package e.omirza.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_calc_layout);
    }

    public void buttonClicked(View v){
        EditText weightView = (EditText) findViewById(R.id.weightBox);
        String weight = weightView.getText().toString();

        EditText heightView = (EditText) findViewById(R.id.heightBox);
        String height = heightView.getText().toString();

        BMIModel myModel = new BMIModel(weight, height);
        String myBMI = "Your weight is " + myModel.toPound() + "lb, your height is " + myModel.toFeetInch() + ", and your BMI is "
               + myModel.getBMI() +".";

        ((TextView) findViewById(R.id.answer)).setText(myBMI);
    }
}
