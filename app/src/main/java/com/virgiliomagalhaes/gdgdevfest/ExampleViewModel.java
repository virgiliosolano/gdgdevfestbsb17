package com.virgiliomagalhaes.gdgdevfest;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * Created by virgiliomagalhaes on 12/2/2017.
 */

public class ExampleViewModel extends ViewModel {

  private MutableLiveData<String> labelPresentation;
  private MutableLiveData<String> textPresentation;

  public MutableLiveData<String> getLabelPresentation() {

    if (labelPresentation == null) {
      labelPresentation = new MutableLiveData<String>();
    }

    return labelPresentation;
  }

}
