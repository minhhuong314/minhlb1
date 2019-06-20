package com.example.awesomelib;

import android.text.Editable;
import android.text.TextWatcher;

/**
 * Created by buidanhnam on 6/18/2018.
 */

public abstract class ListenerOnTextChange implements TextWatcher {

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        getTextCount(charSequence.length());
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }

    abstract void getTextCount(int textCount);
}

