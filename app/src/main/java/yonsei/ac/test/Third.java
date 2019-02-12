package yonsei.ac.test;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Third extends AppCompatActivity implements View.OnClickListener {

    private EditText edt_search;
    private Button btn_enter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);


        edt_search = findViewById(R.id.edt_search);
        btn_enter = findViewById(R.id.btn_enter);

        btn_enter.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        sendData();
        finish();
    }

    private void sendData(){
        Second rr = new Second();
        Bundle bundle = new Bundle();
        bundle.putString("FIND", edt_search.getText().toString());
        rr.setArguments(bundle);
    }
}
