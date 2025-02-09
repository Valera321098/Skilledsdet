import com.skilledsdet.dto.ArticleContainerDto;
import com.skilledsdet.pages.ArticlePage;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;

public class ArticlesTests extends BaseTest{

    @DisplayName("Verify that article container contains data")
    @Test
    public void articleContainersTest() {

        SoftAssertions softAssertions = new SoftAssertions();
        ArticlePage articlePage = new ArticlePage(browser);
        articlePage.open();
        List<ArticleContainerDto> articleContainerList = articlePage.getArticlesList();

        articleContainerList.forEach(article -> {
            softAssertions.assertThat(article.getPictureLink().isEmpty()).isFalse();
            softAssertions.assertThat(article.getTitle().isEmpty()).isFalse();
            softAssertions.assertThat(article.getDateToPost().isEmpty()).isTrue();
            softAssertions.assertThat(article.getTimeToRead().isEmpty()).isFalse();
        });
        softAssertions.assertAll();
    }
}
