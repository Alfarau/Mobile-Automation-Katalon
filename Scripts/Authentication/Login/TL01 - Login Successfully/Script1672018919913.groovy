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

Mobile.verifyElementVisible(findTestObject('Authentication/LoginObject/logo_Ayodhya'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/LoginObject/title_Login'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/LoginObject/title_Email'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/LoginObject/title_Password'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/LoginObject/btn_LupaPassword'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/LoginObject/title_Atau'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/LoginObject/btn_Register'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('Authentication/LoginObject/field_Email'), 'testing123@givmail.com', 0)

Mobile.setEncryptedText(findTestObject('Authentication/LoginObject/field_Password'), 'J2AI4hnpau4pnEw7bw4V5VaaCGuP0rdP', 
    0)

Mobile.tap(findTestObject('Authentication/LoginObject/btnLogin'), 0)

Mobile.verifyElementVisible(findTestObject('Authentication/LoginObject/menu_Tagihan'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Authentication/LoginObject/menu_profil'), 0)

Mobile.tap(findTestObject('Authentication/LoginObject/btnLogOut'), 0)

Mobile.tap(findTestObject('Authentication/LoginObject/LogOut_OK'), 0)

Mobile.closeApplication()

