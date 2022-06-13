package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edt=findViewById(R.id.edt);

                String amount=edt.getText().toString();
                int valueInDollar=Integer.parseInt(amount);
                int valueInRupee=valueInDollar*70;
                String answer=String.valueOf(valueInRupee);

                Toast.makeText(MainActivity.this, answer,
                        Toast.LENGTH_SHORT).show();
            }
        });
}
}





