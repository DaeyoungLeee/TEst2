package yonsei.ac.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txt_hi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_hi = findViewById(R.id.txt_hi);

        txt_hi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Second second = new Second();
        getSupportFragmentManager().beginTransaction().add(R.id.frame, second).commit();
    }
}
