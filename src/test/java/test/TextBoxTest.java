package test;

import com.github.javafaker.Faker;
import core.BaseTest;
import org.junit.jupiter.api.Test;
import page.HomePage;
import page.MenuElementsPage;
import page.menuElements.TextBoxPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextBoxTest extends BaseTest {

    @Test
    public void insertTextBoxSuccess(){
        Faker faker = new Faker();
        String insertFullName = faker.gameOfThrones().character();
        String insertEmail = faker.internet().emailAddress();
        String insertCurrentAddress = faker.address().fullAddress();
        String insertPermanentAddress = faker.gameOfThrones().city();

        new MenuElementsPage().navigateToTextBoxPage();

        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage.enterFullName(insertFullName)
                .enterEmail(insertEmail)
                .enterCurrentAddress(insertCurrentAddress)
                .enterPermanentAddress(insertPermanentAddress)
                .clickSubmitButton();

        assertEquals(insertFullName, textBoxPage.getDisplayedName());
        assertEquals(insertEmail, textBoxPage.getDisplayedEmail());
        assertEquals(insertCurrentAddress, textBoxPage.getDisplayedCurrentAddress());
        assertEquals(insertPermanentAddress, textBoxPage.getDisplayedPermanentAddress());
    }

}
