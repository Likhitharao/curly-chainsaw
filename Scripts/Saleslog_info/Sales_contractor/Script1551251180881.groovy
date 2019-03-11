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

WebUI.callTestCase(findTestCase('Login_page_info/Login_valid_info_1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/div_Sales Log'))

WebUI.delay(5)

WebUI.click(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/button_New'))

WebUI.selectOptionByValue(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/select_--- Please Select  ---'), 'qwe', 
    true)

WebUI.setText(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/input_Lead Amount_lead_amount'), '895625')

WebUI.selectOptionByValue(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/select_--- Please Select  --- _1'), 'LC', 
    true)

WebUI.selectOptionByValue(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/select_TC LTD'), 'TLS Ltd', true)

WebUI.click(findTestObject('Saleslog_info/saleslog_02/Page_Thor/de'))

WebUI.click(findTestObject('Saleslog_info/saleslog_02/Page_Thor/de2'))

WebUI.selectOptionByValue(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/select_--- Please Select  --- _2'), 'Thor Life Sciences E.U', 
    true)

WebUI.setText(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/input__candidate_name'), 'nil')

WebUI.selectOptionByValue(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/select_--- Please Select  --- _3'), 'Cello', 
    true)

WebUI.selectOptionByValue(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/select_--- Please Select  --- _4'), 'C', 
    true)

WebUI.delay(5)

WebUI.click(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/click sales'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/sales'), 'Contractor written up', false)

WebUI.setText(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/input__invoice_rate'), '250')

WebUI.setText(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/input__candidate_rate'), '150')

WebUI.selectOptionByValue(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/select_--- Please Select  --- _6'), 'GBP', 
    true)

WebUI.setText(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/input__contract_days_worked'), '30')

WebUI.setText(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/input_Expenses_expenses'), '989')

WebUI.selectOptionByValue(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/select_--- Please Select  --- _7'), 'GBP', 
    true)

WebUI.setText(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/input_Client Reference Number_'), '85258')

WebUI.setText(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/input_Job Title_job_title'), 'abcd')

WebUI.setText(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/textarea_Comments_comments'), 'abcd')

WebUI.delay(5)

WebUI.click(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/label_No'))

WebUI.click(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/span_Invoice Number_glyphicon'))

WebUI.delay(5)

WebUI.click(findTestObject('Saleslog_info/Sales_contractor/Page_Thor/button_Save'))

WebUI.delay(5)

