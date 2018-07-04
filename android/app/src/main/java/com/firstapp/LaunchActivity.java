package com.firstapp;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.io.File;

public class LaunchActivity extends AppCompatActivity {
    private static LaunchActivity instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        setContentView(R.layout.launch_screen);
        try {
             ImageView bg=(ImageView)findViewById(R.id.bg);

             File file = new File(getFilesDir()+"/launch.jpg");
             if(file.exists()){
                 bg.setImageURI(Uri.fromFile(file));
             }else{
                 bg.setImageResource(R.drawable.launch_screen);
             }

        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        
    }


    public static void close(int time) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                /**
                 * 延时执行的代码
                 */
                if(instance!=null) {
                    instance.finish();
                    instance.overridePendingTransition(0,R.anim.catalyst_fade_out);
                }

            }
        },time);
        
    }
}
