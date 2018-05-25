package com.example.ivs.baitai_mobile_ivs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btLogin;
    EditText txtuser;
    EditText txtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogin = findViewById(R.id.bt_dangnhap);
        txtuser = findViewById(R.id.id_email);
        txtpass = findViewById(R.id.id_pass);

        btLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String user = txtuser.getText().toString().trim();
                String pass = txtpass.getText().toString().trim();
                if (user.equals("admin") && pass.equals("123")) {
                    Intent i = new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(i);
                }
                //MainActivity: Là khung đang đứng
                //DangNhap: Khung chuyển
            }
        });

    }
}
