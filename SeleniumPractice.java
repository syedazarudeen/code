package com.selenium_topics;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class SeleniumPractice {

		private static char[] Text;

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","D:\\java\\selenium drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://leafground.com/pages/checkbox.html");
			Thread.sleep(5000);
			driver.manage().window().maximize();
//			driver.findElement(By.className("login")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.id("email_create")).sendKeys("5566@gmail.com");
//			Thread.sleep(5000);
//			driver.findElement(By.id("SubmitCreate")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.name("id_gender")).click();
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//form[@id='account-creation_form']//following::input[3]")).sendKeys("Syed");
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//form[@id='account-creation_form']//following::input[4]")).sendKeys("Azarudeen");
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//form[@id='account-creation_form']//following::input[5]")).sendKeys("");
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//form[@id='account-creation_form']//following::input[6]")).sendKeys("123456789");
//			Thread.sleep(10000);
//			WebElement day = driver.findElement(By.xpath("//select[contains(@name,'days')]"));
//			Select s = new Select(day);
//			s.selectByValue("7");
//			WebElement month = driver.findElement(By.xpath("//select[contains(@name,'months')]"));
//			Select s1 = new Select(month);
//			s1.selectByValue("4");
//			WebElement year = driver.findElement(By.xpath("//select[contains(@name,'years')]"));
//			Select s2 = new Select(year);
//			s2.selectByValue("2021");
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//form[@id='account-creation_form']//following::input[7]")).click();
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//form[@id='account-creation_form']//following::input[8]")).click();
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//form[@id='account-creation_form']//following::input[9]")).sendKeys("");
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//form[@id='account-creation_form']//following::input[10]")).sendKeys("");
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//form[@id='account-creation_form']//following::input[11]")).sendKeys("greens institute");
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//form[@id='account-creation_form']//following::input[12]")).sendKeys("kgf");
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//form[@id='account-creation_form']//following::input[13]")).sendKeys("hiii");
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//form[@id='account-creation_form']//following::input[14]")).sendKeys("chennai");
//			Thread.sleep(10000);
//			WebElement state = driver.findElement(By.id("id_state"));
//			Select s3 = new Select(state);
//			s3.selectByValue("3");
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//form[@id='account-creation_form']//following::input[15]")).sendKeys("600037");
//			Thread.sleep(10000);
//	    	WebElement country = driver.findElement(By.id("id_country"));
//			Select s4 = new Select(country);
//			s4.selectByValue("21");
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//form[@id='account-creation_form']//following::input[16]")).sendKeys("2175827152");
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//form[@id='account-creation_form']//following::input[17]")).sendKeys("1652381528");
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//form[@id='account-creation_form']//following::input[18]")).sendKeys("");
//			Thread.sleep(10000);
//			driver.findElement(By.id("submitAccount")).click();
//			driver.close();
//			

			driver.findElement(By.xpath("//div[@class='example'][1]//input[1]")).click();
			driver.findElement(By.xpath("//div[@class='example'][1]//input[2]")).click();
			driver.findElement(By.xpath("//div[@class='example'][1]//input[3]")).click();
			driver.findElement(By.xpath("//div[@class='example'][1]//input[4]")).click();
			driver.findElement(By.xpath("//div[@class='example'][1]//input[5]")).click();
			
			driver.findElement(By.xpath("//div[@class='example'][2]//input[1]")).click();
			driver.findElement(By.xpath("//div[@class='example'][2]//input[1]")).click();

			
			driver.findElement(By.xpath("//div[@class='example'][3]//input[1]")).click();
			driver.findElement(By.xpath("//div[@class='example'][3]//input[2]")).click();
			driver.findElement(By.xpath("//div[@class='example'][3]//input[2]")).click();

			
			driver.findElement(By.xpath("//div[@class='example'][4]//input[1]")).click();
			driver.findElement(By.xpath("//div[@class='example'][4]//input[2]")).click();
			driver.findElement(By.xpath("//div[@class='example'][4]//input[3]")).click();
			driver.findElement(By.xpath("//div[@class='example'][4]//input[4]")).click();
			driver.findElement(By.xpath("//div[@class='example'][4]//input[5]")).click();
			driver.findElement(By.xpath("//div[@class='example'][4]//input[6]")).click();

			driver.findElement(By.xpath("//div[@class='example'][1]//input[1]")).click();
			driver.findElement(By.xpath("//div[@class='example'][1]//input[2]")).click();
			driver.findElement(By.xpath("//div[@class='example'][1]//input[3]")).click();
			driver.findElement(By.xpath("//div[@class='example'][1]//input[4]")).click();
			driver.findElement(By.xpath("//div[@class='example'][1]//input[5]")).click();
			
			driver.findElement(By.xpath("//div[@class='example'][2]//input[1]")).click();

			
			driver.findElement(By.xpath("//div[@class='example'][3]//input[1]")).click();
			driver.findElement(By.xpath("//div[@class='example'][3]//input[2]")).click();

			
			driver.findElement(By.xpath("//div[@class='example'][4]//input[1]")).click();
			driver.findElement(By.xpath("//div[@class='example'][4]//input[2]")).click();
			driver.findElement(By.xpath("//div[@class='example'][4]//input[3]")).click();
			driver.findElement(By.xpath("//div[@class='example'][4]//input[4]")).click();
			driver.findElement(By.xpath("//div[@class='example'][4]//input[5]")).click();
			driver.findElement(By.xpath("//div[@class='example'][4]//input[6]")).click();


		

		}
}
