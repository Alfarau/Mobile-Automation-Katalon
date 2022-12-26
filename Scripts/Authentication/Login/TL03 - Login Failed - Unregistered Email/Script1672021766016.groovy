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

Mobile.startApplication('D:\\Mobile Automation Katalon\\ayodhya.apk\\', false)

WebUI.delay(2)

Mobile.tap(findTestObject('Authentication/LoginObject/btnLanjut'), 0)

Mobile.tap(findTestObject('Authentication/LoginObject/btnLanjut'), 0)

Mobile.tap(findTestObject('Authentication/LoginObject/btnLanjut'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Authentication/LoginObject/btnLoginHome'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('Authentication/LoginObject/field_Email'), 'belumdidaftarin@gmail.com', 0)

Mobile.setEncryptedText(findTestObject('Authentication/LoginObject/field_Password'), 'zv7tNTLfY0SaJ855zYDWHw==', 0)

Mobile.tap(findTestObject('Authentication/LoginObject/btnLogin'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/LoginObject/errorMsg_UnregisteredEmail'), 0)

WebUI.delay(2)

Mobile.closeApplication()

