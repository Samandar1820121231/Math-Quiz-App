package uz.gita.lesson7_olimjonov_samandar18.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import uz.gita.lesson7_olimjonov_samandar18.R;

public class InfoDialog extends Dialog {
    public InfoDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        setCancelable(false);
        findViewById(R.id.info_ok).setOnClickListener(button -> {
            dismiss();
        });
    }
}
