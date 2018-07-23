package Adaptadores;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import fragmentos.ResultadosFragment;


public class ResultadoAdapter extends FragmentPagerAdapter {


    private static final String TAG = "ResultadoAdapter";
    public static final int FRAG_RES = 0;
    private static final int NUM_PAGES =1;

    private Fragment[] fragmentList;
    private FragmentManager fragmentManager;

    private ResultadosFragment resultFragment = new ResultadosFragment();


    public ResultadoAdapter(FragmentManager fm) {
        super(fm);
        this.fragmentManager = fm;
        fragmentList = new Fragment[NUM_PAGES];
        fragmentList[0] = resultFragment;
    }



    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case FRAG_RES:
                fragmentList[position] = new ResultadosFragment();
                return fragmentList[position];
        }
        return null;
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }


    public void updateFX(double real, double imagi,double vectorF,double anguloF,int fragment)
    {
        ((ResultadosFragment)fragmentList[0]  ).updateX(real,imagi,vectorF,anguloF,fragment);
    }

    public void updateFY(double real, double imagi,double vectorF,double anguloF)
    {
        ((ResultadosFragment)fragmentList[0]  ).updateY(real,imagi,vectorF,anguloF);
    }

    public void updateFZ(double real, double imagi,double vectorF,double anguloF)
    {
        ((ResultadosFragment)fragmentList[0]  ).updateZ(real,imagi,vectorF,anguloF);
    }

    public void updateSDG(double real, double imagi)
    {
        ((ResultadosFragment)fragmentList[0]  ).updateSDG(real,imagi);
    }

    public void updateFW(double real, double imagi,double vectorF,double anguloF)
    {
        ((ResultadosFragment)fragmentList[0]  ).updateW(real,imagi,vectorF,anguloF);
    }

    public void vaciar()
    {
        ((ResultadosFragment)fragmentList[0]  ).vaciar();
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }

}
