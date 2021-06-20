package nov.issoft.testing;

import com.codeborne.selenide.SelenideElement;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$;

public class SendEmailPopup {

    SelenideElement WriteButton = $("span.mail-ComposeButton-Text");
    SelenideElement Recipient = $("div.MultipleAddressesDesktop-Field div.composeYabbles");
    SelenideElement Subject = $("input.composeTextField.ComposeSubject-TextField");
    SelenideElement Body = $("div.ComposeMbodyCKEditor.composeReact__message-body");
    SelenideElement BodyInput = $("#cke_1_contents div");
    SelenideElement SendButton = $("button.ComposeControlPanelButton-Button_action");

    private int generatedNumber;

    public int sendEmail(String recipient, String subject, String body) {
        WriteButton.click();
        Recipient.setValue(recipient);
        generatedNumber = new Random().nextInt() % 10000;
        Subject.setValue(subject + generatedNumber);
        Body.click();
        BodyInput.setValue(body + generatedNumber);
        SendButton.click();
        return generatedNumber;
    }
}
