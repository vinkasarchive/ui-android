package com.vinkas.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.vinkas.ui.viewpager.R;

/**
 * Created by Vinoth on 27-5-16.
 */
public class ViewPager extends android.support.v4.view.ViewPager {

    private boolean swipeable;

    public boolean isSwipeable() {
        return swipeable;
    }

    public void setSwipeable(boolean swipeable) {
        this.swipeable = swipeable;
    }

    public ViewPager(Context context) {
        super(context);
        setSwipeable(true);
    }

    public ViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ViewPager);
        try {
            setSwipeable(a.getBoolean(R.styleable.ViewPager_swipeable, true));
        } finally {
            a.recycle();
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (isSwipeable())
            return super.onInterceptTouchEvent(event);
        else
            return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (isSwipeable())
            return super.onTouchEvent(event);
        else
            return false;
    }
}