package Selenium.Test.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
   @Test
   public void test1(){
	   System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mayank\\Desktop\\geckodriver.exe");
   	WebDriver driver = new FirefoxDriver();
   	driver.get("http://www.google.com/");
   	driver.close();
   }
}
