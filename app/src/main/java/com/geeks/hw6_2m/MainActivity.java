package com.geeks.hw6_2m;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView Entrance;
    private TextView Registration;
    private TextView Registration2;
    private TextView YourPassword;
    private TextView ClickPassword;
    private EditText Email;
    private EditText password;
    private Button Come;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Entrance = findViewById(R.id.Entrance);
        Registration = findViewById(R.id.registration);
        Registration2 = findViewById(R.id.registration2);
        YourPassword = findViewById(R.id.yourPassword);
        ClickPassword = findViewById(R.id.clickPassworld);
        Email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        Come = findViewById(R.id.come);
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (Email.getText().toString().isEmpty()) {
                    Come.setBackgroundColor(Color.GRAY);
                } else {
                    Come.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }


            }
        });
        Come.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Email.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")) {
                    Entrance.setVisibility(View.GONE);
                    Registration.setVisibility(View.GONE);
                    Registration2.setVisibility(View.GONE);
                    YourPassword.setVisibility(View.GONE);
                    ClickPassword.setVisibility(View.GONE);
                    Email.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    Come.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this,
                            "Вы успешно зарегистрировались",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "Не правильный логин или пароль",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}