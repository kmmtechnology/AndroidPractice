package com.demo.androidpractice;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import java.util.List;

public class Main2Activity extends AppCompatActivity implements PointCollectorListener {


    private PointCollector pointCollector = new PointCollector();
    private Database database=new Database(this);

    @Override
    public void pointsCollected(List<Point> points) {
        Log.i("Infor ", "Poinmts collected");
        Log.i("Size ", new Integer(points.size()).toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageListener();
        showPrompt();
    }


    private void showPrompt() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.setTitle("Password secet message");
        builder.setMessage("Please click anyehere within the screen");

        AlertDialog dialog = builder.create();
        dialog.show();
        pointCollector.setPointCollectorListener(this);
    }


    private void ImageListener() {
        ImageView imageView = (ImageView) findViewById(R.id.Image1);

        imageView.setOnTouchListener(pointCollector);

    }
}
