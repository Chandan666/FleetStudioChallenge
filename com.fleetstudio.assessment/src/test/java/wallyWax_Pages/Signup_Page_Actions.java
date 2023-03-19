package wallyWax_Pages;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup_Page_Actions extends SignUp_repository{
	public Signup_Page_Actions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	// Sign up Page Title Verification
	public void VerifyTitle() {
		String Actual_Title = driver.getTitle();
		assertEquals(Actual_Title, Expected_Title);
		System.out.println("Page Title has been verified");
	}
	public void EnterFirstName() {
		driver.findElement(FirstName).sendKeys("Chandan");	
		System.out.println("text inserted "+ driver.findElement(FirstName).getText());
	}
	public void EnterLastName() {
		driver.findElement(LastNamme).sendKeys("Kumar");	
	}
	public void EnterEmail() throws InterruptedException {
		driver.findElement(Email).sendKeys("hello@wallyax.com");	
		Thread.sleep(2000);
	}
	public void EnterPhoneNumber() {
		
//		driver.findElement(Mobile_Country).click();
//		driver.findElement(India).click();
		driver.findElement(Phone).click();
		driver.findElement(Phone).sendKeys("1234567890");	
	}
	public void SelectingRoleDropDown() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()", Role);
		Select Position = new Select(driver.findElement(Role));
		Position.selectByValue("CEO");
		
	}
	public void CompanyName() {
		driver.findElement(Company).sendKeys("FleetStudio");
	}
	public void SelectCompanySizeRadioButton() {
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", Freelancer);
		driver.findElement(Freelancer).click();
	}
	public void SelectLastRadioButton() {
		driver.findElement(WebsiteNum).click();
	}
	public void ClickSubmitButton() {
		driver.findElement(Submit).click();
		
	}
	public void Signupsuccessful() throws Exception {
		//verify that the sign up page submission is successful
		try {
			String Assertion = driver.findElement(Thanks).getText().trim();
			assertEquals("Thank you for registering with Wally!", Assertion);

			
		 } catch (AssertionError e) {
	        // Take a screenshot on failure
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile, new File("FailedTest.png"));
	        throw e; // re-throw the exception to fail the test
	    }

		
	}
}
