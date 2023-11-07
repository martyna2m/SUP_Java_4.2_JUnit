import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@Slf4j
public class WebPageTitleTest extends TestBase {


    @ParameterizedTest
    @Tag("regression")
    @CsvFileSource(files = "src/test/resources/titles.csv", numLinesToSkip = 1)
    void checkWebsiteTitle(String url, String expectedTitle) {
        WebPageTitleMethods.assertWebTitle(url, expectedTitle, driver);
    }
}
