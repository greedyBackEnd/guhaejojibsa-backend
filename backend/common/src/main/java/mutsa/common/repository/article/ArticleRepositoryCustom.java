/**
 * @project backend
 * @author ARA
 * @since 2023-08-17 PM 4:33
 */

package mutsa.common.repository.article;

import mutsa.common.domain.filter.article.ArticleFilter;
import mutsa.common.domain.models.article.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ArticleRepositoryCustom {
    Page<Article> getPageByUsername(String username, ArticleFilter articleFilter, Pageable pageable);
    Page<Article> getPage(ArticleFilter articleFilter, Pageable pageable);
}
