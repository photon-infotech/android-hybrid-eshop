package com.photon.phresco.hybrid.eshop.net;

import java.io.IOException;
import java.net.HttpURLConnection;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.photon.phresco.hybrid.R;
import com.photon.phresco.hybrid.eshop.activity.MainActivity;
import com.photon.phresco.hybrid.eshop.logger.PhrescoLogger;



public class NetworkManager {
	private static final String TAG = "ConnectivityMessaging ********";
	public static boolean checkURLStatus(final String url){
		PhrescoLogger.info(TAG + "The URL = " + url);
	boolean statusFlag = false;
	HttpClient httpclient = new DefaultHttpClient();
    // Prepare a request object
    HttpGet httpget = new HttpGet(url); 
    // Execute the request
    HttpResponse response;
        try {
			response = httpclient.execute(httpget);
		 int statusCode = response.getStatusLine().getStatusCode();
		 if (statusCode == HttpURLConnection.HTTP_OK) {
				statusFlag = true;
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return statusFlag;
	}

	public static boolean checkNetworkConnectivity(final Activity activity) {
		ConnectivityManager cm = (ConnectivityManager) activity
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo netInfo = cm.getActiveNetworkInfo();
		if (netInfo != null && netInfo.isConnectedOrConnecting()) {
			return true;
		} else if (netInfo != null
				&& (netInfo.getState() == NetworkInfo.State.DISCONNECTED
						|| netInfo.getState() == NetworkInfo.State.DISCONNECTING
						|| netInfo.getState() == NetworkInfo.State.SUSPENDED || netInfo
						.getState() == NetworkInfo.State.UNKNOWN)) {
			return false;
		} else {
			return false;
		}
	}

	public static void showNetworkConectivityAlert(final MainActivity activity) {
		activity.showErrorDialog(activity.getString(R.string.network_error));
	}

	public static void showServiceAlert(final MainActivity activity) {
		activity.showErrorDialog(activity.getString(R.string.service_error));
	}


}
