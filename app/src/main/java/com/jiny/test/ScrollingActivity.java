package com.jiny.test;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ScrollingActivity extends AppCompatActivity {

    int heightKeyboard;
    EditText mEditText;
    EditText mEditText2;
    EditText mEditText3;
    EditText mEditText4;
    EditText mEditText5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mEditText = findViewById(R.id.edt1);
        mEditText2 = findViewById(R.id.edt2);
        mEditText3 = findViewById(R.id.edt3);
        mEditText4 = findViewById(R.id.edt4);
        mEditText5 = findViewById(R.id.edt5);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final View view = findViewById(R.id.nestedScrollView);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

            @Override
            public void onGlobalLayout() {

                int rootViewHeight = view.getRootView().getHeight();
                View tv = findViewById(R.id.tv2);
                int location[] = new int[2];
                tv.getLocationOnScreen(location);
                int height = (int) (location[1] + tv.getMeasuredHeight());

                heightKeyboard = rootViewHeight - height;

                Log.d("TAG", "onGlobalLayout: height ->"+heightKeyboard);

                // deff is the height of soft keyboard
            }
        });

        mEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float y1 = mEditText.getY();
                float y2 = mEditText2.getY();
                float y3 = mEditText3.getY();
                float y4 = mEditText4.getY();
                float y5 = mEditText5.getY();

                if(y1<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt1 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt1 is below",Toast.LENGTH_SHORT).show();
                }
                if(y2<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt2 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt2 is below",Toast.LENGTH_SHORT).show();
                }
                if(y3<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt3 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt3 is below",Toast.LENGTH_SHORT).show();
                }
                if(y4<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt4 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt4 is below",Toast.LENGTH_SHORT).show();
                }
                if(y5<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt5 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt5 is below",Toast.LENGTH_SHORT).show();
                }

            }
        });
        mEditText3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float y1 = mEditText.getY();
                float y2 = mEditText2.getY();
                float y3 = mEditText3.getY();
                float y4 = mEditText4.getY();
                float y5 = mEditText5.getY();

                if(y1<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt1 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt1 is below",Toast.LENGTH_SHORT).show();
                }
                if(y2<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt2 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt2 is below",Toast.LENGTH_SHORT).show();
                }
                if(y3<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt3 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt3 is below",Toast.LENGTH_SHORT).show();
                }
                if(y4<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt4 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt4 is below",Toast.LENGTH_SHORT).show();
                }
                if(y5<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt5 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt5 is below",Toast.LENGTH_SHORT).show();
                }

            }
        });
        mEditText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float y1 = mEditText.getY();
                float y2 = mEditText2.getY();
                float y3 = mEditText3.getY();
                float y4 = mEditText4.getY();
                float y5 = mEditText5.getY();

                if(y1<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt1 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt1 is below",Toast.LENGTH_SHORT).show();
                }
                if(y2<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt2 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt2 is below",Toast.LENGTH_SHORT).show();
                }
                if(y3<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt3 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt3 is below",Toast.LENGTH_SHORT).show();
                }
                if(y4<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt4 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt4 is below",Toast.LENGTH_SHORT).show();
                }
                if(y5<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt5 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt5 is below",Toast.LENGTH_SHORT).show();
                }

            }
        });
        mEditText4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float y1 = mEditText.getScrollY();
                float y2 = mEditText2.getScrollY();
                float y3 = mEditText3.getScrollY();
                float y4 = mEditText4.getScrollY();
                float y5 = mEditText5.getScrollY();

                if(y1<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt1 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt1 is below",Toast.LENGTH_SHORT).show();
                }
                if(y2<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt2 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt2 is below",Toast.LENGTH_SHORT).show();
                }
                if(y3<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt3 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt3 is below",Toast.LENGTH_SHORT).show();
                }
                if(y4<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt4 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt4 is below",Toast.LENGTH_SHORT).show();
                }
                if(y5<heightKeyboard){
                    Toast.makeText(view.getContext(),"Edt5 is above",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(),"Edt5 is below",Toast.LENGTH_SHORT).show();
                }

            }
        });

        //float y = mEditText.getY();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
