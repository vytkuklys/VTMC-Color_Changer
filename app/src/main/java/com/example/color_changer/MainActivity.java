package com.example.color_changer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView field1;
    private TextView field2;
    private TextView field3;
    private TextView field4;

//    private Button btnGreen;
//    private Button btnRed;
//    private Button btnBlue;
//    private Button btnYellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        field1 = findViewById(R.id.field1);
        field2 = findViewById(R.id.field2);
        field3 = findViewById(R.id.field3);
        field4 = findViewById(R.id.field4);

//        btnGreen = findViewById(R.id.btnGreen);
//        btnRed = findViewById(R.id.btnRed);
//        btnBlue = findViewById(R.id.btnBlue);
//        btnYellow = findViewById(R.id.btnYellow);

//        btnGreen.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                field2.setBackgroundColor(Color.TRANSPARENT);
//                field3.setBackgroundColor(Color.TRANSPARENT);
//                field4.setBackgroundColor(Color.TRANSPARENT);
//                field2.setText("");
//                field3.setText("");
//                field4.setText("");
//
//                field1.setBackgroundColor(Color.GREEN);
//                field1.setText("Color Green");
//            }
//        });
//        btnRed.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                field1.setBackgroundColor(Color.TRANSPARENT);
//                field3.setBackgroundColor(Color.TRANSPARENT);
//                field4.setBackgroundColor(Color.TRANSPARENT);
//                field1.setText("");
//                field3.setText("");
//                field4.setText("");
//
//                field2.setBackgroundColor(Color.RED);
//                field2.setText("Color Red");
//            }
//        });
//        btnBlue.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                field1.setBackgroundColor(Color.TRANSPARENT);
//                field2.setBackgroundColor(Color.TRANSPARENT);
//                field4.setBackgroundColor(Color.TRANSPARENT);
//                field1.setText("");
//                field2.setText("");
//                field4.setText("");
//
//                field3.setBackgroundColor(Color.BLUE);
//                field3.setText("Color Blue");
//            }
//        });
//        btnYellow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                field1.setBackgroundColor(Color.TRANSPARENT);
//                field2.setBackgroundColor(Color.TRANSPARENT);
//                field3.setBackgroundColor(Color.TRANSPARENT);
//                field1.setText("");
//                field2.setText("");
//                field3.setText("");
//
//                field4.setBackgroundColor(Color.YELLOW);
//                field4.setText("Color Yellow");
//            }
//        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnGreen:
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        field2.setBackgroundColor(Color.TRANSPARENT);
                        field3.setBackgroundColor(Color.TRANSPARENT);
                        field4.setBackgroundColor(Color.TRANSPARENT);
                        field2.setText("");
                        field3.setText("");
                        field4.setText("");

                        field1.setBackgroundColor(Color.GREEN);
                        field1.setText("Color Green");
                    }
                });
                break;
            case R.id.btnRed:
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        field1.setBackgroundColor(Color.TRANSPARENT);
                        field3.setBackgroundColor(Color.TRANSPARENT);
                        field4.setBackgroundColor(Color.TRANSPARENT);
                        field1.setText("");
                        field3.setText("");
                        field4.setText("");

                        field2.setBackgroundColor(Color.RED);
                        field2.setText("Color Red");
                    }
                });
                break;
            case R.id.btnBlue:

                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        field1.setBackgroundColor(Color.TRANSPARENT);
                        field2.setBackgroundColor(Color.TRANSPARENT);
                        field4.setBackgroundColor(Color.TRANSPARENT);
                        field1.setText("");
                        field2.setText("");
                        field4.setText("");

                        field3.setBackgroundColor(Color.BLUE);
                        field3.setText("Color Blue");
                    }
                });
                break;
            case R.id.btnYellow:
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        field1.setBackgroundColor(Color.TRANSPARENT);
                        field2.setBackgroundColor(Color.TRANSPARENT);
                        field3.setBackgroundColor(Color.TRANSPARENT);
                        field1.setText("");
                        field2.setText("");
                        field3.setText("");

                        field4.setBackgroundColor(Color.YELLOW);
                        field4.setText("Color Yellow");
                    }
                });
                break;
        }
    }
}