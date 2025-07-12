package starter.actions.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WikipediaSearch {
    public static Performable forTerm(String searchTerm) {
        return Task.where("{0} searches for '" + searchTerm + "'",
                actor -> {
                    WebDriver driver = BrowseTheWeb.as(actor).getDriver();
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchInput")));
                    driver.findElement(By.id("searchInput")).sendKeys(searchTerm, Keys.ENTER);
                }
        );
    }
}
