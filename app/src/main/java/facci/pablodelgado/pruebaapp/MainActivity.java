package facci.gemberthd
        .pruebaapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    public Button cal;
    public EditText entrada;
    public TextView resp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "Delgado Alonso Pablo Anthony");
        //Grados a farenhein
        cal = (Button) findViewById(R.id.button1);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrada = (EditText) findViewById(R.id.editText1);
                resp = (TextView) findViewById(R.id.textView1);
                try {
                    float gradosCen = Float.parseFloat(entrada.getText().toString());
                    float gradosFar = 32+(gradosCen*9/5);
                    resp.setText(String.format("R: %.2f", gradosFar));
                }catch (Exception e) {
                    resp.setText("Ingrese solo números");
                }
            }
        });

        //farengein a grados
        cal = (Button) findViewById(R.id.button2);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrada = (EditText) findViewById(R.id.editText2);
                resp = (TextView) findViewById(R.id.textView2);
                try {
                    float gradosFar = Float.parseFloat(entrada.getText().toString());
                    float gradosCent = (float) ((gradosFar-32)/ 1.8);
                    resp.setText(String.format("R: %.2f", gradosCent));
                }catch (Exception e) {
                    resp.setText("Ingrese solo números");
                }
            }
        });





    }
}