/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.crossbits.androidutils;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;




@Kroll.module(name="Androidutils", id="com.crossbits.androidutils")
public class AndroidutilsModule extends KrollModule
{

	// Standard Debugging variables
	private static final String TAG = "AndroidutilsModule";

	@Kroll.constant
	public static final int RINGER_MODE_SILENT = AudioManager.RINGER_MODE_SILENT;

	@Kroll.constant
	public static final int RINGER_MODE_VIBRATE = AudioManager.RINGER_MODE_VIBRATE;

	@Kroll.constant
	public static final int RINGER_MODE_NORMAL = AudioManager.RINGER_MODE_NORMAL;

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;

	public AndroidutilsModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		Log.d(TAG, "inside onAppCreate");
		// put module init code that needs to run when the application is created
	}

	// Methods
	@Kroll.method
	public boolean isRingerModeSilent()
	{
		Activity activity = TiApplication.getAppRootOrCurrentActivity();
		AudioManager am = (AudioManager)activity.getSystemService(Context.AUDIO_SERVICE);

		if(am.getRingerMode() == AudioManager.RINGER_MODE_SILENT) {
			return true;
		}
		else {
			return false;
		}
	}

	@Kroll.method
	public boolean isRingerModeVibrate()
	{
		Activity activity = TiApplication.getAppRootOrCurrentActivity();
		AudioManager am = (AudioManager)activity.getSystemService(Context.AUDIO_SERVICE);

		if(am.getRingerMode() == AudioManager.RINGER_MODE_VIBRATE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Kroll.method
	public boolean isRingerModeNormal()
	{
		Activity activity = TiApplication.getAppRootOrCurrentActivity();
		AudioManager am = (AudioManager)activity.getSystemService(Context.AUDIO_SERVICE);

		if(am.getRingerMode() == AudioManager.RINGER_MODE_NORMAL) {
			return true;
		}
		else {
			return false;
		}
	}

	@Kroll.method
	public int getRingerMode()
	{
		Activity activity = TiApplication.getAppRootOrCurrentActivity();
		AudioManager am = (AudioManager)activity.getSystemService(Context.AUDIO_SERVICE);

		int ringerMode = -1;

		switch (am.getRingerMode()) {
			case AudioManager.RINGER_MODE_SILENT:
				ringerMode = RINGER_MODE_SILENT;
				break;

			case AudioManager.RINGER_MODE_VIBRATE:
				ringerMode = RINGER_MODE_VIBRATE;
				break;

			case AudioManager.RINGER_MODE_NORMAL:
				ringerMode = RINGER_MODE_NORMAL;
				break;
		}

		return ringerMode;
	}

	@Kroll.method
	public String getSimCountryIso()
	{
		Activity activity = TiApplication.getAppRootOrCurrentActivity();
		TelephonyManager tm = (TelephonyManager) activity.getSystemService(Context.TELEPHONY_SERVICE);
		String simCountryIso = tm.getSimCountryIso().toUpperCase();
		Log.d(TAG, "simCountryIso: " + simCountryIso);
		return simCountryIso;
	}

	@Kroll.method
	public boolean isWiredHeadsetOn()
	{
		Activity activity = TiApplication.getAppRootOrCurrentActivity();
		AudioManager am = (AudioManager)activity.getSystemService(Context.AUDIO_SERVICE);

		if(am.isWiredHeadsetOn()) {
			return true;
		}
		else {
			return false;
		}
	}

	@Kroll.method
	public boolean isBluetoothA2dpOn()
	{
		Activity activity = TiApplication.getAppRootOrCurrentActivity();
		AudioManager am = (AudioManager)activity.getSystemService(Context.AUDIO_SERVICE);

		if(am.isBluetoothA2dpOn()) {
			return true;
		}
		else {
			return false;
		}
	}

}
