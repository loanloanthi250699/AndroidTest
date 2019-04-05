package com.example.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class LayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        TextView tvPhone = findViewById(R.id.tv_phone);
        TextView tvPass = findViewById(R.id.tv_pass);
        TextView tvSubmit = findViewById(R.id.text_sumit);
        EditText textPhone = (EditText) findViewById(R.id.text_phone);
        EditText textPassword = (EditText) findViewById(R.id.text_password);

        tvPhone.setVisibility(View.INVISIBLE);
        tvPass.setVisibility(View.INVISIBLE);
        tvSubmit.setVisibility(View.INVISIBLE);
    }

    public void If(){
        TextView tvPhone = findViewById(R.id.tv_phone);
        TextView tvPass = findViewById(R.id.tv_pass);
        TextView tvSubmit = findViewById(R.id.text_sumit);
        EditText textPhone =  findViewById(R.id.text_phone);
        EditText textPassword = findViewById(R.id.text_password);

        String sa = textPhone.getText()+"";
        String sb = textPassword.getText()+"";

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);

        if (a<8){
            tvPhone.setVisibility(View.VISIBLE);
        }
        else {
            tvPhone.setVisibility(View.INVISIBLE);
        }

    }

    public void onSubmit(View view) {
        System.out.println("onclick");

        EditText textEmail = findViewById(R.id.text_email);
        EditText textName = findViewById(R.id.text_name);
        EditText textPhone = findViewById(R.id.text_phone);
        EditText textPassword = findViewById(R.id.text_password);
        CheckBox cbTerm = findViewById(R.id.cb_term);


        System.out.println(textEmail.getText());
        System.out.println(textName.getText());
        System.out.println(textPhone.getText());
        System.out.println(textPassword.getText());
        System.out.println(cbTerm.isChecked());

        textEmail.setText("thien.ho@manifea.com");
        textName.setText("nguyen Loan");
        textPhone.setText("0384653857");
        textPassword.setText("250699");

//        if (cbTerm.isChecked()) {
//            cbTerm.setChecked(false);
//        } else {
//            cbTerm.setChecked(true);
//        }
        cbTerm.setChecked(!cbTerm.isChecked());
    }
}
