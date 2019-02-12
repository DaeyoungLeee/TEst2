package yonsei.ac.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends Fragment implements View.OnClickListener {

    private TextView input, click;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.third, container, false);

        click = view.findViewById(R.id.click);
        input = view.findViewById(R.id.input);




        click.setOnClickListener(this);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle in = getArguments();

        if(in != null){

            input.setText(in.getString("FIND" ));

        }


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), Third.class);
        startActivity(intent);
    }
}
