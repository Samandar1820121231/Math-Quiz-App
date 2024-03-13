package uz.gita.lesson7_olimjonov_samandar18.view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import uz.gita.lesson7_olimjonov_samandar18.R;
import uz.gita.lesson7_olimjonov_samandar18.contract.QuizContract;
import uz.gita.lesson7_olimjonov_samandar18.data.QuestionModel;
import uz.gita.lesson7_olimjonov_samandar18.data.QuestionType;
import uz.gita.lesson7_olimjonov_samandar18.model.QuizModel;
import uz.gita.lesson7_olimjonov_samandar18.presenter.QuizPresenter;

interface GoHomeListener {
    void goHome();
}

interface RestartListener{
    void restart();
}
public class QuizActivity extends AppCompatActivity implements QuizContract.View {
    static AppCompatTextView testState;
//    QuitHomeListener quitHomeListener;
    private final RadioButton[] variants = new RadioButton[4];
    private QuizPresenter presenter;
    private AppCompatTextView question;
    private RadioGroup variantsGroup;
    AppCompatButton buttonBack;
    private AppCompatButton buttonNext;
    private int selectedVariant = -1;
    public static int state = 0;

    private boolean isResultChecked = false;
    QuestionType type;

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

    SharedPreferences sharedPreferences;
    private static final String KEY_SHARED_PREFERENCE = "KEY_SHARED_PREFERENCE";
    private static final String KEY_STATE = "KEY_STATE";
    private static final String KEY_POS = "KEY_POS";
    private static final String KEY_CORRECT_ANSWER = "KEY_CORRECT_ANSWER";
    private static final String KEY_ANSWER = "KEY_ANSWER";
    private int questionType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_quiz);

//        String a =  getIntent().getExtras().getSerializable("TYPE").toString();
//        type = (QuestionType) savedInstanceState.getSerializable("TYPE");
        QuizModel model = new QuizModel();
         int a = getIntent().getIntExtra("TYPE",0);
         int topic = getIntent().getIntExtra("SUBJECT", 0);
        switch (a) {
            case 0:
                questionType = 0;
                if (topic == 0)
                    model.init_easy();
                else
                    model.init_easy_english();
                break;
            case 1:
                questionType = 1;
                if (topic == 0)
                    model.init_medium();
                else
                    model.init_medium_english();
                break;
            case 2:
                questionType = 2;
                if (topic == 0)
                    model.init_hard();
                else
                    model.init_hard_english();break;
            case 3:
                questionType = 3;
                if (topic == 0)
                    model.init_olympiad();
                else
                    model.init_olympiad_english();break;
        }
        presenter = new QuizPresenter(model,this);

        loadViews();
        presenter.start();
//        loadGameState();
    }

    @Override
    public void loadViews() {
        state = 1;
        testState = findViewById(R.id.test_state);
        question = findViewById(R.id.textQuestion);
        variantsGroup = findViewById(R.id.variants);
        buttonBack = findViewById(R.id.button_quiz_back);
        testState.setText(1 + " / " + 10);
        buttonBack.setOnClickListener(v -> {
            finish();
//            saveGameState();
        });
        variantsGroup.setOnCheckedChangeListener((group, checkedId) -> {
            selectedVariant = checkedId - 1;
            buttonNext.setEnabled(true);
            buttonNext.setBackgroundResource(R.drawable.btn_change);
//            group.getChildAt(checkedId).setBackgroundResource(R.drawable.selected_btn_background);
//            buttonNext.setBackgroundResource(R.drawable.btn_change);
        });
        for (int i = 0; i < 4; i++) {
            variants[i] = (RadioButton) variantsGroup.getChildAt(i);
        }
        buttonNext = findViewById(R.id.buttonNext);
        buttonNext.setBackgroundResource(R.drawable.next_unchanged_state);
        buttonNext.setOnClickListener(button ->{
//                if (isResultChecked){
                    testState.setText(++state + " / " + 10);
                    presenter.goNextQuestion(variants[selectedVariant % 4].getText().toString());
//                    for(int i = 0; i < 4; ++i){
//                        variantsGroup.getChildAt(i).setBackground(null);
//                    }
//                    buttonNext.setText("NEXT");
//                    buttonNext.setText("CHECK");
//                    isResultChecked = false;
//                }else{
//                    buttonNext.setText("NEXT");
//                    isResultChecked = true;
//                    if(presenter.getCorrectAnswer(state, selectedVariant) != selectedVariant)
//                        variantsGroup.getChildAt(selectedVariant).setBackgroundResource(R.drawable.radiogroup_item_wrong_background);
//                    variantsGroup.getChildAt(presenter.getCorrectAnswer(state - 1, variants[selectedVariant].getText().toString())).setBackgroundResource(R.drawable.radiogroup_item_correct_background);
//                }
        });

    }

    @Override
    public void setQuestion(QuestionModel questionModel) {
        question.setText(questionModel.question);
        for (int i = 0; i < 4; i++) {
            variants[i].setText(questionModel.variants.get(i));
            variantsGroup.clearCheck();
            buttonNext.setEnabled(false);
            buttonNext.setBackgroundResource(R.drawable.btn_design_disabled);
//            variantsGroup.getChildAt(selectedVariant).setBackgroundResource(R.drawable.default_background);
        }
    }

    @Override
    public void changeTextNextButton(String name) {
        buttonNext.setText(name);
    }

    @Override
    public void showFinishDialog(int correctAnswers, int totalAnswers) {
        state(10);
        switch (questionType){
            case 0:
                saveEasyResult(correctAnswers);break;
            case 1:
                saveMediumResult(correctAnswers);break;
            case 2:
                saveHardResult(correctAnswers);break;
            case 3:
                saveOlympiadResult(correctAnswers);break;
        }
        FinishDialog dialog = new FinishDialog(this,correctAnswers,totalAnswers,() -> {
            finish();
//            quitHomeListener = new QuitHomeListener() {
//                @Override
//                public void quitHome() {
//                    finish();
//                }
//            };
//            quitHomeListener.quitHome();
        },() -> presenter.start(),presenter);
        dialog.show();
    }
    public static void state(int index){
        testState.setText(index + " / "+ 10);
    }
//    private void saveGameState(){
//        sharedPreferences = getSharedPreferences(KEY_SHARED_PREFERENCE,MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putInt(KEY_POS,presenter.getPos());
//        editor.putInt(KEY_STATE,state);
//        editor.putInt(KEY_CORRECT_ANSWER,presenter.getCorrectAnswers() - 1);
//        editor.putString(KEY_ANSWER,presenter.getAnswer());
//        editor.apply();
//    }
//
//    private void loadGameState(){
//        sharedPreferences = getSharedPreferences(KEY_SHARED_PREFERENCE,MODE_PRIVATE);
//        state = sharedPreferences.getInt(KEY_STATE,1);
//        presenter.setCorrectAnswers(sharedPreferences.getInt(KEY_CORRECT_ANSWER,0));
//        state(sharedPreferences.getInt(KEY_STATE,1));
//        presenter.goNextQuestion(sharedPreferences.getString(KEY_ANSWER,null));
//    }

    public void saveEasyResult(int correctAnswers){
        sharedPreferencesEasy = getSharedPreferences(KEY_PREF_EASY,MODE_PRIVATE);
        SharedPreferences.Editor editorEasy = sharedPreferencesEasy.edit();
        editorEasy.putInt(KEY_PREF_CORRECT_EASY,correctAnswers);
        editorEasy.apply();
    }

    public void saveMediumResult(int correctAnswers){
        sharedPreferencesMedium = getSharedPreferences(KEY_PREF_MEDIUM,MODE_PRIVATE);
        SharedPreferences.Editor editorMedium = sharedPreferencesMedium.edit();
        editorMedium.putInt(KEY_PREF_CORRECT_MEDIUM,correctAnswers);
        editorMedium.apply();
    }

    public void saveHardResult(int correctAnswers){
        sharedPreferencesHard = getSharedPreferences(KEY_PREF_HARD,MODE_PRIVATE);
        SharedPreferences.Editor editorHard = sharedPreferencesHard.edit();
        editorHard.putInt(KEY_PREF_CORRECT_HARD,correctAnswers);
        editorHard.apply();
    }

    public void saveOlympiadResult(int correctAnswers){
        sharedPreferencesOlympiad = getSharedPreferences(KEY_PREF_OLYMPIAD,MODE_PRIVATE);
        SharedPreferences.Editor editorOlympiad = sharedPreferencesOlympiad.edit();
        editorOlympiad.putInt(KEY_PREF_CORRECT_OLYMPIAD,correctAnswers);
        editorOlympiad.apply();
    }
}
