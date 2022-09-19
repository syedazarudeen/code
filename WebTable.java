package com.selenium_topics;



	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class WebTable {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",s+"\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			
			driver.equals(driver);
//			 int amount = driver.findElements(By.xpath("(//table[@id='product'])[2]/tbody/tr/td[4]"))
//			 System.out.println("no fo amount ="+amount);
	////
//			for (WebElement webElement : amount) {
//				System.out.println(webElement.getText());
//				
			} 
				
//			driver.findElement(By.xpath("(//div[@class='totalAmount'])")).getText();
}
