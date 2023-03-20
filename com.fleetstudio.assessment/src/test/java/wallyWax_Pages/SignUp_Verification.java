package wallyWax_Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp_Verification {

    private WebDriver driver;
    private Signup_Page_Actions objFunctionality;

    @SuppressWarnings("deprecation")
	@BeforeSuite
    public void beforetest() {
        //WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        WebDriverManager.edgedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        objFunctionality = new Signup_Page_Actions(driver);
    }

    @Test(priority = 0)
    public void NavigatingtoSingnUpPage() {
        driver.get(objFunctionality.url);
        objFunctionality.VerifyTitle();
    }

    @Test(priority = 1)
    public void FilltheSignUpform() throws InterruptedException {
        objFunctionality.EnterFirstName();
        objFunctionality.EnterLastName();
        objFunctionality.EnterEmail();      
        objFunctionality.EnterPhoneNumber();
        objFunctionality.SelectingRoleDropDown();
        objFunctionality.CompanyName();
        objFunctionality.SelectCompanySizeRadioButton();
        objFunctionality.SelectLastRadioButton();
        Thread.sleep(1000);
    }
    @Test(priority = 2)
    public void clickonSubmit() {
    	objFunctionality.ClickSubmitButton();  	
	}
    @Test(priority = 3)
    public void AssertSignupSuccess() throws Exception {
    	objFunctionality.Signupsuccessful();
    }

    @AfterSuite
    public void close() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
