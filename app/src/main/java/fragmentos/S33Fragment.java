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


public class S33Fragment extends Fragment implements  View.OnClickListener{



    private static double r33_11=0;
    private static double i33_11=0;
    private static double r33_12=0;
    private static double i33_12=0;
    private static double r33_13=0;
    private static double i33_13=0;

    private static double r33_21=0;
    private static double i33_21=0;
    private static double r33_22=0;
    private static double i33_22=0;
    private static double r33_23=0;
    private static double i33_23=0;


    private static double r33_31=0;
    private static double i33_31=0;
    private static double r33_32=0;
    private static double i33_32=0;
    private static double r33_33=0;
    private static double i33_33=0;


    private static double rb33_11=0;
    private static double ib33_11=0;
    private static double rb33_21=0;
    private static double ib33_21=0;
    private static double rb33_31=0;
    private static double ib33_31=0;


    private TextView a33_11;
    private TextView a33_12;
    private TextView a33_13;

    private TextView a33_21;
    private TextView a33_22;
    private TextView a33_23;

    private TextView a33_31;
    private TextView a33_32;
    private TextView a33_33;

    private TextView b33_11;
    private TextView b33_21;
    private TextView b33_31;



    public S33Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.s33_layout, container, false);
        instancias(view);
        events();
        return view;
    }

//===================== INSTANCIAS Y EVENTOS ==============================================================================//

    public void instancias(View view){

        a33_11 = (TextView) view.findViewById(R.id.a33_11);
        setInstancia(r33_11,a33_11,i33_11);


        a33_12 = (TextView) view.findViewById(R.id.a33_12);
        setInstancia(r33_12,a33_12,i33_12);


        a33_13 = (TextView) view.findViewById(R.id.a33_13);
        setInstancia(r33_13,a33_13,i33_13);


        a33_21 = (TextView) view.findViewById(R.id.a33_21);
        setInstancia(r33_21,a33_21,i33_21);


        a33_22 = (TextView) view.findViewById(R.id.a33_22);
        setInstancia(r33_22,a33_22,i33_22);


        a33_23 = (TextView) view.findViewById(R.id.a33_23);
        setInstancia(r33_11,a33_11,i33_11);


        a33_31 = (TextView) view.findViewById(R.id.a33_31);
        setInstancia(r33_31,a33_31,i33_31);


        a33_32 = (TextView) view.findViewById(R.id.a33_32);
        setInstancia(r33_32,a33_32,i33_32);


        a33_33 = (TextView) view.findViewById(R.id.a33_33);
        setInstancia(r33_33,a33_33,i33_33);



        b33_11 = (TextView) view.findViewById(R.id.b33_11);
        setInstancia(rb33_11,b33_11,ib33_11);


        b33_21 = (TextView) view.findViewById(R.id.b33_21);
        setInstancia(rb33_21,b33_21,ib33_21);


        b33_31 = (TextView) view.findViewById(R.id.b33_31);
        setInstancia(rb33_31,b33_31,ib33_31);

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

        a33_11.setOnClickListener(this);
        a33_12.setOnClickListener(this);
        a33_13.setOnClickListener(this);

        a33_21.setOnClickListener(this);
        a33_22.setOnClickListener(this);
        a33_23.setOnClickListener(this);

        a33_31.setOnClickListener(this);
        a33_32.setOnClickListener(this);
        a33_33.setOnClickListener(this);


        b33_11.setOnClickListener(this);
        b33_21.setOnClickListener(this);
        b33_31.setOnClickListener(this);

    }


//===================== "GETTERS" ==============================================================================//

    public double getReal(int ntextviewr) {

        switch (ntextviewr) {

            case 0:
                double real11 = r33_11;
                return real11;
            case 1:
                double real12 = r33_12;
                return real12;
            case 2:
                double real13 = r33_13;
                return real13;
            case 3:
                double real21 = r33_21;
                return real21;

            case 4:
                double real22 = r33_22;
                return real22;

            case 5:
                double real23 = r33_23;
                return real23;

            case 6:
                double real31 = r33_31;
                return real31;
            case 7:
                double real32 = r33_32;
                return real32;

            case 8:
                double real33 = r33_33;
                return real33;


            case 9:
                double realb11 = rb33_11;
                return realb11;


            case 10:
                double realb21 = rb33_21;
                return realb21;


            case 11:
                double realb31 = rb33_31;
                return realb31;
        }
        return 0;
    }

     //rc22_11  =+   convertirToInteger(message);
     //rc22_11 = rc22_11 + convertirToInteger(message); }
    //ra22_11=+convertirToInteger(message);

    public double getImagi(int ntextviewi) {

        switch (ntextviewi) {

            case 0:
                double imagi11 = i33_11;
                return imagi11;
            case 1:
                double imagi12 = i33_12;
                return imagi12;
            case 2:
                double imagi13 = i33_13;
                return imagi13;

            case 3:
                double imagi21 = i33_21;
                return imagi21;

            case 4:
                double imagi22 = i33_22;
                return imagi22;

            case 5:
                double imagi23 = i33_23;
                return imagi23;

            case 6:
                double imagi31 = i33_31;
                return imagi31;
            case 7:
                double imagi32 = i33_32;
                return imagi32;

            case 8:
                double imagi33 = i33_33;
                return imagi33;


            case 9:
                double imagib11 = ib33_11;
                return imagib11;


            case 10:
                double imagib21 = ib33_21;
                return imagib21;


            case 11:
                double imagib31 = ib33_31;
                return imagib31;
        }

        return 0;
    }

//===================== "SET'S" ==============================================================================//

    public void updateExpressPolar() {

        calculaPolarExpress(r33_11,i33_11,a33_11);
        calculaPolarExpress(r33_12,i33_12,a33_12);
        calculaPolarExpress(r33_13,i33_13,a33_13);


        calculaPolarExpress(r33_21,i33_21,a33_21);
        calculaPolarExpress(r33_22,i33_22,a33_22);
        calculaPolarExpress(r33_23,i33_23,a33_23);


        calculaPolarExpress(r33_31,i33_31,a33_31);
        calculaPolarExpress(r33_32,i33_32,a33_32);
        calculaPolarExpress(r33_33,i33_33,a33_33);

        calculaPolarExpress(rb33_11,ib33_11,b33_11);
        calculaPolarExpress(rb33_21,ib33_21,b33_21);
        calculaPolarExpress(rb33_31,ib33_31,b33_31);

    }

    public void updateExpressRectangular(){
        asignarValor(r33_11,a33_11,i33_11);
        asignarValor(r33_12,a33_12,i33_12);
        asignarValor(r33_13,a33_13,i33_13);

        asignarValor(r33_21,a33_21,i33_21);
        asignarValor(r33_22,a33_22,i33_22);
        asignarValor(r33_23,a33_23,i33_23);

        asignarValor(r33_31,a33_31,i33_31);
        asignarValor(r33_32,a33_32,i33_32);
        asignarValor(r33_33,a33_33,i33_33);

        asignarValor(rb33_11,b33_11,ib33_11);
        asignarValor(rb33_21,b33_21,ib33_21);
        asignarValor(rb33_31,b33_31,ib33_31);

    }

    public void updateMessage(int idSegmn,double real,double imagi) {
        switch (idSegmn) {

            case 0:
                this.r33_11 = real;
                this.i33_11 = imagi;
                asignarValor(r33_11,a33_11,i33_11);
                break;

            case 1:
                this.r33_12 = real;
                this.i33_12 = imagi;
                asignarValor(r33_12,a33_12,i33_12);
                break;

            case 2:
                this.r33_13 = real;
                this.i33_13 = imagi;
                asignarValor(r33_13,a33_13,i33_13);
                break;

            case 3:
                this.r33_21 = real;
                this.i33_21 = imagi;
                asignarValor(r33_21,a33_21,i33_21);
                break;

            case 4:
                this.r33_22 = real;
                this.i33_22 = imagi;
                asignarValor(r33_22,a33_22,i33_22);
                break;

            case 5:
                this.r33_23 = real;
                this.i33_23 = imagi;
                asignarValor(r33_23,a33_23,i33_23);
                break;

            case 6:
                this.r33_31 = real;
                this.i33_31 = imagi;
                asignarValor(r33_31,a33_31,i33_31);
                break;

            case 7:
                this.r33_32 = real;
                this.i33_32 = imagi;
                asignarValor(r33_32,a33_32,i33_32);
                break;

            case 8:
                this.r33_33 = real;
                this.i33_33 = imagi;
                asignarValor(r33_33,a33_33,i33_33);
                break;

            case 9:
                this.rb33_11 = real;
                this.ib33_11 = imagi;
                asignarValor(rb33_11,b33_11,ib33_11);
                break;

            case 10:
                this.rb33_21 = real;
                this.ib33_21 = imagi;
                asignarValor(rb33_21,b33_21,ib33_21);
                break;


            case 11:
                this.rb33_31 = real;
                this.ib33_31 = imagi;
                asignarValor(rb33_31,b33_31,ib33_31);
                break;

        }
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
        dialogoPersonalizado.setContext(1,identiSegmn,title);
        dialogoPersonalizado.show(getFragmentManager(), "personalizado");
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.a33_11:
                dialogoPersonalizado(0,"X1");
            break;
            case R.id.a33_12:
                dialogoPersonalizado(1,"Y1");
                break;
            case R.id.a33_13:
                dialogoPersonalizado(2,"Z1");

                break;
            case R.id.a33_21:
                dialogoPersonalizado(3,"X2");
                break;
            case R.id.a33_22:
                dialogoPersonalizado(4,"Y2");
                break;
            case R.id.a33_23:
                dialogoPersonalizado(5,"Z2");
                break;

            case R.id.a33_31:
                dialogoPersonalizado(6,"X3");
                break;
            case R.id.a33_32:
                dialogoPersonalizado(7,"Y3");
                break;
            case R.id.a33_33:
                dialogoPersonalizado(8,"Z3");
                break;

            case R.id.b33_11:
                dialogoPersonalizado(9,"C1");
                break;
            case R.id.b33_21:
                dialogoPersonalizado(10,"C2");
                break;
            case R.id.b33_31:
                dialogoPersonalizado(11,"C3");
                break;

        }
    }

}

