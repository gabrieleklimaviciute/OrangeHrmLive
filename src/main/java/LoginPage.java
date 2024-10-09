import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "input[name='username']")
    private WebElement usernameField;

    @FindBy(css = "input[name='password']")
    private WebElement passwordField;

    @FindBy(css = ".orangehrm-login-button")
    private WebElement loginButton;

    @FindBy(css="[class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials'] .oxd-text--p:nth-of-type(1)")
    private WebElement usernameString;

    @FindBy(css= ".orangehrm-demo-credentials.oxd-sheet.oxd-sheet--gray-lighten-2.oxd-sheet--gutters.oxd-sheet--rounded > p:nth-of-type(2)")
    private WebElement passwordString;

    public LoginPage(WebDriver driver) {
        super(driver);

    }

 public void inputUsernameField(String username){
        usernameField.sendKeys(username);
 }

    public void inputPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
    public String getUsernameString() {
        String usernameInput = usernameString.getText();
        if(usernameInput.contains(":")){
            return usernameInput.split(":")[1].trim();
        }
        return null;

    }
    public String getPasswordString(){
        String passwordInput = passwordString.getText();
        if(passwordInput.contains(":")){
            return passwordInput.split(":")[1].trim();
        }
        return null;
    }
}
