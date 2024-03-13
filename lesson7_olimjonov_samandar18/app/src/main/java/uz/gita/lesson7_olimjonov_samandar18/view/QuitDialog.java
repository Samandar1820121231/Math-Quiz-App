package uz.gita.lesson7_olimjonov_samandar18.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;

import uz.gita.lesson7_olimjonov_samandar18.R;

public class QuitDialog extends Dialog {
    QuitGameListener quitGameListener;
    AppCompatButton btnYes;
    AppCompatButton btnNo;

    public QuitDialog(@NonNull Context context,QuitGameListener quitGameListener) {
        super(context);
        this.quitGameListener = quitGameListener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_quit);

        setCancelable(false);
        findViewById(R.id.home_quit_no).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        findViewById(R.id.home_quit_yes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
                quitGameListener.quitGame();
            }
        });
    }
}
