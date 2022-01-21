package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnEdit {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Edit.html");
	driver.manage().window().maximize();
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("kavitha.s@sample.com",Keys.TAB);
	String emailValue = email.getAttribute("value");
	System.out.println(emailValue);
	
	WebElement append = driver.findElement(By.xpath("//input[@value='Append ']"));
	append.sendKeys("ABC",Keys.TAB);
	WebElement text = driver.findElement(By.xpath("//input[@value='TestLeaf']"));
	text.sendKeys("TestLeaf",Keys.TAB);
	WebElement clear = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
	clear.clear();
	clear.sendKeys(Keys.TAB);
	WebElement disable = driver.findElement(By.xpath("//input[@disabled='true']"));
	if(disable.isEnabled())
	System.out.println("The text box is enabled");
	else
		System.out.println("The text box is disabled");
		
	driver.close();
	
}
}
