package com.dalong.androidrulerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.dalong.rulerview.RulerView;

public class MainActivity extends AppCompatActivity {

    private RulerView ruler,ruler2,ruler3;
    private TextView edit,edit2,edit3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ruler=(RulerView)findViewById(R.id.ruler);
        edit=(TextView)findViewById(R.id.edit);
        ruler2=(RulerView)findViewById(R.id.ruler2);
        edit2=(TextView)findViewById(R.id.edit2);
        edit2.setText(String.valueOf((float)ruler2.getCurrentValue()/10));
        ruler3=(RulerView)findViewById(R.id.ruler3);
        edit3=(TextView)findViewById(R.id.edit3);
        ruler.setVisibility(View.GONE);
        ruler3.setVisibility(View.GONE);
        edit.setVisibility(View.GONE);
        edit3.setVisibility(View.GONE);
        ruler.setScrollingListener(new RulerView.OnRulerViewScrollListener<String>() {
            @Override
            public void onChanged(RulerView rulerView, String oldValue, String newValue) {
                edit.setText(String.valueOf(newValue));
            }

            @Override
            public void onScrollingStarted(RulerView rulerView) {

            }

            @Override
            public void onScrollingFinished(RulerView rulerView) {

            }
        });
        ruler2.setScrollingListener(new RulerView.OnRulerViewScrollListener<String>() {
            @Override
            public void onChanged(RulerView rulerView, String oldValue, String newValue) {
//                edit2.setText(String.valueOf(newValue));
                edit2.setText(String.valueOf((float)Integer.parseInt(newValue)/10));
            }

            @Override
            public void onScrollingStarted(RulerView rulerView) {

            }

            @Override
            public void onScrollingFinished(RulerView rulerView) {

            }
        });
        ruler3.setScrollingListener(new RulerView.OnRulerViewScrollListener<String>() {
            @Override
            public void onChanged(RulerView rulerView, String oldValue, String newValue) {
                edit3.setText(String.valueOf(newValue));
            }

            @Override
            public void onScrollingStarted(RulerView rulerView) {

            }

            @Override
            public void onScrollingFinished(RulerView rulerView) {

            }
        });
    }
}
