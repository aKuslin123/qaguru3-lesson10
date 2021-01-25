import com.codeborne.selenide.Config;

public interface WebDriverConfig extends Config {

    boolean remote();

    BrowserName browserName();

}
