package WebElements;

import java.util.List;
import java.util.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;


@Name("Блок результата поиска")
@Block(@FindBy(id = "searchall_results_container"))
public class SearchResult extends HtmlElement{

	private List<WebElement> getItems(){
		
		return getWrappedElement().findElements(By.cssSelector(".s3d-search-result-name"));
		
	}
	
	public void print(){
		
		try{
			
			for(WebElement currentItem : getItems() ){
				
				System.out.println(currentItem.getText());
				
			}
			
		} catch (NoSuchElementException e){
			
			return;
		}
	
	}
	
}
