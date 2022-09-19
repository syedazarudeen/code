package com.selenium_topics;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Frame     {

		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\eclipse\\SeleniumProject\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://leafground.com/pages/frame.html");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			System.out.println("-----frame-----");
	        WebElement element = driver.findElement(By.xpath("(//div[@id='wrapframe'])[1]/iframe"));
			driver.switchTo().frame(element);
			WebElement element2 = driver.findElement(By.xpath("//button[@id='Click']/parent::body"));
			System.out.println(element2.getText());
			WebElement element3 = driver.findElement(By.id("Click"));
			element3.click();
			System.out.println(element3.getText());
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			
			System.out.println("-----nested_frame-----");
			 WebElement element4 = driver.findElement(By.xpath("(//div[@id='wrapframe'])[2]/iframe"));
		     driver.switchTo().frame(element4);
		     WebElement element7 = driver.findElement(By.id("frame2"));
		     driver.switchTo().frame(element7);
//		     driver.switchTo().frame("frame2");
		 	WebElement element5 = driver.findElement(By.xpath("//button[@id='Click1']/parent::body"));
			System.out.println(element5.getText());
			WebElement element6 = driver.findElement(By.id("Click1"));
			element6.click();
			System.out.println(element6.getText());
			
		     
		}
}
