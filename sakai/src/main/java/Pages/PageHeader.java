package Pages;

import org.openqa.selenium.WebDriver;

import WebElements.LoginForm;
import WebElements.SearchForm;
import WebElements.SearchResult;


import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class PageHeader{

	private SearchForm searchForm;
	
	private LoginForm loginForm;
	
	public PageHeader (WebDriver driver){
		
		HtmlElementLoader.populatePageObject(this, driver);
	}
	

  	public SearchResult search(String request){

		
		return searchForm.search(request);
		
	}
	
	public void login(String username, String password){
		
		loginForm.login(username, password);
	}
	

}