//package Steps;
//
//import Base.BaseUtil;
//import cucumber.api.java8.En;
//import io.cucumber.datatable.DataTable;
//import java.util.List;
//
//public class Login extends BaseUtil implements En {
//
//    private BaseUtil base;
//
//    public Login(BaseUtil base) {
//        this.base = base;
//    }
//
//    public Login() {
//        Given("^I navigate to the login page$", () -> {
//            System.out.println("I navigate to the login page");
////            System.out.println("The driver is " + base.stepInfo);
//        });
//        And("^I click login button$", () -> {
//            System.out.println("I click login button");
//        });
//        Then("^I should see the userform page$", () -> {
//            System.out.println("I should see the userform page");
//        });
//        And("^I enter the following for login$", (DataTable table) -> {
//            System.out.println(table);
//            List<User> users = table.asList(User.class);
//            for(User user: users){
//                System.out.println("The username is " + user.username);
//                System.out.println("The password is " + user.password);
//            }
//        });
//        And("^I enter the ([^\"]*) and ([^\"]*)$", (String username, String password) -> {
//            System.out.println("The username is " + username);
//            System.out.println("The password is " + password);
//        });
//    }
//}
