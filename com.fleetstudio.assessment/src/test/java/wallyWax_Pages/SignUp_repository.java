package wallyWax_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp_repository {
	protected WebDriver driver;
	public SignUp_repository(WebDriver driver) {
		this.driver = driver;
	}

	//This class is a object repository for the Sign up page
	public String url = "https://wallyax.com/get-started/";
	public String Expected_Title = "Wally Get Started";
	protected By FirstName = By.name("firstName");
	protected By LastNamme = By.name("lastName");
	protected By Email 	 = By.id("email");
	protected By Phone = By.xpath("//body/div[@id='__next']/div[1]/main[1]/div[2]/div[1]/div[1]/form[1]/fieldset[4]/div[2]/input[1]");
	protected By Role  = By.id("role");
	protected By CEO   = By.xpath("//option[contains(text(),'CEO')]");
	protected By Company = By.id("organization");
	protected By Freelancer = By.xpath("//input[@id='freelancer']");
	protected By WebsiteNum = By.id("large");
	protected By Submit = By.xpath("//*[@id=\"__next\"]/div/main/div[2]/div/div/form/input");
	protected By Thanks = By.xpath("//h1[contains(text(),'Thank you for registering with Wally!')]");


}
