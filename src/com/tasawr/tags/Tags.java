package com.tasawr.tags;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Tags {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	
	// login 

	// login ended

//gfhhgf	
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://carcore.tasawrtest.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testLogin() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("user_login")).clear();
		driver.findElement(By.id("user_login")).sendKeys("muntasim@tasawr.com");
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys("123456");
		driver.findElement(By.id("submit_login")).click();
//		driver.findElement(By.linkText("Tag Group Management")).click();
//	}
//
//	@Test
//	public void testTags() throws Exception {
		driver.get(baseUrl + "/tag_groups?lan=en");
		driver.findElement(By.linkText("New Tag Group")).click();
		driver.findElement(By.id("tag_group_name")).clear();
		driver.findElement(By.id("tag_group_name")).sendKeys("Buckleded");
		driver.findElement(By.id("tag_group_i18n_en_title")).clear();
		driver.findElement(By.id("tag_group_i18n_en_title")).sendKeys("Buckleded");
		driver.findElement(By.id("tag_group_i18n_ar_title")).clear();
		driver.findElement(By.id("tag_group_i18n_ar_title")).sendKeys("االضوء الخلفي");
		driver.findElement(By.id("tag_group_i18n_en_description")).clear();
		driver.findElement(By.id("tag_group_i18n_en_description")).sendKeys("Back light sample copy.");
		driver.findElement(By.id("tag_group_i18n_en_description")).clear();
		driver.findElement(By.id("tag_group_i18n_en_description")).sendKeys("Back light sample copy. Back light sample copy. \nBack light sample copy.");
		driver.findElement(By.id("tag_group_i18n_ar_description")).clear();
		driver.findElement(By.id("tag_group_i18n_ar_description")).sendKeys("الضوء الخلفي الضوء الخلفي الضوء الخلفي الضوء الخلفي  الضوء الخلفي الضوء الخلفي");
		driver.findElement(By.id("add_more_tag")).click();
		
		
		
		driver.findElement(By.xpath("//input[@class='enText']")).sendKeys("flash");
		driver.findElement(By.xpath("//input[@class='arText']")).sendKeys("وء الخلف");
		
		driver.findElement(By.id("add_more_tag")).click();
		
		driver.findElement(By.xpath("//input[@class='enText']")).clear();
		driver.findElement(By.xpath("//input[@class='enText']")).sendKeys("flash");
		driver.findElement(By.xpath("//input[@class='arText']")).clear();
		driver.findElement(By.xpath("//input[@class='arText']")).sendKeys("وء الخلف");
	
		
		driver.findElement(By.id("tag_group_submit")).click();
		driver.findElement(By.linkText("OK")).click();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
