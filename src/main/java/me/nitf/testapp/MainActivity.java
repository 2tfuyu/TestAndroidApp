package me.nitf.testapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int tmp = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnClickActivity instance = OnClickActivity.getInstance();
        findViewById(R.id.plus).setOnClickListener(instance);
        findViewById(R.id.minus).setOnClickListener(instance);
        findViewById(R.id.mul).setOnClickListener(instance);
        findViewById(R.id.div).setOnClickListener(instance);

        TextView textView = findViewById(R.id.textView);
        textView.setText("ssss");
    }
}
