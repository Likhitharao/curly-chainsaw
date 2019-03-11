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

WebUI.comment('Creating Employee data In configuration')

'Click " Configuration"'
WebUI.click(findTestObject('Configuration_Info/Employee_data_01/Page_Thor/div_Configuration'))

WebUI.delay(5)

for (int i = 1; i <= findTestData('Configuration_Info/employee_data_01').getRowNumbers(); i++) {
    'Click "New" button\r\n'
    WebUI.click(findTestObject('Configuration_Info/Employee_data_01/Page_Thor/button_New'))

    WebUI.delay(5)

    'Enter "First Name"'
    WebUI.setText(findTestObject('Configuration_Info/Employee_data_01/Page_Thor/input__first_name'), findTestData('Configuration_Info/employee_data_01').getValue(
            1, i))

    'Enter "Last Name"'
    WebUI.setText(findTestObject('Configuration_Info/Employee_data_01/Page_Thor/input__last_name'), findTestData('Configuration_Info/employee_data_01').getValue(
            2, i))

    'Enter "Emp.Code"'
    WebUI.setText(findTestObject('Configuration_Info/Employee_data_01/Page_Thor/input__emp_code'), findTestData('Configuration_Info/employee_data_01').getValue(
            3, i))

    'Enter " User Name"\r\n'
    WebUI.setText(findTestObject('Configuration_Info/Employee_data_01/Page_Thor/input__user_name'), findTestData('Configuration_Info/employee_data_01').getValue(
            4, i))

    WebUI.delay(5)

    'Enter "Encrypted Password"'
    WebUI.setEncryptedText(findTestObject('Configuration_Info/Employee_data_01/Page_Thor/input__password'), findTestData(
            'Configuration_Info/employee_data_01').getValue(5, i))

    'Select "Role" dropdown'
    WebUI.selectOptionByValue(findTestObject('Configuration_Info/Employee_data_01/Page_Thor/select_--- Please Select  ---'), 
        findTestData('Configuration_Info/employee_data_01').getValue(6, i), true)

    'Select "Company" Dropdown'
    WebUI.selectOptionByValue(findTestObject('Configuration_Info/Employee_data_01/Page_Thor/select_--- Please Select  --- _1'), 
        findTestData('Configuration_Info/employee_data_01').getValue(7, i), true)

    'Select "Brand" Dropdown\r\n'
    WebUI.click(findTestObject('Configuration_Info/Employee_data_01/Page_Thor/span_All'))

    WebUI.click(findTestObject('Configuration_Info/Employee_data_01/Page_Thor/input'))

    WebUI.click(findTestObject('Configuration_Info/Employee_data_01/Page_Thor/click'))

    'Click "Save " button'
    WebUI.click(findTestObject('Configuration_Info/Employee_data_01/Page_Thor/savce'))

    'Search Whether saved data is updated or not'
    WebUI.setText(findTestObject('Configuration_Info/Employee_data_01/Page_Thor/input_Search_form-control inpu'), findTestData(
            'Configuration_Info/employee_data_01').getValue(3, i), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)
}

