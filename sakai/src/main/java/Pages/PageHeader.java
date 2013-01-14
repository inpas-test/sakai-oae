package Pages;

import org.openqa.selenium.WebDriver;

import WebElements.SearchForm;
import WebElements.SearchResult;


import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class PageHeader{

	private SearchForm searchForm;
	
	private SearchResult searchResult;
	
	public PageHeader (WebDriver driver){
		
		HtmlElementLoader.populatePageObject(this, driver);

	}
	

  	public void search(String request) throws InterruptedException{

		
		searchForm.search(request);
		
	}
  	
  	public void viewResults(){
  		
  		searchResult.print();
  	}
	

}
