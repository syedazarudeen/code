package com.selenium_topics;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Scroll {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",s+"\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://leafground.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			//METHOD ONE//
			js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[17]")));
			//METHOD TWO//
			js.executeScript("window.scrollBy(100,500)"," ");

		}
}
