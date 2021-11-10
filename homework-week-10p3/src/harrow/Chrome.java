package harrow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

    public static void main(String[] args) {

        String url = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.get(url);
String getTitle = driver.getTitle();
        System.out.println(getTitle);
        driver.close();


    }
}
