package Tricentis_Insurance_App_AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        Actions actions = new Actions(driver);
        driver.manage().window().maximize();

        try {
            System.out.println("\n---> Running Motorcycle_Insurance File <---\n");
            Motorcycle_Insurance.run(driver, wait, actions);
            Thread.sleep(500);

            System.out.println("\n---> Running Automobile_Insurance File <---\n");
            Automobile_Insurance.run(driver, wait, actions);
            Thread.sleep(500);

            System.out.println("\n---> Running Truck_Insurance File <---\n");
            Truck_Insurance.run(driver, wait, actions);
            Thread.sleep(500);

            System.out.println("\n---> Running Camper_Insurance File <---\n");
            Camper_Insurance.run(driver, wait, actions);

            System.out.println("Congratulations!!!\nAll Codes Successfully Combined and Executed Properly");
            Thread.sleep(2000);
            driver.quit();

        } catch (Exception e) {
            System.out.println("Error in Some Part of Code file, Check All Related files");
            driver.quit();
            throw new RuntimeException(e);
        }
    }

}
