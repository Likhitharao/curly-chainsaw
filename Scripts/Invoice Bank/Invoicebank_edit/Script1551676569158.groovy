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

WebUI.click(findTestObject('Object Repository/Invoicebank_edit/Page_Thor/div_Invoice Bank'))

WebUI.setText(findTestObject('Object Repository/Invoicebank_edit/Page_Thor/input_Show entries_myInputText'), findTestData(
        'Saleslog_info/saleslog_data').getValue(1, 1))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Invoicebank_edit/Page_Thor/i_Inv. P Date_fa fa-pencil-squ'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Invoicebank_edit/Page_Thor/textarea_Comments_com_comments'), 'BCA')

WebUI.click(findTestObject('Object Repository/Invoicebank_edit/Page_Thor/button_Update'))

WebUI.delay(2)

WebUI.verifyTextPresent('Updated', false)

