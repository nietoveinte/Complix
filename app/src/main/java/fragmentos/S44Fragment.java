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


public class S44Fragment extends Fragment implements View.OnClickListener{



    private static double r44_11=0;
    private static double i44_11=0;
    private static double r44_12=0;
    private static double i44_12=0;
    private static double r44_13=0;
    private static double i44_13=0;
    private static double r44_14=0;
    private static double i44_14=0;

    private static double r44_21=0;
    private static double i44_21=0;
    private static double r44_22=0;
    private static double i44_22=0;
    private static double r44_23=0;
    private static double i44_23=0;
    private static double r44_24=0;
    private static double i44_24=0;

    private static double r44_31=0;
    private static double i44_31=0;
    private static double r44_32=0;
    private static double i44_32=0;
    private static double r44_33=0;
    private static double i44_33=0;
    private static double r44_34=0;
    private static double i44_34=0;

    private static double r44_41=0;
    private static double i44_41=0;
    private static double r44_42=0;
    private static double i44_42=0;
    private static double r44_43=0;
    private static double i44_43=0;
    private static double r44_44=0;
    private static double i44_44=0;


    private static double rc44_11=0;
    private static double ic44_11=0;
    private static double rc44_21=0;
    private static double ic44_21=0;
    private static double rc44_31=0;
    private static double ic44_31=0;
    private static double rc44_41=0;
    private static double ic44_41=0;

    private TextView s44_11;
    private TextView s44_12;
    private TextView s44_13;
    private TextView s44_14;

    private TextView s44_21;
    private TextView s44_22;
    private TextView s44_23;
    private TextView s44_24;

    private TextView s44_31;
    private TextView s44_32;
    private TextView s44_33;
    private TextView s44_34;

    private TextView s44_41;
    private TextView s44_42;
    private TextView s44_43;
    private TextView s44_44;

    private TextView sc44_11;
    private TextView sc44_21;
    private TextView sc44_31;
    private TextView sc44_41;


    public S44Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.s44_layout, container, false);
        instancias(view);
        events();

        return view;
    }

//===================== INSTANCIAS Y EVENTOS ==============================================================================//

    public void instancias(View view){

        s44_11 = (TextView) view.findViewById(R.id.s44_11);
        setInstancia(r44_11,s44_11,i44_11);

        s44_12 = (TextView) view.findViewById(R.id.s44_12);
        setInstancia(r44_12,s44_12,i44_12);

        s44_13 = (TextView) view.findViewById(R.id.s44_13);
        setInstancia(r44_13,s44_13,i44_13);

        s44_14 = (TextView) view.findViewById(R.id.s44_14);
        setInstancia(r44_14,s44_14,i44_14);

    //--------------------------------------------------

        s44_21 = (TextView) view.findViewById(R.id.s44_21);
        setInstancia(r44_21,s44_21,i44_21);

        s44_22 = (TextView) view.findViewById(R.id.s44_22);
        setInstancia(r44_22,s44_22,i44_22);

        s44_23 = (TextView) view.findViewById(R.id.s44_23);
        setInstancia(r44_23,s44_23,i44_23);

        s44_24 = (TextView) view.findViewById(R.id.s44_24);
        setInstancia(r44_24,s44_24,i44_24);

    //----------------------------------------------------------

        s44_31 = (TextView) view.findViewById(R.id.s44_31);
        setInstancia(r44_31,s44_31,i44_31);

        s44_32 = (TextView) view.findViewById(R.id.s44_32);
        setInstancia(r44_32,s44_32,i44_32);

        s44_33 = (TextView) view.findViewById(R.id.s44_33);
        setInstancia(r44_33,s44_33,i44_33);

        s44_34 = (TextView) view.findViewById(R.id.s44_34);
        setInstancia(r44_34,s44_34,i44_34);

    //----------------------------------------------------------

        s44_41 = (TextView) view.findViewById(R.id.s44_41);
        setInstancia(r44_41,s44_41,i44_41);

        s44_42 = (TextView) view.findViewById(R.id.s44_42);
        setInstancia(r44_42,s44_42,i44_42);

        s44_43 = (TextView) view.findViewById(R.id.s44_43);
        setInstancia(r44_43,s44_43,i44_43);

        s44_44 = (TextView) view.findViewById(R.id.s44_44);
        setInstancia(r44_44,s44_44,i44_44);

    //----------------------------------------------------------

        sc44_11 = (TextView) view.findViewById(R.id.sc44_11);
        setInstancia(rc44_11,sc44_11,ic44_11);

        sc44_21 = (TextView) view.findViewById(R.id.sc44_21);
        setInstancia(rc44_21,sc44_21,ic44_21);

        sc44_31 = (TextView) view.findViewById(R.id.sc44_31);
        setInstancia(rc44_31,sc44_31,ic44_31);

        sc44_41 = (TextView) view.findViewById(R.id.sc44_41);
        setInstancia(rc44_41,sc44_41,ic44_41);


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

        s44_11.setOnClickListener(this);
        s44_12.setOnClickListener(this);
        s44_13.setOnClickListener(this);
        s44_14.setOnClickListener(this);

        s44_21.setOnClickListener(this);
        s44_22.setOnClickListener(this);
        s44_23.setOnClickListener(this);
        s44_24.setOnClickListener(this);

        s44_31.setOnClickListener(this);
        s44_32.setOnClickListener(this);
        s44_33.setOnClickListener(this);
        s44_34.setOnClickListener(this);

        s44_41.setOnClickListener(this);
        s44_42.setOnClickListener(this);
        s44_43.setOnClickListener(this);
        s44_44.setOnClickListener(this);

        sc44_11.setOnClickListener(this);
        sc44_21.setOnClickListener(this);
        sc44_31.setOnClickListener(this);
        sc44_41.setOnClickListener(this);

    }

//===================== "GETTERS" ==============================================================================//

    public double getImagi(int ntextviewi) {

        switch (ntextviewi) {

            case 0:
                double imagi11 = i44_11;
                return imagi11;
            case 1:
                double imagi12 = i44_12;
                return imagi12;
            case 2:
                double imagi13 = i44_13;
                return imagi13;
            case 3:
                double imagi14 = i44_14;
                return imagi14;
            case 4:
                double imagi21 = i44_21;
                return imagi21;
            case 5:
                double imagi22 = i44_22;
                return imagi22;
            case 6:
                double imagi23 = i44_23;
                return imagi23;
            case 7:
                double imagi24 = i44_24;
                return imagi24;


            case 8:
                double imagi31 = i44_31;
                return imagi31;
            case 9:
                double imagi32 = i44_32;
                return imagi32;
            case 10:
                double imagi33 = i44_33;
                return imagi33;
            case 11:
                double imagi34 = i44_34;
                return imagi34;


            case 12:
                double imagi41 = i44_41;
                return imagi41;
            case 13:
                double imagi42 = i44_42;
                return imagi42;
            case 14:
                double imagi43 = i44_43;
                return imagi43;
            case 15:
                double imagi44 = i44_44;
                return imagi44;

            case 16:
                double imagib11 = ic44_11;
                return imagib11;
            case 17:
                double imagib21 = ic44_21;
                return imagib21;

            case 18:
                double imagib31 = ic44_31;
                return imagib31;

            case 19:
                double imagib41 = ic44_41;
                return imagib41;
        }

        return 0;
    }

    public double getReal(int ntextviewr) {
        switch (ntextviewr) {
            case 0:
                double real11 = r44_11;
                return real11;
            case 1:
                double real12 = r44_12;
                return real12;
            case 2:
                double real13 = r44_13;
                return real13;
            case 3:
                double real14 = r44_14;
                return real14;
            case 4:
                double real21 = r44_21;
                return real21;
            case 5:
                double real22 = r44_22;
                return real22;
            case 6:
                double real23 = r44_23;
                return real23;
            case 7:
                double real24 = r44_24;
                return real24;
            case 8:
                double real31 = r44_31;
                return real31;
            case 9:
                double real32 = r44_32;
                return real32;
            case 10:
                double real33 = r44_33;
                return real33;
            case 11:
                double real34 = r44_34;
                return real34;

            case 12:
                double real41 = r44_41;
                return real41;
            case 13:
                double real42 = r44_42;
                return real42;
            case 14:
                double real43 = r44_43;
                return real43;
            case 15:
                double real44 = r44_44;
                return real44;

            case 16:
                double realb11 = rc44_11;
                return realb11;
            case 17:
                double realb21 = rc44_21;
                return realb21;

            case 18:
                double realb31 = rc44_31;
                return realb31;
            case 19:
                double realb41 = rc44_41;
                return realb41;


        }
        return 0;

    }

//===================== "SET'S" ==============================================================================//

    public void updateMessage(int idSegmn,double real,double imagi) {
        switch (idSegmn) {
            case 0:
                this.r44_11= real;
                this.i44_11 = imagi;
                asignarValor(r44_11,s44_11,i44_11);
                break;
            case 1:
                this.r44_12= real;
                this.i44_12 = imagi;
                asignarValor(r44_12,s44_12,i44_12);
                break;
            case 2:
                this.r44_13= real;
                this.i44_13 = imagi;
                asignarValor(r44_13,s44_13,i44_13);
                break;
            case 3:
                this.r44_14= real;
                this.i44_14 = imagi;
                asignarValor(r44_14,s44_14,i44_14);
                break;


            case 4:
                this.r44_21= real;
                this.i44_21 = imagi;
                asignarValor(r44_11,s44_21,i44_21);
                break;
            case 5:
                this.r44_22= real;
                this.i44_22 = imagi;
                asignarValor(r44_22,s44_22,i44_22);
                break;
            case 6:
                this.r44_23= real;
                this.i44_23 = imagi;
                asignarValor(r44_23,s44_23,i44_23);
                break;
            case 7:
                this.r44_24= real;
                this.i44_24 = imagi;
                asignarValor(r44_24,s44_24,i44_24);
                break;


            case 8:
                this.r44_31= real;
                this.i44_31 = imagi;
                asignarValor(r44_31,s44_31,i44_31);
                break;
            case 9:
                this.r44_32= real;
                this.i44_32 = imagi;
                asignarValor(r44_32,s44_32,i44_32);
                break;

            case 10:
                this.r44_33= real;
                this.i44_33 = imagi;
                asignarValor(r44_33,s44_33,i44_33);
                break;
            case 11:
                this.r44_34= real;
                this.i44_34 = imagi;
                asignarValor(r44_34,s44_34,i44_34);
                break;

            case 12:
                this.r44_41= real;
                this.i44_41 = imagi;
                asignarValor(r44_41,s44_41,i44_41);
                break;
            case 13:
                this.r44_42= real;
                this.i44_42 = imagi;
                asignarValor(r44_42,s44_42,i44_42);
                break;
            case 14:
                this.r44_43= real;
                this.i44_43 = imagi;
                asignarValor(r44_43,s44_43,i44_43);
                break;
            case 15:
                this.r44_44= real;
                this.i44_44 = imagi;
                asignarValor(r44_44,s44_44,i44_44);
                break;


            case 16:
                this.rc44_11 = real;
                this.ic44_11 = imagi;
                asignarValor(rc44_11,sc44_11,ic44_11);
                break;

            case 17:
                this.rc44_21 = real;
                this.ic44_21 = imagi;
                asignarValor(rc44_21,sc44_21,ic44_21);
                break;

            case 18:
                this.rc44_31 = real;
                this.ic44_31 = imagi;
                asignarValor(rc44_31,sc44_31,ic44_31);
                break;


            case 19:
                this.rc44_41 = real;
                this.ic44_41 = imagi;
                asignarValor(rc44_41,sc44_41,ic44_41);
                break;




            //rc22_11  =+   convertirToInteger(message);
            //rc22_11 = rc22_11 + convertirToInteger(message); }

        }
    }

    public void updateExpressPolar() {

        calculaPolarExpress(r44_11,i44_11,s44_11);
        calculaPolarExpress(r44_12,i44_12,s44_12);
        calculaPolarExpress(r44_13,i44_13,s44_13);
        calculaPolarExpress(r44_14,i44_14,s44_14);


        calculaPolarExpress(r44_21,i44_21,s44_21);
        calculaPolarExpress(r44_22,i44_22,s44_22);
        calculaPolarExpress(r44_23,i44_23,s44_23);
        calculaPolarExpress(r44_24,i44_24,s44_24);

        calculaPolarExpress(r44_31,i44_31,s44_31);
        calculaPolarExpress(r44_32,i44_32,s44_32);
        calculaPolarExpress(r44_33,i44_33,s44_33);
        calculaPolarExpress(r44_34,i44_34,s44_34);

        calculaPolarExpress(r44_41,i44_41,s44_41);
        calculaPolarExpress(r44_42,i44_42,s44_42);
        calculaPolarExpress(r44_43,i44_43,s44_43);
        calculaPolarExpress(r44_44,i44_44,s44_44);

        calculaPolarExpress(rc44_11,ic44_11,sc44_11);
        calculaPolarExpress(rc44_21,ic44_21,sc44_21);
        calculaPolarExpress(rc44_31,ic44_31,sc44_31);
        calculaPolarExpress(rc44_41,ic44_41,sc44_41);

    }

    public void updateExpressRectangular(){
        asignarValor(r44_11,s44_11,i44_11);
        asignarValor(r44_12,s44_12,i44_12);
        asignarValor(r44_13,s44_13,i44_13);
        asignarValor(r44_14,s44_14,i44_14);

        asignarValor(r44_21,s44_21,i44_21);
        asignarValor(r44_22,s44_22,i44_22);
        asignarValor(r44_23,s44_23,i44_23);
        asignarValor(r44_24,s44_24,i44_24);

        asignarValor(r44_31,s44_31,i44_31);
        asignarValor(r44_32,s44_32,i44_32);
        asignarValor(r44_33,s44_33,i44_33);
        asignarValor(r44_34,s44_34,i44_34);

        asignarValor(r44_41,s44_41,i44_41);
        asignarValor(r44_42,s44_42,i44_42);
        asignarValor(r44_43,s44_43,i44_43);
        asignarValor(r44_44,s44_44,i44_44);

        asignarValor(rc44_11,sc44_11,ic44_11);
        asignarValor(rc44_21,sc44_21,ic44_21);
        asignarValor(rc44_31,sc44_31,ic44_31);
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

//===================== "EVENTOS" ==============================================================================//

    public void dialogoPersonalizado(int identiSegmn,String title){
        DialogoFragment dialogoPersonalizado = new DialogoFragment();
        dialogoPersonalizado.setContext(2,identiSegmn,title);
        dialogoPersonalizado.show(getFragmentManager(), "personalizado");
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.s44_11:
                dialogoPersonalizado(0,"X1");
                break;
            case R.id.s44_12:
                dialogoPersonalizado(1,"Y1");
                break;
            case R.id.s44_13:
                dialogoPersonalizado(2,"Z1");
                break;
            case R.id.s44_14:
                dialogoPersonalizado(3,"W1");
                break;


            case R.id.s44_21:
                dialogoPersonalizado(4,"X2");
                break;
            case R.id.s44_22:
                dialogoPersonalizado(5,"Y2");
                break;
            case R.id.s44_23:
                dialogoPersonalizado(6,"Z2");
                break;
            case R.id.s44_24:
                dialogoPersonalizado(7,"W2");
                break;

            case R.id.s44_31:
                dialogoPersonalizado(8,"X3");
                break;
            case R.id.s44_32:
                dialogoPersonalizado(9,"Y3");
                break;
            case R.id.s44_33:
                dialogoPersonalizado(10,"Z3");
                break;
            case R.id.s44_34:
                dialogoPersonalizado(11,"W3");
                break;

            case R.id.s44_41:
                dialogoPersonalizado(12,"X4");
                break;
            case R.id.s44_42:
                dialogoPersonalizado(13,"Y4");
                break;
            case R.id.s44_43:
                dialogoPersonalizado(14,"Z4");
                break;
            case R.id.s44_44:
                dialogoPersonalizado(15,"W4");
                break;


            case R.id.sc44_11:
                dialogoPersonalizado(16,"C1");
                break;

            case R.id.sc44_21:
                dialogoPersonalizado(17,"C2");
                break;

            case R.id.sc44_31:
                dialogoPersonalizado(18,"C3");
                break;

            case R.id.sc44_41:
                dialogoPersonalizado(19,"C4");
                break;
        }


    }



}

