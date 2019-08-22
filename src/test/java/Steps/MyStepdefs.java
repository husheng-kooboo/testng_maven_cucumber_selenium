//package Steps;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import java.util.List;
//
//public class MyStepdefs {
//    @And("I enter the following for login")
//    public void iEnterTheFollowingForLogin(List<User> users) throws Throwable{
//        System.out.println("");
//        System.out.println(users);
//        for(User user: users){
//            System.out.println("The username is " + user.username);
//            System.out.println("The password is " + user.password);
//        }
////        List<User> users = new ArrayList<User>();
////        List<User> users = table.asList(User.class);
////        for(User user: users){
////            System.out.println("The username is " + user.username);
////            System.out.println("The password is " + user.password);
////        }
////        List<List<String>> list = table.asLists(String.class);
////        for(int i=1; i<list.size(); i++) { //i starts from 1 because i=0 represents the header
////            System.out.println(list.get(i).get(0));
////            System.out.println(list.get(i).get(1));
////        }
//    }
//
//    @Given("I navigate to the login page")
//    public void iNavigateToTheLoginPage() {
//    }
//
//    @And("I click login button")
//    public void iClickLoginButton() {
//
//    }
//
//    @Then("I should see the userform page")
//    public void iShouldSeeTheUserformPage() {
//    }
//
//
//    @And("I enter the user email address as Email:leon")
//    public void iEnterTheUserEmailAddressAsEmailLeon() {
//    }
//
//    @And("I enter the <username> and <password>")
//    public void iEnterTheUsernameAndPassword() {
//    }
//}
