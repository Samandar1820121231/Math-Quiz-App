package uz.gita.lesson7_olimjonov_samandar18.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import uz.gita.lesson7_olimjonov_samandar18.R;

public class SubjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        AppCompatButton math = findViewById(R.id.button_math);
        AppCompatButton english = findViewById(R.id.button_english);

        AppCompatButton back = findViewById(R.id.button_back);
        back.setOnClickListener(v -> finish());


        math.setOnClickListener(button -> {
            Intent intent0 = new Intent(this,MainActivity.class);
            intent0.putExtra("TYPE",0);
            startActivity(intent0);
        });
        english.setOnClickListener(button -> {
            Intent intent0 = new Intent(this,MainActivity.class);
            intent0.putExtra("TYPE",1);
            startActivity(intent0);
        });
    }
}