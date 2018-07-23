package fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import nietoveinte.complix.R;
/**
 * Created by nietoAll on 20/03/2018.
 */


public class ResultadosFragment extends Fragment implements View.OnClickListener{


    public TextView tv_Y,tv_X,tv_Z,tv_Y_polar,tv_X_polar,tv_Z_polar,determinanteG;
    public TextView tv_W,tv_W_polar;

    public ResultadosFragment() {
    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.result_layout, container, false);
        instancias(view);
        events();
        return view;
    }

//===================== INSTANCIAS Y EVENTOS ==============================================================================//

    public void instancias(View view) {

        tv_Y = (TextView) view.findViewById(R.id.tv_Y);
        tv_Y_polar = (TextView) view.findViewById(R.id.tv_Y_polar);
        tv_X = (TextView) view.findViewById(R.id.tv_X);
        tv_X_polar = (TextView) view.findViewById(R.id.tv_X_polar);
        determinanteG = (TextView) view.findViewById(R.id.determinanteG);
        tv_Z = (TextView) view.findViewById(R.id.tv_Z);
        tv_Z_polar = (TextView) view.findViewById(R.id.tv_Z_polar);

        tv_W = (TextView) view.findViewById(R.id.tv_W);
        tv_W_polar = (TextView) view.findViewById(R.id.tv_W_polar);

        determinanteG = (TextView) view.findViewById(R.id.determinanteG);

    }

    private void events() {
    }

//========================= "SETEOS" ==============================================================================--//

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

public void  vaciar(){

    tv_X.setText("");
    tv_X_polar.setText("");
    tv_Y.setText("");
    tv_Y_polar.setText("");
    tv_Z.setText("");
    tv_Z_polar.setText("");
    tv_W.setText("");
    tv_W_polar.setText("");


}


    public void updateX(double real, double imagi, double vectorF, double anguloF, int fragment) {

        switch (fragment){

            case 0:
                asignarValor(real,tv_X,imagi);
                tv_X_polar.setText(convertirToString(vectorF)+" "+"∟"+" "+convertirToString(anguloF)+"°");
                tv_Z.setText("");
                tv_Z_polar.setText("");
                tv_W.setText("");
                tv_W_polar.setText("");
                break;

            case 1:
                asignarValor(real,tv_X,imagi);
                tv_X_polar.setText(convertirToString(vectorF)+" "+"∟"+" "+convertirToString(anguloF)+"°");
                tv_W.setText("");
                tv_W_polar.setText("");
                break;

            case 2:
                asignarValor(real,tv_X,imagi);
                tv_X_polar.setText(convertirToString(vectorF)+" "+"∟"+" "+convertirToString(anguloF)+"°");
                break;
        }


    }

    public void updateY(double real, double imagi, double vectorF, double anguloF) {
        asignarValor(real,tv_Y,imagi);
        tv_Y_polar.setText(convertirToString(vectorF)+" "+"∟"+" "+convertirToString(anguloF)+"°");
    }

    public void updateZ(double real, double imagi, double vectorF, double anguloF) {
        asignarValor(real,tv_Z,imagi);
        tv_Z_polar.setText(convertirToString(vectorF)+" "+"∟"+" "+convertirToString(anguloF)+"°");
    }

    public void updateW(double real, double imagi, double vectorF, double anguloF) {
        asignarValor(real,tv_W,imagi);
        tv_W_polar.setText(convertirToString(vectorF)+" "+"∟ "+" "+convertirToString(anguloF)+"°");
    }

    public void updateSDG(double real, double imagi) {
        asignarValor(real,determinanteG,imagi);
    }

//===================== CALCULOS ==============================================================================//

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


//===================== "EVENTOS" ==============================================================================//

    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }
}
