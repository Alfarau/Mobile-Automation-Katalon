import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('D:\\Mobile Automation Katalon\\ayodhya.apk', false)

WebUI.delay(2)

Mobile.tap(findTestObject('Authentication/LoginObject/btnLanjut'), 0)

Mobile.tap(findTestObject('Authentication/LoginObject/btnLanjut'), 0)

Mobile.tap(findTestObject('Authentication/LoginObject/btnLanjut'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Authentication/RegistrationObject/btnRegisterHome'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('Authentication/RegistrationObject/field_NamaLengkap'), 'User Automation', 0)

Mobile.setText(findTestObject('Authentication/RegistrationObject/field_Email'), 'emailAutomation@givmail.com', 0)

Mobile.setText(findTestObject('Authentication/RegistrationObject/field_phone'), '08123456789', 0)

Mobile.setText(findTestObject('Authentication/RegistrationObject/field_Password'), '123', 0)

Mobile.setText(findTestObject('Authentication/RegistrationObject/field_KonfPassword'), '123456', 0)

Mobile.tap(findTestObject('Authentication/RegistrationObject/btnLanjutReg'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.verifyElementVisible(findTestObject('Authentication/RegistrationObject/errorMsg_PassLessThan6Char'), 0)

Mobile.closeApplication()

