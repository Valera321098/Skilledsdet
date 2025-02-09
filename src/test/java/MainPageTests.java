import org.assertj.core.api.Assertions;
import com.skilledsdet.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainPageTests extends BaseTest {

    private static final String TITLE = "Manage your study easily.";
    private static final String HEADER_TITLE = "Skilled SDET";
    private MainPage mainPage;

    @BeforeEach
    public void setupEachTest() {
        mainPage = new MainPage(browser);
        mainPage.open();
    }

    @DisplayName("Verify that test of title is correct.")
    @Test
    public void checkTitleTest() {
        Assertions.assertThat(mainPage.getTitle()).isEqualTo(TITLE);
    }

    @DisplayName("Verify that Header elements arte present.")
    @Test
    public void checkHeader() {
        Assertions.assertThat(mainPage.getHeader().getTitle()).isEqualTo(HEADER_TITLE);
        Assertions.assertThat(mainPage.getHeader().isLogoDisplayed()).isTrue();
        Assertions.assertThat(mainPage.getHeader().isArticleButtonDisplayed()).isTrue();
        Assertions.assertThat(mainPage.getHeader().isCoursesButtonDisplayed()).isTrue();
    }

    @DisplayName("Verify redirect to Article page via header button.")
    @Test
    public void checkRedirectToArticlePage() {
        Assertions.assertThat(mainPage
                        .getHeader()
                        .goToArticlePage()
                        .isOpened())
                .isTrue();
    }

    @DisplayName("Verify redirect to Courses page via header button.")
    @Test
    public void checkRedirectToCoursesPage() {
        Assertions.assertThat(mainPage
                        .getHeader()
                        .goToCoursesPage()
                        .isOpened())
                .isTrue();
    }
}
