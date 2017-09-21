package lianxi.myapplication;

import android.app.Application;

/**
 * date 2017/9/19
 * author:张学雷(Administrator)
 * functinn:
 */

public class CrashApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}
