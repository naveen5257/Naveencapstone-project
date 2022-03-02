package Tasks_ModulePage;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.TasksModule;

public class TC_003Test extends Base_Class {
	@Test
	public void Taskmodule() {
		TasksModule task = new TasksModule(driver);
		task.getThirdone().click();
		task.getAccount().click();
		task.getColleague().click();
		WebElement Storevalue = task.getName();
		Storevalue.click();
		Storevalue.sendKeys("Naveen");
		WebElement storeone = task.getLastname();
		storeone.click();
		storeone.sendKeys("Kumar");
		WebElement storeemail = task.getEmail();
		storeemail.click();
		storeemail.click();
		storeemail.sendKeys("naveenr9535@gmail.com");
		task.getInvitaion().click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
