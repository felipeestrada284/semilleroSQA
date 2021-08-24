package com.imalittletester.automation.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestStepDefinitions extends TestBase{
    
    @Given("^El usuario se encuentra en la pagina de iamlittletester$")
    public void elUsuarioSeEncuentraEnLaPaginaDeIamlittletester() throws Exception {
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^Hace click sobre el boton The little tester comics$")
    public void haceClickSobreElBotonTheLittleTesterComics() throws Exception {
        homePage.clickOnTitleComics();
    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void seDebeRedirigirALaPantallaComics() throws Exception {
        Assert.assertTrue("No se redirecciono a la pagina", comicsPages.isTitleComicsDisplayed());
    }
}
