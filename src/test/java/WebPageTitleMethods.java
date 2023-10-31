import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class WebPageTitleMethods {

    public static void assertWebTitle(String url, String expectedTitle, WebDriver driver) {
        driver.get(url);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        assertThat(title).isEqualTo(expectedTitle);
    }
}
