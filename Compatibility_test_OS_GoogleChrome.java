// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CompatibilitytestOSGoogleChromeDesktopTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void compatibilitytestOSGoogleChromeDesktop() {
    // Test name: Compatibility_test_OS_GoogleChrome_Desktop
    // Step # | name | target | value
    // 1 | open | /website | 
    driver.get("https://ramoncristian00.wixsite.com//website");
    // 2 | setWindowSize | 2560x1080 | 
    driver.manage().window().setSize(new Dimension(2560, 1080));
    // 3 | click | id=DrpDwnMn00label | 
    driver.findElement(By.id("DrpDwnMn00label")).click();
    // 4 | click | id=DrpDwnMn01label | 
    driver.findElement(By.id("DrpDwnMn01label")).click();
    // 5 | runScript | window.scrollTo(0,448) | 
    js.executeScript("window.scrollTo(0,448)");
    // 6 | click | id=DrpDwnMn02label | 
    driver.findElement(By.id("DrpDwnMn02label")).click();
    // 7 | mouseOver | id=DrpDwnMn02label | 
    {
      WebElement element = driver.findElement(By.id("DrpDwnMn02label"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 8 | mouseOut | id=DrpDwnMn02label | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 9 | click | id=DrpDwnMn03label | 
    driver.findElement(By.id("DrpDwnMn03label")).click();
    // 10 | click | id=DrpDwnMn04label | 
    driver.findElement(By.id("DrpDwnMn04label")).click();
    // 11 | click | id=DrpDwnMn05label | 
    driver.findElement(By.id("DrpDwnMn05label")).click();
  }
}
