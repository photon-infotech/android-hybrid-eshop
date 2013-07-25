package com.photon.phresco.hybrid.test;
import android.test.ActivityInstrumentationTestCase2;

import android.test.suitebuilder.annotation.Smoke;
import com.jayway.android.robotium.solo.By;
import android.util.Log;
import com.jayway.android.robotium.solo.Solo;
import com.photon.phresco.hybrid.activity.MainActivity;
import com.photon.phresco.hybrid.test.LoginValidationTest;
import com.photon.phresco.hybrid.test.LoginVerificationTest;
import com.photon.phresco.hybrid.test.RegistrationTest;
import com.photon.phresco.hybrid.test.BrowseVerificationTest;
import com.photon.phresco.hybrid.test.SpecialOffersTest;
import com.photon.phresco.hybrid.test.MyCartChekoutTest;
import com.photon.phresco.hybrid.test.MobilePhonesTest;
import com.photon.phresco.hybrid.test.AudioDevicesVerificationTest;
import com.photon.phresco.hybrid.test.CamarasVerificationTest;
import com.photon.phresco.hybrid.test.TabletsVerificationTest;
import com.photon.phresco.hybrid.test.MoviesandMusicVerificationTest;
import com.photon.phresco.hybrid.test.TestException;
import com.jayway.android.robotium.solo.WebElement;
import android.widget.EditText;

@SuppressWarnings({ "unchecked", "unused" })
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

public static final String PACKAGE_NAME = "com.photon.phresco.hybrid";
private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.photon.phresco.hybrid.eshop.activity.MainActivity";
private static Class<MainActivity> mainActivity;
private Solo soloMain;
private Log LOG;
private static final String TAG = "****MainTestCase****";
private static EditText EditFields;
private LoginValidationTest loginTestCase;
private LoginVerificationTest loginTestPass;
private RegistrationTest rigsterTest;
private BrowseVerificationTest browsetest;
private MyCartChekoutTest Mycarttest;
private SpecialOffersTest specialtest;
private MobilePhonesTest mobile;
private AudioDevicesVerificationTest audio;
private CamarasVerificationTest camaras;
private TabletsVerificationTest tablet;
private MoviesandMusicVerificationTest movies;


static {
	try {
		mainActivity = (Class<MainActivity>) Class
				.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
	}

	catch (ClassNotFoundException e) {
		throw new RuntimeException(e);
	}
}

public MainActivityTest(){
	super(PACKAGE_NAME, mainActivity);
}

public void setUp() {

	soloMain = new Solo(getInstrumentation(), getActivity());

}

// test cases are started here 

@Smoke
public void testValidationLogin() throws TestException {

	try {
		Log.i(TAG, "testValidationLogin---------Start");
		// creating object of the testclass LoginVerificationTestCase
		loginTestCase = new LoginValidationTest(soloMain);
		// calling the test method
		loginTestCase.testLoginValidation(getInstrumentation());
		Log.i(TAG, "testValidationLogin---------End");

	} catch (TestException e) {
		Log.e(TAG, Log.getStackTraceString(e));
	}

}
@Smoke
public void testVerificationLogin() throws TestException {

	try {
		Log.i(TAG, "testVerificationLogin---------Start");
		// creating object of the testclass LoginVerificationTestCase
		loginTestPass = new LoginVerificationTest(soloMain);
		// calling the test method
		loginTestPass.testLoginVerification(getInstrumentation());
		Log.i(TAG, "testVerificationLogin---------End");

	} catch (TestException e) {
		Log.e(TAG, Log.getStackTraceString(e));
	}

}
@Smoke
public void testRegistration() throws TestException {

	try {
		Log.i(TAG, "testRegistration---------Start");
		// creating object of the testclass RegistrationTestClass
		rigsterTest = new RegistrationTest(soloMain);
		// calling the test method
		rigsterTest.testRegistration(getInstrumentation());
		Log.i(TAG, "testRegistration---------End");

	} catch (TestException e) {
		Log.e(TAG, Log.getStackTraceString(e));
	}

}

@Smoke
public void testMobilePhones() throws TestException {

	try {
		Log.i(TAG, "testMobilePhones---------Start");
		// creating object of the testclass testBrowseVerification class
		mobile = new MobilePhonesTest(soloMain);
		// calling the test method
		mobile.testMobilePhones(getInstrumentation());
		Log.i(TAG, "testMobilePhones---------End");

	} catch (TestException e) {
		Log.e(TAG, Log.getStackTraceString(e));
	}

}
@Smoke
public void testAudioDevicesVerificationTest() throws TestException {

	try {
		Log.i(TAG, "testAudioDevicesVerificationTest---------Start");
		// creating object of the testclass testBrowseVerification class
		audio = new AudioDevicesVerificationTest(soloMain);
		// calling the test method
		audio.testAudioDevicesVerificationTest(getInstrumentation());
		Log.i(TAG, "testAudioDevicesVerificationTest---------End");

	} catch (TestException e) {
		Log.e(TAG, Log.getStackTraceString(e));
	}

}
@Smoke
public void testCamarasVerificationTest() throws TestException {

	try {
		Log.i(TAG, "testCamarasVerificationTest---------Start");
		// creating object of the testclass testBrowseVerification class
		camaras = new CamarasVerificationTest(soloMain);
		// calling the test method
		camaras.testCamarasVerificationTest(getInstrumentation());
		Log.i(TAG, "testCamarasVerificationTest---------End");

	} catch (TestException e) {
		Log.e(TAG, Log.getStackTraceString(e));
	}

}
@Smoke
public void testTabletsVerificationTest() throws TestException {

	try {
		Log.i(TAG, "testTabletsVerificationTest---------Start");
		// creating object of the testclass testBrowseVerification class
		tablet = new TabletsVerificationTest(soloMain);
		// calling the test method
		tablet.testTabletsVerificationTest(getInstrumentation());
		Log.i(TAG, "testTabletsVerificationTest---------End");

	} catch (TestException e) {
		Log.e(TAG, Log.getStackTraceString(e));
	}

}
@Smoke
public void testMoviesandMusicVerificationTest() throws TestException {

	try {
		Log.i(TAG, "testMoviesandMusicVerificationTest---------Start");
		// creating object of the testclass testBrowseVerification class
		movies = new MoviesandMusicVerificationTest(soloMain);
		// calling the test method
		movies.testMoviesandMusicVerificationTest(getInstrumentation());
		Log.i(TAG, "testMoviesandMusicVerificationTest---------End");

	} catch (TestException e) {
		Log.e(TAG, Log.getStackTraceString(e));
	}

}
@Smoke
public void testBrowseVerification() throws TestException {

	try {
		Log.i(TAG, "testBrowseVerification---------Start");
		// creating object of the testclass testBrowseVerification class
		browsetest = new BrowseVerificationTest(soloMain);
		// calling the test method
		browsetest.testBrowseVerification(getInstrumentation());
		Log.i(TAG, "testBrowseVerification---------End");

	} catch (TestException e) {
		Log.e(TAG, Log.getStackTraceString(e));
	}

}

@Smoke
public void testSpecialOffersTest() throws TestException {

	try {
		Log.i(TAG, "testSpecialOffersTest---------Start");
		// creating object of the testclass testSpecialOffersTest class
		specialtest = new SpecialOffersTest(soloMain);
		// calling the test method
		specialtest.testSpecialOffersTest(getInstrumentation());
		Log.i(TAG, "testSpecialOffersTest---------End");

	} catch (TestException e) {
		Log.e(TAG, Log.getStackTraceString(e));
	}

}
/*@Smoke
public void testMyoffersTest() throws TestException {

	try {
		Log.i(TAG, "testMyoffersTest---------Start");
		// creating object of the testclass testMyoffersTest class
		Mycarttest = new MyCartChekoutTest(soloMain);
		// calling the test method
		Mycarttest.testMyCartChekoutTest(getInstrumentation());
		Log.i(TAG, "testMyoffersTest---------End");

	} catch (TestException e) {
		Log.e(TAG, Log.getStackTraceString(e));
	}

}*/
@Override
protected void tearDown() throws Exception {

	soloMain.finishOpenedActivities();
		
}}
