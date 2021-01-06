import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SafariDriv {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Browser: Safari");
        driver = new org.openqa.selenium.safari.SafariDriver();

        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        System.out.println("Title: " + driver.getTitle());
        driver.findElement(By.id("email")).sendKeys("zgm05@mail.ru");
        Thread.sleep(1000);
        driver.findElement(By.id("u_0_b")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='u_0_a']/div[1]/div[1]/div/a/span/span ")).click();
        Thread.sleep(3000);
        String friends = driver.findElement(By.xpath("//div/div[3]/div/div[2]/div[3]/ul/li[3]/a/span[1] ")).getText();
        Thread.sleep(3000);
        driver.findElement(By.id("userNavigationLabel")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Log Out")).click();
        driver.quit();
        System.out.println("You have " + friends + " friends");
    }
}

