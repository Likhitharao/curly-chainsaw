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

WebUI.comment('Downloading Invoice in Saleslog Module')

'Login to THOR Using valid Credentials'
WebUI.callTestCase(findTestCase('Login_page_info/Login_valid_info_1'), [:], FailureHandling.STOP_ON_FAILURE)

'Click on"Saleslog" tab'
WebUI.click(findTestObject('Object Repository/Saleslog_download/Page_Thor/div_Sales Log'))

'Enter input in "Search"'
WebUI.setText(findTestObject('Object Repository/Saleslog_download/Page_Thor/input_Show entries_myInputText'), findTestData(
        'Saleslog_info/saleslog_data').getValue(1, 1))

'wait for web elements to load '
WebUI.delay(5)

'Click on "Download" Button'
WebUI.click(findTestObject('Object Repository/Saleslog_download/Page_Thor/i_Approved_fa fa-download'))

