package com.google.developer.flashcards.reminders;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Intent;

public class NotificationService extends IntentService {
    public static final int NOTIFICATION_ID = 8;
    private static final String TAG = NotificationService.class.getSimpleName();
    private NotificationManager mNotificationManager;

    public NotificationService() {
        super(TAG);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
    }
}
