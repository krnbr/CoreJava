config
audit


	@RequestMapping("/tst")
	@ResponseBody
	public List<TestDto> getList(@RequestParam(value="m",required=false) int m){
		List<TestDto> testDtos = new ArrayList<TestDto>();
		Calendar calendar = Calendar.getInstance();
		calendar.set(calendar.MONTH, m);
		int currentMonth = calendar.get(Calendar.MONTH);
		int currentYear = calendar.get(Calendar.YEAR);
		for(int i=currentMonth-3;i<currentMonth+2;i++){
			System.out.println(i+" "+currentMonth);
			TestDto testDto = new TestDto("MONTH", 0, currentYear, 0, 0, 0, 0);
				if(i==-3){
					testDto.setMonthNumber(10);
					testDto.setYear(currentYear-1);
				}else if(i==-2){
						testDto.setMonthNumber(11);
						testDto.setYear(currentYear-1);
				}else if(i==-1){
					testDto.setMonthNumber(0);
					//testDto.setYear(currentYear-1);
				/*}else if(i==0){
					testDto.setMonthNumber(1);
					//testDto.setYear(currentYear-1);*/
				}else if(i>=0&&i<=10){
					testDto.setMonthNumber(i+1);
				}else if(i>=11&&i<=13){
					testDto.setMonthNumber(i-11);
					testDto.setYear(currentYear+1);
				}
			testDto.setMonth(new DateFormatSymbols().getMonths()[testDto.getMonthNumber()]);
			testDtos.add(testDto);
		}
		
		String []s={"12","01","02","03","04","06","06","06","06","05","09","10","11","06","08","09","05","04","03","02"};
		
		for (String string : s) {
			if(Integer.parseInt(string)-1==testDtos.get(0).getMonthNumber()){
				testDtos.get(0).setStatusCount(testDtos.get(0).getStatusCount()+1);
			}else if(Integer.parseInt(string)-1==testDtos.get(1).getMonthNumber()){
				testDtos.get(1).setStatusCount(testDtos.get(1).getStatusCount()+1);
			}else if(Integer.parseInt(string)-1==testDtos.get(2).getMonthNumber()){
				testDtos.get(2).setStatusCount(testDtos.get(2).getStatusCount()+1);
			}else if(Integer.parseInt(string)-1==testDtos.get(3).getMonthNumber()){
				testDtos.get(3).setStatusCount(testDtos.get(3).getStatusCount()+1);
			}else if(Integer.parseInt(string)-1==testDtos.get(4).getMonthNumber()){
				testDtos.get(4).setStatusCount(testDtos.get(4).getStatusCount()+1);
			}
		}
		
		return testDtos;
	}
	
	
	
	
	public class TestDto {

	private String month;
	
	private int monthNumber;
	
	private int year;
	
	private int churnedCount;
	
	private int updateCount;
	
	private int statusCount;
	
	private int status;
	
	

	public TestDto(String month, int monthNumber, int year, int churnedCount,
			int updateCount, int statusCount, int status) {
		this.month = month;
		this.monthNumber = monthNumber;
		this.year = year;
		this.churnedCount = churnedCount;
		this.updateCount = updateCount;
		this.statusCount = statusCount;
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getMonthNumber() {
		return monthNumber;
	}

	public void setMonthNumber(int monthNumber) {
		this.monthNumber = monthNumber;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getChurnedCount() {
		return churnedCount;
	}

	public void setChurnedCount(int churnedCount) {
		this.churnedCount = churnedCount;
	}

	public int getUpdateCount() {
		return updateCount;
	}

	public void setUpdateCount(int updateCount) {
		this.updateCount = updateCount;
	}

	public int getStatusCount() {
		return statusCount;
	}

	public void setStatusCount(int statusCount) {
		this.statusCount = statusCount;
	}
	
	
	
}


package com.optimantra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleSearch {

	
	static WebDriver driver;
    static Wait<WebDriver> wait;

    public static void main(String[] args) throws IOException {
    	System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--start-maximized");
    	options.addArguments("--test-type");
    	driver = new ChromeDriver(options);
        
        wait = new WebDriverWait(driver, 10);
        driver.get("http://localhost:5353/optimus/om/public/welcome");

        boolean result;
        try {
            result = firstPageContainsQAANet();
        } catch(Exception e) {
            e.printStackTrace();
            result = false;
        } finally {
        	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        	String s = "";
        	/*do{
        		 s = bufferedReader.readLine();
        	}*/
        	s = bufferedReader.readLine();
        	while(!(s.equalsIgnoreCase("quit"))){
        		s = bufferedReader.readLine();
        	}
        	driver.close();
        }

        //System.out.println("Test " + (result? "passed." : "failed."));
        /*if (!result) {*/
            System.exit(1);
        /*}*/
        
    }

    private static boolean firstPageContainsQAANet() {
        //type search query
        //driver.findElement(By.name("q")).sendKeys("fb");

        driver.findElement(By.className("userlogin-link")).click();
        
        // click search
        //driver.findElement(By.name("btnG")).click();
        for(int i = 0; i < 500; i++){
        	System.out.print("*");
        }
        driver.findElement(By.id("j_username")).sendKeys("ksingh3@seasiainfotech.com");
        driver.findElement(By.id("j_password")).sendKeys("test123");
        
        driver.findElement(By.id("logmein")).click();
        driver.findElement(By.id("sgn")).click();
        //driver.findElement(By.linkText("ADMIN")).click();
        
        //driver.findElement(By.id("logmein")).click();
        
        List<WebElement> w = driver.findElements( By.cssSelector("#home-dropmenu ul li a"));

        for(WebElement s1: w)
        {
            String s2= s1.getText();
            System.out.println(s2);

            if(s2.contentEquals("Admin"))
            {
                s1.click();   
                break;
            }
        }
        //driver.findElement(By.cssSelector("#home-dropmenu ul li a:firstchild")).click();
        driver.findElement(By.className("abcde")).click();
        
        driver.findElement(By.linkText("Email Templates")).click();
        
        // Wait for search to complete
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webDriver) {
                System.out.println("Searching ...");
                //return webDriver.findElement(By.id("resultStats")) != null;
                return true;
            }
        });

        // Look for QAAutomation.net in the results
        return true;
    }
}



    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
    <dependency>
    	<groupId>org.seleniumhq.selenium</groupId>
    	<artifactId>selenium-server</artifactId>
    	<version>2.42.2</version>
    </dependency>
    <!-- <dependency>
    	<groupId>org.seleniumhq.selenium</groupId>
    	<artifactId>selenium-chrome-driver</artifactId>
    	<version>2.42.2</version>
    </dependency> -->
    <dependency>
    	<groupId>org.seleniumhq.selenium</groupId>
    	<artifactId>selenium-java</artifactId>
    	<version>2.42.2</version>
    </dependency>
  </dependencies>
