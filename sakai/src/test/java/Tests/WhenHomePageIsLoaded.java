package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


import Pages.PageHeader;
//import WebElements.SearchResult;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class WhenHomePageIsLoaded {
	
	private WebDriver driver = new FirefoxDriver();
	private PageHeader pageHeader = new PageHeader(driver);

	
	@Before
	public void LoadHomePage(){
		
		driver.get("http://localhost:8080/");
		
	}
	
	@Test
	public void aUserShouldSearhByString(){
		
		System.out.println("Bigin test!");
		
		pageHeader.search("����");
				
		assertThat(pageHeader.toString(), containsString("message"));

	}

	@After
	public void closePage(){

		//driver.quit();
		
	}
}
