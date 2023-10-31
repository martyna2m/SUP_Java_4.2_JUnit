import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class WebPageTitleTest extends DriverSetup {


    @ParameterizedTest
    @CsvSource({"https://sii.pl/, 'Rozwiązania i usługi IT, inżynierii i BPO - Sii Polska'"})
    @Tag("regression")
    @Tag("sii")
    void checkSiiWebsiteTitle(String url, String expectedTitle) {
        WebPageTitleMethods.assertWebTitle(url, expectedTitle, driver);
    }

    @ParameterizedTest
    @CsvSource({"https://www.onet.pl/, Onet – Jesteś na bieżąco"})
    @Tag("regression")
    @Tag("onet")
    void checkOnetWebsiteTitle(String url, String expectedTitle) {
        WebPageTitleMethods.assertWebTitle(url, expectedTitle, driver);

    }

    @ParameterizedTest
    @CsvSource({"http://kotuszkowo.pl/, Kotuszkowo- blog o kotach"})
    @Tag("regression")
    @Tag("cat")
    void checkCatWebsiteTitle(String url, String expectedTitle) {
        WebPageTitleMethods.assertWebTitle(url, expectedTitle, driver);

    }

    @ParameterizedTest
    @CsvSource({"https://www.filmweb.pl/, Filmweb - filmy takie jak Ty!"})
    @Tag("regression")
    @Tag("filmweb")
    void checkFilmWebsiteTitle(String url, String expectedTitle) {
        WebPageTitleMethods.assertWebTitle(url, expectedTitle, driver);

    }

    @ParameterizedTest
    @CsvSource({"https://www.selenium.dev/documentation/en/webdriver/, WebDriver | Selenium"})
    @Tag("regression")
    @Tag("selenium")
    void checkSeleniumWebsiteTitle(String url, String expectedTitle) {
        WebPageTitleMethods.assertWebTitle(url, expectedTitle, driver);

    }


}
