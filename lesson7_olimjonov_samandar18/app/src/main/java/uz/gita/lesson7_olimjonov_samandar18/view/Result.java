package uz.gita.lesson7_olimjonov_samandar18.view;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import uz.gita.lesson7_olimjonov_samandar18.R;

public class Result extends AppCompatActivity {
    AppCompatTextView txtEasy;
    AppCompatTextView txtMedium;
    AppCompatTextView txtHard;
    AppCompatTextView txtOlympiad;
    AppCompatButton resultBack;

    SharedPreferences sharedPreferencesEasy;
    private static final String KEY_PREF_EASY = "KEY_PREF_EASY";
    private static final String KEY_PREF_CORRECT_EASY = "KEY_PREF_CORRECT_EASY";

    SharedPreferences sharedPreferencesMedium;
    private static final String KEY_PREF_MEDIUM = "KEY_PREF_MEDIUM";
    private static final String KEY_PREF_CORRECT_MEDIUM = "KEY_PREF_CORRECT_MEDIUM";

    SharedPreferences sharedPreferencesHard;
    private static final String KEY_PREF_HARD = "KEY_PREF_HARD";
    private static final String KEY_PREF_CORRECT_HARD = "KEY_PREF_CORRECT_HARD";

    SharedPreferences sharedPreferencesOlympiad;
    private static final String KEY_PREF_OLYMPIAD = "KEY_PREF_OLYMPIAD";
    private static final String KEY_PREF_CORRECT_OLYMPIAD = "KEY_PREF_CORRECT_OLYMPIAD";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_result);
        initViews();
        loadEasyResult();
        loadMediumResult();
        loadHardResult();
        loadOlympiadResult();
    }
    public void initViews(){
        resultBack = findViewById(R.id.result_back);
        txtEasy = findViewById(R.id.res_easy);
        txtMedium = findViewById(R.id.res_medium);
        txtHard = findViewById(R.id.res_hard);
        txtOlympiad = findViewById(R.id.res_olympiad);
        resultBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


    public void loadEasyResult(){
        sharedPreferencesEasy = getSharedPreferences(KEY_PREF_EASY,MODE_PRIVATE);
        txtEasy.setText("Last result: "+sharedPreferencesEasy.getInt(KEY_PREF_CORRECT_EASY,0) + " / 10");
    }

    public void loadMediumResult(){
        sharedPreferencesMedium = getSharedPreferences(KEY_PREF_MEDIUM,MODE_PRIVATE);
        txtMedium.setText("Last result: "+sharedPreferencesMedium.getInt(KEY_PREF_CORRECT_MEDIUM,0) + " / 10");
    }

    public void loadHardResult(){
        sharedPreferencesHard = getSharedPreferences(KEY_PREF_HARD,MODE_PRIVATE);
        txtHard.setText("Last result: "+sharedPreferencesHard.getInt(KEY_PREF_CORRECT_HARD,0) + " / 10");
    }

    public void loadOlympiadResult(){
        sharedPreferencesOlympiad = getSharedPreferences(KEY_PREF_OLYMPIAD,MODE_PRIVATE);
        txtOlympiad.setText("Last result: "+sharedPreferencesOlympiad.getInt(KEY_PREF_CORRECT_OLYMPIAD,0) + " / 10");
    }

}
