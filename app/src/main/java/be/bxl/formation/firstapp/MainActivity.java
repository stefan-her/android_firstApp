package be.bxl.formation.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_login);

        EditText et_login = (EditText) findViewById(R.id.login);
        EditText et_pwd = (EditText) findViewById(R.id.pwd);

        Button bt_login = (Button) findViewById(R.id.button_login);
        bt_login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String value = et_login.getText().toString();
                        value += "\n";
                        value += et_pwd.getText().toString();
                        et_login.setText("");
                        et_pwd.setText("");
                        Toast.makeText(MainActivity.this, value, Toast.LENGTH_LONG).show();
                    }
                }
        );


        Button bt_pwd = (Button) findViewById(R.id.button_reset);
        bt_pwd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        et_login.setText("");
                        et_pwd.setText("");
                        Toast.makeText(MainActivity.this, getString(R.string.bt_reset), Toast.LENGTH_LONG).show();
                    }
                }
        );


        //String text = getString(R.string.text_first);
        //Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}