package io.github.intellij.dlanguage

import com.intellij.mock.MockPsiManager
import com.intellij.openapi.projectRoots.Sdk
import com.intellij.openapi.projectRoots.impl.MockSdk
import com.intellij.openapi.roots.ModuleRootManager
import com.intellij.openapi.roots.OrderRootType
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.FileViewProvider
import com.intellij.psi.SingleRootFileViewProvider
import com.intellij.testFramework.LightPlatformTestCase
import com.intellij.testFramework.LightVirtualFile
import io.github.intellij.dlanguage.psi.DlangFile
import com.intellij.testFramework.VfsTestUtil
import com.intellij.util.containers.MultiMap

/**
 * Provides a base for unit testing that requires in-memory D source files
 */
abstract class LightDlangTestCase : LightPlatformTestCase() {

    companion object {
        class MockDir(val dirName: String) : LightVirtualFile(dirName) {
            override fun isDirectory(): Boolean = true
        }
    }

    // this method will be called prior to the test being run and MockSdk is read only
    override fun getProjectJDK(): Sdk {
        val roots = MultiMap<OrderRootType, VirtualFile>(2)
        roots.putValue(OrderRootType.SOURCES, MockDir("phobos"))
        roots.putValue(OrderRootType.SOURCES, MockDir("druntime"))

        return MockSdk("dmd", "", "2", roots) { DlangSdkType.getInstance() }
    }

    fun addFileToModuleSource(filename: String, content: String? = null): VirtualFile {
        val sourcesRoot = ModuleRootManager.getInstance(module).sourceRoots[0]
        return VfsTestUtil.createFile(sourcesRoot, filename, content)
    }

    fun virtualDlangPsiFile(filename: String, content: String): DlangFile {
        val provider: FileViewProvider = SingleRootFileViewProvider(
            MockPsiManager(project),
            addFileToModuleSource(filename, content)
        )
        return DlangFile(provider)
    }

    /**
     * Use this method to help simplify the creation of test data for these unit tests
     *
     * @param filename the filename, including extension, of a D source file
     * @param content the file content (source code)
     * @return a Dlang LightVirtualFile (In-memory implementation of [VirtualFile])
     */
    fun lightDlangVirtualFile(filename: String, content: String) = LightVirtualFile(filename, DLanguage, content)

    /**
     * Use this method to help simplify the creation of test data for these unit tests
     *
     * @param filename the filename, including extension, of a D source file
     * @param content the file content (source code)
     * @return a Dlang Psi File from a single LightVirtualFile (In-memory implementation of [VirtualFile])
     */
    fun lightDlangPsiFile(filename: String, content: String): DlangFile {
        val provider: FileViewProvider = SingleRootFileViewProvider(
            MockPsiManager(project),
            lightDlangVirtualFile(filename, content)
        )
        return DlangFile(provider)
    }

}
