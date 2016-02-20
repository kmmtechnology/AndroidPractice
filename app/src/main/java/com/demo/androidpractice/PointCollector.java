package com.demo.androidpractice;

import android.graphics.Point;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 19-Feb-16.
 */
public class PointCollector implements View.OnTouchListener {

    private List<Point> points = new ArrayList<Point>();
    private PointCollectorListener pointCollectorListener;

    public void setPointCollectorListener(PointCollectorListener pointCollectorListener) {
        this.pointCollectorListener = pointCollectorListener;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        float X = event.getX();
        float Y = event.getY();
        Log.i("cord: ", X + "," + Y);
        if (points.size() == 4) {

            Log.i("4 size : ",new Integer(points.size()).toString());
            if (pointCollectorListener != null) {

                pointCollectorListener.pointsCollected(points);
                points.clear();

            }

        }

        points.add(new Point(Math.round(X), Math.round(Y)));
        Log.i("Current pointarraysize:", new Integer(points.size()).toString());
        return false;
    }
}
