package testGit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchSite {

	public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivasundara\\Desktop\\browserExes\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://stackoverflow.com/questions/20654719/push-eclipse-project-to-github-with-egit");
       driver.close();
       //test
       //test1
       

	}

}
