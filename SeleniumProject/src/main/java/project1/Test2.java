package project1;
import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		driver.manage().window().maximize();
		WebElement element1 = driver.findElement(By.id("image"));
		WebElement element2 = driver.findElement(By.id("box"));
		
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		
		action.dragAndDrop(element1, element2);
		Thread.sleep(1000);
		String text = element2.getText();
		Thread.sleep(2000);
		System.out.println("Success" + text);
		
		driver.close();

	}

}
