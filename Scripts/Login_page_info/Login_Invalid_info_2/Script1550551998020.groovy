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

WebUI.openBrowser('Login to THOR with Invalid Credentials')

'Thor "URL"'
WebUI.navigateToUrl('https://staging.mythortal.com/')

'Enter"Invalid E-mail"'
WebUI.setText(findTestObject('Login_page_info/Login_invalid_info_2/Page_THORtal - Login/input_Login_username'), 'Nick')

'Enter"Invalid Password"'
WebUI.setEncryptedText(findTestObject('Login_page_info/Login_invalid_info_2/Page_THORtal - Login/input_Login_password'), 
    'qOlzMKa2OKp2/hJZSRuf5A==')

'Click"Login" button'
WebUI.click(findTestObject('Login_page_info/Login_invalid_info_2/Page_THORtal - Login/button_Login'), FailureHandling.STOP_ON_FAILURE)

