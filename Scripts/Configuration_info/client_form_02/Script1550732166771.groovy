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

WebUI.comment('Editing The Client Form in Configuration')

'Click on "configuration Button"\r\n'
WebUI.click(findTestObject('Configuration_Info/client_form_02/Page_Thor/div_Configuration'))

WebUI.delay(5)

'Click on "client Form" tab\r\n'
WebUI.click(findTestObject('Configuration_Info/client_form_02/Page_Thor/a_Client Form'))

WebUI.delay(5)

'Click on "Edit" button\r\n'
WebUI.click(findTestObject('Configuration_Info/client_form_02/Page_Thor/span_Reverse Charge Applies_fa'))

'If Value== Yes'
if (findTestData('Configuration_Info/Client_form_01').getValue(7, 1)) {
    WebUI.delay(5)

    'Update status as "NO"'
    WebUI.click(findTestObject('Configuration_Info/client_form_02/Page_Thor/Status'))
} else {
    'Update status as "Yes"\r\n'
    WebUI.click(findTestObject('Configuration_Info/client_form_02/Page_Thor/label_Yes'))
}

'Click on "Save " Button\r\n'
WebUI.click(findTestObject('Configuration_Info/client_form_02/Page_Thor/button_Update'))

