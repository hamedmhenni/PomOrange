package PartieObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Hooks.SetUp;

public class AuthentificationObject {

	public static WebDriver driver;

	// creation d'un constructeur
	public AuthentificationObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

// declaration des element web 
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Username']")
	public static WebElement username;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	public static WebElement motdepass;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Login']")
	public static WebElement btnLogin;
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Paul Collings')]")
	public static WebElement nomdeprofil;

//declaration des methode 
	public static void accéderUrl  (String arg) {
		driver.navigate().to(arg);
	}
	public static void saisirUsername(String arg) {
		username.sendKeys(arg);
	}
	public static void saisirmotpass(String arg) {
		motdepass.sendKeys(arg);
	}
	public static void clickBtnLogin() {
		btnLogin.click();
		}
		
		public static String obtenirnomprofil() {
			String text ;
			return
			text=nomdeprofil.getText();
			
	}

}
