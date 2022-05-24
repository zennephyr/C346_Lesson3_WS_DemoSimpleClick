package sg.edu.rp.c346.id21015762.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textviewDisplay);
        btnDisplay = findViewById(R.id.btnDisplay);
        etInput = findViewById(R.id.etInput);
        tbtn = findViewById(R.id.tbtn);
        rgGender = findViewById(R.id.radioGroupGender);

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if (tbtn.isChecked()){
                    etInput.setEnabled(false);
                } else {
                    etInput.setEnabled(true);
                }
            }
        });


        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);

            }
        });

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString(); //typed
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){ //if button is male
                    // Write the code when male selected
                    stringResponse = ("He says " + stringResponse); //display gender+text
                }
                else{
                    // Write the code when female selected
                    stringResponse = ("She says " + stringResponse); //display gender+text
                }
                tvDisplay.setText(stringResponse);
            }
        });



    }



}