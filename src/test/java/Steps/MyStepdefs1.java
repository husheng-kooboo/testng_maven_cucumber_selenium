package Steps;

import Base.BaseUtil;
import Pages.LoginPage;
import Transformation.EmailTransform;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class MyStepdefs1 extends BaseUtil {

    private BaseUtil base;
    private LoginPage loginPage;
    public MyStepdefs1(BaseUtil base) {
        this.base = base;
        this.loginPage = new LoginPage(base.driver);
    }

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        System.out.println(base.stepInfo);
        base.driver.navigate().to("https://demo.taotesting.com/tao/Main/login");
    }

    @And("I enter the following for login")
    public void iEnterTheFollowingForLogin(List<User> users) {
        for(User user: users){
            loginPage.inputloginInfo(user.username,user.password);
        }
    }

    @And("I click login button")
    public void iClickLoginButton() {
        System.out.println("iClickLoginButton");
        loginPage.clickLogin();
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
//        WebDriverWait wait = new WebDriverWait(base.driver,30);
//
//        ExpectedCondition<Boolean> expectation = new
//                ExpectedCondition<Boolean>() {
//                    public Boolean apply(WebDriver driver) {
//                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
//                    }
//                };
//
//        try {
//            wait.until(expectation);
//        } catch(Throwable error) {
//            Assert.assertFalse("Timeout waiting for Page Load Request to complete.", true);
//        }
//        Assert.assertEquals("It's not display!", base.driver.findElement(By.id("user_settings")).isDisplayed(),true);
    }

    @And("I enter the ([^\"]*) and ([^\"]*)")
    public void iEnterTheUsernameAndPassword(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

    @And("^I enter the user email address as Email:([^\"]*)$")
    public void iEnterTheUserEmailAddressAsEmailAdmin(String email) {
        System.out.println(new EmailTransform().transform(email));
        Assert.assertEquals(1,1);
    }
}