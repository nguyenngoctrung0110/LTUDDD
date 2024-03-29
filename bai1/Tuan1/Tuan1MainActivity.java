package com.example.bai1.Tuan1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.bai1.R;

public class Tuan1MainActivity extends AppCompatActivity {
    //khai bao cac control
    EditText txt1, txt2;
    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tuan1_main);
        // anh xa cac control
        txt1= findViewById(R.id.demo11txt1);
        txt2= findViewById(R.id.demo11txt2);
        btn1= findViewById(R.id.demo11btn1);
        tv1= findViewById(R.id.demo11tv1);

        // xu li su kien
        btn1.setOnClickListener(v->{
            //goi ham tinh tong
            tinhtong();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //dinh nghia ham tinh tong
    private void tinhtong() {
        //lay du lieu nhap vao tu edittext1
        String str1=txt1.getText().toString();
        float so1=Float.parseFloat(str1); //chuyen du lieu sang so
        //lay du lieu nhap vao tu edittext1
        String str2=txt2.getText().toString();
        float so2=Float.parseFloat(str2);
        //tinh tong
        float tong= so1 + so2;
        tv1.setText(String.valueOf(tong));
    }
}