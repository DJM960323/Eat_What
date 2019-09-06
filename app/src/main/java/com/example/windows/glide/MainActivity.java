package com.example.windows.glide;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView courseText;
    private Button selectBtn;


    public boolean isStart = false;

    int[] courseArray = new int[]{
            R.string.course_1,R.string.course_2,R.string.course_3,R.string.course_4,R.string.course_5,
            R.string.course_6,R.string.course_7,R.string.course_8,R.string.course_9,R.string.course_10,
            R.string.course_11,R.string.course_12,R.string.course_13,R.string.course_14,R.string.course_15,
            R.string.course_16,R.string.course_17,R.string.course_18,R.string.course_19,R.string.course_20,
            R.string.course_21,R.string.course_22,R.string.course_23,R.string.course_24,R.string.course_25
    };

    public Handler handler = new Handler(){

        @RequiresApi(api = Build.VERSION_CODES.M)
        @Override
        public void handleMessage(Message msg) {
            //设置case用于处理Message消息
            switch (msg.arg1){
                case 0:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;

                case 1:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;
                case 2:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;
                case 3:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;
                case 4:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;
                case 5:
                    courseText.setTextColor(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;
                case 6:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;
                case 7:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;

                case 8:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;
                case 9:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;
                case 10:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;
                case 11:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;
                case 12:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;
                case 13:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;
                case 14:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;
                case 15:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;

                case 16:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;

                case 17:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;

                case 18:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;

                case 19:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;

                case 20:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;

                case 21:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;

                case 22:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;

                case 23:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;
                case 24:
                    courseText.setText(courseArray[msg.arg1]);
                    courseText.setTextColor(getResources().getColor(R.color.textColor));
                    selectCourse(isStart);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courseText = (TextView)findViewById(R.id.course_text);
        selectBtn = (Button)findViewById(R.id.select_button);
        selectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isStart){
                    isStart = true;
                    selectCourse(isStart);
                    selectBtn.setText("结   束");
                }else{
                    isStart = false;
                    selectCourse(isStart);
                    selectBtn.setText("开   始");
                }
            }
        });







    }

    private void selectCourse(boolean isStart){


        if (isStart){
            Message message = new Message();
            int index = (int)(Math.random() * courseArray.length);
            message.arg1 = index;
            Log.e("TAG",getResources().getString(courseArray[index]) + "-" + index);
            handler.sendMessageDelayed(message,20);
        }

    }



}




