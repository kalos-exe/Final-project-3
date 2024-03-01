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

def getDataUser = findTestData('Data Files/Data user')
def Username = getDataUser.getObjectValue('Username', 1)
def Password = getDataUser.getObjectValue('Password', 1)
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.matahari.com')

WebUI.click(findTestObject('Object Repository/web matahari/div_Masuk'))

WebUI.setText(findTestObject('Object Repository/web matahari/inputUsername'), Username)
WebUI.setText(findTestObject('Object Repository/web matahari/inputPassword'), Password)

WebUI.click(findTestObject('Object Repository/web matahari/button_Masuk'))

WebUI.click(findTestObject('Object Repository/web matahari/span_CELANA PANJANG PRIA'))

WebUI.click(findTestObject('Object Repository/web matahari/button_BELI'))
WebUI.click(findTestObject('Object Repository/web matahari/div_32'))
WebUI.click(findTestObject('Object Repository/web matahari/button_Belibarang'))
WebUI.click(findTestObject('Object Repository/web matahari/a_Keranjang'))

WebUI.click(findTestObject('Object Repository/web matahari/a_Lihat Keranjang'))