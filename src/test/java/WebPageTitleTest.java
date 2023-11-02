import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class WebPageTitleTest extends DriverSetup {

    @ParameterizedTest
    @CsvSource({"https://sii.pl/, 'Rozwiązania i usługi IT, inżynierii i BPO - Sii Polska'",
            "https://www.onet.pl/, Onet – Jesteś na bieżąco",
            "http://kotuszkowo.pl/, Kotuszkowo- blog o kotach",
            "https://www.filmweb.pl/, Filmweb - filmy takie jak Ty!",
            "https://www.selenium.dev/documentation/en/webdriver/, WebDriver | Selenium"})
    @Tag("regression")
    void checkWebsiteTitle(String url, String expectedTitle) {
        WebPageTitleMethods.assertWebTitle(url, expectedTitle, driver);
    }
}
