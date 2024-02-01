package com.example.ticketsnap.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.ticketsnap.R;
import com.example.ticketsnap.databinding.ActivityAccountBinding;
import com.example.ticketsnap.fragments.ChangePassFragment;
import com.example.ticketsnap.fragments.PersonalData;

public class AccountActivity extends AppCompatActivity {

    ActivityAccountBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAccountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btmReplaceFragment.setOnClickListener(view -> {
            int clickedItemId = view.getId();

            switch (clickedItemId){
                case R.id.personalData:
                    replaceFragment(new PersonalData());
                    break;

                case R.id.changePass:
                    replaceFragment(new ChangePassFragment());
                    break;
            }

            //return true;

        });

    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.Fragments, fragment);
        fragmentTransaction.commit();
    }
}