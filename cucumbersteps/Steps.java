package cucumbersteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	
@Given("user navigates to the application")
public void usershouldnavigate() {
			driver=new ChromeDriver();
			driver.get( "http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
}
@And("user enters the username as Demosalesmanager")
public void enterUserName() {
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
}
@And("user enters the password as crmsfa")
public void enterPassWord() {
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
}
@When("user clicks the login button")
public void clickLogin() {
	        driver.findElement(By.className("decorativeSubmit")).click();
	}
@Then("login should be successful")
public void verifyPage() {
	String title = driver.getTitle();
	if(title.contains("Leaftaps")) {
		System.out.println("Login successful");
	}
	else {
		System.out.println("Login not successful");
	}
}

	}

