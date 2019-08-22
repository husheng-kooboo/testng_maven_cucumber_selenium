//package Steps;
//
//import Base.BaseUtil;
//import Transformation.EmailTransform;
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java8.En;
//import java.util.List;
//
//public class MyStepdefs2 implements En {
//
//    private BaseUtil base;
//
//    public MyStepdefs2(BaseUtil base) {
//        this.base = base;
//
//        Given("^I navigate to the login page$", () -> {
//            System.out.println("Hello " + base.stepInfo);
////            base.driver.navigate().to("https://www.baidu.com");
//        });
//        And("^I enter the user email address as Email:([^\"]*)$", (String email) -> {
//            System.out.println(new EmailTransform().transform(email));
//        });
//        And("^I enter the following for login$", (DataTable table) -> {
//            List<User> users = table.asList(User.class);
//            for(User user: users){
//                System.out.println("The username is " + user.username);
//                System.out.println("The password is " + user.password);
//            }
//        });
//        And("^I click login button$", () -> {
//        });
//        Then("^I should see the userform page$", () -> {
//        });
//        And("^I enter the ([^\"]*) and ([^\"]*)$", (String username, String password) -> {
//            System.out.println("The username is " + username);
//            System.out.println("The password is " + password);
//        });
//    }
//}
