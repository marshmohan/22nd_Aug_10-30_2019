package method_parameters;

import org.openqa.selenium.By;


public class SwitchTowindow_Using_Keywords {

	public static void main(String[] args)
	{
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_webpage("http://naukri.com");
		obj.set_timeout(20);
		
		By Jobs_menu=By.xpath("//div[@class='mTxt'][contains(.,'Jobs')]");
		obj.mousehover(Jobs_menu);
		
		By RegisterNow_jobs_menu=By.xpath("(//a[@title='Register Now'])[1]");
		obj.click_element(RegisterNow_jobs_menu);
		obj.capturescreen("Registernow_link");
		
		
		obj.switchto_window("Apply to Millions of Jobs Online");
		obj.capturescreen("Registration page");
		
		
		
		
		
	}

}
