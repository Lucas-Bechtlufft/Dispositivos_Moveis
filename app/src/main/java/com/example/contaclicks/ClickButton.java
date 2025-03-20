package com.example.contaclicks;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ClickButton extends AppCompatActivity {

    private Button btnClick;

    private TextView ResultadoClick;
    int numStr;
    @Override

    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_button);

        btnClick = findViewById(R.id.btnClick);
        ResultadoClick = findViewById(R.id.ResultadoClick);


        btnClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                contadorClicks();
            }
        });
    }
    private void contadorClicks() {
        numStr++;
        ResultadoClick.setText("" + numStr);

    }

}