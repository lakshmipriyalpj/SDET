package Q3.Q3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Logo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver;
		System.setProperty("webdriver.edge.driver","C:\\Users\\Lakshmi Priya\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
        driver=new EdgeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com");
        Thread.sleep(2000);
       
        WebElement logo = driver.findElement(By.xpath("//img[@alt=\"Make My Trip\"]"));
        if (logo.isDisplayed()) {
            System.out.println("MakeMyTrip logo is present on the page.");
        } else {
            System.out.println("MakeMyTrip logo is NOT present on the page.");
        }
        driver.quit();
	}

}
