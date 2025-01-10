package com.example.hms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddPatient extends AppCompatActivity {
    Button button8;
    Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_patient);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assign_doctor();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assign_room();
            }
        });
    }
    public void assign_doctor(){
        Intent intent=new Intent(this, AssignDoctor.class);
        startActivity(intent);
    }
    public void assign_room(){
        Intent intent=new Intent(this, AssignRoom.class);
        startActivity(intent);
    }
}