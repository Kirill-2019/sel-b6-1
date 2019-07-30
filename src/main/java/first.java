import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class first {
   private static WebDriver WD;
   public static void main(String[] args) throws InterruptedException {


      WD = new ChromeDriver();

      WD.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      WD.get("https://yandex.ru/");
      WD.close();
      WD.quit();

   }
}


