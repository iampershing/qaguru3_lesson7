import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.text;

@Feature("Github Lesson")
@Story("Google Tests")
public class GoogleTests{

    @Test
    @DisplayName("Via Chrome Browser - Check That Selenide Exist in Google")
    @Description("Verification that it is possible to find Selenide via Google using Chrome")
    @Tag("GitHub")
    @Owner("Sergei P")
    void selenideSearchTest() {
        Configuration.browser = "chrome";
        open("http://google.com");
        $(byName("q")).setValue("Selenide").pressEnter();
        $("html").shouldHave(text("Selenide"));
    }
}
