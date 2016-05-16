package com.pedrominmercado.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button add;
    private Button sub;
    private Button mult;
    private Button div;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        operand1 = (EditText) findViewById(R.id.operandEdit1);
        operand2 = (EditText) findViewById(R.id.operandEdit2);
        add = (Button) findViewById(R.id.addBtn);
        sub = (Button) findViewById(R.id.subBtn);
        mult = (Button) findViewById(R.id.mulBtn);
        div = (Button) findViewById(R.id.divBtn);
        result = (TextView) findViewById(R.id.operandResultText);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length() > 0 && operand2.getText().length() > 0){
                    double num1 = Double.parseDouble(operand1.getText().toString());
                    double num2 = Double.parseDouble(operand2.getText().toString());
                    double resultOperand = num1 + num2;
                    result.setText(Double.toString(resultOperand));
                }
                else{
                    Toast.makeText(MainActivity.this,"Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length() > 0 && operand2.getText().length() > 0) {
                    double num1 = Double.parseDouble(operand1.getText().toString());
                    double num2 = Double.parseDouble(operand2.getText().toString());
                    double resultOperand = num1 - num2;
                    result.setText(Double.toString(resultOperand));
                }
                else{
                    Toast.makeText(MainActivity.this,"Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length() > 0 && operand2.getText().length() > 0) {
                    double num1 = Double.parseDouble(operand1.getText().toString());
                    double num2 = Double.parseDouble(operand2.getText().toString());
                    double resultOperand = num1 * num2;
                    result.setText(Double.toString(resultOperand));
                }
                else{
                    Toast.makeText(MainActivity.this,"Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length() > 0 && operand2.getText().length() > 0) {
                    double num1 = Double.parseDouble(operand1.getText().toString());
                    double num2 = Double.parseDouble(operand2.getText().toString());
                    double resultOperand = num1 / num2;
                    result.setText(Double.toString(resultOperand));
                }
                else{
                    Toast.makeText(MainActivity.this,"Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
