package nobcommerce;

import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class EdgeDriver {
    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/";

        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new org.openqa.selenium.edge.EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.getTitle();
        String getTitle = driver.getTitle();
        System.out.println(getTitle);
        driver.close();


    }
}
