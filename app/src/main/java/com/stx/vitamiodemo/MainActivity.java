package com.stx.vitamiodemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                Intent intent = new Intent(MainActivity.this, PlayVideoActivity.class);
                startActivity(intent);
                break;
            case R.id.button2:
                String query = editText.getText().toString();
                Intent intent1 = new Intent(MainActivity.this, SearchResultActivity.class);
                intent1.putExtra("extra_data", query);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}
