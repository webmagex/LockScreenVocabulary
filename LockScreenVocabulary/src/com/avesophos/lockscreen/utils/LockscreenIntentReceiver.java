package com.avesophos.lockscreen.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.avesophos.lockscreen.LockScreenActivity;

public class LockscreenIntentReceiver extends BroadcastReceiver {

	// Handle actions and display Lockscreen
	@Override
	public void onReceive(Context context, Intent intent) {

		if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)
				|| intent.getAction().equals(Intent.ACTION_SCREEN_ON)
				|| intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {

			// Display lock screen
			Intent mIntent = new Intent(context, LockScreenActivity.class);
			if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)
				|| intent.getAction().equals(Intent.ACTION_SCREEN_ON))
			mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(mIntent);
			
		}

	}

}
