package WebElements;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ru.yandex.qatools.htmlelements.element.TypifiedElement;


public class SearchResult extends TypifiedElement{

	public SearchResult(WebElement wrappedElement) {
		super(wrappedElement);
	}

	private List<WebElement> getItmes(){
		
		return getWrappedElement().findElements(By.xpath("//li"));
		
	}
	
	public void test(){
		
		for(WebElement item : getItmes()){
			
			System.out.println(item.getText());
			
		}
		throw new NoSuchElementException();
	}
	
}
