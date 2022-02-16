import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/40723/Desktop/ProiectSDA_Modul8/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/checkbox");
        Thread.sleep(1000);
        driver.findElement(By.id("checkbox-1")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#checkbox-2")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
