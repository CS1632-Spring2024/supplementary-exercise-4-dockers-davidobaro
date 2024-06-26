// Generated by Selenium IDE
package edu.pitt.cs;

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

// import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
  }

  @After
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void tEST1LINKS() {
    driver.get("http://localhost:8080");
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/\')]"));
      assert (elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/rent-a-cat\')]"));
      assert (elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/feed-a-cat\')]"));
      assert (elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/greet-a-cat\')]"));
      assert (elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/reset\')]"));
      assert (elements.size() > 0);
    }
  }

  @Test
  public void tEST2RESET() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(967, 727));
    driver.findElement(By.linkText("Reset")).click();
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    driver.findElement(By.id("rentID")).click();
    driver.findElement(By.id("rentID")).sendKeys("1");
    driver.findElement(By.xpath("//button[contains(.,\'Rent\')]")).click();
    driver.findElement(By.id("rentID")).clear();
    driver.findElement(By.id("rentID")).click();
    driver.findElement(By.id("rentID")).sendKeys("2");
    driver.findElement(By.xpath("//button[contains(.,\'Rent\')]")).click();
    driver.findElement(By.id("rentID")).clear();
    driver.findElement(By.id("rentID")).click();
    driver.findElement(By.id("rentID")).sendKeys("3");
    driver.findElement(By.xpath("//button[contains(.,\'Rent\')]")).click();
    driver.findElement(By.id("rentID")).clear();
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(1)")).getText(), is("Rented out"));
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(2)")).getText(), is("Rented out"));
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(3)")).getText(), is("Rented out"));
    driver.findElement(By.linkText("Reset")).click();
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(1)")).getText(), is("ID 1. Jennyanydots"));
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(2)")).getText(),
        is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(3)")).getText(), is("ID 3. Mistoffelees"));
  }

  @Test
  public void tEST3CATALOG() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(963, 724));
    {
      WebElement element = driver.findElement(By.xpath("//li[1]/img"));
      String attribute = element.getAttribute("src");
      vars.put("cat1", attribute);
    }
    assertEquals(vars.get("cat1").toString(), "https://cs1632.appspot.com/images/cat1.jpg");
    {
      WebElement element = driver.findElement(By.xpath("//li[2]/img"));
      String attribute = element.getAttribute("src");
      vars.put("cat2", attribute);
    }
    assertEquals(vars.get("cat2").toString(), "https://cs1632.appspot.com/images/cat2.jpg");
    {
      WebElement element = driver.findElement(By.xpath("//li[3]/img"));
      String attribute = element.getAttribute("src");
      vars.put("cat3", attribute);
    }
    assertEquals(vars.get("cat3").toString(), "https://cs1632.appspot.com/images/cat3.jpg");
  }

  @Test
  public void tEST4LISTING() {
    // Test name: TEST-4-LISTING
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/reset |
    driver.get("https://cs1632.appspot.com/reset");
    // 2 | setWindowSize | 867x651 |
    driver.manage().window().setSize(new Dimension(867, 651));
    // 3 | click | linkText=Catalog |
    driver.findElement(By.linkText("Catalog")).click();
    // 4 | assertText | css=.list-group-item:nth-child(1) | ID 1. Jennyanydots
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(1)")).getText(), is("ID 1. Jennyanydots"));
    // 5 | assertText | css=.list-group-item:nth-child(2) | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(2)")).getText(),
        is("ID 2. Old Deuteronomy"));
    // 6 | assertText | css=.list-group-item:nth-child(3) | ID 3. Mistoffelees
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(3)")).getText(), is("ID 3. Mistoffelees"));
  }

  @Test
  public void tEST5RENTACAT() {
    driver.get("https://cs1632.appspot.com/reset");
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Rent\')]"));
      assert (elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Return\')]"));
      assert (elements.size() > 0);
    }
  }

  @Test
  public void tEST6RENT() {
    driver.get("https://cs1632.appspot.com/reset");
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    driver.findElement(By.id("rentID")).click();
    driver.findElement(By.id("rentID")).sendKeys("1");
    driver.findElement(By.xpath("//button[contains(.,\'Rent\')]")).click();
    assertThat(driver.findElement(By.xpath("//li[contains(.,\'Rented out\')]")).getText(), is("Rented out"));
    assertThat(driver.findElement(By.xpath("//li[contains(.,\'ID 2. Old Deuteronomy\')]")).getText(),
        is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.xpath("//li[contains(.,\'ID 3. Mistoffelees\')]")).getText(),
        is("ID 3. Mistoffelees"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'rentResult\']")).getText(), is("Success!"));
  }

  @Test
  public void tEST7RETURN() {
    // Test name: TEST-7-RETURN (1)
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com |
    driver.get("https://cs1632.appspot.com");
    // 2 | click | linkText=Reset |
    driver.findElement(By.linkText("Reset")).click();
    // 3 | click | linkText=Rent-A-Cat |
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 4 | assertElementPresent | css=.form-group:nth-child(3) .btn |
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".form-group:nth-child(3) .btn"));
      assert (elements.size() > 0);
    }
    // 5 | click | id=rentID |
    driver.findElement(By.id("rentID")).click();
    // 6 | type | id=rentID | 2
    driver.findElement(By.id("rentID")).sendKeys("2");
    // 7 | click | css=.form-group:nth-child(3) .btn |
    driver.findElement(By.cssSelector(".form-group:nth-child(3) .btn")).click();
    // 8 | assertText | xpath=//li[contains(.,'Rented out')] | Rented out
    assertThat(driver.findElement(By.xpath("//li[contains(.,\'Rented out\')]")).getText(), is("Rented out"));
    // 9 | click | id=returnID |
    driver.findElement(By.id("returnID")).click();
    // 10 | type | id=returnID | 2
    driver.findElement(By.id("returnID")).sendKeys("2");
    // 11 | click | xpath=//button[@onclick='returnSubmit()'] |
    driver.findElement(By.xpath("//button[@onclick=\'returnSubmit()\']")).click();
    // 12 | assertText | xpath=//li[contains(.,'ID 2. Old Deuteronomy')] | ID 2. Old
    // Deuteronomy
    assertThat(driver.findElement(By.xpath("//li[contains(.,\'ID 2. Old Deuteronomy\')]")).getText(),
        is("ID 2. Old Deuteronomy"));
  }

  @Test
  public void tEST9FEED() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(802, 855));
    driver.findElement(By.linkText("Reset")).click();
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    driver.findElement(By.id("catnips")).click();
    driver.findElement(By.id("catnips")).sendKeys("6");
    driver.findElement(By.xpath("//button[contains(.,\'Feed\')]")).click();
    assertThat(driver.findElement(By.id("feedResult")).getText(), is("Nom, nom, nom."));
  }

  @Test
  public void tEST8FEEDACAT() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(802, 855));
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[@onclick=\'feedSubmit()\']"));
      assert (elements.size() > 0);
    }
  }

  @Test
  public void tEST10GREETACAT() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(802, 855));
    driver.findElement(By.linkText("Reset")).click();
    driver.findElement(By.linkText("Greet-A-Cat")).click();
    assertThat(driver.findElement(By.xpath("//div[@id=\'greeting\']/h4")).getText(), is("Meow!Meow!Meow!"));
  }

  @Test
  public void tEST11GREETACATWITHNAME() {
    // Test name: TEST-11-GREET-A-CAT-WITH-NAME
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ |
    driver.get("https://cs1632.appspot.com/");
    // 2 | setWindowSize | 802x855 |
    driver.manage().window().setSize(new Dimension(802, 855));
    // 3 | click | linkText=Reset |
    driver.findElement(By.linkText("Reset")).click();
    // 4 | open | https://cs1632.appspot.com/greet-a-cat/Jennyanydots |
    driver.get("https://cs1632.appspot.com/greet-a-cat/Jennyanydots");
    // 5 | assertText | xpath=//div[@id='greeting']/h4 | Meow! from Jennyanydots.
    assertThat(driver.findElement(By.xpath("//div[@id=\'greeting\']/h4")).getText(), is("Meow! from Jennyanydots."));
  }
}
