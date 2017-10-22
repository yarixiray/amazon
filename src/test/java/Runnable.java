import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Runnable {

    private static String BASE_URL = "https://www.amazon.com/";


    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(BASE_URL);
        driver.findElement(By.cssSelector("a[href*='bestsellers']")).click();
        //Assert.assertEquals("Amazon Best Sellers: Best Digital Cameras",driver.getTitle());

        List<WebElement> links = driver.findElements(By.xpath("//div[@id='zg_centerListWrapper']//a[@class='a-link-normal']"));
        links.get(8).click();


        for (int i = 0; i <= 7; i++) {

            List<WebElement> checkBox2 = driver.findElements(By.xpath("//input[@type='checkbox' and @name='offeringID.2']"));
            for (WebElement checkBox : checkBox2) {
                if (checkBox.isEnabled()) {
                    checkBox.click();
                }
            }


//        WebElement submit;
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='submit.addToCart']")));
            element.click();
            for (int j = 0; j < 6; j++) {
                driver.navigate().back();
            }
        }

//        driver.close();
//        driver.quit();
    }

//    @Test
//    public void goToThePage() throws Exception {
//        BestSellersDigitalCameras test = new BestSellersDigitalCameras(driver);
//        test.goToBestSellersPage();
//    }

}
