import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Base {

    //Se crean los metodos de la API de Selenium
    private WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    //Devuelveme el elemento que estoy pasando como parametro
    public String getText(WebElement element){
        return element.getText();
    }

    //En vez de recibir un webelement recibira un locator
    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    //texto que se quier excribir en la pagina, locator donde queremos escribir ese texto
    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    //Este metodo nos dice si el elemento se encuentra listo par ser utilizado
    //retorna falso en caso de que el elemento no halla cargado, no existe o fue modificado y devuelve la exception
    public Boolean isDisplayed(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    //Este metodo es encargado de recibir la url y abrir la pagina
    public void visit(String url){
        driver.get(url);
    }

}
