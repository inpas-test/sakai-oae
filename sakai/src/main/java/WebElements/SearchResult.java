package WebElements;

import org.openqa.selenium.support.FindBy;


import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;


@Name("Результат поиска")
@Block(@FindBy(id = "searchall_results_container"))
public class SearchResult extends HtmlElement{

	
}
