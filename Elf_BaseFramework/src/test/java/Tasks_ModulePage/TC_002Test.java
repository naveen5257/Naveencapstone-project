package Tasks_ModulePage;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.TasksModule;

public class TC_002Test extends Base_Class {
	@Test
	public void Thirdone() {
		TasksModule task = new TasksModule(driver);
		task.getSecondone().click();
		task.getClickicon().click();
		task.getCalander().click();
		task.getDownload().click();

	}

}
