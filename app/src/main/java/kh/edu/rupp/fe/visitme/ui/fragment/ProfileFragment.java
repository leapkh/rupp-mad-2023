package kh.edu.rupp.fe.visitme.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import kh.edu.rupp.fe.visitme.databinding.FragmentProfileBinding;
import kh.edu.rupp.fe.visitme.databinding.FragmentSearchBinding;

public class ProfileFragment extends Fragment {

    private FragmentProfileBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = FragmentProfileBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Setup Listener
        binding.imgBtnEdit.setOnClickListener( v -> {
            Toast.makeText(getContext(), "You click edit.", Toast.LENGTH_LONG).show();
        });
    }
}
