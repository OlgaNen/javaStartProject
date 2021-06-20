package nov.issoft.testing;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CheckSentEmail {

    SelenideElement sentMenu = $(".mail-Layout-Inner a[href=\"#sent\"]");
    ElementsCollection subject = $$("span.mail-MessageSnippet-Item_subject span");

    public void clickSendEmail() {
        sentMenu.click();
    }

    public boolean findSentEmail(int generatedNumber) {
        boolean result = false;
            for (SelenideElement e : subject) {
                String s = e.getText();
                if (s.equals("test" + generatedNumber)) {
                    result = true;
                }
            }
        return result;
        }
}