import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class WebPageTitleTest extends DriverSetup {


    @ParameterizedTest
    @ValueSource(strings = {"Rozwiązania i usługi IT, inżynierii i BPO - Sii Polska"})
    @Tag("regression")
    @Tag("sii")
    void checkSiiWebsiteTitle(String expectedTitle) {
        WebPageTitleMethods.assertWebTitle("https://sii.pl/", expectedTitle, driver);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Onet – Jesteś na bieżąco"})
    @Tag("regression")
    @Tag("onet")
    void checkOnetWebsiteTitle(String expectedTitle) {
        WebPageTitleMethods.assertWebTitle("https://www.onet.pl/", expectedTitle, driver);

    }

    @ParameterizedTest
    @ValueSource(strings = {"Kotuszkowo- blog o kotach"})
    @Tag("regression")
    @Tag("cat")
    void checkCatWebsiteTitle(String expectedTitle) {
        WebPageTitleMethods.assertWebTitle("http://kotuszkowo.pl/", expectedTitle, driver);

    }

    @ParameterizedTest
    @ValueSource(strings = {"Filmweb - filmy takie jak Ty!"})
    @Tag("regression")
    @Tag("filmweb")
    void checkFilmWebsiteTitle(String expectedTitle) {
        WebPageTitleMethods.assertWebTitle("https://www.filmweb.pl/", expectedTitle, driver);

    }

    @ParameterizedTest
    @ValueSource(strings = {"WebDriver | Selenium"})
    @Tag("regression")
    @Tag("selenium")
    void checkSeleniumWebsiteTitle(String expectedTitle) {
        WebPageTitleMethods.assertWebTitle("https://www.selenium.dev/documentation/en/webdriver/", expectedTitle, driver);

    }


}
