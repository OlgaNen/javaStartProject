package nov.issoft.testing;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class LoginEmailPage {

    SelenideElement loginInput = $(By.id("passp-field-login"));
    SelenideElement passwordInput = $(By.id("passp-field-passwd"));


    public void loginEmailBox(String userName, String password) {
        loginInput.setValue(userName).pressEnter();
        passwordInput.setValue(password).pressEnter();
    }
}
