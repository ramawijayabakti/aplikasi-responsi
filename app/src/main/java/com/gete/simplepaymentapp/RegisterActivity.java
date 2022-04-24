package com.gete.simplepaymentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText et_email, et_password, et_konfirmasi_password;
    Button btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        et_konfirmasi_password = findViewById(R.id.et_konfirmasi_password);
        btn_register = findViewById(R.id.btn_register);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = et_email.getText().toString();
                String password = et_password.getText().toString();
                String password_konfirmasi = et_konfirmasi_password.getText().toString();

                if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password) ){
                    Toast.makeText(getApplicationContext(), "Email atau Password tidak boleh kosong!", Toast.LENGTH_LONG).show();
                }else if(!password.equals(password_konfirmasi)) {
                    Toast.makeText(getApplicationContext(), "Password Konfirmasi tidak sama!", Toast.LENGTH_LONG).show();
                }else{
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}