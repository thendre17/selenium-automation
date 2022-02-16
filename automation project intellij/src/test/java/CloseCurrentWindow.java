import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseCurrentWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/40723/Desktop/ProiectSDA_Modul8/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        Thread.sleep(3000);
        driver.findElement(By.id("new-tab-button")).click();
        Thread.sleep(5000);
        driver.close(); //functia close inchide tab-ul activ

    }
}
