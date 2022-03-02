package pomRepository;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class TasksModule {

	public TasksModule(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getWritedescriptilon() {
		return Writedescriptilon;
	}

// First test Case
	@FindBy(id = "container_tasks")
	private WebElement ClickontheTasksOption;
	
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement ClickOnAddNewdropdown;
	
	@FindBy(xpath = "/html/body/div[19]/div[1]")
	private WebElement toclickonnewcustomer;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement ToEnterthename;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement Writedescriptilon;
	
//@FindBy(xpath = "(//div[@class='dropdownButton'])[15]") private WebElement ToclickDrop;
	
	@FindBy(xpath = "//div[@class='emptySelection']/../..//div[@class='dropdownButton']")
	private WebElement toclickxpath;
	
	@FindBy(xpath = "//div[@class='itemRow selected']/..//div[text()='Big Bang Company']")
	private WebElement bigBangCompanyOption;
	

	
//@FindBy(xpath = "//div[text()='Create Customer']") private WebElement Toclickoncreate;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement create;
	
// second new Test Case
	
	@FindBy(id = "container_tasks") private WebElement secondone;
	@FindBy(xpath = "(//div[@class=\"popup_menu_icon\"])[1]") private WebElement clickicon;
	@FindBy(xpath = "(//div[contains(text(),'Corporate Work Schedule')])[1]") private WebElement calander;
	@FindBy(xpath = "//div[contains(text(),'Export to iCal File')]") private WebElement download;
	
	
	// thrid new test case
	@FindBy(id = "container_tasks") private WebElement thirdone;
	@FindBy(xpath = "(//div[@class=\"menu_icon\"])[4]") private WebElement account;
	@FindBy(id = "popup_menu_support_createAccountColleague") private WebElement colleague;
	@FindBy(id = "popup_menu_support_firstNameInviteMenu") private WebElement name;
    @FindBy(id = "popup_menu_support_lastNameInviteMenu") private WebElement lastname;
    @FindBy(id = "popup_menu_support_emailInviteMenu") private WebElement email;
    @FindBy(id = "popup_menu_support_sendInvitationButton") private WebElement invitaion;



  
public WebElement getInvitaion() {
		return invitaion;
	}

public WebElement getEmail() {
		return email;
	}

public WebElement getThirdone() {
	return thirdone;
}
	

	public WebElement getLastname() {
	return lastname;
}

	public WebElement getName() {
		return name;
	}

	public WebElement getColleague() {
		return colleague;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getDownload() {
		return download;
	}

	public WebElement getCalander() {
		return calander;
	}

	public WebElement getClickicon() {
		return clickicon;
	}

	public WebElement getSecondone() {
		return secondone;
	}

	public WebElement getBigBangCompanyOption() {
		return bigBangCompanyOption;
	}

	/*
	 * public WebElement getToclickDrop() { return ToclickDrop; }
	 */
	public WebElement getToEnterthename() {
		return ToEnterthename;
	}

	public WebElement getToclickxpath() {
		return toclickxpath;
	}

	public WebElement getToclickonnewcustomer() {
		return toclickonnewcustomer;
	}

	public WebElement getClickonnewbutton() {
		return clickonnewbutton;
	}

	public WebElement getToclickonnewproject() {
		return toclickonnewproject;
	}

	public WebElement getTocreatenewproject() {
		return tocreatenewproject;
	}

	public WebElement getToClickondrop() {
		return ToClickondrop;
	}

	public WebElement getToKiamotor() {
		return ToKiamotor;
	}

	public WebElement getToSelectText() {
		return ToSelectText;
	}

	public WebElement getToselectourcompany() {
		return Toselectourcompany;
	}
	@FindBy(xpath = "(//div[text()='In Progress'])[8]") private WebElement progress;

	public WebElement getProgress() {
		return progress;
	}

	@FindBy(id = "container_tasks")
	private WebElement Toclickontaskoption;
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement clickonnewbutton;
	@FindBy(xpath = "//div[contains(text(),'+ New Project')]")
	private WebElement toclickonnewproject;
	@FindBy(xpath = "(//input[@placeholder=\"Enter Project Name\"])[2]")
	private WebElement tocreatenewproject;
	@FindBy(xpath = "(//div[@class='dropdownButton'])[15]")
	private WebElement ToClickondrop;
	@FindBy(xpath = "(//div[@class=\"itemRow cpItemRow \"])[2]")
	private WebElement ToKiamotor;
	@FindBy(xpath = "//div[@class='itemRow cpItemRow selected']")
	private WebElement ToSelectText;
	@FindBy(xpath = "(//div[text()='Our company'])[2]")
	private WebElement Toselectourcompany;

	@FindBy(xpath = "(//div[contains(text(),'Big Bang Company')])[1]")
	private WebElement toclickonbangcompany;
	@FindBy(xpath = "(//div[@class='img'])[5]")
	private WebElement Toclickoncheckbox;
	@FindBy(xpath = "//div[contains(text(),'Change Status')]")
	private WebElement Toclickonthechangestatus;
	@FindBy(xpath = "(//div[text()='Bug fixing'])[1]/../../../../..//div[@class='workflowStatus statusType_open statusColor_yellow statusTypeIcon_yellow showArrow']")
	private WebElement ToclickontheNew;
	@FindBy(xpath = "(//div[text()='OPEN TASKS'])[2]/..//div[text()='In Progress']")
	private WebElement ToSelectInProgress;
//	
//	@FindBy(xpath = "(//div[text()='Review'])[3]")
//	
//	private WebElement changeStatusButton;
	
	@FindBy(xpath = "//span[text()='Apply']") private WebElement clickApply;
//public WebElement getFirstone() {
//	return Firstone;
//}
	//@FindBy(xpath = "(//div[text()='Delete'])[1]") private WebElement delete;
	
	
	
	
	//third Test Case
	@FindBy(id = "container_tasks") private WebElement  archive;
	//@FindBy(xpath = "//div[@title='Big Bang Company']/..//div[@class='editButton']") 
	//private WebElement icon;
	
	
	
	
	
	
	
	

//	public WebElement getIcon() {
//		return icon;
//	}

	public WebElement getArchive() {
		return archive;
	}

//	public WebElement getChangeStatusButton() {
//	return changeStatusButton;
//}

	
	public WebElement getClickApply() {
		return clickApply;
	}

//	public WebElement getDelete() {
//		return delete;
//	}

//	public void setDelete(WebElement delete) {
//		this.delete = delete;
//	}

	public WebElement getToSelectInProgress() {
		return ToSelectInProgress;
	}

	public WebElement getCreate() {
		return create;
	}

	public WebElement getToclickontheNew() {
		return ToclickontheNew;
	}

	public WebElement getToclickonthechangestatus() {
		return Toclickonthechangestatus;
	}

	public WebElement getToclickonbangcompany() {
		return toclickonbangcompany;
	}

	public WebElement getToclickoncheckbox() {
		return Toclickoncheckbox;
	}

	public WebElement getToclickontaskoption() {
		return Toclickontaskoption;
	}

	public WebElement getClickontheTasksOption() {
		return ClickontheTasksOption;
	}

	public WebElement getClickOnAddNewdropdown() {
		return ClickOnAddNewdropdown;
	

}
}