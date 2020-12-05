import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BingTests {

    @BeforeAll
    static void setup(){
        Configuration.startMaximized = true;
    }

    @Test
    public void willBingFindQAGuru () {
        open("https://bing.com");
        $(byName("q")).val("QAGURU").pressEnter();
        $("#b_content").shouldHave(text("QAGURU"));
    }
}
