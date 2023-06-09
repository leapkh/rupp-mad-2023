package kh.edu.rupp.fe.visitme.ui.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import kh.edu.rupp.fe.visitme.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {

    private ActivityProfileBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imgBack.setOnClickListener(view -> finish());



    }
}
