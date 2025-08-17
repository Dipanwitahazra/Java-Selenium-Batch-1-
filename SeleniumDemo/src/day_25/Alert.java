package day_25;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        
     
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert = (Alert) driver.switchTo().alert();
        System.out.println("Alert says: " + alert.getText());
        alert.accept();

        Thread.sleep(2000);

     
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert confirmAlert = (Alert) driver.switchTo().alert();
        System.out.println("Confirm says: " + confirmAlert.getText());
        confirmAlert.dismiss(); 

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert promptAlert = (Alert) driver.switchTo().alert();
        System.out.println("Prompt says: " + promptAlert.getText());
        promptAlert.sendKeys("Hello Selenium!");
        promptAlert.accept();

        Thread.sleep(2000);

        driver.quit(); 
    }

	private void dismiss() {
		// TODO Auto-generated method stub
		
	}

	private void accept() {
		// TODO Auto-generated method stub
		
	}

	private void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}

	private String getText() {
		// TODO Auto-generated method stub
		return null;
	}
}