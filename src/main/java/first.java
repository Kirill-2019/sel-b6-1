import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class first {
   private static WebDriver WD;
   public static void main(String[] args){


      WD = new ChromeDriver();

      WD.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      WD.get("http://localhost/litecart/admin/");

      login.login(WD);

      WD.close();
      WD.quit();

   }
}


