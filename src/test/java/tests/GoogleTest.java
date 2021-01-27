import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

    @Test
    void selenideSearchTest() {
        String seatchItem = "";
        String searchResult = "";

        open("https://google.com");
        $(byName("q")).setValue("Selenide").pressEnter();
        $("html").shouldHave(text(searchResult));
    }
}
