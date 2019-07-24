import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Itea_avtotest {
    public static void main(String[] args)  {
        System.setProperty("chromedriver",
                "D:/autotest/WebdriverChrome");
        WebDriver driver = new ChromeDriver();
        driver.get("http://iteaua-develop.demo.gns-it.com/ru/about-itea/");

        for (int i = 0; i < 2; i++)

            if (i < 1) {
                String myElements = driver.findElement(By.className("phone_header")).getAttribute("href");
                System.out.println(myElements.substring(7));
            } else {
                List<WebElement> elements = driver.findElements(By.xpath("//a[@class='phone_header']"));
                for (int j = 0; j < elements.size(); j++) {
                    System.out.println(elements.get(j).getAttribute("href").substring(7));
                }
            }
        driver.quit();
    }
}