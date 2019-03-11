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

WebUI.setText(findTestObject('Configuration_Info/example/Page_THORtal - Login/input_Login_username'), 'nick')

WebUI.setEncryptedText(findTestObject('Configuration_Info/example/Page_THORtal - Login/input_Login_password'), 'AdUMoLaE2tWuHJEBZev0OA==')

WebUI.click(findTestObject('Configuration_Info/example/Page_THORtal - Login/button_Login'))

WebUI.click(findTestObject('Configuration_Info/example/Page_Thor/div_Configuration'))

WebUI.delay(5)

WebUI.click(findTestObject('Configuration_Info/example/Page_Thor/a_Team Conf'))

WebUI.delay(5)

WebUI.click(findTestObject('Configuration_Info/example/Page_Thor/button_New'))

WebUI.delay(5)

WebUI.setText(findTestObject('Configuration_Info/example/Page_Thor/input__team_name'), 'r')

WebUI.selectOptionByValue(findTestObject('Configuration_Info/Team_conf_01/Page_Thor/dd'), '160', true)

WebUI.click(findTestObject('Configuration_Info/example/Page_Thor/b_All_caret'))

WebUI.delay(5)

WebUI.click(findTestObject('Configuration_Info/example/Page_Thor/label_ac'))

WebUI.click(findTestObject('Configuration_Info/example/Page_Thor/label_AAA'))

WebUI.click(findTestObject('Configuration_Info/example/Page_Thor/div_AA'))

WebUI.click(findTestObject('Configuration_Info/example/Page_Thor/button_Save'))

