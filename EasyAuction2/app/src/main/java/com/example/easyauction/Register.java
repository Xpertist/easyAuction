package com.example.easyauction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText etID,etPass,etFname,etLname,etEmail,etTel;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etID = findViewById(R.id.etID);
        etPass = findViewById(R.id.etPass);
        etFname = findViewById(R.id.etFname);
        etLname = findViewById(R.id.etLname);
        etEmail = findViewById(R.id.etEmail);
        etTel = findViewById(R.id.etTel);

        btnLogin = findViewById(R.id.btnReg);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ID,Pass,Username,Password,Email,Tel;

                ID = etID.getText() .toString();
                Pass = etPass.getText() . toString();
                if (ID.equals(""));
                {
                    Toast.makeText(Register.this,"ID Required",Toast.LENGTH_SHORT).show();
                }
                if (Pass.equals("")){
                    Toast.makeText(Register.this,"Password Required",Toast.LENGTH_SHORT).show();
                }


                if (ID.equals(""));
                {
                    Toast.makeText(Register.this,"ID Required",Toast.LENGTH_SHORT).show();
                }
                if (Pass.equals("")){
                    Toast.makeText(Register.this,"Password Required",Toast.LENGTH_SHORT).show();
                }



            }
        });




    }
}
