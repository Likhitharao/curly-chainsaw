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

WebUI.comment('Creating Deal With Contract Type "RETAINER "')

'Click on "Saleslog" tab'
WebUI.click(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/div_Sales Log'))

'wait for web elements to load '
WebUI.delay(5)

'For Entering \'n\' Deals'
for (int i = 1; i <= findTestData('Saleslog_info/saleslog_data').getRowNumbers(); i++) {
    'Click on "New" Button'
    WebUI.click(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/button_New'))

    'Select "Thor Consultant" dropdown'
    WebUI.selectOptionByValue(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/select_--- Please Select  ---'), findTestData(
            'Saleslog_info/saleslog_data').getValue(11, i), true)

    'Enter"Lead amount"'
    WebUI.setText(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/input_Lead Amount_lead_amount'), findTestData('Saleslog_info/saleslog_data').getValue(
            2, i))

    'Select"Lead given by" Dropdown'
    WebUI.selectOptionByValue(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/select_--- Please Select  --- _1'), 
        findTestData('Saleslog_info/saleslog_data').getValue(12, i), true)

    'Select "Brand" Dropdown'
    WebUI.selectOptionByValue(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/select_--- Please Select  --- _2'), 
        findTestData('Saleslog_info/saleslog_data').getValue(15, i), true)

    'Select "Company Name" Dropdown'
    WebUI.selectOptionByValue(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/select_TC LTD'), findTestData('Saleslog_info/saleslog_data').getValue(
            14, i), true)

    'Click on "Date" field\r\n'
    WebUI.click(findTestObject('Saleslog_info/saleslog_02/Page_Thor/de'))

    'Set "Date"'
    WebUI.click(findTestObject('Saleslog_info/saleslog_02/Page_Thor/de2'))

    'Enter "Candidate Name"'
    WebUI.setText(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/input__candidate_name'), findTestData('Saleslog_info/saleslog_data').getValue(
            1, i))

    'Select "Client Name" Dropdown'
    WebUI.selectOptionByValue(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/select_--- Please Select  --- _3'), 
        findTestData('Saleslog_info/saleslog_data').getValue(16, i), true)

    'Select "Contract type" Dropdown'
    WebUI.selectOptionByValue(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/select_--- Please Select  --- _4'), 
        'R', true)

    'wait for web elements to load '
    WebUI.delay(5)

    'Select "Sales Category" Dropdown'
    WebUI.selectOptionByValue(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/select_--- Please Select  --- _5'), 
        findTestData('Saleslog_info/saleslog_data').getValue(18, i), true)

    'Enter "Billable Salary"'
    WebUI.setText(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/input__fixed_total_amount'), findTestData('Saleslog_info/saleslog_data').getValue(
            3, i))

    'Select "Actual Currency" Dropdown'
    WebUI.selectOptionByValue(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/select_--- Please Select  --- _6'), 
        findTestData('Saleslog_info/saleslog_data').getValue(19, i), true)

    'Enter "Thor rate"'
    WebUI.setText(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/input__thor_rate'), findTestData('Saleslog_info/saleslog_data').getValue(
            4, i))

    'Enter "Client reference Number"'
    WebUI.setText(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/input_Client Reference Number_'), findTestData('Saleslog_info/saleslog_data').getValue(
            22, i))

    'Enter "Job Title"'
    WebUI.setText(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/input_Job Title_job_title'), findTestData('Saleslog_info/saleslog_data').getValue(
            23, i))

    'Enter "Comments"'
    WebUI.setText(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/textarea_Comments_comments'), findTestData('Saleslog_info/saleslog_data').getValue(
            9, i))

    'Enter "Payment Terms"'
    WebUI.setText(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/input_Payment Terms_payment'), findTestData('Saleslog_info/saleslog_data').getValue(
            10, i))

    'wait for web elements to load '
    WebUI.delay(5)

    'Click on "VAT"'
    WebUI.click(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/label_No'))

    'Generate"VAT"'
    WebUI.click(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/span_Invoice Number_glyphicon'))

    'wait for web elements to load '
    WebUI.delay(5)

    'Click on "Save" Button'
    WebUI.click(findTestObject('Saleslog_info/saleslog_02/2/Page_Thor/button_Save'))

    'wait for web elements to load '
    WebUI.delay(5)
}

