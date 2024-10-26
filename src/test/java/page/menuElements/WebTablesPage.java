package page.menuElements;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebTablesPage extends BasePage<WebTablesPage> {

    @FindBy(tagName = "h1")
    private WebElement textWebTablesTitle;

    @FindBy(id = "addNewRecordButton")
    private WebElement addNewRecordButton;

    @FindBy(id = "searchBox")
    private WebElement searchBox;

    @FindBy(id = "firstName")
    private WebElement firstNameInput;

    @FindBy(id = "lastName")
    private WebElement lastNameInput;

    @FindBy(id = "userEmail")
    private WebElement emailInput;

    @FindBy(id = "age")
    private WebElement ageInput;

    @FindBy(id = "salary")
    private WebElement salaryInput;

    @FindBy(id = "department")
    private WebElement departmentInput;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(id = "edit-record-1")
    private WebElement editRecordButton1;

    @FindBy(id = "delete-record-1") // Altere para incluir lógica dinâmica
    private WebElement deleteRecordButton1;

    // Adicione mais botões de edição e exclusão conforme necessário para outros registros

    // Métodos para interagir com os elementos
    public void clickAddNewRecord() {
        addNewRecordButton.click();
    }

    public void enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    public void enterAge(String age) {
        ageInput.sendKeys(age);
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterSalary(String salary) {
        salaryInput.sendKeys(salary);
    }

    public void enterDepartment(String department) {
        departmentInput.sendKeys(department);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void clickEditRecord1() {
        editRecordButton1.click();
    }

    public void clickDeleteRecord1() {
        deleteRecordButton1.click();
    }

    public void deleteContactByName(String firstName, String lastName) {
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));

        for (WebElement row : rows) {
            String rowFirstName = row.findElement(By.xpath(".//td[contains(@class, 'first-name')]")).getText();
            String rowLastName = row.findElement(By.xpath(".//td[contains(@class, 'last-name')]")).getText();

            if (rowFirstName.equals(firstName) && rowLastName.equals(lastName)) {
                WebElement deleteButton = row.findElement(By.xpath(".//span[contains(@id, 'delete-record')]"));
                deleteButton.click();
                break;
            }
        }
    }

}
