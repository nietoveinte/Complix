
package nietoveinte.complix;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;


import Adaptadores.ResultadoAdapter;
import fragmentos.DialogoSistemas;
import Adaptadores.SistemasAdapter;

public class MainActivity extends AppCompatActivity implements Comunicador {


    private static final String TAG = "MainActivity";
    private TextView igualview;
    private SistemasAdapter sPA;
    private ResultadoAdapter reSPA;
    private ViewPager mViewPager, mViewPager3;
    public SwitchCompat simpleSwitch;
    public ImageView deleteview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar();
        mViewPager = (ViewPager) findViewById(R.id.containermpager);
        sPA = new SistemasAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(sPA);

        mViewPager3 = (ViewPager) findViewById(R.id.containermpager3);
        reSPA = new ResultadoAdapter(getSupportFragmentManager());
        mViewPager3.setAdapter(reSPA);


        igualview = (TextView) findViewById(R.id.igualview);
        igualview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mViewPager.getCurrentItem()==0) {
                    determinanteG();
                }else

                if (mViewPager.getCurrentItem()==1) {
                    determinanteG33();
                }





            }
        });

        deleteview = (ImageView) findViewById(R.id.deleteview);
        deleteview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mViewPager.getCurrentItem()==0){
                    sPA.updateFragment(sPA.FRAG_S22,0,0,0);
                    sPA.updateFragment(sPA.FRAG_S22,1,0,0);
                    sPA.updateFragment(sPA.FRAG_S22,2,0,0);
                    sPA.updateFragment(sPA.FRAG_S22,3,0,0);
                    sPA.updateFragment(sPA.FRAG_S22,4,0,0);
                    sPA.updateFragment(sPA.FRAG_S22,5,0,0);
                    reSPA.vaciar();

                } else
                if(mViewPager.getCurrentItem()==1){
                    sPA.updateFragment(sPA.FRAG_S33,0,0,0);
                    sPA.updateFragment(sPA.FRAG_S33,1,0,0);
                    sPA.updateFragment(sPA.FRAG_S33,2,0,0);
                    sPA.updateFragment(sPA.FRAG_S33,3,0,0);
                    sPA.updateFragment(sPA.FRAG_S33,4,0,0);
                    sPA.updateFragment(sPA.FRAG_S33,5,0,0);
                    sPA.updateFragment(sPA.FRAG_S33,6,0,0);
                    sPA.updateFragment(sPA.FRAG_S33,7,0,0);
                    sPA.updateFragment(sPA.FRAG_S33,8,0,0);
                    sPA.updateFragment(sPA.FRAG_S33,9,0,0);
                    sPA.updateFragment(sPA.FRAG_S33,10,0,0);
                    sPA.updateFragment(sPA.FRAG_S33,11,0,0);
                    reSPA.vaciar();
                } else

                if(mViewPager.getCurrentItem()==2){
                    sPA.updateFragment(sPA.FRAG_S44,0,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,1,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,2,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,3,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,4,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,5,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,6,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,7,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,8,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,9,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,10,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,11,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,12,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,13,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,14,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,15,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,16,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,17,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,18,0,0);
                    sPA.updateFragment(sPA.FRAG_S44,19,0,0);
                    reSPA.vaciar();
                }

            }
        });

       // alertDialogLista();
        simpleSwitch = (SwitchCompat) findViewById(R.id.swPolar);
        simpleSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(mViewPager.getCurrentItem()==0){sPA.updateFragmentExpress(0);} else
                    if(mViewPager.getCurrentItem()==1){sPA.updateFragmentExpress(1);} else
                    if(mViewPager.getCurrentItem()==2){sPA.updateFragmentExpress(2);}

                } else {

                    if(mViewPager.getCurrentItem()==0){sPA.updateFragmentBack(0);} else
                    if(mViewPager.getCurrentItem()==1){sPA.updateFragmentBack(1);}

                }
            }
        });



    }

//================================ "GET Y SET" ========================================================

    @Override
    public double getValorReal(int fragment,int segmn) {
        switch (fragment){

            case 0:
                double real =sPA.getFragmentReal(fragment,segmn);
                return real;

            case 1:
                double real2 =sPA.getFragmentReal(fragment,segmn);
                return real2;

            case 2:
                double real3 =sPA.getFragmentReal(fragment,segmn);
                return real3;
        }
        return 0;
    }

    @Override
    public double getValorImagi(int fragment,int segmn) {

        double imagi =sPA.getFragmentImagi(fragment,segmn);
        return imagi;
    }

    @Override
    public void setValores(int fragment, int idSegment, double real, double imagi) {

        if(fragment==0) {
            sPA.updateFragment(sPA.FRAG_S22, idSegment, real, imagi);
            if(simpleSwitch.isChecked()){
                sPA.updateFragmentExpress(0);
            }
        }
        if (fragment == 1) {
            sPA.updateFragment(sPA.FRAG_S33, idSegment, real, imagi);
            if(simpleSwitch.isChecked()){
                sPA.updateFragmentExpress(1);
            }
        }

        if (fragment == 2) {
            sPA.updateFragment(sPA.FRAG_S44, idSegment, real, imagi);
            if(simpleSwitch.isChecked()){
                sPA.updateFragmentExpress(2);
            }
        }


    }

    @Override
    public void setSistema(int currentitem) {
        mViewPager.setCurrentItem(currentitem);
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



//================================ "OBLIGATORIOS POR HERENCIA" ========================================================

    @Override
    public double getValorReal(int textview) {
        return 0;
    }

    @Override
    public double getValorImagi(int textview) {
        return 0;
    }

    @Override
    public void setValor(int textview, double real, double imagi) {

    }




    //================================ "DETERMINANTES GENERALES" ========================================================

    public void determinanteG(){


        double r11 = sPA.getFragmentReal(sPA.FRAG_S22, 0);
        double i11 = sPA.getFragmentImagi(sPA.FRAG_S22, 0);
        double r12 = sPA.getFragmentReal(sPA.FRAG_S22, 1);
        double i12 = sPA.getFragmentImagi(sPA.FRAG_S22, 1);
        double r21 = sPA.getFragmentReal(sPA.FRAG_S22, 2);
        double i21 = sPA.getFragmentImagi(sPA.FRAG_S22, 2);
        double r22 = sPA.getFragmentReal(sPA.FRAG_S22, 3);
        double i22 = sPA.getFragmentImagi(sPA.FRAG_S22, 3);

        double rb11 = sPA.getFragmentReal(sPA.FRAG_S22, 4);
        double ib11 = sPA.getFragmentImagi(sPA.FRAG_S22, 4);
        double rb21 = sPA.getFragmentReal(sPA.FRAG_S22, 5);
        double ib21 = sPA.getFragmentImagi(sPA.FRAG_S22, 5);


        double real1= (r11*r22)+((i11*i22)*(-1));
        double imagi1 = (r11*i22)+(i11*r22);
        double real2= (r21*r12)+((i21*i12)*(-1));
        double imagi2 = (r21*i12)+(i21*r12);

        double realG = real1-real2;
        double imagiG = imagi1-imagi2;

        double vectorG = convierteApolarVector(realG,imagiG);
        double anguloG = convierteApolarAngulo(realG,imagiG);

        reSPA.updateSDG(realG,imagiG);

        determinanteX(rb11,ib11,r12,i12,rb21,ib21,r22,i22,vectorG,anguloG);
        determinanteY(r11,i11,rb11,ib11,r21,i21,rb21,ib21,vectorG,anguloG);



    }

    public void determinanteG33(){

        double r11 =sPA.getFragmentReal(sPA.FRAG_S33,0);
        double i11 =sPA.getFragmentImagi(sPA.FRAG_S33,0);
        double r12 =sPA.getFragmentReal(sPA.FRAG_S33 ,1);
        double i12 =sPA.getFragmentImagi(sPA.FRAG_S33,1);
        double r13 =sPA.getFragmentReal(sPA.FRAG_S33 ,2);
        double i13 =sPA.getFragmentImagi(sPA.FRAG_S33,2);

        double r21 =sPA.getFragmentReal(sPA.FRAG_S33,3);
        double i21 =sPA.getFragmentImagi(sPA.FRAG_S33,3);
        double r22 =sPA.getFragmentReal(sPA.FRAG_S33,4);
        double i22 =sPA.getFragmentImagi(sPA.FRAG_S33,4);
        double r23 =sPA.getFragmentReal(sPA.FRAG_S33,5);
        double i23 =sPA.getFragmentImagi(sPA.FRAG_S33,5);

        double r31 =sPA.getFragmentReal(sPA.FRAG_S33,6);
        double i31 =sPA.getFragmentImagi(sPA.FRAG_S33,6);
        double r32 =sPA.getFragmentReal(sPA.FRAG_S33,7);
        double i32 =sPA.getFragmentImagi(sPA.FRAG_S33,7);
        double r33 =sPA.getFragmentReal(sPA.FRAG_S33,8);
        double i33 =sPA.getFragmentImagi(sPA.FRAG_S33,8);

        double rb11 =sPA.getFragmentReal(sPA.FRAG_S33,9);
        double ib11 =sPA.getFragmentImagi(sPA.FRAG_S33,9);
        double rb21 =sPA.getFragmentReal(sPA.FRAG_S33,10);
        double ib21 =sPA.getFragmentImagi(sPA.FRAG_S33,10);
        double rb31 =sPA.getFragmentReal(sPA.FRAG_S33,11);
        double ib31 =sPA.getFragmentImagi(sPA.FRAG_S33,11);


//--------------------------------------------------------------------//
        double rg1= rgde(r11,i11,r22,i22,r33,i33);
        double ig1= igde(r11,i11,r22,i22,r33,i33);

        double rg2 = rgde(r21,i21,r32,i32,r13,i13);
        double ig2 = igde(r21,i21,r32,i32,r13,i13);

        double rg3 = rgde(r31,i31,r12,i12,r23,i23);
        double ig3 = igde(r31,i31,r12,i12,r23,i23);

        double rg4 = rgde(r13,i13,r22,i22,r31,i31);
        double ig4 = igde(r13,i13,r22,i22,r31,i31);

        double rg5 = rgde(r23,i23,r32,i32,r11,i11);
        double ig5 = igde(r23,i23,r32,i32,r11,i11);

        double rg6 = rgde(r33,i33,r12,i12,r21,i21);
        double ig6 = igde(r33,i33,r12,i12,r21,i21);

        double rg = (rg1+rg2+rg3)-(rg4+rg5+rg6);
        double ig = (ig1+ig2+ig3)-(ig4+ig5+ig6);


        double vectorG = convierteApolarVector(rg,ig);
        double anguloG = convierteApolarAngulo(rg,ig);

//-----------------------------------------------------------------------


        reSPA.updateSDG(rg,ig);


        determinanteX33(rb11,ib11,r12,i12,r13,i13,rb21,ib21,r22,i22,r23,i23,rb31,ib31,r32,i32,r33,i33,vectorG,anguloG);
        determinanteY33(r11,i11,rb11,ib11,r13,i13,r21,i21,rb21,ib21,r23,i23,r31,i31,rb31,ib31,r33,i33,vectorG,anguloG);
        determinanteZ33(r11,i11,r12,i12,rb11,ib11,r21,i21,r22,i22,rb21,ib21,r31,i31,r32,i32,rb31,ib31,vectorG,anguloG);

    }

    public void determinanteG44(){


    }

//================================ "CALCULOS 3X3" ========================================================

    public void determinanteX33(double r11,double i11,double r12,double i12,double r13,double i13,double r21,double i21,double r22,double i22,double r23,double i23,double r31,double i31,double r32,double i32,double r33,double i33,double vectorG, double anguloG){



        double rg1= rgde(r11,i11,r22,i22,r33,i33);
        double ig1= igde(r11,i11,r22,i22,r33,i33);

        double rg2 = rgde(r21,i21,r32,i32,r13,i13);
        double ig2 = igde(r21,i21,r32,i32,r13,i13);

        double rg3 = rgde(r31,i31,r12,i12,r23,i23);
        double ig3 = igde(r31,i31,r12,i12,r23,i23);

        double rg4 = rgde(r13,i13,r22,i22,r31,i31);
        double ig4 = igde(r13,i13,r22,i22,r31,i31);

        double rg5 = rgde(r23,i23,r32,i32,r11,i11);
        double ig5 = igde(r23,i23,r32,i32,r11,i11);

        double rg6 = rgde(r33,i33,r12,i12,r21,i21);
        double ig6 = igde(r33,i33,r12,i12,r21,i21);

        double rg = (rg1+rg2+rg3)-(rg4+rg5+rg6);
        double ig = (ig1+ig2+ig3)-(ig4+ig5+ig6);


        double vectorX = convierteApolarVector(rg,ig);
        double anguloX = convierteApolarAngulo(rg,ig);

        double vectorF = vectorX/vectorG;
        double anguloF = anguloX-(anguloG);




        reSPA.updateFX(rg,ig,vectorF,anguloF,1);


    }

    public void determinanteY33(double r11,double i11,double r12,double i12,double r13,double i13,double r21,double i21,double r22,double i22,double r23,double i23,double r31,double i31,double r32,double i32,double r33,double i33,double vectorG, double anguloG){


        double rg1= rgde(r11,i11,r22,i22,r33,i33);
        double ig1= igde(r11,i11,r22,i22,r33,i33);

        double rg2 = rgde(r21,i21,r32,i32,r13,i13);
        double ig2 = igde(r21,i21,r32,i32,r13,i13);

        double rg3 = rgde(r31,i31,r12,i12,r23,i23);
        double ig3 = igde(r31,i31,r12,i12,r23,i23);

        double rg4 = rgde(r13,i13,r22,i22,r31,i31);
        double ig4 = igde(r13,i13,r22,i22,r31,i31);

        double rg5 = rgde(r23,i23,r32,i32,r11,i11);
        double ig5 = igde(r23,i23,r32,i32,r11,i11);

        double rg6 = rgde(r33,i33,r12,i12,r21,i21);
        double ig6 = igde(r33,i33,r12,i12,r21,i21);

        double rg = (rg1+rg2+rg3)-(rg4+rg5+rg6);
        double ig = (ig1+ig2+ig3)-(ig4+ig5+ig6);


        double vectorY = convierteApolarVector(rg,ig);
        double anguloY = convierteApolarAngulo(rg,ig);

        double vectorF = vectorY/vectorG;
        double anguloF = anguloY-(anguloG);

        reSPA.updateFY(rg,ig,vectorF,anguloF);

    }

    public void determinanteZ33(double r11,double i11,double r12,double i12,double r13,double i13,double r21,double i21,double r22,double i22,double r23,double i23,double r31,double i31,double r32,double i32,double r33,double i33,double vectorG, double anguloG){


        double rg1= rgde(r11,i11,r22,i22,r33,i33);
        double ig1= igde(r11,i11,r22,i22,r33,i33);

        double rg2 = rgde(r21,i21,r32,i32,r13,i13);
        double ig2 = igde(r21,i21,r32,i32,r13,i13);

        double rg3 = rgde(r31,i31,r12,i12,r23,i23);
        double ig3 = igde(r31,i31,r12,i12,r23,i23);

        double rg4 = rgde(r13,i13,r22,i22,r31,i31);
        double ig4 = igde(r13,i13,r22,i22,r31,i31);

        double rg5 = rgde(r23,i23,r32,i32,r11,i11);
        double ig5 = igde(r23,i23,r32,i32,r11,i11);

        double rg6 = rgde(r33,i33,r12,i12,r21,i21);
        double ig6 = igde(r33,i33,r12,i12,r21,i21);

        double rg = (rg1+rg2+rg3)-(rg4+rg5+rg6);
        double ig = (ig1+ig2+ig3)-(ig4+ig5+ig6);

        double vectorZ = convierteApolarVector(rg,ig);
        double anguloZ = convierteApolarAngulo(rg,ig);

        double vectorF = vectorZ/vectorG;
        double anguloF = anguloZ-(anguloG);

        reSPA.updateFZ(rg,ig,vectorF,anguloF);

    }


//================================ "CALCULOS 2X2" ========================================================

    public void determinanteX(double r11,double i11,double r12,double i12,double r21,double i21,double r22,double i22,double vectorG, double anguloG){


        double real1= (r11*r22)+((i11*i22)*(-1));
        double imagi1 = (r11*i22)+(i11*r22);
        double real2= (r21*r12)+((i21*i12)*(-1));
        double imagi2 = (r21*i12)+(i21*r12);

        double realG = real1-real2;
        double imagiG = imagi1-imagi2;

        double vectorX = convierteApolarVector(realG,imagiG);
        double anguloX = convierteApolarAngulo(realG,imagiG);

        double vectorF = vectorX/vectorG;
        double anguloF = anguloX-(anguloG);

        double realF= convierteARectangularReal(vectorF,anguloF);
        double imagiF = convierteARectangularImagi(vectorF,anguloF);

        reSPA.updateFX(realF,imagiF,vectorF,anguloF,0);

    }

    public void determinanteY(double r11,double i11,double r12,double i12,double r21,double i21,double r22,double i22,double vectorG,double anguloG){

        double real1= (r11*r22)+((i11*i22)*(-1));
        double imagi1 = (r11*i22)+(i11*r22);
        double real2= (r21*r12)+((i21*i12)*(-1));
        double imagi2 = (r21*i12)+(i21*r12);

        double realG = real1-real2;
        double imagiG = imagi1-imagi2;

        double vectorY = convierteApolarVector(realG,imagiG);
        double anguloY = convierteApolarAngulo(realG,imagiG);

        double vectorF = vectorY/vectorG;
        double anguloF = anguloY-(anguloG);

        double realF= convierteARectangularReal(vectorF,anguloF);
        double imagiF = convierteARectangularImagi(vectorF,anguloF);
        reSPA.updateFY(realF,imagiF,vectorF,anguloF);


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

    public double convierteARectangularReal(double vectorF,double anguloF){
        double realF = vectorF*Math.cos(Math.toRadians(anguloF));
        return realF;
    }

    public double convierteARectangularImagi(double vectorF,double anguloF){
        double imagiF = vectorF*Math.sin(Math.toRadians(anguloF));
        return imagiF;
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


    public double rdecom(double r1, double i1, double r2, double i2 ) {
        double rdecom = (r1 * r2) + ((i1 * i2) * (-1));
        return rdecom;
    }

    public double idecom(double r1, double i1, double r2, double i2){
        double idecom = (r1*i2)+(i1*r2);
        return idecom;
    }

    public double rgde(double r1, double i1, double r2, double i2, double r3, double i3){
        double re = rdecom(r1,i1,r2,i2);
        double ie = idecom(r1,i1,r2,i2);
        double rgd = rdecom(re,ie,r3,i3);
        return rgd;
    }

    public double igde(double r1, double i1, double r2, double i2, double r3, double i3){
        double re = rdecom(r1,i1,r2,i2);
        double ie = idecom(r1,i1,r2,i2);
        double igd = idecom(re,ie,r3,i3);
        return igd;
    }



//================================ "TOOLBAR Y MENUS" ========================================================


    public void alertDialogLista() {
        DialogoSistemas dlgsis = new DialogoSistemas();
        dlgsis.show(getSupportFragmentManager(), "dlgsis");
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarTop);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.back_white));
        toolbar.setBackground(getResources().getDrawable(R.drawable.border_toolbar));
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //regresar...
                finish();
                //onBackPressed();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_settings:
                return true;

            case R.id.action_2x2:
                mViewPager.setCurrentItem(0);
                return true;

            case R.id.action_3x3:
                mViewPager.setCurrentItem(1);
                return true;
/*
            case R.id.action_4x4:
                mViewPager.setCurrentItem(2);
                retmurn true;*/
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
super.onBackPressed();

    }

}
