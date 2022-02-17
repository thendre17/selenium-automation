import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAndCloseWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        driver.findElement(By.id("new-tab-button")).click();
        driver.findElement(By.id("new-tab-button")).click();
        for (String tabone: driver.getWindowHandles() ){
            driver.switchTo().window(tabone);
            Thread.sleep(4000);
        }
        driver.close();
    }
}
