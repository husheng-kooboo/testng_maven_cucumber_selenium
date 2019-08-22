package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "login")
    public WebElement txtUserName;

    @FindBy(how = How.ID, using = "password")
    public WebElement txtPassword;

    @FindBy(how = How.ID, using = "connect")
    public WebElement btnLogin;

    public void inputloginInfo(String username, String password){
        txtUserName.sendKeys(username);
        txtPassword.sendKeys(password);
    }

    public void clickLogin(){
        btnLogin.click();
    }
}
