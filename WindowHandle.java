package com.selenium_topics;



	import java.time.Duration;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptException;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.remote.RemoteWebDriver;

	public class WindowHandle {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			String s = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",s+"\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.SHIFT,"mobile");
			Thread.sleep(3000);
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//div[@data-component-type='s-search-result'])[1]")).click();
			driver.findElement(By.xpath("(//div[@data-component-type='s-search-result'])[1]")).click();


			String parentID = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			
		    for (String string : windowHandles) {
		    	if(!parentID.equals(string)) {
				
			System.out.println(driver.getTitle());
		    	
		    	
		    	
		    	
			Set<String> page = driver.getWindowHandles();
			java.util.Iterator<String> next = page.iterator();
			String parent = next.next();
			driver.switchTo().window(parent);
			System.out.println(driver.getTitle());
			String child = next.next();
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());}
		    	
			
		}

	}}

