import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class SwitchAndCloseWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        driver.findElement(By.id("new-tab-button")).click();
        driver.findElement(By.id("new-tab-button")).click();

        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(0));
        System.out.println("Current page title is"+driver.getTitle());

        driver.switchTo().window(newTb.get(1));
        System.out.println("Current page title is"+driver.getTitle());

        driver.switchTo().window(newTb.get(2));
        System.out.println("Current page title is"+driver.getTitle());

        /*for (String tabone: driver.getWindowHandles() ){
            driver.switchTo().window(tabone);
            Thread.sleep(4000);
        }*/
        driver.close();
    }
}
