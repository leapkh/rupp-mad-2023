package kh.edu.rupp.fe.visitme.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import kh.edu.rupp.fe.visitme.databinding.FragmentMoreBinding;
import kh.edu.rupp.fe.visitme.databinding.FragmentProfileBinding;

public class MoreFragment extends Fragment {

    private FragmentMoreBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = FragmentMoreBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
}
