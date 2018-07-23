package nietoveinte.complix;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import nietoveinte.complix.R;


public class Menu_Activity extends AppCompatActivity {

    private Button btnSistema, btnCalculadora, btnDeterminante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        btnCalculadora = (Button) findViewById(R.id.btnCalcuMenu);
        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent btnCalcuMenu = new Intent(Menu_Activity.this, CalculadorActivity.class);
              startActivity(btnCalcuMenu);
            }

        });


        btnSistema = (Button) findViewById(R.id.btnSisMenu);
        btnSistema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnSisMenu = new Intent(Menu_Activity.this, MainActivity.class);
                startActivity(btnSisMenu);
            }

        });


        btnDeterminante = (Button) findViewById(R.id.btnDetMenu);
        btnDeterminante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent btnDetMenu = new Intent(Menu_Activity.this, DeterminanteActivity.class);
               startActivity(btnDetMenu);
            }

        });

    }
}
