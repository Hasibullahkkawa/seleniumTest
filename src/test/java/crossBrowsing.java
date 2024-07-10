import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class crossBrowsing {
    public static void main(String[] args) {


        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();


    }
}

