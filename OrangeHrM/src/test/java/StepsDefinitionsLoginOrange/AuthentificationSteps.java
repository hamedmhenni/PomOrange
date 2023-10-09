package StepsDefinitionsLoginOrange;

import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PartieObject.AuthentificationObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AuthentificationSteps {
	// driver = driver setup (@before...)
	WebDriver driver=SetUp.driver;
	//appel de constructeur 
	AuthentificationObject login = new AuthentificationObject(driver);
	

	@Given("saisir l url page orange {string}")
	public void saisir_l_url_page_orange(String string) {
	    login.accéderUrl(string);
	}

	@When("saisir le login del page orange {string}")
	public void saisir_le_login_del_page_orange(String string) {
	    login.saisirUsername(string);
	}

	@When("saisr le motpass de la page orange {string}")
	public void saisr_le_motpass_de_la_page_orange(String string) {
	   login.saisirmotpass(string);
	}

	@When("cliquer sur le bouton login dans la page orange")
	public void cliquer_sur_le_bouton_login_dans_la_page_orange() {
	  login.clickBtnLogin();
	}

	@Then("verifier le nom de profil affichee {string}")
	public void verifier_le_nom_de_profil_affichee(String string) {
	   
		Assert.assertEquals(string,login.obtenirnomprofil());
	}

}
