import org.junit.jupiter.api.Test;



public class LoginTest extends BaseTest {

    @Test
    void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        String username = loginPage.getUsernameString();
        String password = loginPage.getPasswordString();
        loginPage.inputUsernameField(username);
        loginPage.inputPasswordField(password);
        loginPage.clickLoginButton();


    }
}
