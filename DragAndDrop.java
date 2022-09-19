package com.selenium_topics;


	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class DragAndDrop {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//MOUSE ACTIONS//
		System.out.println("-----DRAG AND DROP-----");
		WebElement draggable = driver.findElement(By.id("draggable"));
		System.out.println(draggable.getText());
		WebElement droppable = driver.findElement(By.id("droppable"));
		System.out.println(droppable.getText());
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable, droppable).build().perform();
		
		System.out.println("-----HOLD AND RELEASE-----");
		driver.get("http://leafground.com/pages/drag.html");
		WebElement drag = driver.findElement(By.xpath("//p[@style='color: whitesmoke']//parent::div"));
		System.out.println(drag.getText());
		Actions actions = new Actions(driver); 
		Thread.sleep(2000);
		actions.clickAndHold(drag);
		actions.moveByOffset(300,100);
		actions.release().perform();
		

		//KEY BOARD ACTIONS//
		driver.get("https://www.amazon.in/?nis=8");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(Keys.SHIFT,"mobile");
		Thread.sleep(2000);
		search.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		Thread.sleep(2000);
		search.sendKeys(Keys.SHIFT,"watch");
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_DELETE);
		


		
	}
}
