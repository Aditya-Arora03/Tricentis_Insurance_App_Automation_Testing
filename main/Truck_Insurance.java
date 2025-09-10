package Tricentis_Insurance_App_AutomationTesting;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Truck_Insurance {

    public static void run(WebDriver driver, WebDriverWait wait, Actions actions) throws Exception {

        driver.get("https://sampleapp.tricentis.com/101/app.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='main-navigation']//a[@id='nav_truck']"))).click();
        System.out.println("Heading to Truck Insurance Details Page");

        //Make option dropdown
        try {
            WebElement make_option = driver.findElement(By.name("Make"));
            make_option.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value = 'default']")));
            Select dropdown_make = new Select(make_option);
            dropdown_make.selectByVisibleText("Porsche");
            System.out.println("Make_Option element selected");
        } catch (Exception e) {
            System.out.println("Error Making Make Selection");
            throw new Exception(e);
        }

        //engine performance
        try {
            WebElement eng_perf = driver.findElement(By.id("engineperformance"));
            eng_perf.sendKeys("800");
            System.out.println("Engine performance Entered");
        } catch (Exception e) {
            System.out.println("Error Entering Engine Performance");
            throw new Exception(e);
        }

        //Date Selection
        try {
            //scroll karo thoda upar acha dikhne ke lea
            WebElement body = driver.findElement(By.tagName("body"));
            body.click();
            actions.scrollByAmount(0, 150).perform();

            WebElement date = driver.findElement(By.id("opendateofmanufacturecalender"));
            date.click();
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[2]/a"))).click();
            System.out.println("Date Entered");

        } catch (Exception e) {
            System.out.println("Error Entering Date");
            throw new Exception(e);
        }

        // number of seats
        try {
            WebElement no_of_seats = driver.findElement(By.id("numberofseats"));
            no_of_seats.click();
            Select dropdown_seats = new Select(no_of_seats);
            dropdown_seats.selectByVisibleText("5");
            System.out.println("Number of seats Selected");
        } catch (Exception e) {
            System.out.println("Error selecting seats");
            throw new Exception(e);
        }

        //fuel type
        try {
            WebElement fuelType = driver.findElement(By.id("fuel"));
            fuelType.click();
            Select FT = new Select(fuelType);
            FT.selectByVisibleText("Electric Power");
            System.out.println("Fuel Type Selected");
        } catch (Exception e) {
            System.out.println("Error Selecting Fuel Type");
            throw new RuntimeException(e);
        }


        //Payload
        try {
            WebElement payload = driver.findElement((By.id("payload")));
            payload.sendKeys("995");
            System.out.println("Payload Value Entered");
        } catch (Exception e) {
            System.out.println("Error entering Payload");
            throw new Exception(e);
        }

        //Total Weight
        try {
            WebElement total_weight = driver.findElement(By.id("totalweight"));
            total_weight.sendKeys("45000");
            System.out.println("Total Weight Entered");
        } catch (Exception e) {
            System.out.println("Total Waight entering Error");
            throw new Exception(e);

        }


        //List Price
        try {
            WebElement list_price = driver.findElement(By.id("listprice"));
            list_price.sendKeys("55000");
            System.out.println("List Price entered");

        } catch (Exception e) {
            System.out.println("Error entering list price");
            throw new Exception(e);
        }

        //License Plate Number
        try {
            WebElement license = driver.findElement(By.id("licenseplatenumber"));
            license.sendKeys("MH14BV7016");
            System.out.println("License Plate Number Entered");
        } catch (Exception e) {
            System.out.println("Error Entering License Plate Number");
            throw new RuntimeException(e);
        }

        WebElement body = driver.findElement(By.tagName("body"));
        body.click();
        actions.scrollByAmount(0, 150).perform();

        //Mileage
        try {
            WebElement mileage = driver.findElement(By.id("annualmileage"));
            mileage.sendKeys("500");
            System.out.println("Mileage Successfully Entered");
        } catch (Exception e) {
            System.out.println("Error Entering Mileage");
            throw new Exception(e);
        }

        WebElement next1 = driver.findElement(By.id("nextenterinsurantdata"));
        next1.click();

        WebElement next01 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Enter Insurant Data")));
        if (next01.isDisplayed()) {
            System.out.println("\nHeading to next Insurant Data page");
        } else {
            System.out.println("\nError heading to next Insurant Data page");
            driver.quit();
        }
        actions.scrollByAmount(0, -1000).perform();

        //fname
        driver.findElement(By.id("firstname")).sendKeys("Aditya");
        System.out.println("Firstname Entered");

        //lname
        driver.findElement(By.id("lastname")).sendKeys("Arora");
        System.out.println("Lastname Entered");

        //dob
        WebElement date = driver.findElement(By.xpath("//input[@id='birthdate']"));
        date.sendKeys("01/03/2003");
        actions.scrollByAmount(0, 400).perform();
        System.out.println("Date Of Birth Entered");

        //gender
        driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
        Thread.sleep(500);
        System.out.println("Gender Entered");

        //address
        driver.findElement(By.id("streetaddress")).sendKeys("Karve road, Pune");
        Thread.sleep(500);
        System.out.println("Address Entered");

        //country select
        WebElement country = driver.findElement(By.id("country"));
        Select c1 = new Select(country);
        c1.selectByVisibleText("India");
        System.out.println("Country Selected");
        Thread.sleep(500);

        //zip
        driver.findElement(By.id("zipcode")).sendKeys("110011");
        Thread.sleep(500);
        System.out.println("Zip Entered");

        //city
        driver.findElement(By.id("city")).sendKeys("Pune");
        Thread.sleep(500);
        System.out.println("City Entered");

        //occupation
        WebElement occu = driver.findElement(By.id("occupation"));
        Select occu1 = new Select(occu);
        occu1.selectByVisibleText("Employee");
        System.out.println("Occupation Selected");
        Thread.sleep(500);

        //hobbies
        actions.scrollByAmount(0, 250).perform();
        driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span")).click();
        System.out.println("All Desired hobbies options Clicked");
        Thread.sleep(500);

        //website
        driver.findElement(By.id("website")).sendKeys("https://www.google.com/");
        Thread.sleep(500);
        System.out.println("Website URL Entered");

        WebElement next2 = driver.findElement(By.id("nextenterproductdata"));
        next2.click();
        WebElement next02 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Enter Product Data")));


        if (next02.isDisplayed()) {
            System.out.println("\nHeading to next Product Data page");
        } else {
            System.out.println("\nError heading to next Product Data page");
            driver.quit();
        }

        actions.scrollByAmount(0, -1500).perform();

        //start date
        try {

            WebElement date1 = driver.findElement(By.xpath("//button[@id='openstartdatecalender']"));
            date1.click();

            while (true) {
                WebElement monthElement = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]"));
                String monthText = monthElement.getText();
                if (monthText.equals("October")) {
                    break;
                }

                WebElement forward = driver.findElement(By.xpath("//a[@title='Next']"));
                forward.click();

                WebElement dateElement = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]/a"));
                dateElement.click();

            }
            System.out.println("Date selected successfully");
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("error Date");
            throw new Exception(e);
        }

        //insurance
        WebElement insurance = driver.findElement(By.id("insurancesum"));
        insurance.click();
        Select inc = new Select(insurance);
        inc.selectByVisibleText("10.000.000,00");
        System.out.println("Insurance selected");
        Thread.sleep(500);

        //damage
        WebElement damage = driver.findElement(By.id("damageinsurance"));
        damage.click();
        Select dmg = new Select(damage);
        dmg.selectByVisibleText("Full Coverage");
        System.out.println("Damage Selected");
        Thread.sleep(500);

        //optional 1
        driver.findElement(By.xpath("//label[normalize-space()='Euro Protection']")).click();

        //optional 2
        driver.findElement(By.xpath("//label[normalize-space()='Legal Defense Insurance']")).click();
        System.out.println("Desired options Selected");


        //next button
        WebElement next3 = driver.findElement(By.id("nextselectpriceoption"));
        next3.click();

        WebElement next03 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Select Price Option")));
        if (next03.isDisplayed()) {
            System.out.println("\nHeading to Selecting Price option page");
        } else {
            System.out.println("\nError Heading towards Price option content");
        }

        //option select button
        driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span")).click();
        System.out.println("Choice Plan Selected");

        //next button
        WebElement next4 = driver.findElement(By.id("nextsendquote"));
        next4.click();
        WebElement next04 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Send Quote")));

        if (next04.isDisplayed()) {
            System.out.println("\nHeading to Send Quote page");
        } else {
            System.out.println("\nError Heading towards Send Quote content");
        }

        //email
        driver.findElement(By.id("email")).sendKeys("aditya.arora@gmail.com");
        System.out.println("Email entered");

        //phone
        driver.findElement(By.id("phone")).sendKeys("99787887852");
        System.out.println("Phone Entered");

        //username
        driver.findElement(By.id("username")).sendKeys("adityaarora");
        System.out.println("Username entered");

        //password
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("Aditya@001");
        System.out.println("Password entered");

        //confirm password
        WebElement conf_pass = driver.findElement(By.id("confirmpassword"));
        conf_pass.sendKeys("Aditya@001");
        System.out.println("Confirm Password entered");
        if ((pass.getAttribute("value").equals(conf_pass.getAttribute("value")))) {
            System.out.println("Password and Confirm Password Matches Successfully");
        } else {
            System.out.println("Error Password Matching");
            driver.quit();
        }

        //comments
        WebElement comments = driver.findElement(By.id("Comments"));

        if (comments.getText().isEmpty()) {
            System.out.println("No comments entered");
        } else {
            System.out.println("Comment entered");
        }

        //sendmaill
        driver.findElement(By.id("sendemail")).click();
        System.out.println("Send Mail Button Clicked");

        //alert
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sweet-alert showSweetAlert visible']")));
//            Thread.sleep(1000);
            System.out.println("Confirmation Window Alert Pop-up");
        } catch (Exception e) {
            System.out.println("Error Confirmation Window Popping - up");
            throw new Exception(e);
        }
        try {
            File ss_capture = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(ss_capture, new File("C:\\Users\\worka\\Desktop\\New folder\\truck_confirm.jpg"));
            System.out.println("Screenshot Captured.\n");
        } catch (Exception e) {
            System.out.println("Error Capturing Screenshot.\n");
            throw new Exception(e);
        }

        //OK button
        driver.findElement(By.xpath("//button[@class='confirm']")).click();


        //main page button
        actions.scrollByAmount(0, 700).perform();
        driver.findElement(By.xpath("//span[@class='hb hb-xs inv spin-icon hb-home-inv']")).click();
        Thread.sleep(500);

        if (driver.getCurrentUrl().contains("index.php")) {
            System.out.println("Going to Main Home Page");
            System.out.println("Congratulations. Successful Code Completion.");
        } else {
            System.out.println("Error, firse check karo");
        }

    }

}
