package id.co.technomotion.hellorobo2;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import id.co.technomotion.hellorobo2.model.Calculator;


public class MainActivity extends Activity implements View.OnClickListener {

    private  Activity activity;
    private EditText input1,input2;
    private Button btnPlus,btnMinus,btnMultiply,btnDivide;
    private TextView output;
    private Calculator calculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator=new Calculator();

        input1= (EditText) findViewById(R.id.first_input);
        input2= (EditText) findViewById(R.id.second_input);
        output= (TextView) findViewById(R.id.result_output);
        btnPlus= (Button) findViewById(R.id.button_plus);
        btnMinus= (Button) findViewById(R.id.button_minus);
        btnMultiply= (Button) findViewById(R.id.button_multiply);
        btnDivide= (Button) findViewById(R.id.button_divide);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        if(input1.getText().toString().isEmpty() || input2.getText().toString().isEmpty()){
            Toast.makeText(this,"wajib diisi",Toast.LENGTH_SHORT).show();
            return;
        }

        double in1=Double.parseDouble(input1.getText().toString());
        double in2=Double.parseDouble(input2.getText().toString());

        switch (v.getId()){
            case R.id.button_plus:
                output.setText(calculator.calculate(in1).addBy(in2));
            break;
            case R.id.button_minus:
                output.setText(calculator.calculate(in1).substractBy(in2));
                break;
            case R.id.button_multiply:
                output.setText(calculator.calculate(in1).multiplyBy(in2));
                break;
            case R.id.button_divide:
                output.setText(calculator.calculate(in1).divideBy(in2));
                break;
        }
    }
}
