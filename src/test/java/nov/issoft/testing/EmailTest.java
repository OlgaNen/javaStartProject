package nov.issoft.testing;


import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class EmailTest {
    @BeforeMethod
    public void yandexLogin() {
        open("https://passport.yandex.by/");
    }

    @Test
    @Parameters({"userName_1", "password_1", "recipient_1", "subject", "body"})
    public void sendEmail(String userName, String password, String recipient, String subject, String body) throws InterruptedException {
        LoginEmailPage loginEmailPage = new LoginEmailPage();
        loginEmailPage.loginEmailBox(userName, password);
        NavigateEmailBox navigateEmailBox = new NavigateEmailBox();
        navigateEmailBox.navigateUserName();
        navigateEmailBox.navigateUserEmailBox();
        SendEmailPopup sendEmailPopup = new SendEmailPopup();
        int generatedNumber =  sendEmailPopup.sendEmail(recipient, subject, body);
        CheckSentEmail checkSentEmail = new CheckSentEmail();
        checkSentEmail.clickSendEmail();
        Selenide.sleep(5000);
        boolean result = checkSentEmail.findSentEmail(generatedNumber);
        Assert.assertTrue(result);
    }
}


/*
        open("https://passport.yandex.by/");
        $(By.id("passp-field-login")).setValue("test000.automation").pressEnter();
        $(By.id("passp-field-passwd")).setValue("Testing&2021").pressEnter();
        $(By.cssSelector("span.user-account__name")).click();
        $(By.cssSelector("li.menu__list-item")).click();
        $(By.cssSelector("span.mail-ComposeButton-Text")).click();
        $(By.cssSelector("div.MultipleAddressesDesktop-Field div.composeYabbles")).setValue("test000.automation@yandex.ru");
        generatedNumber = new Random().nextInt() % 10000;
        $(By.cssSelector("input.composeTextField.ComposeSubject-TextField")).setValue("test" + generatedNumber);
        $(By.cssSelector("div.ComposeMbodyCKEditor.composeReact__message-body")).click();
        $(By.cssSelector("#cke_1_contents div")).setValue("testing email sending" + generatedNumber);
        $(By.cssSelector("button.ComposeControlPanelButton-Button_action")).click();
        $(By.cssSelector(".mail-Layout-Inner a[href=\"#sent\"]")).click();
        Selenide.sleep(1500);
        ElementsCollection subjectEmail = $$("span.mail-MessageSnippet-Item_subject span");
        Assert.assertEquals(true, isExistedEmail(generatedNumber, subjectEmail));
        for (SelenideElement e : subjectEmail) {
            String s = e.getText();
            if (s.equals("test" + generatedNumber)) {
                return true;
            }
        }
    }*/
