package Week2.Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		//Locate the element with Select
		WebElement dd1 = driver.findElement(By.id("dropdown1"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByIndex(2);
		WebElement dd2 = driver.findElement(By.name("dropdown2"));
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByVisibleText("Appium");
		WebElement dd3 = driver.findElement(By.name("dropdown3"));
		Select dropdown3 = new Select(dd3);
		dropdown3.selectByValue("2");
		int sizes = dropdown1.getOptions().size();
		System.out.println(sizes);
		//dropdown.selectByValue("3");
		//dropdown.selectByIndex(1);
		/*int size = dropdown1.getOptions().size();
		dropdown1.selectByIndex(size-2);*/
		driver.close();
	}	
}
