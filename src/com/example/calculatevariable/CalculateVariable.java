package com.example.calculatevariable;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculateVariable extends Activity {
	
	Button btnSum;
	Button btnMinus;
	Button btnMultiple;
	Button btnDivide;
	EditText txtValue1;
	EditText txtValue2;
	EditText txtResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_variable);
        
        btnSum = (Button) this.findViewById(R.id.btnSum);
    	btnMinus = (Button) this.findViewById(R.id.btnMinus);
    	btnMultiple = (Button) this.findViewById(R.id.btnMultiple);
    	btnDivide = (Button) this.findViewById(R.id.btnDivide);
    	txtValue1 = (EditText) this.findViewById(R.id.editText3);
    	txtValue2 = (EditText) this.findViewById(R.id.txtValue2);
    	txtResult = (EditText) this.findViewById(R.id.txtResult);
        
        btnSum.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				double value1 = Double.parseDouble(txtValue1.getText().toString());
				double value2 = Double.parseDouble(txtValue2.getText().toString());
				double result = value1 + value2;
				txtResult.setText(Double.toString(result));
			}
		});
        
        
        btnMinus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				double value1 = Double.parseDouble(txtValue1.getText().toString());
				double value2 = Double.parseDouble(txtValue2.getText().toString());
				double result = value1 - value2;
				txtResult.setText(Double.toString(result));
			}
		});
        
        
        btnMultiple.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				double value1 = Double.parseDouble(txtValue1.getText().toString());
				double value2 = Double.parseDouble(txtValue2.getText().toString());
				double result = value1 * value2;
				txtResult.setText(Double.toString(result));
			}
		});
        
        
        btnDivide.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				double value1 = Double.parseDouble(txtValue1.getText().toString());
				double value2 = Double.parseDouble(txtValue2.getText().toString());
				double result = value1 / value2;
				txtResult.setText(Double.toString(result));
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_calculate_variable, menu);
        return true;
    }
}
