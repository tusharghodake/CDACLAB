package training.demo.training.demo.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
	
 public static void main(String[] args) throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 

	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	 
//	 driver.findElement(By.linkText("Leave")).click();
//	 
//	 driver.findElement(By.xpath("//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[1]/img")).click();
//	 
//	
//	 driver.findElement(By.linkText("15")).click();
//	 
//	driver.findElement(By.xpath("//*[@id=\"leaveList_chkSearchFilter_1\"]")).click();
//	
	 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
	 
	 Thread.sleep(2000);
	 driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Robert");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.id("empsearch_id")).sendKeys("0006");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.name("empsearch[employee_status]")).sendKeys("Full-Time Probation");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.name("empsearch[termination]")).sendKeys("Full-Time Permanent");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.name("empsearch[supervisor_name]")).sendKeys("John Smith");
	 
	 Thread.sleep(2000);
	driver.findElement(By.name("empsearch[job_title]")).sendKeys("Sales Manager");
	
	 Thread.sleep(2000);
	driver.findElement(By.name("empsearch[sub_unit]")).sendKeys("Sales");
	
	 Thread.sleep(2000);
	driver.findElement(By.id("searchBtn")).click();
	
	 Thread.sleep(2000);
	driver.findElement(By.id("welcome")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
	
 }
 
}
