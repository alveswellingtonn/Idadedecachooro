package idadedecachorro.cursoandroid.com.idadedecachooro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;
    private Button botaoTipoRaca;
    private TextView tipoRaca;
    private String[] raca = new String[]{"Poodle, ", "Pastor Alemão, ", "Labrador, ", "Coquer, ", "Salsicha, ", "Buldog"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = findViewById(R.id.caixatextoid);
        botaoIdade = findViewById(R.id.bota0idadeid);
        resultadoIdade = findViewById(R.id.resultadoidadeid);
        botaoTipoRaca = findViewById(R.id.botaoTipoRacaId);
        tipoRaca = findViewById(R.id.tipoRacaId);

        //tipoRaca.setText(raca[raca.length]);

        botaoTipoRaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipoRaca.setText(raca[0] + (raca[1]) + (raca[2]) + (raca[3]) + (raca[4]) + (raca[5]));
            }
        });

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //recuperar o que foi digitado
               String textoDigitado = caixaTexto.getText().toString();

               if (textoDigitado.isEmpty()){
                   //String vaizia (Digite um valor)
                   resultadoIdade.setText("Nenhum número digitado!");
               } else  {
                   int valorDigitado = Integer.parseInt(textoDigitado);
                   int resultadoFinal = valorDigitado * 7;
                   resultadoIdade.setText (" A idade do cachorro em anos humanos é: " + resultadoFinal + " ano" );
               }

            }
        });
    }
}
