import com.skilledsdet.Browser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.skilledsdet.config.FrameworkPropertiesProvider.FRAMEWORK_PROPERTIES;

public abstract class BaseTest {

    public Browser browser;

    @BeforeEach
    public void setupEach() {
        browser = new Browser(FRAMEWORK_PROPERTIES.browser());
    }

    @AfterEach
    public void tearDownEach() {
        browser.quit();
    }
}
