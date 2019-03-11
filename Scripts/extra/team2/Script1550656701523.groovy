import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.mythortal.com/')

WebUI.setText(findTestObject('Configuration_Info/team2/Page_THORtal - Login/input_Login_username'), 'nick')

WebUI.setEncryptedText(findTestObject('Configuration_Info/team2/Page_THORtal - Login/input_Login_password'), 'AdUMoLaE2tWuHJEBZev0OA==')

WebUI.click(findTestObject('Configuration_Info/team2/Page_THORtal - Login/button_Login'))

WebUI.click(findTestObject('Configuration_Info/team2/Page_Thor/div_Configuration'))

WebUI.delay(5)

WebUI.click(findTestObject('Configuration_Info/team2/Page_Thor/a_Team Conf'))

WebUI.delay(5)

WebUI.click(findTestObject('Configuration_Info/team2/Page_Thor/button_New'))

WebUI.delay(5)

WebUI.setText(findTestObject('Configuration_Info/team2/Page_Thor/input__team_name'), findTestData('Configuration_Info/Team_conf_01').getValue(
        1, 1))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Configuration_Info/Team_conf_01/Page_Thor/dd'), findTestData('Configuration_Info/Team_conf_01').getValue(
        2, 1), true)

WebUI.click(findTestObject('Configuration_Info/team2/Page_Thor/b_All_caret'))

for (int i = 1; i <= findTestData('Configuration_Info/Team_conf_01').getRowNumbers(); i++) {
    WebUI.delay(5)

    WebUI.setText(findTestObject('Configuration_Info/team2/Page_Thor/input_All_form-control multise'), findTestData('Configuration_Info/Team_conf_01').getValue(
            3, i), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)

    WebUI.click(findTestObject('Configuration_Info/team2/Page_Thor/input'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Configuration_Info/team2/Page_Thor/div_Team Name'))

WebUI.click(findTestObject('Configuration_Info/team2/Page_Thor/button_Save'))

