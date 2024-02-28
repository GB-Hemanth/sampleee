package samp.ple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class App 
{
    public static void main( String[] args )
    {
    	
    		 //System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
    			WebDriverManager.chromedriver().setup();
    		      WebDriver  driver = new ChromeDriver();
    		        driver.get("https://www.saucedemo.com/");
    }
}
