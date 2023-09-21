package Q4.Q4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class q4_ {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Lakshmi Priya\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
        driver=new EdgeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com");
        Thread.sleep(2000);
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@title, 'notification-frame')]")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
 
        WebElement webElement = driver.findElement(By.xpath("//a[@data-cy='mmtLogo']"));
        Actions action = new Actions(driver);
        action.moveToElement(webElement).click(webElement).build().perform();
        
        
        WebElement  flights=findElementByXPath("//li[@class='menu_Flights']");
        clickElement(flights);
        Thread.sleep(2000);
        
        WebElement  oneway=findElementByXPath("//li[@data-cy='oneWayTrip']");
        clickElement(oneway);
        Thread.sleep(2000);
        
        WebElement  from=findElementByXPath("//input[@id='fromCity']");
        from.sendKeys("Hyderabad");
        Thread.sleep(2000);
        
        
        WebElement  fromEnter=findElementByXPath("//p[text()='Hyderabad, India']");
        clickElement(fromEnter);
        
        WebElement  to=findElementByXPath("//input[@id='toCity']");
        to.sendKeys("New York");
        Thread.sleep(2000);
        
        WebElement  toEnter=findElementByXPath("//span[text()='New York']");
        clickElement(toEnter);
       
        driver.quit();
           
}
	public static WebElement findElementByXPath(String xpath)
	{
		return driver.findElement(By.xpath(xpath));
	}
	public static void clickElement(WebElement element)
	{
		element.click();
	}
}



	