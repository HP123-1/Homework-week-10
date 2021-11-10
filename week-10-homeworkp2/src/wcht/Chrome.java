package wcht;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

    public static void main(String[] args) {

        String url = "https://www.wcht.org.uk/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver2 = new ChromeDriver();
        driver2.get(url);
        driver2.manage().window().maximize();
        driver2.getTitle();
        driver2.close();

    }

}