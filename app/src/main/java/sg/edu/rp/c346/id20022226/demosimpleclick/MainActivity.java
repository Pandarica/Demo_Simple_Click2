package sg.edu.rp.c346.id20022226.demosimpleclick;

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
    ToggleButton toggleButtonEnabled;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        toggleButtonEnabled = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroup);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                if (toggleButtonEnabled.isChecked() == true) {
                    String stringResponse = etInput.getText().toString();
                    int selectedId = rgGender.getCheckedRadioButtonId();

                    if (selectedId == R.id.rb1) {
                        tvDisplay.setText("He says " + stringResponse);
                    } else if (selectedId == R.id.rb2) {
                        tvDisplay.setText("She says " + stringResponse);
                    } else {
                        tvDisplay.setText(stringResponse);
                    }
                }
            }
        });
    }
}