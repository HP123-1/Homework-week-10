package harrow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MsEdge {
    public static void main(String[] args) {
        String url = "https://www.harrow.gov.uk/";

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
