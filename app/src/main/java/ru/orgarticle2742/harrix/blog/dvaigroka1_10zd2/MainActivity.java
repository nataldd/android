package ru.orgarticle2742.harrix.blog.dvaigroka1_10zd2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private TextView textView2;
    int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);

    }

    public void onClickBtn(View v){
        String S1 = editText.getText().toString();
        int I1 = Integer.parseInt(S1);
        //int sum = 0;
        sum+=I1;
        if (sum > 99){
            textView2.setText("Игра закончена. Вы победили!");
        }
        else {
            final Random random = new Random();
            String S2="";
            int I2= (random.nextInt(10)+1);
            S2+=I2 + "sum=" + sum;
            textView.setText(S2);

            sum += I2;
            if (sum > 99) {
                textView2.setText("Игра закончена. Вы проиграли.");
            }
        }

    }
}
