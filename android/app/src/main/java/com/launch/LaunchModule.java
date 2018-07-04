package com.launch;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.firstapp.LaunchActivity;

public class LaunchModule extends ReactContextBaseJavaModule {


  public LaunchModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "LaunchActivity";
  }

  @ReactMethod
  public void close(int time) {
    LaunchActivity.close(time);
  }

}