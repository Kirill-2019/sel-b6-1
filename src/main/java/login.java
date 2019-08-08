import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;

public class login {
   public static void login(WebDriver WD ){

      WD.findElement(By.name("username")).sendKeys("admin");
      WD.findElement(By.name("password")).sendKeys("admin");
   }
}
