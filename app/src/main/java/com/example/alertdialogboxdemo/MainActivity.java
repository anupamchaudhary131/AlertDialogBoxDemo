package com.example.alertdialogboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDialog = (Button)findViewById(R.id.btnDialog);

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnIntent = new Intent(MainActivity.this, CustomDialogLayout.class);
                startActivity(btnIntent);
            }
        });

        // Single Button dialog Box

        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();

        alertDialog.setTitle("Terms and Conditions");
        alertDialog.setIcon(R.drawable.ic_baseline_info_24);
        alertDialog.setMessage("Have You Read all the Terms and Conditions");

        alertDialog.setButton("Yes, I have Read", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Yes, You Can Proceed Now.....", Toast.LENGTH_LONG).show();
            }
        });

        alertDialog.show();

    }













    /*        // Two Button dialog box

        AlertDialog.Builder delDialog = new AlertDialog.Builder(MainActivity.this);

        delDialog.setTitle("Delete");
        delDialog.setIcon(R.drawable.ic_baseline_delete_24);
        delDialog.setMessage("Are You Sure You Want To Delete ?");

        delDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Item Successfully Deleted", Toast.LENGTH_LONG).show();
            }
        });

        delDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Item Not Deleted", Toast.LENGTH_LONG).show();
            }
        });

        delDialog.show();

    }

    //Three Button Dialog box


    @Override
    public void onBackPressed() {
        AlertDialog.Builder extDialog = new AlertDialog.Builder(MainActivity.this);

        extDialog.setTitle("Exit");
        extDialog.setIcon(R.drawable.ic_baseline_exit_to_app_24);
        extDialog.setMessage("Are You Sure You Want To Exit ?");

        extDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.super.onBackPressed();
            }
        });

        extDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Welcome Back !", Toast.LENGTH_SHORT).show();
            }
        });

        extDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Successfully Cancel !", Toast.LENGTH_SHORT).show();
            }
        });

        extDialog.show();
    } */
}