package fragmentos;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import nietoveinte.complix.Comunicador;
import nietoveinte.complix.R;

// 141.42136  //141.42

/**
 * Created by nietoAll on 06/02/2018.
 */

public class DialogoFragment extends DialogFragment implements View.OnClickListener {


    public TextView tvreal;
    public TextView tvimagi;
    public TextView tvvector;
    public TextView tvangulo;

    public static String segmn;
    public static int fragment;
    public static int idSegmento;

    public static int flag_foco;

    public Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    public ImageView btn_done;
    public Button btn_clear, btn_menos, btn_point;
    public Button btn_menos_imagi;
    public ImageButton btn_ret;
    public Toolbar toolbar;
    public static String titleToolbar;

    Comunicador comunicacion;

    @Override

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    // El contructor vacio es requerido para el dialogFragment
    public DialogoFragment() {
    }


    public static void setSegmn(String segmn) {
        DialogoFragment.segmn = segmn;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view = inflater.inflate(R.layout.dialogo_personalizado, container);

        toolbar = (Toolbar) view.findViewById(R.id.my_toolbar);
        toolbar.setBackground(getResources().getDrawable(R.drawable.border_toolbar));
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //regresar...
                //finish();
                //onBackPressed();
                onStop();
                //dismiss();


            }});


        comunicacion = (Comunicador) getActivity();

        btn_0 = (Button) view.findViewById(R.id.btn_0);
        btn_1 = (Button) view.findViewById(R.id.btn_1);
        btn_2 = (Button) view.findViewById(R.id.btn_2);
        btn_3 = (Button) view.findViewById(R.id.btn_3);
        btn_4 = (Button) view.findViewById(R.id.btn_4);
        btn_5 = (Button) view.findViewById(R.id.btn_5);
        btn_6 = (Button) view.findViewById(R.id.btn_6);
        btn_7 = (Button) view.findViewById(R.id.btn_7);
        btn_8 = (Button) view.findViewById(R.id.btn_8);
        btn_9 = (Button) view.findViewById(R.id.btn_9);
        btn_ret = (ImageButton) view.findViewById(R.id.btn_ret);
        btn_clear = (Button) view.findViewById(R.id.btn_clear);
        btn_point = (Button) view.findViewById(R.id.btn_point);
        btn_menos = (Button) view.findViewById(R.id.btn_menos_real);
        btn_menos_imagi = (Button) view.findViewById(R.id.btn_menos_imagi);


        tvvector = (TextView) view.findViewById(R.id.tvvector);
        tvvector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {     setFoco(2,tvvector,tvangulo,tvreal,tvimagi);
            }
        });

        tvangulo = (TextView) view.findViewById(R.id.tvangulo);
        tvangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { setFoco(3,tvangulo,tvvector,tvreal,tvimagi);
            }
        });


        tvreal = (TextView) view.findViewById(R.id.tvreal);
        tvreal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFoco(0,tvreal,tvimagi,tvvector,tvangulo);
            }
        });

        tvimagi = (TextView) view.findViewById(R.id.tvimagi);


        btn_done = (ImageView) view.findViewById(R.id.btn_done);
        btn_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chainireal = tvreal.getText().toString().trim();
                String chainimagi = tvimagi.getText().toString().trim();

                if (chainireal.toString().isEmpty() && chainimagi.equals("i")) {

                    comunicacion.setValores(fragment, idSegmento, 0, 1);
                    dismiss();

                } else if (chainireal.toString().isEmpty() && chainimagi.equals("-i")) {

                    comunicacion.setValores(fragment, idSegmento, 0, -1);
                    dismiss();
                } else if (chainireal.toString().isEmpty() && chainimagi.length() > 0) {
                    chainimagi = chainimagi.substring(0, chainimagi.length() - 1);
                    double imagi = convierteDouble(chainimagi);
                    comunicacion.setValores(fragment, idSegmento, 0, imagi);
                    dismiss();
                } else if (chainimagi.equals("+i")) {
                    double real = convierteDouble(chainireal);
                    comunicacion.setValores(fragment, idSegmento, real, 1);
                    dismiss();

                } else if (chainimagi.equals("-i")) {
                    double real = convierteDouble(chainireal);
                    comunicacion.setValores(fragment, idSegmento, real, -1);
                    dismiss();
                } else if (chainimagi.toString().isEmpty()) {
                    double real = convierteDouble(chainireal);
                    comunicacion.setValores(fragment, idSegmento, real, 0);
                    dismiss();
                } else if (chainimagi.length() > 0) {

                    if (chainimagi.substring(0, 1).equals("+")) {

                        chainimagi = chainimagi.substring(1, chainimagi.length() - 1);
                        double imagi = convierteDouble(chainimagi);
                        double real = convierteDouble(chainireal);
                        comunicacion.setValores(fragment, idSegmento, real, imagi);
                        dismiss();

                    } else if (chainimagi.substring(0, 1).equals("-")) {

                        chainimagi = chainimagi.substring(0, chainimagi.length() - 1);
                        double imagi = convierteDouble(chainimagi);
                        double real = convierteDouble(chainireal);
                        comunicacion.setValores(fragment, idSegmento, real, imagi);
                        dismiss();

                    }


                }


            }
        });


        btn_1.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        //btn_menos.setOnClickListener(this);
        btn_ret.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_point.setOnClickListener(this);


        btn_menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag_foco==1){flag_foco=0;}

                switch (flag_foco){
                    case 0:

                    setFoco(0,tvreal,tvimagi,tvvector,tvangulo);

                    String menus = tvimagi.getText().toString().trim();

                if (tvreal.getText().toString().isEmpty()) {
                    if (menus.substring(0, 1) == "-") {
                        tvreal.setText("0");
                        getValoresRectangulares();
                    }else if(menus.substring(0, 1) == "0-9"){
                        tvreal.setText("0");
                        tvimagi.setText("+"+menus);
                        getValoresRectangulares();
                    }
                } /*else if (tvreal.getText().toString().isEmpty()&&tvimagi.getText().toString().trim() != "0i") {
                        tvreal.setText("0");
                    getValoresRectangulares();
                        dismiss();

                }*/ else if (tvreal.getText().toString().trim().equals("0")) {
                    tvreal.setText("-0");
                    getValoresRectangulares();
                } else if (tvreal.getText().equals("-0")) {
                    tvreal.setText("0");
                    getValoresRectangulares();
                } else if (tvreal.getText().toString().trim() != "0") {

                    double temp = convierteDouble(tvreal.getText().toString());
                    temp = temp * (-1);
                    tvreal.setText(convertirToString(temp));
                    getValoresRectangulares();
                }
              break;

                    case 2:

                        setFoco(2,tvvector,tvangulo,tvreal,tvimagi);
                        double temp = convierteDouble(tvvector.getText().toString());
                        temp = temp * (-1);
                        tvvector.setText(convertirToString(temp));

                    break;

                    case 3:

                        setFoco(3,tvangulo,tvvector,tvreal,tvimagi);

                        double temp2 = convierteDouble(tvangulo.getText().toString().substring(0,tvangulo.getText().toString().length()-1));
                        temp = temp2 * (-1);

                        if (tvangulo.getText().toString().trim().equals("0°")) {
                            tvangulo.setText("-0°");
                        } else

                        if (tvangulo.getText().equals("-0°")) {
                            tvangulo.setText("0°");
                        }
                        else
                        {
                        tvangulo.setText(convertirToString(temp)+"°");
                        }

                        break;



            }
            }
        });


        btn_menos_imagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               flag_foco = 1;
               setFoco(1,tvimagi,tvreal,tvvector,tvangulo);

                if (tvreal.getText().toString().equals("0") && tvimagi.getText().toString().isEmpty()) {
                    tvimagi.setText("i");
                    tvreal.setText("");

                } else if (tvimagi.getText().equals("i") || tvimagi.getText().equals("+i")) {
                    tvimagi.setText("-i");

                } else if (tvimagi.getText().equals("-i") && tvreal.getText().toString().isEmpty()) {
                    tvimagi.setText("i");

                } else if (tvimagi.getText().equals("-i")) {
                    tvimagi.setText("+i");

                } else if (tvreal.getText().toString() != "" && tvimagi.getText().equals("")) {
                    tvimagi.setText("+i");

                } else if (tvreal.getText().toString().isEmpty() && tvimagi.getText().toString().length() >= 3) {

                    String chain = tvimagi.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    double tempmenus = convierteDouble(chain);
                    tempmenus = tempmenus * (-1);
                    tvimagi.setText(convertirToString(tempmenus) + "i");

                } else if (tvreal.getText().toString() != "" && tvimagi.getText().toString().length() >= 3) {

                    String chain = tvimagi.getText().toString();
                    String ini = chain.substring(0, 1);

                    if (ini.equals("+")) {

                        chain = chain.substring(1, chain.length() - 1);
                        double tempmenus = convierteDouble(chain);
                        tempmenus = tempmenus * (-1);
                        tvimagi.setText(convertirToString(tempmenus) + "i");



                    } else if (ini.equals("-")) {

                        chain = chain.substring(0, chain.length() - 1);
                        double tempmenus = convierteDouble(chain);
                        tempmenus = tempmenus * (-1);
                        tvimagi.setText("+" + convertirToString(tempmenus) + "i");


                    }
                }

                getValoresRectangulares();

        }});




    tvimagi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            setFoco(1,tvimagi,tvreal,tvvector,tvangulo);
            if (tvimagi.getText().equals(""))
            {
                tvimagi.setText("+i");
            } else if (tvreal.getText().toString().equals("0") && tvimagi.getText().toString().isEmpty()) {
                tvimagi.setText("i");
                tvreal.setText("");

            }

            getValoresRectangulares();
        }


    });

        getea();
        setTitle(toolbar);

        return view;


    }


//===================== "GETEOS" ==============================================================================--//

    public void getValoresPolares() {

        String vectorExpress = tvvector.getText().toString().trim();
        String anguloExpress = tvangulo.getText().toString().trim();

        if (anguloExpress.equals("0°") || anguloExpress.equals("-0°")){
            tvreal.setText(vectorExpress);
            tvimagi.setText("");
        } else

        if (vectorExpress.equals("0") || vectorExpress.equals("-0")){
            tvreal.setText("0");
            tvimagi.setText("");
        } else {

            String menusangulo = anguloExpress.substring(0, anguloExpress.length() - 1);
            calculaRectangularExpress(convierteDouble(vectorExpress), convierteDouble(menusangulo));
        }

    }

    public void getValoresRectangulares() {

        String realExpress = tvreal.getText().toString().trim();
        String imagiExpress = tvimagi.getText().toString().trim();

        if (realExpress.toString().isEmpty() && imagiExpress.equals("i")) {
            calculaPolarExpress(0, 1);

        }else if (realExpress.toString().isEmpty() && imagiExpress.equals("+i")) {
            calculaPolarExpress(0, 1);

        } else if (realExpress.toString().isEmpty() && imagiExpress.equals("-i")) {
            calculaPolarExpress(0, -1);

        } else if (realExpress.toString().isEmpty() && imagiExpress.length() > 0) {
            imagiExpress = imagiExpress.substring(0, imagiExpress.length() - 1);
            double imagi = convierteDouble(imagiExpress);
            calculaPolarExpress(0, imagi);

        } else if (imagiExpress.equals("+i")) {
            double real = convierteDouble(realExpress);
            calculaPolarExpress(real, 1);

        } else if (imagiExpress.equals("-i")) {
            double real = convierteDouble(realExpress);
            calculaPolarExpress(real, -1);

        } else if (imagiExpress.toString().isEmpty()) {
            double real = convierteDouble(realExpress);
            calculaPolarExpress(real, 0);

        } else if (imagiExpress.length() > 0) {

            if (imagiExpress.substring(0, 1).equals("+")) {
                imagiExpress = imagiExpress.substring(1, imagiExpress.length() - 1);
                double imagi = convierteDouble(imagiExpress);
                double real = convierteDouble(realExpress);
                calculaPolarExpress(real, imagi);

            } else if (imagiExpress.substring(0, 1).equals("-")) {

                imagiExpress = imagiExpress.substring(0, imagiExpress.length() - 1);
                double imagi = convierteDouble(imagiExpress);
                double real = convierteDouble(realExpress);
                calculaPolarExpress(real, imagi);

            }
        }


    }

    public void getea() {

        double valorImagi = comunicacion.getValorImagi(fragment, idSegmento);
        double valorReal = comunicacion.getValorReal(fragment, idSegmento);
        //inteligencia multiples;

        tvreal.setText(convertirToString(valorReal));
        if (valorImagi == 0) {
            tvimagi.setText("");
            setFoco(0,tvreal,tvimagi,tvvector,tvangulo);
        } else {
            if (valorImagi > 0) {
                tvimagi.setText("+" + convertirToString(valorImagi) + "i");
                setFoco(1,tvimagi,tvreal,tvvector,tvangulo);
            }
            if (valorImagi < 0) {
                tvimagi.setText(convertirToString(valorImagi) + "i");
                setFoco(1,tvimagi,tvreal,tvvector,tvangulo);
            }
        }

        getValoresRectangulares();

    }

//===================== CALCULOS ==============================================================================--//

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

    public double convierteARectangularReal(double vectorF,double anguloF){
        double realF = vectorF*Math.cos(Math.toRadians(anguloF));
        return realF;
    }

    public double convierteARectangularImagi(double vectorF,double anguloF){
        double imagiF = vectorF*Math.sin(Math.toRadians(anguloF));
        return imagiF;
    }

    public void calculaRectangularExpress(double vector, double angulo) {
        double real = convierteARectangularReal(vector,angulo);
        double imagi = convierteARectangularImagi(vector,angulo);
        if(imagi>0){
            tvreal.setText(convertirToString(real));
            tvimagi.setText("+"+convertirToString(imagi)+"i");}
        else
        if(imagi<0){
            tvreal.setText(convertirToString(real));
            tvimagi.setText(convertirToString(imagi)+"i");}
    }

    public void calculaPolarExpress(double real, double imagi) {

        if(real==0 && imagi ==0){
            tvvector.setText("0");
            tvangulo.setText("0°");
        } else {

            double v_z = convierteApolarVector(real, imagi);
            double ang_z = convierteApolarAngulo(real, imagi);
            tvvector.setText(convertirToString(v_z));
            tvangulo.setText(convertirToString(ang_z) + "°");
        }

    }

    public static double fijarNumero(double numero, int digitos) {
        double resultado;
        resultado = numero * Math.pow(10, digitos);
        resultado = Math.round(resultado);
        resultado = resultado / Math.pow(10, digitos);
        return resultado;
    }

    public double convierteDouble(String variable) {
        double variableDouble = Double.parseDouble(variable);
        return variableDouble;
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

    public int entero(double x) {
        if (x % 1 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

//===================== SET ==============================================================================//

    public void setRV(int id, TextView textView) {

        switch (id) {

            case R.id.btn_0:
                if (textView.getText().equals("0")) {
                    textView.setText("0");
                } else if (textView.getText().equals("-0")) {
                    textView.setText("-0");
                } else {
                    textView.append("0");
                }
                break;

            case R.id.btn_1:
                if (textView.getText().equals("0")) {
                    textView.setText("1");
                } else if (textView.getText().equals("-0")) {
                    textView.setText("-1");
                } else {
                    textView.append("1");
                }
                break;

            case R.id.btn_2:
                if (textView.getText().equals("0")) {
                    textView.setText("2");
                } else if (textView.getText().equals("-0")) {
                    textView.setText("-2");
                } else {
                    textView.append("2");
                }
                break;

            case R.id.btn_3:
                if (textView.getText().equals("0")) {
                    textView.setText("3");
                } else if (textView.getText().equals("-0")) {
                    textView.setText("-3");
                } else {
                    textView.append("3");
                }
                break;

            case R.id.btn_4:
                if (textView.getText().equals("0")) {
                    textView.setText("4");
                } else if (textView.getText().equals("-0")) {
                    textView.setText("-4");
                } else {
                    textView.append("4");
                }
                break;

            case R.id.btn_5:
                if (textView.getText().equals("0")) {
                    textView.setText("5");
                } else if (textView.getText().equals("-0")) {
                    textView.setText("-5");
                } else {
                    textView.append("5");
                }
                break;


            case R.id.btn_6:
                if (textView.getText().equals("0")) {
                    textView.setText("6");
                } else if (textView.getText().equals("-0")) {
                    textView.setText("-6");
                } else {
                    textView.append("6");
                }
                break;

            case R.id.btn_7:
                if (textView.getText().equals("0")) {
                    textView.setText("7");
                } else if (textView.getText().equals("-0")) {
                    textView.setText("-7");
                } else {
                    textView.append("7");
                }
                break;


            case R.id.btn_8:
                if (textView.getText().equals("0")) {
                    textView.setText("8");
                } else if (textView.getText().equals("-0")) {
                    textView.setText("-8");
                } else {
                    textView.append("8");
                }
                break;

            case R.id.btn_9:
                if (textView.getText().equals("0")) {
                    textView.setText("9");
                } else if (textView.getText().equals("-0")) {
                    textView.setText("-9");
                } else {
                    textView.append("9");
                }
                break;
            case R.id.btn_point:
                if (textView.getText().equals("0"))
                    textView.setText("0.");

                if (textView.getText().equals("-0")) {
                    textView.setText("-0.");
                } else
                    //indexOf es un valor de la clase stream
                    if (String.valueOf(textView.getText()).indexOf(".") <= 0) {
                        textView.append(".");
                    }
                break;


            case R.id.btn_clear:
                textView.setText("0");
                break;

            case R.id.btn_ret:
                String chain = textView.getText().toString();
                if (chain.length() > 1) {
                    chain = chain.substring(0, chain.length() - 1);
                    if (chain.equals("-")) {
                        textView.setText("0");
                    } else {
                        textView.setText(chain);
                    }
                } else if (chain.length() <= 1) {
                    textView.setText("0");
                }
                break;
        }
    }

    public void setAngulo(int id, TextView textView) {

        switch (id) {

            case R.id.btn_0:
                if (textView.getText().equals("0°")) {
                    textView.setText("0°");
                    getValoresPolares();
                } else if (textView.getText().equals("-0°")) {
                    textView.setText("-0°");
                    getValoresPolares();
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "0" + "°");
                    getValoresPolares();
                }
                break;

            case R.id.btn_1:
                if (textView.getText().equals("0°")) {
                    textView.setText("1°");
                    getValoresPolares();
                } else if (textView.getText().equals("-0°")) {
                    textView.setText("-1°");
                    getValoresPolares();
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "1" + "°");
                    getValoresPolares();
                }
                break;

            case R.id.btn_2:
                if (textView.getText().equals("0°")) {
                    textView.setText("2°");
                    getValoresPolares();
                } else if (textView.getText().equals("-0°")) {
                    textView.setText("-2°");
                    getValoresPolares();
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "2" + "°");
                    getValoresPolares();
                }
                break;

            case R.id.btn_3:
                if (textView.getText().equals("0°")) {
                    textView.setText("3°");
                    getValoresPolares();
                } else if (textView.getText().equals("-0°")) {
                    textView.setText("-3°");
                    getValoresPolares();
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "3" + "°");
                    getValoresPolares();
                }
                break;

            case R.id.btn_4:
                if (textView.getText().equals("0°")) {
                    textView.setText("4°");
                    getValoresPolares();
                } else if (textView.getText().equals("-0°")) {
                    textView.setText("-4°");
                    getValoresPolares();
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "4" + "°");
                    getValoresPolares();
                }
                break;

            case R.id.btn_5:
                if (textView.getText().equals("0°")) {
                    textView.setText("5°");
                    getValoresPolares();
                } else if (textView.getText().equals("-0°")) {
                    textView.setText("-5°");
                    getValoresPolares();
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "5" + "°");
                    getValoresPolares();
                }
                break;


            case R.id.btn_6:
                if (textView.getText().equals("0°")) {
                    textView.setText("6°");
                    getValoresPolares();
                } else if (textView.getText().equals("-0°")) {
                    textView.setText("-6°");
                    getValoresPolares();
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "6" + "°");
                    getValoresPolares();
                }
                break;

            case R.id.btn_7:
                if (textView.getText().equals("0°")) {
                    textView.setText("7°");
                    getValoresPolares();
                } else if (textView.getText().equals("-0°")) {
                    textView.setText("-7°");
                    getValoresPolares();
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "7" + "°");
                    getValoresPolares();
                }
                break;


            case R.id.btn_8:
                if (textView.getText().equals("0°")) {
                    textView.setText("8°");
                    getValoresPolares();
                } else if (textView.getText().equals("-0°")) {
                    textView.setText("-8°");
                    getValoresPolares();
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "8" + "°");
                    getValoresPolares();
                }
                break;

            case R.id.btn_9:
                if (textView.getText().equals("0°")) {
                    textView.setText("9°");
                    getValoresPolares();
                } else if (textView.getText().equals("-0°")) {
                    textView.setText("-9°");
                    getValoresPolares();
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "9°");
                    getValoresPolares();
                }
                break;


            case R.id.btn_point:
                if (textView.getText().equals("0"))
                    textView.setText("0.");
                getValoresPolares();

                if (textView.getText().equals("-0")) {
                    textView.setText("-0.");
                    getValoresPolares();
                } else
                    //indexOf es un valor de la clase stream
                    if (String.valueOf(textView.getText()).indexOf(".") <= 0) {

                        String chain = textView.getText().toString();
                        chain = chain.substring(0, chain.length() - 1);
                        textView.setText(chain + "." + "°");
                        getValoresPolares();
                    }
                break;


            case R.id.btn_clear:
                textView.setText("0°");
                getValoresPolares();
                break;

            case R.id.btn_ret:

                String chain = textView.getText().toString();

                if (chain.length() >3) {
                            chain = chain.substring(0, chain.length() - 2);
                            if (chain.equals("-")) {
                                textView.setText("0°");
                                getValoresPolares();
                            } else {
                                textView.setText(chain+"°");
                                getValoresPolares();
                            }
                        } else


                if (chain.length() == 2) {
                         textView.setText("0°");
                         getValoresPolares();
                    } else


                if (chain.length() == 3) {

                        if(chain.substring(0,chain.length()-2).equals("-")){
                            textView.setText("0°");
                            getValoresPolares();
                        }
                        else {

                            chain = chain.substring(0, chain.length() - 2);
                            textView.setText(chain+"°");
                            getValoresPolares();
                        }


                  }






                break;
        }
    }

    public void setImagi(int id, TextView textView) {

        switch (id) {


            case R.id.btn_0:
                if (textView.getText().equals("+0i")) {
                    textView.setText("+0i");
                } else if (textView.getText().equals("-0i")) {
                    textView.setText("-0i");
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "0" + "i");
                }
                break;

            case R.id.btn_1:


                if (textView.getText().equals("+0i")) {
                    textView.setText("+1i");
                } else if (textView.getText().equals("-0i")) {
                    textView.setText("-1i");
                } else {

                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "1" + "i");
                }
                break;

            case R.id.btn_2:

                if (textView.getText().equals("+0i")) {
                    textView.setText("+2i");
                } else if (textView.getText().equals("-0i")) {
                    textView.setText("-2i");
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "2" + "i");
                }
                break;

            case R.id.btn_3:
                if (textView.getText().equals("+0i")) {
                    textView.setText("+3i");
                } else if (textView.getText().equals("-0i")) {
                    textView.setText("-3i");
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "3" + "i");
                }
                break;

            case R.id.btn_4:
                if (textView.getText().equals("+0i")) {
                    textView.setText("+4i");
                } else if (textView.getText().equals("-0i")) {
                    textView.setText("-4i");
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "4" + "i");
                }
                break;

            case R.id.btn_5:
                if (textView.getText().equals("+0i")) {
                    textView.setText("+5i");
                } else if (textView.getText().equals("-0i")) {
                    textView.setText("-5i");
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "5" + "i");
                }
                break;

            case R.id.btn_6:

                if (textView.getText().equals("+0i")) {
                    textView.setText("+6i");
                } else if (textView.getText().equals("-0i")) {
                    textView.setText("-6i");
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "6" + "i");
                }
                break;

            case R.id.btn_7:

                if (textView.getText().equals("+0i")) {
                    textView.setText("+7i");
                } else if (textView.getText().equals("-0i")) {
                    textView.setText("-7i");
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "7" + "i");
                }
                break;


            case R.id.btn_8:
                if (textView.getText().equals("+0i")) {
                    textView.setText("+8i");
                } else if (textView.getText().equals("-0i")) {
                    textView.setText("-8i");
                }
                if (textView.getText().equals("0i")) {
                    textView.setText("8i");
                } else {

                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "8" + "i");
                }

                break;

            case R.id.btn_9:

                if (textView.getText().equals("+0i")) {
                    textView.setText("+9i");
                } else if (textView.getText().equals("-0i")) {
                    textView.setText("-9i");
                } else {
                    String chain = textView.getText().toString();
                    chain = chain.substring(0, chain.length() - 1);
                    textView.setText(chain + "9" + "i");
                }
                break;

            case R.id.btn_point:

                if (textView.getText().equals("+i")) {
                    textView.setText("+i");

                }else if (textView.getText().equals("-i")) {
                    textView.setText("-i");
                }else if (textView.getText().equals("+0i")) {
                    textView.setText("+0.i");
                }
                else if (textView.getText().equals("-0i")) {
                    textView.setText("-0.i");
                } else {

                    //indexOf es un valor de la clase stream
                    if (String.valueOf(textView.getText()).indexOf(".") <= 0) {
                        String chain = textView.getText().toString();
                        chain = chain.substring(0, chain.length() - 1);
                        //textView.setText(chain+"5"+"i");
                        textView.setText(chain + "." + "i");
                    }
                }
                break;

            case R.id.btn_clear:
                textView.setText("");
                setFoco(0,tvreal,tvimagi,tvvector,tvangulo);
                break;

            case R.id.btn_ret:
                String ret = textView.getText().toString();
                if(ret.equals("i")){
                    textView.setText("");
                    setFoco(0,tvreal,tvimagi,tvvector,tvangulo);
                }else

                if (ret.length() > 2) {
                    ret = ret.substring(0, ret.length() - 2);
                    if (ret.equals("-i") || ret.equals("+i")) {
                        textView.setText("");
                        setFoco(0,tvreal,tvimagi,tvvector,tvangulo);
                    } else {
                        textView.setText(ret + "i");
                    }
                } else if (ret.length() == 2) {
                    textView.setText("");
                    setFoco(0,tvreal,tvimagi,tvvector,tvangulo);
                }
                break;
        }
    }

    public void setFoco(int foco,TextView tvfoco, TextView tvuplano, TextView tvsplano_1, TextView tvsplano_2){

        flag_foco = foco;
        tvfoco.setBackgroundColor(tvfoco.getContext().getResources().getColor(R.color.colorFoco));
        tvuplano.setBackgroundColor(tvuplano.getContext().getResources().getColor(R.color.colorBlanco));
        tvsplano_1.setBackgroundColor(tvsplano_1.getContext().getResources().getColor(R.color.colorBlanco));
        tvsplano_2.setBackgroundColor(tvsplano_2.getContext().getResources().getColor(R.color.colorBlanco));

        if (foco == 2 || foco == 3)
        {
            tvfoco.setTextColor(tvfoco.getContext().getResources().getColor(R.color.colorLetraRFR));
            tvuplano.setTextColor(tvsplano_2.getContext().getResources().getColor(R.color.colorLetraRFR));
            tvsplano_1.setTextColor(tvsplano_1.getContext().getResources().getColor(R.color.colorLetraRFR_M));
            tvsplano_2.setTextColor(tvsplano_2.getContext().getResources().getColor(R.color.colorLetraRFR_M));

        } else if(foco == 0 || foco == 1) {


            if(foco==0) {
                if (tvreal.getText().toString().isEmpty()) {
                    tvreal.setText("0");
                    getValoresRectangulares();
                }
                if (tvimagi.getText().toString().trim().equals("i")) {
                    tvimagi.setText("+i");
                    getValoresRectangulares();
                }
            }
            tvreal.setTextColor(tvsplano_1.getContext().getResources().getColor(R.color.colorLetraRFR));
            tvimagi.setTextColor(tvsplano_2.getContext().getResources().getColor(R.color.colorLetraiFR));
            tvuplano.setBackgroundColor(tvsplano_2.getContext().getResources().getColor(R.color.colorBlanco));
            tvsplano_1.setTextColor(tvsplano_1.getContext().getResources().getColor(R.color.colorLetraRFR_M));
            tvsplano_2.setTextColor(tvsplano_2.getContext().getResources().getColor(R.color.colorLetraRFR_M));
        }



    }
    
    public static void setContext(int fragmento, int idSegmn,String title) {

        fragment = fragmento;
        idSegmento = idSegmn;
        titleToolbar=title;

    }

    public void setTitle(Toolbar toolbar){

        toolbar.setTitle(titleToolbar);


    }


//===================== SET ==============================================================================//

    @Override
    public void onClick(View v) {

        switch (flag_foco) {

            case 0:
                setRV(v.getId(), tvreal);
                getValoresRectangulares();
                break;
            case 1:
                setImagi(v.getId(), tvimagi);
                getValoresRectangulares();
                break;
            case 2:
                setRV(v.getId(), tvvector);
                getValoresPolares();
                break;
            case 3:
                setAngulo(v.getId(),tvangulo);
                getValoresPolares();
                break;


        }
    }

}