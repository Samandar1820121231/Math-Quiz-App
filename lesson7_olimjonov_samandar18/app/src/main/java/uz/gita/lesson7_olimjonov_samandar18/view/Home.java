package uz.gita.lesson7_olimjonov_samandar18.view;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import uz.gita.lesson7_olimjonov_samandar18.R;


public class Home extends AppCompatActivity {
    AppCompatButton btnStart;
    AppCompatButton btnResult;
    AppCompatButton btnInfo;
    AppCompatButton btnQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);
        init();

    }
    public void init(){
        btnStart = findViewById(R.id.home_start);
        btnResult = findViewById(R.id.home_resutl);
        btnInfo = findViewById(R.id.home_info);
        btnQuit = findViewById(R.id.home_quit);
        btnStart.setOnClickListener(button -> {
            Intent intent = new Intent(Home.this, SubjectActivity.class);
            startActivity(intent);
        });
        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               QuitDialog quitDialog = new QuitDialog(Home.this,() -> finish());
               quitDialog.show();
            }
        });
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InfoDialog infoDialog = new InfoDialog(Home.this);
                infoDialog.show();
            }
        });
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this,Result.class);
                startActivity(intent);
            }
        });
    }

}
interface QuitGameListener{
    void quitGame();
}
