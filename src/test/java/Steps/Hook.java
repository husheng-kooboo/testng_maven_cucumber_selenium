package Steps;

import Base.BaseUtil;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base){
        this.base = base;
    }

    @Before
    public void InitializeTest(){
        System.out.println("This is the before test");
        System.out.println(System.getProperty("user.dir"));
        base.stepInfo = "FirefoxDriver";
//        System.setProperty("webdriver.gecko.driver", "src\\test\\java\\Bin\\geckodriver.exe");
//        base.driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Bin\\chromedriver.exe");
        base.driver = new ChromeDriver();
    }

    @After
    public void TeardownTest(Scenario scenario){
        System.out.println(scenario.getStatus());
        if(scenario.isFailed() == true) {
            System.out.println("Test failed!");
        }else{
            System.out.println("Test success!");
        }
        System.out.println("This is the after test");
        base.driver.close();
    }
}
