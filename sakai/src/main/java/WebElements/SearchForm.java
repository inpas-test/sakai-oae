package WebElements;

import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;


@Name("����� ������")
@Block(@FindBy(className = "s3d-search-container"))
public class SearchForm extends HtmlElement{
	
	@Name("���� ����� ��� ������")
	@FindBy(className = "s3d-search-inputfield")
	private TextInput requestInput;
	
	@Name("������ ������")
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/button")
	private Button searchButton;
	


	public void search (String request) throws InterruptedException{
		
		requestInput.sendKeys(request);
		
		searchButton.click();

	}

}
