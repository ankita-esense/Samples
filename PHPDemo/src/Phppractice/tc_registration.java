package Phppractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("onesignal-popover-cancel-button")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("mc-closeModal")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("login")).click();
        Thread.sleep(5000);
        String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        driver.findElement(By.xpath("//*[@class='nav navbar-nav navbar-right']")).click();
        driver.findElement(By.id("Secondary_Navbar-Account-Register")).click();

        // Registration process

        driver.findElement(By.id("inputFirstName")).sendKeys("dsfs");
        driver.findElement(By.id("inputLastName")).sendKeys("dsfds");
        driver.findElement(By.id("inputEmail")).sendKeys("anki@gmail.com");
        //driver.findElement(By.className("iti-arrow")).click();
        driver.findElement(By.id("inputPhone")).sendKeys("1236547899");

        driver.findElement(By.id("inputCompanyName")).sendKeys("rrr");
        driver.findElement(By.id("inputAddress1")).sendKeys("fdsfsfsf");
        driver.findElement(By.id("inputAddress2")).sendKeys("35353543535");
        driver.findElement(By.id("inputCity")).sendKeys("35345");
        //driver.findElement(\y.
        driver.findElement(By.id("stateinput")).sendKeys("23423424");
        driver.findElement(By.id("inputPostcode")).sendKeys("432424234");
        driver.findElement(By.id("customfield2")).sendKeys("35424243");
        driver.findElement(By.id("inputNewPassword1")).sendKeys("123456");
        driver.findElement(By.id("inputNewPassword2")).sendKeys("123456");
        // driver.findElement(By.id("inputCaptcha")).sendKeys(capta);
         //driver.findElement(By.name("test")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");


		
		

       // Ocr Ocr= new Ocr();
        //Ocr.setUp(); // one time setup
        //Ocr ocr = new Ocr(); // create a new OCR engine
        ///Ocr.startEngine("eng", Ocr.SPEED_SLOW); // English
        //String 
        //imageUrl=driver.findElement(By.xpath("//*[@id='inputCaptchaImage")).getAttribute("src");
        //String s = Ocr.recognize(new File[] {new File("imageUrl")}, 
        //Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);
        //String s = Ocr.recognize(arg0, arg1, arg2, arg3)


        //String s = Ocr.recognize("https://phptravels.org/includes/verifyimage.php", s, null);

      //  String s1 = Ocr.recognize("https://phptravels.org/includes/verifyimage.php", null, null, null, null, null, null, null, null);

        //String s1 = Ocr.recognize("https://phptravels.org/includes/verifyimage.php", null, 
//null, null);

        //String s1 = new OCR().recognizeCharacters((RenderedImage) image);
        //System.out.println("Text From Image : \n"+ s1);
        //System.out.println("Length of total text : \n"+ s.length());
		
	}

}
