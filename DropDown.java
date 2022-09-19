package com.selenium_topics;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class DropDown   {

		public static void main(String[] args)throws Exception {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\eclipse\\SeleniumProject\\drivers\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.anhtester.com/basic-select-dropdown-demo.html");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			WebElement list = driver.findElement(By.cssSelector("select[name='States']"));
			Select s = new Select(list);
	        s.selectByIndex(1);
			s.selectByVisibleText("Pennsylvania");
			s.selectByVisibleText("Washington");
			Thread.sleep(2000);
			List<WebElement> elements = driver.findElements(By.id("multi-select"));
			for (WebElement webElement : elements) {
				System.out.println(webElement.getText());
			}
			driver.findElement(By.cssSelector("button[id='printMe']")).click();
			Thread.sleep(2000);
			WebElement element = driver.findElement(By.xpath("//p[@class='getall-selected']"));
			System.out.println(element.getText());

//			driver.get("https://semantic-ui.com/modules/dropdown.html");
//			driver.findElement(By.xpath("(//i[@class='dropdown icon']/parent::div)[8]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//div[text()='Angular'][1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//div[text()='CSS'][1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//div[text()='HTML'][1]")).click();



			


			
		


		
		
	}
}
