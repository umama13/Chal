package com.example.chal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        View nav_home = findViewById(R.id.nav_home);
        nav_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhome();
            }

            private void openhome() {
                Intent intent=new Intent(Home.this,Home.class);
                startActivity(intent);
            }
        });

    }
}

