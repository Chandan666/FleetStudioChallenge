# FleetStudioChallenge
# Hello Team,
Here are a few deatils about the Assignment.
This is a Java code for a page object model (POM) TestNG framework for sign up verification, that contains methods for interacting with the sign-up page elements. The class extends the SignUp_repository class, which contains the web element locators.

The methods in this class include:

. VerifyTitle() method that verifies the title of the sign-up page.

. EnterFirstName(), EnterLastName(), EnterEmail(), EnterPhoneNumber(), SelectingRoleDropDown(), CompanyName(), . SelectCompanySizeRadioButton(), and SelectLastRadioButton() methods that fill in the sign-up form fields with appropriate values.

. ClickSubmitButton() method that clicks the submit button.

. Signupsuccessful() method that verifies if the sign-up was successful by checking if a success message is displayed. If the assertion fails, it takes a screenshot of the page and throws an exception to fail the test.



The class also uses the JavaScriptExecutor to scroll down to the elements before interacting with them.
