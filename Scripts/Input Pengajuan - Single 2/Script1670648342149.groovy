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

Mobile.startExistingApplication('com.bcaf.finashowroom')

Mobile.tap(findTestObject('Input Data 2/FINASH - BUTTON APPLY KREDIT'), 0)

Mobile.tap(findTestObject('Input Data 2/FINASH - BUTTON APPLY ONLINE'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Input Data 2/FINASH - BUTTON CAPTURE IMAGE'), 0)

CucumberKW.comment('Data Konsumen')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Klik Button Camera'
Mobile.tapAtPosition(527, 1914)

'Klik Button Submit'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(804, 1923)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Input Data 2/FINASH - INPUT NIK'), nik, 0)

Mobile.hideKeyboard()

Mobile.sendKeys(findTestObject('Input Data 2/FINASH - INPUT NAMA'), nama)

Mobile.tap(findTestObject('Input Data 2/FINASH - INPUT TANGGAL'), 0)

Mobile.tap(findTestObject('Input Data 2/FINASH - PILIH TAHUN'), 0)

Mobile.swipe(600, 900, 1500, 2400)

Mobile.tap(findTestObject('Input Data 2/FINASH - TAHUN 1992'), 0)

int drop = bulan

for (i = 0; i < drop; i++) {
    Mobile.tap(findTestObject('Input Data 2/FINASH - PILIH BULAN'), 0)
}

Mobile.tap(findTestObject('Input Data 2/FINASH - PILIH TANGGAL'), 0)

Mobile.tap(findTestObject('Input Data 2/FINASH - BUTTON SET'), 0)

Mobile.scrollToText('LANJUTKAN')

Mobile.setText(findTestObject('Input Data 2/FINASH - INPUT NO TELP'), no_telp, 0)

Mobile.sendKeys(findTestObject('Input Data 2/FINASH - INPUT EMAIL'), email)

Mobile.setText(findTestObject('Input Data 2/FINASH - INPUT NO ATM'), no_atm, 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.checkElement(findTestObject('Input Data 2/FINASH - RB SINGLE'), 0)

WebUI.delay(2)

'Klik Button Lanjutkan'
Mobile.tapAtPosition(529, 2080)

CucumberKW.comment('Data Kendaraan')

WebUI.delay(3)

Mobile.sendKeys(findTestObject('Object Repository/Kendaraan/android.widget.EditText'), no_polisi, FailureHandling.STOP_ON_FAILURE)

Mobile.sendKeys(findTestObject('Object Repository/Kendaraan/android.widget.EditText (1)'), merk, FailureHandling.STOP_ON_FAILURE)

Mobile.sendKeys(findTestObject('Object Repository/Kendaraan/android.widget.EditText (2)'), model, FailureHandling.STOP_ON_FAILURE)

Mobile.sendKeys(findTestObject('Object Repository/Kendaraan/android.widget.EditText (4)'), type, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Kendaraan/android.view.View - Tahun Kendaraan'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(900, 1300, 0, 0)

Mobile.tap(findTestObject('Object Repository/Kendaraan/android.widget.CheckedTextView - 2022'), 0)

Mobile.tap(findTestObject('Kendaraan/ITR2'), 0)

Mobile.delay(2)

not_run: Mobile.sendKeys(findTestObject('Kendaraan/ITR2'), '325.000.000')

Mobile.delay(4)

'Input OTR RP 385jt'
Mobile.tapAtPosition(tigax, tigay)

Mobile.tapAtPosition(enamx, enamy)

Mobile.tapAtPosition(limax, limay)

Mobile.tapAtPosition(444, 2070)

Mobile.tapAtPosition(444, 2070)

Mobile.tapAtPosition(444, 2070)

Mobile.tapAtPosition(444, 2070)

Mobile.tapAtPosition(444, 2070)

Mobile.tapAtPosition(444, 2070)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Kendaraan/android.widget.EditText - 0'), 0)

Mobile.delay(4)

'Input DP %'
Mobile.tapAtPosition(duax, duay)

Mobile.tapAtPosition(limax, limay)

Mobile.hideKeyboard()

not_run: Mobile.setText(findTestObject('Object Repository/Kendaraan/android.widget.EditText - 0'), '30', 0)

Mobile.sendKeys(findTestObject('Object Repository/Kendaraan/android.widget.EditText (7)'), kode_promo, FailureHandling.STOP_ON_FAILURE)

Mobile.checkElement(findTestObject('Kendaraan/android.widget.CheckBox'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Klik Button Setuju'
Mobile.tapAtPosition(757, 2080)

'Klik Button Lanjutkan'
not_run: Mobile.tapAtPosition(529, 2080)

