package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage<H extends BasePage> {

    public WebDriver driver;

    public void PageBase(){
        this.driver = BaseTest.driver;
        PageFactory.initElements(BaseTest.driver, this);
    }

}
