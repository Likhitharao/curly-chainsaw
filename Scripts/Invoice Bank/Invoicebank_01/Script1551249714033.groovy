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

WebUI.comment('Checking Saleslog (Invoice sent ,Direct Approval) Deals are updated in Invoice or not')

'Calling: Login THOR using Valid Credentials'
WebUI.callTestCase(findTestCase('Login_page_info/Login_valid_info_1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'Calling: InvoiceSent Deal for Creating Deal'
WebUI.callTestCase(findTestCase('Saleslog_info/saleslog_Invoicesent'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'Click on "Invoice Bank" tab'
WebUI.click(findTestObject('Object Repository/Invoice_Bank_01/Page_Thor/div_Invoice Bank'))

'Refreshing the page for Updating the created deal'
WebUI.refresh()

'For Checking \'n\' Deals'
for (int i = 1; i <= findTestData('Saleslog_info/saleslog_data').getRowNumbers(); i++) {
    'Enter input in "search" (Created deal details)'
    WebUI.setText(findTestObject('Object Repository/Invoice_Bank_01/Page_Thor/input_Show entries_myInputText'), findTestData(
            'Saleslog_info/saleslog_data').getValue(1, i))

    WebUI.delay(5)
}

