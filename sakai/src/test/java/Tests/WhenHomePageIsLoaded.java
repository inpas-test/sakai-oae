package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import Pages.PageHeader;
import WebElements.SearchResult;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class WhenHomePageIsLoaded {
	
	private WebDriver driver = new FirefoxDriver();
	private PageHeader pageHeader = new PageHeader(driver);

	
	@Before
	public void LoadHomePage(){
		
		driver.get("http://uos-centos:8080/");
		
	}
	
	@Test
	public void aUserShouldSearhByString(){
		
		System.out.println("Bigin test!");
		
		SearchResult result = pageHeader.search("new");
		
		System.out.println(result.toString());
		
		assertThat(result.toString(), containsString("message"));

	}

	@After
	public void closePage(){

		driver.quit();
		
	}
}
