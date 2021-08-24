package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComicsPages extends BasePage{

    //FindBy devuelve un webElement
    //anotaciones con la PageFactory
    @FindBy(className = "page-title")
    private WebElement pageTitleLocator;
    //private By pageTitleLocator = By.className("page-title");

    private String titlePage = "Category: comics";


    public ComicsPages(WebDriver driver){
        super(driver);
    }

    public boolean isTitleComicsDisplayed() throws Exception {
        return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titlePage);
    }
}
