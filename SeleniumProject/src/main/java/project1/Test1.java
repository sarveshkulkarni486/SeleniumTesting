package project1;
import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver.get("https://seleniumbase.io/demo_page");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("myTextarea")).sendKeys("Hello World");
		Thread.sleep(1000);
		driver.close();
		System.out.println("Success");
		
		

	}


}
