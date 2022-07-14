package com.example.alertdialogboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CustomDialogLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog_layout);

        Dialog dialog = new Dialog(CustomDialogLayout.this);
        dialog.setContentView(R.layout.activity_custom_dialog_layout);
        dialog.setCancelable(false);

        Button btnOkay = dialog.findViewById(R.id.btnOkay);

        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CustomDialogLayout.this, "Closed", Toast.LENGTH_LONG).show();
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}