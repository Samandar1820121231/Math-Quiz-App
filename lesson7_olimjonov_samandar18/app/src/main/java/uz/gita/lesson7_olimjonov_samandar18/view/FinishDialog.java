package uz.gita.lesson7_olimjonov_samandar18.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;

import uz.gita.lesson7_olimjonov_samandar18.R;
import uz.gita.lesson7_olimjonov_samandar18.contract.QuizContract;

public class FinishDialog extends Dialog {
    QuizContract.Presenter presenter;
    private GoHomeListener goHomeListener;
    private RestartListener restartListener;
    private int correctAnswers;
    private int totalAnswers;


    public FinishDialog(Context context,int correctAnswers, int totalAnswers, GoHomeListener listener1,RestartListener listener2,QuizContract.Presenter presenter) {
        super(context);
        this.totalAnswers = totalAnswers;
        this.correctAnswers = correctAnswers;
        goHomeListener = listener1;
        restartListener = listener2;
        this.presenter = presenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_finish);
        ((AppCompatTextView) findViewById(R.id.textResult)).setText("Score: " + correctAnswers + " / " + totalAnswers);

        setCancelable(false);

        findViewById(R.id.buttonHome).setOnClickListener(button -> {
            dismiss();
            presenter.start();
            goHomeListener.goHome();
        });

        findViewById(R.id.buttonRestart).setOnClickListener(button -> {
            dismiss();
            restartListener.restart();
        });
    }
}
