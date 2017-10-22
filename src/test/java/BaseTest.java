import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;
    protected static String pageUrl = "https://www.amazon.com/";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }


}
