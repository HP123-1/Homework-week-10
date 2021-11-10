package xcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MsEdge {
    public static void main(String[] args) {
        String url = "https://www.x-cart.com/";

        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.getTitle();
        String getTitle = driver.getTitle();
        System.out.println(getTitle);
        driver.close();

    }
}




