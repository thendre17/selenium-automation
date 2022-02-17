import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:/Users/40723/Desktop/ProiectSDA_Modul8/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        Thread.sleep(5000);

        driver.findElement(By.id("alert-button")).click();
        Thread.sleep(5000);

        Alert alert = driver.switchTo().alert(); // o alerta este considerata ca o fereastra separata, motiv pentru care nu
        // putem sa o identificam prin inspect, ci trebuie sa instruim sistemul sa se mute in fereastra respectiva
        Thread.sleep(5000);

        alert.dismiss(); // functia dismiss este folosita pentru a inchide o alerta (echivalent cu a da click pe butonul ok)
        Thread.sleep(5000);
        driver.quit();
    }
}
