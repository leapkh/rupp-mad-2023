package kh.edu.rupp.fe.visitme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import kh.edu.rupp.fe.visitme.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imgProfile.setOnClickListener(view -> startProfileActivity());
    }

    private void startProfileActivity() {
        //Intent intent = new Intent(this, ProfileActivity.class);
        //startActivity(intent);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }, 1000);
    }

}
