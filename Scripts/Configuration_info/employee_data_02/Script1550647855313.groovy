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

WebUI.comment('Editing the Employee data In Configuration')

'Click "Configuration " Button\r\n'
WebUI.click(findTestObject('Configuration_Info/employee_data_02/new edit2/Page_Thor/div_Configuration'))

for (int i = 1; i <= findTestData('Configuration_Info/employee-data_02').getRowNumbers(); i++) {
    'Search "Emp.code" for which we have to edit'
    WebUI.setText(findTestObject('Configuration_Info/employee_data_02/new edit2/Page_Thor/input_Search_form-control inpu'), 
        findTestData('Configuration_Info/employee-data_02').getValue(1, i))

    WebUI.delay(5)

    'Click " edit" Button\r\n'
    WebUI.click(findTestObject('Configuration_Info/employee_data_02/new edit2/Page_Thor/span_TC LTD_checkbox_employee'))

    WebUI.delay(5)

    'Edit "Firstname"'
    WebUI.setText(findTestObject('Configuration_Info/employee_data_02/new edit2/Page_Thor/input__first_name'), findTestData(
            'Configuration_Info/employee-data_02').getValue(2, i))

    'Edit" role"'
    WebUI.selectOptionByValue(findTestObject('Configuration_Info/employee_data_02/new edit2/Page_Thor/select_--- Please Select  ---'), 
        findTestData('Configuration_Info/employee-data_02').getValue(3, i), true)

    WebUI.delay(5)

    'Edit "status"\r\n'
    WebUI.click(findTestObject('Configuration_Info/employee_data_02/new edit2/Page_Thor/label_in-active'))

    WebUI.delay(5)

    'Click on "Update" Buttton'
    WebUI.click(findTestObject('Configuration_Info/employee_data_02/new edit2/Page_Thor/button_Update'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)
}

