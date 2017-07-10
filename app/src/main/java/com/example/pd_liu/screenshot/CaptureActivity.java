package com.example.pd_liu.screenshot;

import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.pd_liu.screenshot.util.ScreenManagerUtil;

public class CaptureActivity extends AppCompatActivity {

    private MediaProjectionManager mMediaProjectionManager;

    private static int sRequestCodeCapture = 111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture);

        mMediaProjectionManager = ScreenManagerUtil.getMediaProjectionManager(this);

        startActivityForResult(mMediaProjectionManager.createScreenCaptureIntent(), sRequestCodeCapture);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == sRequestCodeCapture){
            if(resultCode == RESULT_OK){
                //http://www.jianshu.com/p/d7eb518195fd
                mMediaProjectionManager.getMediaProjection(requestCode, data);
            }
        }
    }
}
