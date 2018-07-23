package nietoveinte.complix;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import fragmentos.DialogoCalculadora;

public class CalculadorActivity extends AppCompatActivity implements Comunicador{

    public TextView tv_A;
    public TextView tv_B;
    public TextView tv_A_po;
    public TextView tv_B_po;
    public TextView tv_Z;
    public TextView tv_Z_po;

    private  double r_a = 0;
    private  double i_a = 0;
    private  double v_a = 0;
    private  double ang_a = 0;


    private  double r_b = 0;
    private  double i_b = 0;
    private  double v_b = 0;
    private  double ang_b = 0;

    private  double r_z = 0;
    private  double i_z = 0;
    private  double v_z = 0;
    private  double ang_z = 0;

    private Button btn_sumaab,btn_div,btn_mov1,btn_mov2;
    private Button btn_multipli,btn_resta;


    //Perfecta para


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculador);


        setToolbar();


       tv_A = (TextView) findViewById(R.id.tv_A);
       tv_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            dialogoCalculador(0);
            }
        });

       tv_B_po = (TextView) findViewById(R.id.tv_B_po);
       tv_B_po.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dialogoCalculador(3);
        }
    });

       tv_A_po = (TextView) findViewById(R.id.tv_A_po);
       tv_A_po.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        dialogoCalculador(1);
        }
        });

       tv_B = (TextView) findViewById(R.id.tv_B);
       tv_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogoCalculador(2);
            }
        });

       tv_Z = (TextView) findViewById(R.id.tv_Z);
       tv_Z_po = (TextView) findViewById(R.id.tv_Z_po);


        btn_sumaab = (Button) findViewById(R.id.btn_sumaab);
        btn_sumaab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumaAB(r_a,i_a,r_b,i_b);
            }
        });


        btn_multipli = (Button) findViewById(R.id.btn_multipli);
        btn_multipli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                productoComplejo(r_a,i_a,r_b,i_b);


            }
        });


        btn_resta = (Button) findViewById(R.id.btn_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                restaAB(r_a,i_a,r_b,i_b);


            }
        });

  }



    public void dialogoCalculador(int tv){
        DialogoCalculadora dialogoCalculadora = new DialogoCalculadora();
        dialogoCalculadora.setContext(tv);
        dialogoCalculadora.show(getSupportFragmentManager(), "dialogogocalc");
    }


    @Override
    public double getValorReal(int textview) {
        switch (textview){
            case 0:
            return r_a;

            case 1:
            return r_b;

            case 2:
            return r_z;
        }
        return 0;
    }

    @Override
    public double getValorImagi(int textview) {


        switch (textview){
            case 0:
                return i_a;
            case 1:
                return i_b;
            case 2:
                return i_z;
        }
        return 0;

    }


    @Override
    public void setValores(int fragment, int idSegment, double datos, double datos2) {

    }

    public void asignarValorRectangular(double partereal, TextView textview, double parteimagi) {

        if (partereal==0 && parteimagi == 0) {
            textview.setText("0");
        }

        if (partereal==0) {
            textview.setText(convertirToString(parteimagi)+"i");
        }

        if (parteimagi == 0) {
            textview.setText(convertirToString(partereal));
        }
        else{
            if(parteimagi>0){
                textview.setText(convertirToString(partereal) + "+" + convertirToString(parteimagi) + "i");}
            if(parteimagi<0){
                textview.setText(convertirToString(partereal) + convertirToString(parteimagi) + "i");}
        }
    }

//===================== "CALCULO" ==============================================================================//

    public String convertirToString(double variable) {


        int d = entero(variable);
        int i = (int) variable;

        if (variable==0){
            return "0";
        } else

        if(d==0){
            String variableString = String.valueOf(fijarNumero(variable,2));
            return variableString;
        } else

        if(d==1){
            String variableString = String.valueOf(i);
            return variableString;
        }

        return "0.0";

    }

    public static double fijarNumero(double numero, int digitos) {
        double resultado;
        resultado = numero * Math.pow(10, digitos);
        resultado = Math.round(resultado);
        resultado = resultado / Math.pow(10, digitos);
        return resultado;
    }

    public double convierteApolarVector(double real, double imagi) {
        double realc = real * real;
        double imagic = imagi * imagi;
        double vector = (double) Math.sqrt(realc + imagic);
        return vector;
    }

    public double convierteApolarAngulo(double real, double imagi) {

        double angulo1 = imagi / real;
        double angulo2 = Math.atan(angulo1);
        double angulo3 = Math.toDegrees(angulo2);

        if (real> 0 | real ==0 ) {
            return angulo3;
        } else

        if (real <  0 && imagi == 0 | imagi>0) {
            double angulo = angulo3 + 180;
            return angulo;
        }else

        if (real < 0 && imagi < 0) {
            double angulo = -180 + angulo3;
            return angulo;
        }

        return 0;
    }

    public int entero(double x) {
        if (x % 1 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void setValor(int textview, double real, double imagi) {
        switch (textview){

            case 0:
                r_a=real;
                i_a=imagi;
                asignarValorRectangular(r_a,tv_A,i_a);
                v_a=convierteApolarVector(real,imagi);
                ang_a=convierteApolarAngulo(real, imagi);
                tv_A_po.setText(convertirToString(v_a)+" "+ "∟" +" "+ convertirToString(ang_a)+"°");
            break;


            case 1:
                r_a=real;
                i_a=imagi;
                asignarValorRectangular(r_a,tv_A,i_a);
                v_a=convierteApolarVector(real,imagi);
                ang_a=convierteApolarAngulo(real, imagi);
                tv_A_po.setText(convertirToString(v_a)+" "+ "∟"+" "+ convertirToString(ang_a)+"°");
            break;


            case 2:
                r_b=real;
                i_b=imagi;
                asignarValorRectangular(r_b,tv_B,i_b);
                v_b=convierteApolarVector(real,imagi);
                ang_b=convierteApolarAngulo(real, imagi);
                tv_B_po.setText(convertirToString(v_b)+" "+ "∟"+" "+ convertirToString(ang_b)+"°");
            break;

            case 4|5:
                r_z=real;
                i_z=imagi;
                tv_Z.setText(convertirToString(real)+convertirToString(imagi));
                v_z=convierteApolarVector(real,imagi);
                ang_z=convierteApolarAngulo(real, imagi);
                tv_Z_po.setText(convertirToString(v_a)+convertirToString(ang_a));
            break;
        }
    }

    @Override
    public double getValorReal(int fragment, int segmn) {
        return 0;
    }

    @Override
    public double getValorImagi(int fragment, int segmn) {
        return 0;
    }

    @Override
    public void setSistema(int currentitem) {

    }

    public void sumaAB(double reala,double imagia,double realb,double imagib){
        double realF = reala + realb;
        double imagiF = imagia + imagib;
        asignarValorRectangular(realF,tv_Z,imagiF);
        v_z=convierteApolarVector(realF,imagiF);
        ang_z=convierteApolarAngulo(realF, imagiF);
        tv_Z_po.setText(convertirToString(v_z)+" "+ "∟"+" "+ convertirToString(ang_z)+"°");


    }


    public void restaAB(double reala,double imagia,double realb,double imagib){
        double realF = reala - realb;
        double imagiF = imagia - imagib;
        asignarValorRectangular(realF,tv_Z,imagiF);
        v_z=convierteApolarVector(realF,imagiF);
        ang_z=convierteApolarAngulo(realF, imagiF);
        tv_Z_po.setText(convertirToString(v_z)+" "+ "∟"+" "+ convertirToString(ang_z)+"°");


    }


    public void productoComplejo(double real1, double imagi1,double real2, double imagi2){

        double realF=(real1*real2)+((imagi1*imagi2)*(-1));
        double imagiF = (real1*imagi2)+(imagi1*real2);
        asignarValorRectangular(realF,tv_Z,imagiF);



        v_z=convierteApolarVector(realF,imagiF);
        ang_z=convierteApolarAngulo(realF, imagiF);
        tv_Z_po.setText(convertirToString(v_z)+" "+ "∟"+" "+ convertirToString(ang_z)+"°");


        /* 6(4) + 6(2i) + 8i(4) + 8i(2i)
        (6 + 8i)(4 + 2i)
        24 + 12i + 32i + 16i2
        24 + 44i + 16i2
        24 + 44i + 16(-1)
        24 + 44i – 16
        8 + 44i*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_search:

                tv_A.setText("");
                tv_B.setText("");
                tv_Z.setText("");
                tv_A_po.setText("");
                tv_B_po.setText("");
                tv_Z_po.setText("");

                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarTop);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.back_blue));
        toolbar.setBackground(getResources().getDrawable(R.drawable.border_toolbar_calcu));
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //regresar...
//                finish();
                onBackPressed();

            }
        });

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


}



