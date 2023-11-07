import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class WebPageTitleMethods {

    public static void assertWebTitle(String url, String expectedTitle, WebDriver driver) {

        log.info("Test started: Assert title on {}", url);

        driver.get(url);
        log.debug("Getting url: {}", url);

        driver.manage().window().maximize();

        log.debug("Expected title: {}", expectedTitle);

        String title = driver.getTitle();
        log.debug("Actual title: {}", title);

        assertThat(title).isEqualTo(expectedTitle);
        log.info("Test passed");

    }


}





