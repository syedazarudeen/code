package com.selenium_topics;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AlertBox {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\eclipse\\SeleniumProject\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
//			driver.get("http://leafground.com/pages/Alert.html");
//			
//			driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
//			System.out.println(driver.switchTo().alert().getText());
//			Thread.sleep(2000);
//			driver.switchTo().alert().accept();
//			System.out.println("-----x------");
//			
//			driver.findElement(By.cssSelector("button[onclick='confirmAlert()']")).click();
//			System.out.println(driver.switchTo().alert().getText());
//			Thread.sleep(2000);
//			driver.switchTo().alert().dismiss();
//			WebElement element1 = driver.findElement(By.id("result"));
//			System.out.println(element1.getText());
//			Thread.sleep(2000);
//			System.out.println("-----x------");
//			
//			driver.findElement(By.cssSelector("button[onclick='confirmPrompt()']")).click();
//			Thread.sleep(2000);
//			driver.switchTo().alert().sendKeys("selenium");
//			Thread.sleep(2000);
//			driver.switchTo().alert().accept();
//			Thread.sleep(2000);
//			WebElement element2 = driver.findElement(By.id("result1"));
//			System.out.println(element2.getText());
//			Thread.sleep(2000);
//			System.out.println("-----x------");
//			
//			driver.findElement(By.xpath("//button[@onclick='lineBreak()']")).click();
//			System.out.println(driver.switchTo().alert().getText());
//			Thread.sleep(2000);
//			driver.switchTo().alert().accept();
//			System.out.println("-----x------");
//			


			driver.get("https://demoqa.com/alerts");
			Thread.sleep(2000);

			driver.findElement(By.cssSelector("#alertButton")).click();
			System.out.println(driver.switchTo().alert().getText());
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println("-----x------");
			
			driver.findElement(By.id("timerAlertButton")).click();
			Thread.sleep(5000);
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println("-----x------");
			
			driver.findElement(By.id("confirmButton")).click();
			System.out.println(driver.switchTo().alert().getText());
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			WebElement element1 = driver.findElement(By.cssSelector("#confirmResult"));
			System.out.println(element1.getText());
			Thread.sleep(2000);
			System.out.println("-----x------");
			
			driver.findElement(By.cssSelector("#promtButton")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().sendKeys("selenium");
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			WebElement element2 = driver.findElement(By.cssSelector("#promptResult"));
			System.out.println(element2.getText());
			Thread.sleep(2000);
			System.out.println("-----x------");
			
			
		}

	}

