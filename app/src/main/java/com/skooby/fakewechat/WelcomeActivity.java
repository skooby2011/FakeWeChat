package com.skooby.fakewechat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/**
 * Created by skooby on 16/7/1.
 */
public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo_layout);

        handler.sendEmptyMessageDelayed(99,3000);
    }

    private Handler handler = new Handler(){

        @Override
        public void handleMessage(Message msg){

            if(msg.what == 99){
                Intent it = new Intent(WelcomeActivity.this,MainActivity.class);
                startActivity(it);
                finish();
            }
        }
    };
}
