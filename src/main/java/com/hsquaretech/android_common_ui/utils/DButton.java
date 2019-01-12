package com.hsquaretech.android_common_ui.utils;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;


/**
 * Created by root on 19/6/17.
 */

public class DButton extends AppCompatButton {

    public DButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TextViewHelper.setTypeface(context, this, attrs);
    }

}
