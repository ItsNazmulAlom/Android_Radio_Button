package com.nazmul.radiobutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioButton rbMale,rbFemale,rbOther;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rbMale = findViewById(R.id.rb_male);
        rbFemale = findViewById(R.id.rb_female);
        rbOther  = findViewById(R.id.rb_other);
        btnSubmit = findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String gender = "";

                if (rbMale.isChecked()){
                    gender = "Male";
                }
                else if (rbFemale.isChecked()){
                    gender = "Female";
                }
                else if (rbOther.isChecked()){
                    gender = "Other";
                }

                Toast.makeText(MainActivity.this,"Gender selected="+gender,Toast.LENGTH_SHORT).show();


            }
        });
    }
}
