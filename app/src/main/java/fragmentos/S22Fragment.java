package fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import nietoveinte.complix.R;

/**
 * Created by nietoAll on 03/02/2018.
 */


public class S22Fragment extends Fragment implements View.OnClickListener{


    private static double ra22_11 = 0;
    private static double ia22_11 = 0;

    private static double ra22_12 = 0;
    private static double ia22_12 = 0;

    private static double ra22_21 = 0;
    private static double ia22_21 = 0;

    private static double ra22_22 = 0;
    private static double ia22_22 = 0;

    private static double rb22_11 = 0;
    private static double ib22_11 = 0;

    private static double rb22_21 = 0;
    private static double ib22_21 = 0;


    private TextView a22_11;
    private TextView a22_12;

    private TextView a22_21;
    private TextView a22_22;

    private TextView b22_11;
    private TextView b22_21;


    public S22Fragment() {
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.s22_layout, container, false);
        instancias(view);
        events();
        return view;
    }

//===================== INSTANCIAS Y EVENTOS ==============================================================================//

    public void instancias(View view) {

        a22_11 = (TextView) view.findViewById(R.id.a22_11);
        setInstancia(ra22_11,a22_11,ia22_11);

        a22_12 = (TextView) view.findViewById(R.id.a22_12);
        setInstancia(ra22_12,a22_12,ia22_12);

        a22_21 = (TextView) view.findViewById(R.id.a22_21);
        setInstancia(ra22_21,a22_21,ia22_21);

        a22_22 = (TextView) view.findViewById(R.id.a22_22);
        setInstancia(ra22_22,a22_22,ia22_22);


        b22_11 = (TextView) view.findViewById(R.id.b22_11);
        setInstancia(rb22_11,b22_11,ib22_11);

        b22_21 = (TextView) view.findViewById(R.id.b22_21);
        setInstancia(rb22_21,b22_21,ib22_21);
    }
    public void setInstancia(double partereal,TextView textview, double parteimagi){
        if(partereal == 0 && parteimagi == 0){
            textview.setText("");
        } else {
            asignarValor(partereal,textview,parteimagi);
            //textview.setText(convertirToString(partereal) + "+" + convertirToString(parteimagi) + "i");

        }
    }
    private void events() {
        a22_11.setOnClickListener(this);
        a22_12.setOnClickListener(this);
        a22_21.setOnClickListener(this);
        a22_22.setOnClickListener(this);
        b22_21.setOnClickListener(this);
        b22_11.setOnClickListener(this);
    }


//===================== "GETTERS" ==============================================================================//

    public double getReal(int ntextviewr) {

        switch (ntextviewr) {

            case 0:
                double real11 = ra22_11;
                return real11;
            case 1:
                double real12 = ra22_12;
                return real12;
            case 2:
                double real21 = ra22_21;
                return real21;
            case 3:

                double real22 = ra22_22;
                return real22;
            case 4:
                double breal2 = rb22_11;
                return breal2;
            case 5:
                double breal21 = rb22_21;
                return breal21;
        }

        return 0;

    }

    public double getImagi(int ntextviewi) {

        switch (ntextviewi) {

            case 0:
                double imagi = ia22_11;
                return imagi;

            case 1:
                double imagi12 =ia22_12;
                return imagi12;

            case 2:
                double imagi21 = ia22_21;
                return imagi21;

            case 3:

                double imagi22 = ia22_22;
                return imagi22;

            case 4:

                double bimagi12 = ib22_11;
                return bimagi12;

            case 5:

                double bimagi21 = ib22_21;
                return bimagi21;

        } return 0;

}

//===================== "SET'S" ==============================================================================//

    public void updateMessage(int segmn, double real, double imagi) {
        switch (segmn) {
            case 0:
                this.ra22_11 = real;
                this.ia22_11 = imagi;
                asignarValor(ra22_11,a22_11,ia22_11);
                break;
            case 1:
                this.ra22_12 = real;
                this.ia22_12 = imagi;
                asignarValor(ra22_12,a22_12,ia22_12);
                break;
            case 2:
                this.ra22_21 = real;
                this.ia22_21 = imagi;
                asignarValor(ra22_21,a22_21,ia22_21);
                break;
            case 3:
                this.ra22_22 = real;
                this.ia22_22 = imagi;
                asignarValor(ra22_22,a22_22,ia22_22);
                break;
            case 4:
                this.rb22_11 = real;
                this.ib22_11 = imagi;
                asignarValor(rb22_11,b22_11,ib22_11);
                break;
            case 5:
                this.rb22_21 = real;
                this.ib22_21 = imagi;
                asignarValor(rb22_21,b22_21,ib22_21);
                break;
            //rc22_11  =+   convertirToInteger(message);
            //rc22_11 = rc22_11 + convertirToInteger(message); }
        }
    }

    public void updateExpressPolar() {

        calculaPolarExpress(ra22_11,ia22_11,a22_11);
        calculaPolarExpress(ra22_12,ia22_12,a22_12);

        calculaPolarExpress(ra22_21,ia22_21,a22_21);
        calculaPolarExpress(ra22_22,ia22_22,a22_22);

        calculaPolarExpress(rb22_11,ib22_11,b22_11);
        calculaPolarExpress(rb22_21,ib22_21,b22_21);


    }

    public void updateExpressRectangular(){
        asignarValor(ra22_11,a22_11,ia22_11);
        asignarValor(ra22_12,a22_12,ia22_12);
        asignarValor(ra22_21,a22_21,ia22_21);
        asignarValor(ra22_22,a22_22,ia22_22);
        asignarValor(rb22_11,b22_11,ib22_11);
        asignarValor(rb22_21,b22_21,ib22_21);
    }

    public void asignarValor(double partereal, TextView textview, double parteimagi) {

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

    public void calculaPolarExpress(double real, double imagi,TextView textView) {
        double v_z = convierteApolarVector(real, imagi);
        double ang_z = convierteApolarAngulo(real, imagi);

        if (real == 0 && imagi == 0) {
            textView.setText("0" + "∟" + "0" + "°");
        } else{
            textView.setText(convertirToString(v_z) + "∟" + convertirToString(ang_z)+"°");
        }

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


//===================== " EVENTOS" ==============================================================================//

    public void dialogoPersonalizado(int identiSegmn,String title){
        DialogoFragment dialogoPersonalizado = new DialogoFragment();
        dialogoPersonalizado.setContext(0,identiSegmn,title);
        dialogoPersonalizado.show(getFragmentManager(), "personalizado");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.a22_11:
                dialogoPersonalizado(0,"X1");
                break;
            case R.id.a22_12:
                dialogoPersonalizado(1,"Y1");
                break;
            case R.id.a22_21:
                dialogoPersonalizado(2,"X2");
                break;
            case R.id.a22_22:
                dialogoPersonalizado(3,"Y2");
                break;
            case R.id.b22_11:
                dialogoPersonalizado(4,"C1");
                break;
            case R.id.b22_21:
                dialogoPersonalizado(5,"C2");
                break;
        }
    }

}
