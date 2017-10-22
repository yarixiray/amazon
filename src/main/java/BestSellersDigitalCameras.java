import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BestSellersDigitalCameras {
    private WebDriver driver;
    private static String pageUrl = "https://www.amazon.com/";
    private By bestSellers = By.cssSelector("a[href*='bestsellers']");

    public BestSellersDigitalCameras(WebDriver driver) {
        this.driver = driver;
        driver.get(pageUrl);
        PageFactory.initElements(driver, this);
    }

    public void goToBestSellersPage() {
        driver.findElement(bestSellers).click();
    }
}
