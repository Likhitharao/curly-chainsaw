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

WebUI.comment('Creating Client form in Configuration')

'Click on "Configuration Button"\r\n'
WebUI.click(findTestObject('Saleslog_info/saleslog_02/2/client_form/Page_Thor/div_Configuration'))

WebUI.delay(5)

'click on "Client Form" tab\r\n'
WebUI.click(findTestObject('Saleslog_info/saleslog_02/2/client_form/Page_Thor/a_Client Form'))

for (int i = 1; i <= findTestData('Configuration_Info/Client_form_01').getRowNumbers(); i++) {
    WebUI.delay(5)

    'Click on "+" button\r\n'
    WebUI.click(findTestObject('Saleslog_info/saleslog_02/2/client_form/Page_Thor/i_Client_fa fa-plus-circle tho'))

    WebUI.delay(5)

    'Enter "Client Name"\r\n'
    WebUI.setText(findTestObject('Saleslog_info/saleslog_02/2/client_form/Page_Thor/input__client_name'), findTestData('Configuration_Info/Client_form_01').getValue(
            1, i))

    'Enter "Contact Name"\r\n'
    WebUI.setText(findTestObject('Saleslog_info/saleslog_02/2/client_form/Page_Thor/input_max 35 characters_contac'), findTestData(
            'Configuration_Info/Client_form_01').getValue(2, i))

    'Enter " Contact Email Address"\r\n'
    WebUI.setText(findTestObject('Saleslog_info/saleslog_02/2/client_form/Page_Thor/input_max 50 characters_contac'), findTestData(
            'Configuration_Info/Client_form_01').getValue(3, i))

    'Enter " Company Postal address"\r\n'
    WebUI.setText(findTestObject('Saleslog_info/saleslog_02/2/client_form/Page_Thor/input_max 50 characters_compan'), findTestData(
            'Configuration_Info/Client_form_01').getValue(4, i))

    'Enter "EC Vat Number"\r\n'
    WebUI.setText(findTestObject('Saleslog_info/saleslog_02/2/client_form/Page_Thor/input__EcVat_Num'), findTestData('Configuration_Info/Client_form_01').getValue(
            5, i))

    'Enter "Vat Status"\t\r\n\t\r\n'
    WebUI.selectOptionByValue(findTestObject('Saleslog_info/saleslog_02/2/client_form/Page_Thor/select_--- Please Select  ---'), findTestData(
            'Configuration_Info/Client_form_01').getValue(6, i), true)

    WebUI.delay(5)

    'Click on " Save Button"'
    WebUI.click(findTestObject('Saleslog_info/saleslog_02/2/client_form/Page_Thor/button_Save'))
}

