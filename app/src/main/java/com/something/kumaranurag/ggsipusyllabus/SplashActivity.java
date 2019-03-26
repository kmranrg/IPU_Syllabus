package com.something.kumaranurag.ggsipusyllabus;

/**
 * Created by Kumar Anurag on 7/14/2017.
 */


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread timer = new Thread(){

            public void run(){
                try{
                    sleep(2000);
                }
                catch(Exception e)
                {
                    e.printStackTrace();

                }
                finally{
                    Intent kj = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(kj);
                }

            }
        };timer.start();



    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        SplashActivity.this.finish();
    }


}
