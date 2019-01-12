package com.customalertdialogbox;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnShowAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowAlertDialog=findViewById(R.id.btnShowAlertDialog);

        final AlertDialog.Builder mBuilder=new AlertDialog.Builder(this);
        final View mview=getLayoutInflater().inflate(R.layout.customalertdialog,null);


        final EditText email=mview.findViewById(R.id.etUserName);
        final EditText password=mview.findViewById(R.id.etPassword);
        final Button   login=mview.findViewById(R.id.btnLogin);
        btnShowAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if((!email.getText().toString().isEmpty())&&(!password.getText().toString().isEmpty()))
                        {
                            Toast.makeText(getApplicationContext(),"Login Sucessfully",Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Any filed is empty Please fill ",Toast.LENGTH_LONG).show();
                        }
                    }
                });
                mBuilder.setView(mview);
                AlertDialog dialog=mBuilder.create();
                dialog.show();
            }
        });

    }
}
