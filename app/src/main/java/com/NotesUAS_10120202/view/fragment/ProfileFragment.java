package com.NotesUAS_10120202.view.fragment;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.NotesUAS_10120202.databinding.FragmentProfileBinding;
import com.NotesUAS_10120202.view.activity.LoginActivity;
import com.NotesUAS_10120202.view.activity.MainActivity;
import com.NotesUAS_10120202.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class ProfileFragment extends Fragment {

    private MainActivity mainActivity;

    private FragmentProfileBinding binding;
    private FirebaseAuth auth;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mainActivity = (MainActivity) getActivity();
        mainActivity.getSupportActionBar().hide();

        binding.btnSignOut.setOnClickListener(v -> {
            new AlertDialog.Builder(requireContext())
                    .setTitle("Sign Out")
                    .setMessage("Anda Yakin Ingin Keluar")
                    .setPositiveButton("Ya", (dialog, which) -> signOut())
                    .setNegativeButton("Tidak", (dialog, which) -> dialog.dismiss())
                    .create()
                    .show();
        });

        setupUser();
    }

    private void setupUser() {
        auth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = auth.getCurrentUser();

        if (currentUser != null) {
            // Perform the necessary setup for the authenticated user here
            // For example, setting profile picture and display name
        } else {
            startActivity(new Intent(requireContext(), LoginActivity.class));
            requireActivity().finish();
        }
    }

    private void signOut() {
        auth.signOut();
        Intent intent = new Intent(requireContext(), LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        requireActivity().finish();
    }
}
//10120202 - Rian Fahrizal - IF5
