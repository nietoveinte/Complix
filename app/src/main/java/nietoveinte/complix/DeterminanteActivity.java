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

import Adaptadores.DeterminanteAdapter;

//import fragmentos.DialogoLista;

public class DeterminanteActivity extends AppCompatActivity implements Comunicador{

    private static final String TAG = "DeterminanteActivity";
    private TextView igualviewd;
    public TextView determinanteGD;
    private DeterminanteAdapter dPA;
    private ViewPager mViewPagerd;
    public SwitchCompat simpleSwitchd;

    public ImageView deleteviewd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determinante);

        setToolbar();
        mViewPagerd = (ViewPager) findViewById(R.id.containermpagerd);
        dPA = new DeterminanteAdapter(getSupportFragmentManager());
        mViewPagerd.setAdapter(dPA);

        determinanteGD = (TextView) findViewById(R.id.determinanteGD);

        igualviewd = (TextView) findViewById(R.id.igualviewd);
        igualviewd.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {

                if(mViewPagerd.getCurrentItem()==0) {
                    determinante22();
                }else

                if (mViewPagerd.getCurrentItem()==1) {
                    determinante33();
                } else

                if (mViewPagerd.getCurrentItem()==2) {

                   // determinanteG33();
                }

            }
        });

        deleteviewd = (ImageView) findViewById(R.id.deleteviewd);
        deleteviewd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mViewPagerd.getCurrentItem()==0){
                    dPA.updateFragment(dPA.FRAG_D22,0,0,0);
                    dPA.updateFragment(dPA.FRAG_D22,1,0,0);
                    dPA.updateFragment(dPA.FRAG_D22,2,0,0);
                    dPA.updateFragment(dPA.FRAG_D22,3,0,0);
                    dPA.updateFragment(dPA.FRAG_D22,4,0,0);
                    dPA.updateFragment(dPA.FRAG_D22,5,0,0);
                    determinanteGD.setText("");
                } else
                if(mViewPagerd.getCurrentItem()==1){
                    dPA.updateFragment(dPA.FRAG_D33,0,0,0);
                    dPA.updateFragment(dPA.FRAG_D33,1,0,0);
                    dPA.updateFragment(dPA.FRAG_D33,2,0,0);
                    dPA.updateFragment(dPA.FRAG_D33,3,0,0);
                    dPA.updateFragment(dPA.FRAG_D33,4,0,0);
                    dPA.updateFragment(dPA.FRAG_D33,5,0,0);
                    dPA.updateFragment(dPA.FRAG_D33,6,0,0);
                    dPA.updateFragment(dPA.FRAG_D33,7,0,0);
                    dPA.updateFragment(dPA.FRAG_D33,8,0,0);
                    determinanteGD.setText("");
                } else

                if(mViewPagerd.getCurrentItem()==2){
                    dPA.updateFragment(dPA.FRAG_D44,0,0,0);
                    dPA.updateFragment(dPA.FRAG_D44,1,0,0);
                    dPA.updateFragment(dPA.FRAG_D44,2,0,0);
                    dPA.updateFragment(dPA.FRAG_D44,3,0,0);
                    dPA.updateFragment(dPA.FRAG_D44,4,0,0);
                    dPA.updateFragment(dPA.FRAG_D44,5,0,0);
                    dPA.updateFragment(dPA.FRAG_D44,6,0,0);
                    dPA.updateFragment(dPA.FRAG_D44,7,0,0);
                    dPA.updateFragment(dPA.FRAG_D44,8,0,0);
                    dPA.updateFragment(dPA.FRAG_D44,9,0,0);
                    dPA.updateFragment(dPA.FRAG_D44,10,0,0);
                    dPA.updateFragment(dPA.FRAG_D44,11,0,0);
                    dPA.updateFragment(dPA.FRAG_D44,12,0,0);
                    dPA.updateFragment(dPA.FRAG_D44,13,0,0);
                    dPA.updateFragment(dPA.FRAG_D44,14,0,0);
                    dPA.updateFragment(dPA.FRAG_D44,15,0,0);
                    determinanteGD.setText("");
                }

            }
        });


      // alertDialogLista();

        simpleSwitchd = (SwitchCompat) findViewById(R.id.swPolard);
        simpleSwitchd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    if(mViewPagerd.getCurrentItem()==0){dPA.updateFragmentExpress(0);}
                    else  if(mViewPagerd.getCurrentItem()==1){dPA.updateFragmentExpress(1);}
                    else  if(mViewPagerd.getCurrentItem()==2){dPA.updateFragmentExpress(2);}

                } else {

                    if(mViewPagerd.getCurrentItem()==0){dPA.updateFragmentBack(0);}
                    else if(mViewPagerd.getCurrentItem()==1){dPA.updateFragmentBack(1);}
                    else if(mViewPagerd.getCurrentItem()==2){dPA.updateFragmentBack(2);}

                }
            }
        });

    }

//================================ "CALCULAR DETERMINANTES" ========================================================


public void determinante22(){

    double r11 = dPA.getFragmentReal(dPA.FRAG_D22, 0);
    double i11 = dPA.getFragmentImagi(dPA.FRAG_D22, 0);
    double r12 = dPA.getFragmentReal(dPA.FRAG_D22, 1);
    double i12 = dPA.getFragmentImagi(dPA.FRAG_D22, 1);
    double r21 = dPA.getFragmentReal(dPA.FRAG_D22, 2);
    double i21 = dPA.getFragmentImagi(dPA.FRAG_D22, 2);
    double r22 = dPA.getFragmentReal(dPA.FRAG_D22, 3);
    double i22 = dPA.getFragmentImagi(dPA.FRAG_D22, 3);

    double real1= (r11*r22)+((i11*i22)*(-1));
    double imagi1 = (r11*i22)+(i11*r22);
    double real2= (r21*r12)+((i21*i12)*(-1));
    double imagi2 = (r21*i12)+(i21*r12);

    double realG = real1-real2;
    double imagiG = imagi1-imagi2;

    asignarValor(realG,determinanteGD,imagiG);

}

public void determinante33(){

    double r11 =dPA.getFragmentReal(dPA.FRAG_D33,0);
    double i11 =dPA.getFragmentImagi(dPA.FRAG_D33,0);
    double r12 =dPA.getFragmentReal(dPA.FRAG_D33 ,1);
    double i12 =dPA.getFragmentImagi(dPA.FRAG_D33,1);
    double r13 =dPA.getFragmentReal(dPA.FRAG_D33 ,2);
    double i13 =dPA.getFragmentImagi(dPA.FRAG_D33,2);

    double r21 =dPA.getFragmentReal(dPA.FRAG_D33,3);
    double i21 =dPA.getFragmentImagi(dPA.FRAG_D33,3);
    double r22 =dPA.getFragmentReal(dPA.FRAG_D33,4);
    double i22 =dPA.getFragmentImagi(dPA.FRAG_D33,4);
    double r23 =dPA.getFragmentReal(dPA.FRAG_D33,5);
    double i23 =dPA.getFragmentImagi(dPA.FRAG_D33,5);

    double r31 =dPA.getFragmentReal(dPA.FRAG_D33,6);
    double i31 =dPA.getFragmentImagi(dPA.FRAG_D33,6);
    double r32 =dPA.getFragmentReal(dPA.FRAG_D33,7);
    double i32 =dPA.getFragmentImagi(dPA.FRAG_D33,7);
    double r33 =dPA.getFragmentReal(dPA.FRAG_D33,8);
    double i33 =dPA.getFragmentImagi(dPA.FRAG_D33,8);

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

    asignarValor(rg,determinanteGD,ig);

}

//================================ "CALCULOS" ========================================================

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

//================================ "TOOLBAR" ========================================================

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarTopd);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.back_blue));
        toolbar.setBackground(getResources().getDrawable(R.drawable.border_toolbar_calcu));
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Complix");

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //regresar...
//                finish();
                onBackPressed();

            }
        });

    }


//================================ "GET" ========================================================

    @Override
    public double getValorReal(int fragment,int segmn) {
        switch (fragment){

            case 0:
                double real =dPA.getFragmentReal(fragment,segmn);
                return real;

            case 1:
                double real2 =dPA.getFragmentReal(fragment,segmn);
                return real2;

            case 2:
                double real3 =dPA.getFragmentReal(fragment,segmn);
                return real3;
        }
        return 0;
    }

    @Override
    public double getValorImagi(int fragment,int segmn) {

        double imagi =dPA.getFragmentImagi(fragment,segmn);
        return imagi;
    }

    @Override
    public double getValorReal(int textview) {
        return 0;
    }

    @Override
    public double getValorImagi(int textview) {
        return 0;
    }

//================================ "SET" ========================================================

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

    @Override
    public void setValores(int fragment, int idSegment, double real, double imagi) {

        if(fragment==0) {
            dPA.updateFragment(dPA.FRAG_D22, idSegment, real, imagi);
            if(simpleSwitchd.isChecked()){
                dPA.updateFragmentExpress(0);
            }
        }
        if (fragment == 1) {
            dPA.updateFragment(dPA.FRAG_D33, idSegment, real, imagi);
            if(simpleSwitchd.isChecked()){
                dPA.updateFragmentExpress(1);
            }
        }

        if (fragment == 2) {
            dPA.updateFragment(dPA.FRAG_D44, idSegment, real, imagi);
            if(simpleSwitchd.isChecked()){
                dPA.updateFragmentExpress(2);
            }
        }


    }

    @Override
    public void setValor(int textview, double real, double imagi) {

    }

    @Override
    public void setSistema(int currentitem) {
        mViewPagerd.setCurrentItem(currentitem);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.maind, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_settings:
                return true;

            case R.id.det2x2:
                mViewPagerd.setCurrentItem(0);
                return true;

            case R.id.det3x3:
                mViewPagerd.setCurrentItem(1);
                return true;
/*
            case R.id.action_4x4:
                mViewPagerd.setCurrentItem(2);
                return true;*/
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}