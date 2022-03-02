package Tasks_ModulePage;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.TasksModule;

public class TC_001Test extends Base_Class {
	@Test
	public void ToAddnewtask() {
		TasksModule task = new TasksModule(driver);
		task.getClickontheTasksOption().click();
		task.getClickOnAddNewdropdown().click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		task.getToclickonnewcustomer().click();
		task.getToEnterthename().sendKeys("NaveenProject4");

		task.getWritedescriptilon().sendKeys("Create a new Customer for Naveen Project");
		// task.getToclickDrop().click();
		task.getToclickxpath().click();
		task.getBigBangCompanyOption().click();

		task.getCreate().click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
