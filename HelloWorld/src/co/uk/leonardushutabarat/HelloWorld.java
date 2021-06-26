package co.uk.leonardushutabarat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HelloWorld {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.edge.driver", "C:\\Temp\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.uk/");
		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
		System.out.println(driver.getTitle());
		System.out.println("Example of Fetch");
		System.out.println("Example of Fetch 2");

	}

}
