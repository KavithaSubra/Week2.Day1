package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("ABC");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
				firstName.sendKeys("KK");	
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']")).sendKeys("S");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select option1 = new Select(source);
		option1.selectByVisibleText("Existing Customer");
		WebElement campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select option2 = new Select(campaign);
		option2.selectByIndex(4);
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstNameLocal']")).sendKeys("KK");	
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastNameLocal']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_personalTitle']")).sendKeys("Ms.");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_birthDate']")).sendKeys("01/01/2020");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_generalProfTitle']")).sendKeys("Professor");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_departmentName']")).sendKeys("Math");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_annualRevenue']")).sendKeys("100K");
		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select option3 =new Select(currency);
		option3.selectByIndex(4);
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select option4 =new Select(industry);
		option4.selectByIndex(9);
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_numberEmployees']")).sendKeys("100");
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select option5 =new Select(owner);
		option5.selectByIndex(5);
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_sicCode']")).sendKeys("100ABC");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_tickerSymbol']")).sendKeys("ABC");
		driver.findElement(By.xpath("//textarea[@id = 'createLeadForm_description']")).sendKeys("desc");
		driver.findElement(By.xpath("//textarea[@id = 'createLeadForm_importantNote']")).sendKeys("Note");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryPhoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryPhoneAreaCode']")).sendKeys("044");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_primaryPhoneNumber')]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryPhoneExtension']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryPhoneAskForName']")).sendKeys("Kavi");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryEmail']")).sendKeys("kavi.test@mail.com");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryWebUrl']")).sendKeys("www.google.com");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_generalToName']")).sendKeys("KK");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_generalAttnName']")).sendKeys("KK");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_generalAddress1']")).sendKeys("Nehru Street");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_generalAddress2']")).sendKeys("Trichy");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_generalCity']")).sendKeys("Trichy");
		WebElement state = driver.findElement(By.xpath("//select[@id = 'createLeadForm_generalStateProvinceGeoId']"));
		Select option6 = new Select(state);
		option6.selectByValue("AL");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_generalPostalCode']")).sendKeys("111");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_generalPostalCodeExt']")).sendKeys("22");  
		driver.findElement(By.name("submitButton")).click();
		String fName = firstName.getAttribute("value");
		System.out.println("First Name is: " + fName);
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);

		driver.close();
	}

}
