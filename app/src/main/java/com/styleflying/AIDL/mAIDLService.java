package com.styleflying.AIDL;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class mAIDLService extends Service {
    private static final String TAG = "AIDLService";

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    private final mInterface.Stub mBinder = new mInterface.Stub() {
        @Override
        public void invokTest() throws RemoteException {
            System.out.println(TAG + " invokTest " + System.currentTimeMillis());
        }
    };
}
