package Tests;

import org.junit.After;
import org.junit.Before;
//import org.junit.Ignore;
import org.junit.Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.PageHeader;
import WebElements.LoginForm;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class WhenHomePageIsLoaded {
	
	private WebDriver driver = new FirefoxDriver();
	private PageHeader pageHeader = new PageHeader(driver);
	private LoginForm loginForm = new LoginForm(driver);


	
	@Before
	public void LoadHomePage(){
		try{
			
			driver.get("http://uos-centos:8080");
			//driver.wait();
			driver.manage().window().maximize();
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		
	}
	
	
	@Test
	public void aUserShouldLogging(){
		
		loginForm.login("admin", "admin", driver);
		
		assertThat(driver.getTitle(), containsString("User"));
		
	}
	
	@Test
	public void aUserShouldSearhByString() throws InterruptedException{
		
		try{
		
			System.out.println("Bigin test!");
		
			pageHeader.search("sakai");
		
			pageHeader.viewResults();
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		} 

	}

	@After
	public void closePage(){

		//driver.quit();
		
	}
}
