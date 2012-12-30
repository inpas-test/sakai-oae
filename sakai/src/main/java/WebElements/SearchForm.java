package WebElements;

import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;



@Name("Форма поиска")
@Block(@FindBy(className = "s3d-search-container"))
public class SearchForm extends HtmlElement{
	
	@Name("Поле ввода для поиска")
	@FindBy(className = "s3d-search-inputfield")
	private TextInput requestInput;
	
	@Name("Кнопка поиска")
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/button")
	private Button searchButton;
/*	
	@Name("Результат поиска (список)")
	@FindBy(id = "searchall_results_container")
	private SearchResult searchResult;
*/	

	public void search (String request){
		
		requestInput.sendKeys(request);
		
		searchButton.click();


	}

}
