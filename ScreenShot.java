 package com.selenium_topics;


	import java.awt.image.BufferedImage;
	import java.io.File;
	import java.time.Duration;
	import java.util.concurrent.TimeUnit;

	import javax.imageio.ImageIO;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import net.bytebuddy.asm.Advice.This;

	public class ScreenShot {
		
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			String s = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",s+"\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_833o4zmtnn_b&adgrpid=55759171661&hvpone=&hvptwo=&hvadid=294130660745&hvpos=&hvnetw=g&hvrand=14342934482903467458&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061927&hvtargid=kwd-326600735004&hydadcr=5840_1914862&gclid=Cj0KCQjw5ZSWBhCVARIsALERCvyyxcI9p-ctzpJ3e8P1x1qxJAYxttFEqq_KocS_7QeiPXSiwPNp6b8aAsIHEALw_wcB");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs, new File("C:\\eclipse\\SeleniumProject\\screenshot\\screen.png"));
			
			WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
			File screenshotAs1 = logo.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs1, new File("C:\\eclipse\\SeleniumProject\\screenshot\\screen1.png"));
		
			
		}
		
		
		

}
