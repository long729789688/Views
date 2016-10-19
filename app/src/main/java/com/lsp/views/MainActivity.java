package com.lsp.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);

        tv.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        tv.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);

        tv.setText("草泥马");
        tv.setGravity(Gravity.RIGHT);

        setContentView(tv);


    }

}