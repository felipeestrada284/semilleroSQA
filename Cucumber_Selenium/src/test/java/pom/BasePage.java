package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void Click(By element) throws Exception {
        try {
            driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("No se pudo dar click sobre el elemento: " + element);
        }
    }

    //Metodo con PageFactory
    public void Click(WebElement element) throws Exception {
        try {
            element.click();
        }catch (Exception e){
            throw new Exception("No se pudo dar click sobre el elemento: " + element);
        }
    }

    public boolean isDisplayed(By element) throws Exception {
        try {
            return driver.findElement(element).isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo visualizar el elemento: " + element);
        }
    }

    //Metodo con PageFactory, no recibira un elemento de tipo By sino de tipo WebElement
    public boolean isDisplayed(WebElement element) throws Exception {
        try {
            return element.isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo visualizar el elemento: " + element);
        }
    }

    public String getText(By element) throws Exception {
        try {
            return driver.findElement(element).getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento: " + element);
        }
    }

    //Metodo PageFactory
    public String getText(WebElement element) throws Exception {
        try {
            return element.getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento: " + element);
        }
    }

    public String getTitle() throws Exception {
        try {
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el titulo del driver ");
        }
    }

}
