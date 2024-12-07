package test;

import core.BaseTest;
import org.junit.jupiter.api.Test;
import page.MenuElementsPage;
import page.menuElements.TextBoxPage;
import support.dto.UserDTO;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static support.factory.CreateUserFactory.createFactoryUser;

public class TextBoxTest extends BaseTest {

    @Test
    public void insertTextBoxSuccess(){
        UserDTO userDTO = createFactoryUser();
        new MenuElementsPage().navigateToTextBoxPage();

        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage.enterFullName(userDTO.getFullName())
                .enterEmail(userDTO.getEmail())
                .enterCurrentAddress(userDTO.getCurrentAddress())
                .enterPermanentAddress(userDTO.getPermanentAddress())
                .clickSubmitButton();

        assertEquals(userDTO.getFullName(), textBoxPage.getDisplayedName());
        assertEquals(userDTO.getEmail(), textBoxPage.getDisplayedEmail());
        assertEquals(userDTO.getCurrentAddress(), textBoxPage.getDisplayedCurrentAddress());
        assertEquals(userDTO.getPermanentAddress(), textBoxPage.getDisplayedPermanentAddress());
    }

}
