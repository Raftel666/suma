package gaeta.alvarado.suma;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.numero1);
        num2 = (EditText) findViewById(R.id.numero2);
        Button Sumar = (Button) findViewById(R.id.sumar);
        final TextView Resultado = (TextView) findViewById(R.id.resultado);

        Sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.valueOf(num1.getText().toString());
                int number2 = Integer.valueOf(num2.getText().toString());
                int suma = number1 + number2;
                Resultado.setText(""+suma);
            }
        });
    }
    public void result(String Resultado){
        Toast.makeText(this,Resultado,Toast.LENGTH_LONG).show();
    }
}
