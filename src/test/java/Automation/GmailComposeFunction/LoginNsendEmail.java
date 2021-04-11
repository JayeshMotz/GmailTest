package Automation.GmailComposeFunction;

import org.testng.annotations.Test;

import Essentials.ConfigFile;
import Essentials.ExecuteLogic;

public class LoginNsendEmail extends ExecuteLogic {

    @Test(description = "This test cover the following scenarios :- 1)Login to Gmail 2)Send Mail 3)Logout")
    public void testLoginNSend() throws Exception {
	OpenBrowser();

	ReadNAssign(ConfigFile.xlPath_credentials);
	ReadExcel_Executelogic(ConfigFile.xlPath_credentials);

	CloseBrowser();

    }

    @Override
    public void Logic(int i) throws Exception {
	// TODO Auto-generated method stub

	sheet = workbook.getSheetAt(i);
	lastrow = sheet.getLastRowNum();
	String SheetName = workbook.getSheetName(i);
	if (SheetName.equalsIgnoreCase("Creds")) {

	    for (int j = 1; j <= lastrow; j++) {
		row = sheet.getRow(j);

		String Username = row.getCell(in1).toString();
		String Password = row.getCell(in2).toString();

		if (Username.equals("") || Password.equals("")) {
		    break;
		}

		log.Login(Username, Password);

		for (int k = 0; k < 1; k++) {
		    sheet = workbook.getSheetAt(i);
		    lastrow = sheet.getLastRowNum();
		    SheetName = workbook.getSheetName(i);

		    if (SheetName.equalsIgnoreCase("emailDetails")) {
			for (int l = 1; l <= lastrow; l++) {

			    String recepient = row.getCell(in3).toString();
			    String subjectLine = row.getCell(in4).toString();
			    String msgBody = row.getCell(in5).toString();

			    se.sendMessages(recepient, subjectLine, msgBody);
			}
		    }
		}

		log.Logout();
	    }
	}

    }

}
