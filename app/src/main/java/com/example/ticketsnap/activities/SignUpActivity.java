package com.example.ticketsnap.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ticketsnap.R;
import com.example.ticketsnap.data.DatabaseHandler;
import com.example.ticketsnap.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    ActivitySignUpBinding binding;
    DatabaseHandler databaseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHandler = new DatabaseHandler(this);

        binding.signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = binding.inputEmail.getText().toString();
                String name = binding.inputName.getText().toString();
                String surname = binding.inputSurname.getText().toString();
                String password = binding.inputPass.getText().toString();
                String confirmPassword = binding.inputConfirmPass.getText().toString();

                if(email.equals("") || name.equals("") || surname.equals("") || password.equals("") || confirmPassword.equals(""))
                    Toast.makeText(SignUpActivity.this, "", Toast.LENGTH_SHORT).show();
                else {
                    if(password.equals(confirmPassword)){

                    }
                }
            }
        });
    }
}