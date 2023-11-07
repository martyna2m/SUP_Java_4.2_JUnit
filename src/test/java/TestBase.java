import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


@Slf4j
public class TestBase {

    public WebDriver driver;


    @BeforeEach
    void setUp() {
        driver = new EdgeDriver();
        log.info(("Driver initialized properly"));

    }

    @AfterEach
    void closeDriver() {
        driver.quit();
        log.info(("Driver quit properly"));
    }
}
