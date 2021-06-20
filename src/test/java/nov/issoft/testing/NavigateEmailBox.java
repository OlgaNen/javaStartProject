package nov.issoft.testing;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NavigateEmailBox {

    SelenideElement AccountName = $("span.user-account__name");
    SelenideElement MailMenu = $("li.menu__list-item");


    public void navigateUserName() {
        AccountName.click();

    }

    public void navigateUserEmailBox() {
        MailMenu.click();
    }
}