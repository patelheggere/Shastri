package patelheggere.com.myapplication;

import android.app.Application;

/**
 * Created by Patel Heggere on 3/30/2018.
 */

public class BaseApp extends Application {

    private static BaseApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

    }

    public static synchronized BaseApp getInstance() {
        return mInstance;
    }

}
