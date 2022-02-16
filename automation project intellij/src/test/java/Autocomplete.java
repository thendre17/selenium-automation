//in java, numele clasei, prin conventie, trebuie sa fie denumit cu litera mare la inceput
// de aceea, numele fisierului trebuie sa fie scrie tot cu litera mare, pentru ca numele fisierului trebuie sa fie identic cu numele clasei

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/40723/Desktop/ProiectSDA_Modul8/chromedriver.exe");
// la linia 3 i-am spus sistemului unde sa gaseasca driverul

        WebDriver driver = new ChromeDriver();                               // Aici am creat un nou obiect al clasei chrome driver care se numeste driver si care are tipul de date webdriver.
        driver.get("https://formy-project.herokuapp.com/autocomplete");      // aici am deschis link-ul soecificat intre paranteze
        WebElement autocomplete = driver.findElement(By.id("autocomplete")); // identificam prin intermediul id-ului elementul text box in care se poate introduce adresa
                                                                             // elementul identificat este salvat intr-o variabila numita "autocomplete" care are tipul de date WebElement
        autocomplete.sendKeys("Strada Iancu Gontea nr. 177");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/table/tr/td[2]/button")).click();

// o variabila este o adresa de memorie la care sunt stocate informatii
// o functie reprezinta un set de instructiuni grupate sub un singur nume
// o clasa reprezinta un tipar care defineste atributele pe care trebuie sa le aiba un obiect si actiunile pe care poate sale faca
// un obiect este o instata a unei clase adica o reprezentare reala creata pe baza tiparului definit in clasa
// un tip de data este o proprietate a unei variabile sau functii care specifica ce informatii pot sa fie stocate in variabila sau returnata de catre functie
// putem spune ca o functie returneaza ceva atunci cand trimite rezultatul actiunii pe care o face catre exterior

    }
}
