package io.github.intellij.dlanguage.psi.named;

import com.intellij.navigation.ItemPresentation;
import com.intellij.testFramework.LightPlatformTestCase;
import io.github.intellij.dlanguage.DLanguage;
import io.github.intellij.dlanguage.psi.DlangVisitor;
import io.github.intellij.dlanguage.psi.impl.DElementFactory;
import io.github.intellij.dlanguage.psi.impl.named.DlangIdentifierImpl;

import static org.mockito.Mockito.*;

/**
 * @author Samael Bate (singingbush)
 * created on 22/07/2022
 */
public class DlangIdentifierTest extends LightPlatformTestCase {

    private DlangIdentifier identifier;

    @Override
    public void setUp() throws Exception {
        super.setUp();

        this.identifier = DElementFactory.createDLanguageIdentifierFromText(getProject(), "someVariable");
    }

    public void testGetName() {
        assertEquals("someVariable", this.identifier.getName());
    }

    public void testGetLanguage() {
        assertEquals(DLanguage.INSTANCE, this.identifier.getLanguage());
    }

    public void testAcceptDlangVisitor() {
        final DlangVisitor visitor = mock(DlangVisitor.class); // perhaps test with other visitors such as PhobosStyleGuidelinesVisitor

        this.identifier.accept(visitor);

        verify(visitor, times(1)).visitDNamedElement(eq(this.identifier));
        verify(visitor, times(1)).visitIdentifier(eq((DlangIdentifierImpl) this.identifier));
    }

    public void testGetPresentation() {
        final ItemPresentation presentation = this.identifier.getPresentation();

        assertNotNull(presentation);

        assertEquals("someVariable", presentation.getPresentableText());

        assertEquals("The expected is 'A' because the created file is 'A.hs'", "A", presentation.getLocationString());
    }
}
