
import org.junit.   Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class SampleTest {

    @Test(timeout = 1000)
    public void MoodleLogin() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://moodle.chnu.edu.ua/login/index.php");


    }


}
