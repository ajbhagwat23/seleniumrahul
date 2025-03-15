package pk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loc {
	public static void main(String[]args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("inputUsername")).sendKeys("Akshay");
		
		driver.findElement(By.name("inputPassword")).sendKeys("Bhagwat");
		Thread.sleep(3000);
		
		driver.findElement(By.className("submit")).click();
		
		//implicit wait
		Thread.sleep(3000);
		
		String d= driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(d);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Akshay");
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Bhagwat");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("akshayy");
				
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("rahul shetty");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String a= driver.findElement(By.cssSelector("p[Class='infoMsg']")).getText();
		System.out.println(a);
		//Assert.assertEqual(a,"you are not logged in");
		
		driver.findElement(By.className("go-to-login-btn")).click();
		
		driver.findElement(By.cssSelector("input[id='inputUsername']")).sendKeys("Akshay");
		
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		String b=driver.findElement(By.xpath("//div[@class='login-container']")).getText();
		System.out.println(b);Thread.sleep(3000);
		driver.findElement(By.className("logout-btn")).click();
		
		Thread.sleep(3000);
		driver.quit();
		}
	
	public void getpassword(WebDriver driver) throws Exception
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("reset-pwd-btn")).click();
		String pass= driver.findElement(By.cssSelector("p[Class='infoMsg']")).getText();
		System.out.println(pass);
		//Please use temporary password 'rahulshettyacademy' to Login.
	}

}
