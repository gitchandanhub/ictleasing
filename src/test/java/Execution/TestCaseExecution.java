package Execution;

import java.util.concurrent.atomic.AtomicInteger;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import BaseDriver.AppDriver;

import Pages.Createsinglequote1;
import Pages.Login;
import Pages.Approvesinglequote;
import Pages.Converttoleasesinglequote;
import Pages.Createmultiplequotefordifferentvehicle;
import Pages.Leasetabs;
import Pages.Assets;

@Listeners(Listen.TestNG_Listeners.class)


public class TestCaseExecution extends AppDriver

{
	AtomicInteger count = new AtomicInteger(1);
	
	@Test(priority=0)
	 public void LoginTest() throws InterruptedException
    {
    Login  lpobj = new Login();
    lpobj.employeeLogin();
    Thread.sleep(1000);
    lpobj.Enterusername(config.getProperty("Username"));
    Thread.sleep(4000);
    lpobj.Enterpsswrd(config.getProperty("Password"));
    lpobj.clickbtn();
    Thread.sleep(4000);
    }	
	
	
//@Test(enabled = true)
	
	public void test() throws InterruptedException
    {
     Pages.test  lpobj = new Pages.test();
    
     lpobj.clickonQuotationTab();
    
    }
	
	
	
	
	@Test(enabled = true)
	
	public void CreateSingleQuote1() throws InterruptedException
    {
    Createsinglequote1  lpobj = new Createsinglequote1();
    
    Thread.sleep(7000);
    lpobj.OpenQuotationtab(null);
    lpobj.Quotetypeselection(null);
    lpobj.Selectsinglequote(null);
    lpobj.SubmitSinglequote(null);
    lpobj.Salespersonoptions(null);
  //Customer Data
    
    lpobj.Selectsalespersonasadmin(null);
    lpobj.EnterCustomerNumber(config.getProperty("CusotmerNumber"));;
    lpobj.EnterCustomerName(null);
    
    lpobj.EnterCustomerAddress(config.getProperty("CustomerAdd"));
    lpobj.EnterCustomerAddress2(config.getProperty("CustomerAdd1"));
    lpobj.EnterCustomerCity(config.getProperty("CustomerCity"));
    
    lpobj.stateoptions(null);
    lpobj.selectstate(null);
    lpobj.EnterCustomerZip(config.getProperty("CustomerZip"));
    lpobj.CustomerContactname(config.getProperty("ContactName"));
    lpobj.CustomerContactemail(config.getProperty("EmailAddress"));
    lpobj.CustomerContactcellno(config.getProperty("CellNo"));
    
    //Lease Data
    lpobj.EnterDelAcqDate(config.getProperty("DelAcqDate"));
    lpobj.LeaseTypeoptions(null);
    lpobj.Selectmaittype(null);
    
    //Term and salestax
    
    lpobj.CustomerTerm(null);
    lpobj.Termselected(null);
    lpobj.Salestaxstateoptions(null);
    lpobj.SelectSalestaxstate(null);
    lpobj.Salestaxrate(config.getProperty("SalesTaxRateState"));
    
    
   //Vehicle Data
    
    lpobj.Vehicleyearoption(null);
    lpobj.selectVehicleyear(null);
    
    lpobj.Vehiclemakeoption(null);
    lpobj.selectvehiclemake(null); 
    
    lpobj.vehiclemodeloptions(null);
    lpobj.selectvehiclemodel(null);  
    
    lpobj.vehiclenewusedoptions(null);
    lpobj.selectusedvehicleoption(null); 
    
    lpobj.vehiclecoloroption(null);
    lpobj.selectvehiclecolor(null);
    
    lpobj.vehicleintcoloroption(null);
    lpobj.selectvehicleintcolor(null);
    
    lpobj.vehicleordertype(null);
    
    lpobj.vehiclestateoption(null);
    lpobj.selectvehiclestate(null);  
    lpobj.vehicleplatetypeoption(null);
    lpobj.selectvehicleplatetype(null);
    
    //Rates
    
    lpobj.factorymsrp(config.getProperty("FactoryMSRP"));
    lpobj.additionalmsrp(config.getProperty("AdditionalMSRP"));
    lpobj.delaercost(config.getProperty("DealerCost"));
    lpobj.Bankfees(config.getProperty("BankFee"));
    lpobj.residualvaule(config.getProperty("ResidualValue"));
    lpobj.customercustomnote(config.getProperty("Cusomternotes"));
    
    //Save Single Quote
    
    lpobj.savesinglequote(null);
 
    }	
	
	
	
  	@Test(enabled =false)
  	
  	
  	public void Approvesinglequote() throws InterruptedException
     {
  		Approvesinglequote lpobj = new Approvesinglequote();
  		
  		
  		lpobj.OpenQuotationtab(null);
  		lpobj.Clickactiveprospecttab(null);
  		lpobj.Editsinglequote(null);
  		lpobj.Approvesinglequotation(null);
		
      }
   		
  	@Test(enabled=false)
  		
  	public void Converttoleasesinglequote() throws InterruptedException
     {
  		Converttoleasesinglequote lpobj = new Converttoleasesinglequote();
  		
  		lpobj.Showlisteditquotescreen(null);
  		lpobj.Activeprospectgain(null);
  		lpobj.Editapprovedquote(null);
  		lpobj.Converttoleaseasq(null);
  		lpobj.ConfirmConverttoleaseasq(null);
  	
  		
      }
  	
  	@Test(enabled=false)
		
  	public void Leasetabs() throws InterruptedException
     {
  		Leasetabs lpobj = new Leasetabs();
  		Thread.sleep(4000);
  		lpobj.SelectLeasetab(null);
  		lpobj.Openlatestlease(null);
  		lpobj.Openleaseaccountingsheet(null);
  		lpobj.Openleasebanksheet(null);
  		lpobj.Selectbankfromlistbanksheet(null);
  		lpobj.Saveleasebanksheet(null);
  		
  		lpobj.leasescheduleAtab(null);
  		lpobj.UploadscheduleA(null);
  		lpobj.Uploadschedulefindfile(null);
  		lpobj.SubmituploadfilescheA(null);
  		
  		
  		lpobj.Openleasecoitab(null);
  		lpobj.Uploadinsurancecrtcoi(null);
  		lpobj.Chooseinsurancecerticoi(null);
  		lpobj.SubmitICcoi(null);
  		
  		
  		lpobj.OpenleaseBAsheet(null);
  		lpobj.OpenleasepayoffALS(null);
  		lpobj.Openleasepayoffcustom(null);
  		lpobj.Openleasepayoffbank(null);
  		lpobj.Openleasebillofsale(null);
  		lpobj.OpenleaseAccounting(null);
  		
  		
  		lpobj.Openleaseendofsale(null);
  		lpobj.Uploadendofsaledoc(null);
  		lpobj.Chooseendofsaledoc(null);
  		lpobj.SubmitEOSdoc(null);
  		
  		lpobj.Clickshowlistbutton(null);
  		
      }
  	
	//@Test
	
  	public void Assets() throws InterruptedException
     {
		Assets lpobj = new Assets();
     
		lpobj.OpenAssettab1();		
		lpobj.openlatestasset(null);
		lpobj.customCFvaule1(null);
		lpobj.customCFvaule2(null);
		lpobj.customCFvaule3(null);
		
		lpobj.OwnernameROI(null);
		lpobj.OwneremailROI(null);
		lpobj.Owneradd1ROI(null);
		lpobj.Owneradd2ROI(null);
		lpobj.OwnercityROI(null);
		lpobj.OwnerstateoptionROI(null);
		lpobj.SelectownerstateROI(null);
		lpobj.OwnerzipROI(null);
		
		
		lpobj.Saveassetvehform(null);
		
		lpobj.OpenassetRegtab(null);
		lpobj.Addtitlenumber(null);
		lpobj.Titlestateoptions(null);
		lpobj.Selecttitlestate(null);
		lpobj.Addpaperelec(null);
		lpobj.SaveAssetRegform(null);
		
		lpobj.Showlistasset(null);
     }

	
	//@Test
	public void createmultiquotesformultivehicles() throws InterruptedException
	{
		Createmultiplequotefordifferentvehicle mqdvobj = new Createmultiplequotefordifferentvehicle();
		mqdvobj.clickonQuotationTab();
		Thread.sleep(3000);
		mqdvobj.clickonCreateNew();
		Thread.sleep(3000);
		mqdvobj.selectCreateMultipleQuoteForDifferentVehicle();
		Thread.sleep(3000);
		mqdvobj.clickonSubmitButton();
		//Filling Customer Data
		mqdvobj.selectSalesPerson();
		mqdvobj.EnterCustomerNumber(config.getProperty("CusotmerNumber"));
		mqdvobj.EnterCustomerName(null);
		mqdvobj.EnterCustomerAddress(config.getProperty("CustomerAdd"));
		mqdvobj.EnterCustomerAddress2(config.getProperty("CustomerAdd1"));
		mqdvobj.EnterCustomerCity(config.getProperty("CustomerCity"));
		mqdvobj.selectState();
		mqdvobj.EnterCustomerZip(config.getProperty("CustomerZip"));
		mqdvobj.enterContactName();
		mqdvobj.enterEmail();
		mqdvobj.enterCellTell();
		mqdvobj.enterWorkTell();
		Thread.sleep(3000);
		//Filling sales data
		mqdvobj.salesstdstate();
		mqdvobj.enterRate();
		Thread.sleep(3000);
		//Filling lease data
		mqdvobj.EnterDelAcqDate(config.getProperty("DelAcqDate"));
		mqdvobj.selectLeaseType();
		mqdvobj.selectLeaseType();
		mqdvobj.selectMaintenanceType();
		Thread.sleep(3000);
		//filling vehicle data
		mqdvobj.selectVehicle1Year();
		mqdvobj.selectVehicle1make();
		mqdvobj.selectVehicle1model();
		mqdvobj.enterTrim1();
		mqdvobj.selectNewUsed();
		mqdvobj.selectExtcolor1();
		mqdvobj.selectIntcolor1();
		mqdvobj.selectOrderType1();
		mqdvobj.selectPlateState();
		mqdvobj.selectPlateType1();
		mqdvobj.selectQuote1Term();
		mqdvobj.selectVehicle2Year();
		mqdvobj.selectVehicle2make();
		mqdvobj.selectVehicle2model();
		Thread.sleep(3000);
		mqdvobj.enterTrim2();
		mqdvobj.selectNewUsed2();
		mqdvobj.selectExtcolor2();
		mqdvobj.selectIntcolor2();
		mqdvobj.selectOrderType2();
		mqdvobj.selectPlateState2();
		mqdvobj.selectPlateType2();
		mqdvobj.selectQuote2Term();
		mqdvobj.selectVehicle3Year();
		mqdvobj.selectVehicle3make();
		mqdvobj.selectVehicle3model();
		Thread.sleep(3000);
		mqdvobj.enterTrim3();
		mqdvobj.selectNewUsed3();
		mqdvobj.selectExtcolor3();
		mqdvobj.selectIntcolor3();
		mqdvobj.selectOrderType3();
		mqdvobj.selectPlateState3();
		mqdvobj.selectPlateType3();
		mqdvobj.selectQuote3Term();
		Thread.sleep(3000);
		
		//Rates quote1
		mqdvobj.factorymsrp(config.getProperty("FactoryMSRP"));
		mqdvobj.additionalmsrp(config.getProperty("AdditionalMSRP"));
		mqdvobj.delaercost(config.getProperty("DealerCost"));
		mqdvobj.Bankfees(config.getProperty("BankFee"));
		mqdvobj.residualvaule(config.getProperty("ResidualValue"));
		//Rates quote2
		mqdvobj.factorymsrp2(config.getProperty("FactoryMSRP"));
		mqdvobj.additionalmsrp2(config.getProperty("AdditionalMSRP"));
		mqdvobj.delaercost2(config.getProperty("DealerCost"));
		mqdvobj.Bankfees2(config.getProperty("BankFee"));
		mqdvobj.residualvaule2(config.getProperty("ResidualValue"));
		//Rates quote3
		mqdvobj.factorymsrp3(config.getProperty("FactoryMSRP"));
		mqdvobj.additionalmsrp3(config.getProperty("AdditionalMSRP"));
		mqdvobj.delaercost3(config.getProperty("DealerCost"));
		mqdvobj.Bankfees3(config.getProperty("BankFee"));
		mqdvobj.residualvaule3(config.getProperty("ResidualValue"));
		
		
		mqdvobj.customercustomnote(config.getProperty("Cusomternotes"));
		
		
		
	    
	    //Save Single Quote
	    
		mqdvobj.savesinglequote(null);
		
		
		

	}

	
	
	
	
	
	private void Threadsleep() {
		// TODO Auto-generated method stub
		
	}
}