import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def login(userName, password) {
	WebUI.setText(findTestObject('logintest/Page_/input_userName'), userName)
	
	WebUI.setText(findTestObject('logintest/Page_/input_password'), password)
}

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.6.223:8000/#/login?from=%2Fsystem%2FshopSettings')

WebUI.setText(findTestObject('Page_ (3)/input_username'), 'admin')

WebUI.setText(findTestObject('Page_ (3)/input_password'), '123456')

WebUI.setText(findTestObject('Page_ (3)/input_inputRandomCode'), '6666')

WebUI.click(findTestObject('Page_ (3)/button_'))

WebUI.click(findTestObject('Page_ (3)/label_'))

WebUI.setText(findTestObject('Page_ (3)/input_concatPhone'), '02312345')

WebUI.closeBrowser()

WebUI.verifyElementText(findTestObject('Page_/input_username'), 'admin')



login("admin", "123456")