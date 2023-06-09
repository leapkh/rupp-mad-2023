package kh.edu.rupp.fe.visitme.ui.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import kh.edu.rupp.fe.visitme.R;
import kh.edu.rupp.fe.visitme.databinding.ActivityMainBinding;
import kh.edu.rupp.fe.visitme.ui.fragment.HomeFragment;
import kh.edu.rupp.fe.visitme.ui.fragment.MoreFragment;
import kh.edu.rupp.fe.visitme.ui.fragment.ProfileFragment;
import kh.edu.rupp.fe.visitme.ui.fragment.ProvincesFragment;
import kh.edu.rupp.fe.visitme.ui.fragment.SearchFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Show HomeFragment
        showFragment(new HomeFragment());

        // Setup Listeners
        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            if (item.getItemId() == R.id.mnuHome) {
                showFragment(new HomeFragment());
            } else if(item.getItemId() == R.id.mnuProvinces) {
                showFragment(new ProvincesFragment());
            } else if(item.getItemId() == R.id.mnuSearch) {
                showFragment(new SearchFragment());
            } else if(item.getItemId() == R.id.mnuProfile) {
                showFragment(new ProfileFragment());
            } else {
                showFragment(new MoreFragment());
            }

            return true;
        });
    }

    private void showFragment(Fragment fragment){
        // FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // FragmentTransaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Replace fragment in lytFragment
        fragmentTransaction.replace(R.id.lytFragment, fragment);

        // Commit transaction
        fragmentTransaction.commit();
    }

}