package uz.gita.lesson7_olimjonov_samandar18.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import uz.gita.lesson7_olimjonov_samandar18.R;
import uz.gita.lesson7_olimjonov_samandar18.data.QuestionType;

public class MainActivity extends AppCompatActivity {

    int subject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this,QuizActivity.class);
        Bundle bundle = new Bundle();
        subject = getIntent().getIntExtra("TYPE", 0);
        AppCompatButton math_easy = findViewById(R.id.button_easy);
        AppCompatButton math_medium = findViewById(R.id.button_medium);
        AppCompatButton math_hard = findViewById(R.id.button_hard);
        AppCompatButton math_olympiad = findViewById(R.id.button_olympiad);

        AppCompatButton back = findViewById(R.id.button_back);
        back.setOnClickListener(v -> finish());


        math_easy.setOnClickListener(button -> {
//            bundle.putSerializable("TYPE", "MATHEMATICS_EASY");
            Intent intent0 = new Intent(this,QuizActivity.class);
            intent0.putExtra("TYPE",0);
            intent0.putExtra("SUBJECT", subject);
            startActivity(intent0);
        });
        math_medium.setOnClickListener(button -> {
//            bundle.putSerializable("TYPE", "MATHEMATICS_MEDIUM");
//            intent.putExtras(bundle);
            Intent intent1 = new Intent(this,QuizActivity.class);
            intent1.putExtra("SUBJECT", subject);
            intent1.putExtra("TYPE",1);
            startActivity(intent1);
        });
        math_hard.setOnClickListener(button -> {
           Intent intent2 = new Intent(this,QuizActivity.class);
           intent2.putExtra("TYPE",2);
           intent2.putExtra("SUBJECT", subject);
           startActivity(intent2);
        });
        math_olympiad.setOnClickListener(button -> {
            Intent intent3 = new Intent(this,QuizActivity.class);
            intent3.putExtra("TYPE",3);
            intent3.putExtra("SUBJECT", subject);
            startActivity(intent3);
        });
        new QuitHomeListener(){

            @Override
            public void quitHome() {
                finish();
            }
        };
    }
}

interface QuitHomeListener{
    void quitHome();
}