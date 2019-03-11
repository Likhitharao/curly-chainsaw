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

WebUI.setText(findTestObject('Object Repository/Exchange/Page_THORtal - Login/input_Login_username'), 'nick')

WebUI.setEncryptedText(findTestObject('Object Repository/Exchange/Page_THORtal - Login/input_Login_password'), 'AdUMoLaE2tWuHJEBZev0OA==')

WebUI.click(findTestObject('Object Repository/Exchange/Page_THORtal - Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Exchange/Page_Thor/div_Sales Log'))

WebUI.delay(5)

CustomKeywords.'date.Datepicker.keywordName'(null)

WebUI.click(findTestObject('Object Repository/Exchange/Page_Thor/button_New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Exchange/Page_Thor/select_--- Please Select  ---'), 'AA', true)

WebUI.setText(findTestObject('Object Repository/Exchange/Page_Thor/input_Lead Amount_lead_amount'), '852369')

WebUI.selectOptionByValue(findTestObject('Object Repository/Exchange/Page_Thor/select_--- Please Select  --- _1'), 'LB', 
    true)

WebUI.click(findTestObject('Object Repository/Exchange/Page_Thor/td_14'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Exchange/Page_Thor/select_--- Please Select  --- _2'), 'Thor Life Sciences E.U', 
    true)

WebUI.setText(findTestObject('Object Repository/Exchange/Page_Thor/input__candidate_name'), 'AWE')

WebUI.selectOptionByValue(findTestObject('Object Repository/Exchange/Page_Thor/select_--- Please Select  --- _3'), 'Cello', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Exchange/Page_Thor/select_--- Please Select  --- _4'), 'C', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Exchange/Page_Thor/select_--- Please Select  --- _5'), 'Dropper', 
    true)

WebUI.setText(findTestObject('Object Repository/Exchange/Page_Thor/input__invoice_rate'), '20')

WebUI.setText(findTestObject('Object Repository/Exchange/Page_Thor/input__candidate_rate'), '20')

WebUI.selectOptionByValue(findTestObject('Object Repository/Exchange/Page_Thor/select_--- Please Select  --- _6'), 'GBP', 
    true)

WebUI.setText(findTestObject('Object Repository/Exchange/Page_Thor/input__contract_days_worked'), '20')

WebUI.click(findTestObject('Object Repository/Exchange/Page_Thor/label_No'))

WebUI.click(findTestObject('Object Repository/Exchange/Page_Thor/button_Invoice Number_generate'))

WebUI.click(findTestObject('Object Repository/Exchange/Page_Thor/button_Save'))

