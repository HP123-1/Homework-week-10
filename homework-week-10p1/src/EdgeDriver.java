import org.openqa.selenium.WebDriver;

public class EdgeDriver {

    public static void main(String[] args) {
        String url = "https://www.barclays.co.uk/";

        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver2 = new org.openqa.selenium.edge.EdgeDriver();
        driver2.manage().window().maximize();
        driver2.getTitle();
        String getTitle = driver2.getTitle();
        System.out.println(url);
        driver2.close();

    }
}
