package com.tasawr.sel1;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel1 {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.google.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testSel1() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.id("gbqfq")).click();
		driver.findElement(By.id("gbqfq")).clear();
		driver.findElement(By.id("gbqfq")).sendKeys("apple inc.");
		driver.findElement(By.id("gbqfb")).click();
		driver.findElement(By.cssSelector("em")).click();
		driver.findElement(By.cssSelector("#gn-ipad > a > span")).click();
		driver.findElement(By.xpath("//body[@id='overview']/a[4]")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		driver.findElement(By.xpath("//body[@id='overview']/a[4]")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		driver.findElement(By.xpath("//body[@id='overview']/a[4]")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		driver.findElement(By.xpath("//body[@id='overview']/a[4]")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		driver.findElement(By.xpath("//body[@id='overview']/a[4]")).click();
		driver.findElement(By.xpath("//body[@id='overview']/a[4]")).click();
		driver.findElement(By.xpath("//body[@id='overview']/a[4]")).click();
		driver.findElement(By.xpath("//body[@id='overview']/a[4]")).click();
		driver.findElement(By.xpath("//body[@id='overview']/a[4]")).click();
		driver.findElement(By.xpath("//body[@id='overview']/a[4]")).click();
		driver.findElement(By.xpath("//body[@id='overview']/a[4]")).click();
		driver.findElement(By.xpath("//body[@id='overview']/a[4]")).click();
		driver.findElement(By.xpath("//body[@id='overview']/a[4]")).click();
		//sdlkfdklfdlkfds
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
