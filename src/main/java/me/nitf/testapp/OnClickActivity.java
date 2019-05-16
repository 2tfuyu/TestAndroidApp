package me.nitf.testapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static me.nitf.testapp.R.id.textView;

@SuppressLint("Registered")
public class OnClickActivity extends Activity implements View.OnClickListener {

    private int tmp = 0;
    private static final OnClickActivity instance = new OnClickActivity();

    public static OnClickActivity getInstance() {
        return instance;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        findViewById(R.id.plus).setOnClickListener(this);
        findViewById(R.id.minus).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == null) return;
        Calculator calc = new Calculator();
        EditText editText = (EditText) findViewById(R.id.editText);

        int input = Integer.parseInt(String.valueOf(editText.getText()));
        int result = 0;
        switch (v.getId()) {
            case R.id.plus:
                result = calc.plus(this.tmp, input);
                break;
            case R.id.minus:
                result = calc.minus(this.tmp, input);
                break;
            case R.id.mul:
                result = calc.mul(this.tmp, input);
                break;
            case R.id.div:
                result = calc.div(this.tmp, input);
                break;
        }

        this.tmp = result;
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(result));
    }
}
