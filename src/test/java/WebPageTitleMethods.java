import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class WebPageMethods {
    private static WebDriver driver;

    public static void compareWebTitles(String url, String expectedTitle) {
      driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        assertThat(title).isEqualTo(expectedTitle);
      driver.quit();
    }
}
