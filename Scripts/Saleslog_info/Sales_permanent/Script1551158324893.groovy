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

WebUI.comment('Craeting Deal with Contract Type "PERMANENT"')

'Click on " Sales log" tab\r\n'
WebUI.click(findTestObject('Saleslog_info/new sales/Page_Thor/div_Sales Log'))

'wait for web elements to load '
WebUI.delay(5)

'For Entering "n" deals'
for (int i = 1; i <= findTestData('Saleslog_info/saleslog_data').getRowNumbers(); i++) {
    'Click on " New" button\r\n'
    WebUI.click(findTestObject('Saleslog_info/new sales/Page_Thor/button_New'))

    'Select "Thor Consultant" Dropdown'
    WebUI.selectOptionByValue(findTestObject('Saleslog_info/new sales/Page_Thor/select_--- Please Select  ---'), findTestData(
            'Saleslog_info/saleslog_data').getValue(11, i), true)

    'Enter "Lead amount"'
    WebUI.setText(findTestObject('Saleslog_info/new sales/Page_Thor/input_Lead Amount_lead_amount'), findTestData('Saleslog_info/saleslog_data').getValue(
            2, i))

    'Select "Lead Given By " Dropdown\r\n '
    WebUI.selectOptionByValue(findTestObject('Saleslog_info/new sales/Page_Thor/select_--- Please Select  --- _1'), findTestData(
            'Saleslog_info/saleslog_data').getValue(12, i), true)

    'Click on"Date" field'
    WebUI.click(findTestObject('Saleslog_info/saleslog_02/Page_Thor/de'))

    'Set"Date"'
    WebUI.click(findTestObject('Saleslog_info/saleslog_02/Page_Thor/de2'))

    'Select"Brand" Dropdown'
    WebUI.selectOptionByValue(findTestObject('Saleslog_info/new sales/Page_Thor/select_--- Please Select  --- _2'), findTestData(
            'Saleslog_info/saleslog_data').getValue(15, i), true)

    'Enter "Candidate Name"'
    WebUI.setText(findTestObject('Saleslog_info/new sales/Page_Thor/input__candidate_name'), findTestData('Saleslog_info/saleslog_data').getValue(
            1, i))

    'Select "Client Name" Dropdown'
    WebUI.selectOptionByValue(findTestObject('Saleslog_info/new sales/Page_Thor/select_--- Please Select  --- _3'), findTestData(
            'Saleslog_info/saleslog_data').getValue(16, i), true)

    'Select"ContractType" Dropdown'
    WebUI.selectOptionByValue(findTestObject('Saleslog_info/new sales/Page_Thor/select_--- Please Select  --- _4'), 'P', 
        true)

    'Select "Sales category" Dropdown'
    WebUI.selectOptionByValue(findTestObject('Saleslog_info/new sales/Page_Thor/select_--- Please Select  --- _5'), findTestData(
            'Saleslog_info/saleslog_data').getValue(18, i), true)

    'Enter "Billable Salaty"'
    WebUI.setText(findTestObject('Saleslog_info/new sales/Page_Thor/input__fixed_total_amount'), findTestData('Saleslog_info/saleslog_data').getValue(
            3, i))

    'Select "Actual Currency" Dropdown'
    WebUI.selectOptionByValue(findTestObject('Saleslog_info/new sales/Page_Thor/select_--- Please Select  --- _6'), findTestData(
            'Saleslog_info/saleslog_data').getValue(19, i), true)

    'Enter "Thor rate"'
    WebUI.setText(findTestObject('Saleslog_info/new sales/Page_Thor/input__thor_rate'), findTestData('Saleslog_info/saleslog_data').getValue(
            4, i))

    'Enter "Client Reference Number"'
    WebUI.setText(findTestObject('Saleslog_info/new sales/Page_Thor/input_Client Reference Number_'), findTestData('Saleslog_info/saleslog_data').getValue(
            22, i))

    'Enter "Job Title"'
    WebUI.setText(findTestObject('Saleslog_info/new sales/Page_Thor/input_Job Title_job_title'), findTestData('Saleslog_info/saleslog_data').getValue(
            23, i))

    'Enter "Comments"'
    WebUI.setText(findTestObject('Saleslog_info/new sales/Page_Thor/textarea_Comments_comments'), findTestData('Saleslog_info/saleslog_data').getValue(
            9, i))

    'Click on "VAT"'
    WebUI.click(findTestObject('Saleslog_info/new sales/Page_Thor/label_No'))

    'Generate "VAT"'
    WebUI.click(findTestObject('Saleslog_info/new sales/Page_Thor/span_Invoice Number_glyphicon'))

    'wait for web elements to load '
    WebUI.delay(5)

    'Click on "Save" Button'
    WebUI.click(findTestObject('Saleslog_info/new sales/Page_Thor/button_Save'), FailureHandling.STOP_ON_FAILURE)

    'wait for web elements to load '
    WebUI.delay(5)
}

