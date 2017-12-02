package com.virgiliomagalhaes.gdgdevfest;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

/**
 * Created by virgiliomagalhaes on 12/2/2017.
 */

public class ExampleListener implements LifecycleObserver {


  @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
  public void createResource() {
    Log.d("LIFECYCLE", "Lifecycle.Event.ON_CREATE Dispatch");
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_START)
  public void startResource() {
    Log.d("LIFECYCLE", "Lifecycle.Event.ON_START Dispatch");
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
  public void pauseResource() {
    Log.d("LIFECYCLE", "Lifecycle.Event.ON_PAUSE Dispatch");
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
  public void destroyResource() {
    Log.d("LIFECYCLE", "Lifecycle.Event.ON_DESTROY Dispatch");
  }
}
