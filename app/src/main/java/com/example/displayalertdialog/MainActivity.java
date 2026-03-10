package com.example.displayalertdialog;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Exit Application");
                builder.setMessage("Do you want to exit?");

                builder.setPositiveButton("YES", (dialog, which) -> {
                    finish();
                });

                builder.setNegativeButton("NO", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        });
    }
}