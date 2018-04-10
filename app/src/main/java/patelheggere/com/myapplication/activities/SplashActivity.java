package patelheggere.com.myapplication.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import patelheggere.com.myapplication.R;
import patelheggere.com.myapplication.helper.SharedPreferenceHelper;

import static patelheggere.com.myapplication.helper.AppConstants.SPLASH_TIME_OUT;
import static patelheggere.com.myapplication.helper.AppConstants.isFirstTime;

public class SplashActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);

            new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

                @Override
                public void run() {
                    // This method will be executed once the timer is over
                    // Start your app main activity
                    if(SharedPreferenceHelper.getInstance().get(isFirstTime, true)) {
                        Intent i = new Intent(SplashActivity.this, WelcomeActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        Intent i = new Intent(SplashActivity.this, MainActivity.class);
                        startActivity(i);
                    }

                    // close this activity
                    finish();
                }
            }, SPLASH_TIME_OUT);
        }

    }
