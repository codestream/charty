package com.charty.lib.model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by 1 on 02.04.14.
 */
public class Label {

    private Color mLabelColor;
    private Typeface mLabelTypeface;
    private Context mContext;

    public Label(Context context){
        this.mContext = context;
    }

    public void setLabelColor(TextView view, int resourceColor){
        view.setText(mContext.getResources().getColor(resourceColor));
    }

    public void setLabelTypeface(TextView view, String typefaceName){
        if(mLabelTypeface == null){
            mLabelTypeface = Typeface.createFromAsset(mContext.getAssets(), typefaceName);
            view.setTypeface(mLabelTypeface);
        }
    }
}
