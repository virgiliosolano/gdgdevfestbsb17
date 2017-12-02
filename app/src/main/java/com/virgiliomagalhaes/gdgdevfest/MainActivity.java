package com.virgiliomagalhaes.gdgdevfest;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

  private ExampleViewModel exampleViewModel;

  @BindView(R.id.textViewPresentation) TextView userLabelPresentation;
  @BindView(R.id.editTextPresentation) EditText userTextPresentation;

  @Override protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    exampleViewModel = ViewModelProviders.of(this).get(ExampleViewModel.class);
    this.getLifecycle().addObserver(new ExampleListener());

    userTextPresentation.addTextChangedListener(new TextWatcher() {

      @Override public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

      @Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        exampleViewModel.getLabelPresentation().setValue(charSequence.toString());
      }

      @Override public void afterTextChanged(Editable editable) {}
    });

    final Observer<String> textPresentation = new Observer<String>() {
      @Override public void onChanged(@Nullable final String text) {
        userLabelPresentation.setText(text);
      }
    };

    exampleViewModel.getLabelPresentation().observe(this, textPresentation);
  }
}
