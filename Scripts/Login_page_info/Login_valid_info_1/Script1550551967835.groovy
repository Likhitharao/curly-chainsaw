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
import com.kms.katalon.core.logging.KeywordLogger


WebUI.comment('Login to Thor with Valid Credentials')

WebUI.openBrowser('')

'Thor URL'
WebUI.navigateToUrl('https://staging.mythortal.com/')

'Enter"E-mail"'
WebUI.setText(findTestObject('Login_page_info/Login_valid_info_1/Page_THORtal - Login/input_Login_username'), 'nick')

'Enter"Password"\r\n'
WebUI.setEncryptedText(findTestObject('Login_page_info/Login_valid_info_1/Page_THORtal - Login/input_Login_password'), 'AdUMoLaE2tWuHJEBZev0OA==')

'Click "Login" button'
WebUI.click(findTestObject('Login_page_info/Login_valid_info_1/Page_THORtal - Login/button_Login'))

'Very Successful Login'
WebUI.verifyElementPresent(findTestObject('Login_page_info/Login_valid_info_1/Page_THORtal - Login/dash'), 0, FailureHandling.STOP_ON_FAILURE)

KeywordLogger log = new KeywordLogger()
log.logInfo("yourMsg")
