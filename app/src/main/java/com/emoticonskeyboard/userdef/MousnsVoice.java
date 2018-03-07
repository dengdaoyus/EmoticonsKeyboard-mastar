package com.emoticonskeyboard.userdef;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.emoticonskeyboard.R;

public class MousnsVoice extends RelativeLayout {
    private View view;
    public MousnsVoice(Context context) {
        this(context, null);
    }

    public MousnsVoice(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.layout_voice, this);
    }
}
