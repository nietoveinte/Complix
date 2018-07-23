package Adaptadores;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import fragmentos.D22Fragment;
import fragmentos.D33Fragment;
import fragmentos.D44Fragment;


public class DeterminanteAdapter extends FragmentPagerAdapter {


    private static final String TAG = "SectionsPageAdapter";
    public static final int FRAG_D22 = 0;
    public static final int FRAG_D33 = 1;
    public static final int FRAG_D44 = 2;
    private static final int NUM_PAGES =2;
    //private static final int NUM_PAGES =3;

    private Fragment[] fragmentList;
    private FragmentManager fragmentManager;

    private D22Fragment d22Fragment = new D22Fragment();
    private D33Fragment d33Fragment = new D33Fragment();
    private D44Fragment d44Fragment = new D44Fragment();


    public DeterminanteAdapter(FragmentManager fm) {
        super(fm);
        this.fragmentManager = fm;
        fragmentList = new Fragment[NUM_PAGES];
        fragmentList[0] = d22Fragment;
        fragmentList[1] = d33Fragment;
//        fragmentList[2] = d44Fragment;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case FRAG_D22:
                fragmentList[position] = new D22Fragment();
                return fragmentList[position];
            case FRAG_D33:
                fragmentList[position] = new D33Fragment();
                return fragmentList[position];
            case FRAG_D44:
                /*fragmentList[position] = new D44Fragment();
                return fragmentList[position];*/
        }
        return null;
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    public void updateFragment(int fragment,int segmn,double real, double imagi)
    {
        switch (fragment)
        {
            case FRAG_D22:
             ((D22Fragment)fragmentList[fragment]).updateMessage(segmn,real,imagi);
              break;
            case FRAG_D33:
             ((D33Fragment)fragmentList[fragment]).updateMessage(segmn,real,imagi);
                break;
            case FRAG_D44:
             ((D44Fragment)fragmentList[fragment]).updateMessage(segmn,real,imagi);
                break;
        }
    }

    public void updateFragmentExpress(int fragment)
    {
        switch (fragment)
        {
            case FRAG_D22:
                ((D22Fragment)fragmentList[fragment]).updateExpressPolar();
                break;
            case FRAG_D33:
                ((D33Fragment)fragmentList[fragment]).updateExpressPolar();
                break;
            case FRAG_D44:
                ((D44Fragment)fragmentList[fragment]).updateExpressPolar();
                break;
        }
    }

    public void updateFragmentBack(int fragment ){

        switch (fragment)
        {
            case FRAG_D22:
                ((D22Fragment)fragmentList[fragment]).updateExpressRectangular();
                break;
            case FRAG_D33:
                ((D33Fragment)fragmentList[fragment]).updateExpressRectangular();
                break;
            case FRAG_D44:
                ((D44Fragment)fragmentList[fragment]).updateExpressRectangular();
            break;
        }


    }

    public double getFragmentReal(int fragment,int ntextviewr) {


        switch (fragment) {

            case FRAG_D22:
            return ((D22Fragment) fragmentList[fragment]).getReal(ntextviewr);

            case FRAG_D33:
            return ((D33Fragment)fragmentList[fragment]).getReal(ntextviewr);

            case FRAG_D44:
            return ((D44Fragment)fragmentList[fragment]).getReal(ntextviewr);

        } return 0.0;
 }

    public double getFragmentImagi(int fragment,int ntextviewi){

    switch (fragment) {

        case FRAG_D22:
        return ((D22Fragment) fragmentList[fragment]).getImagi(ntextviewi);
      case FRAG_D33:
        return ((D33Fragment)fragmentList[fragment]).getImagi(ntextviewi);
        case FRAG_D44:
        return ((D44Fragment)fragmentList[fragment]).getImagi(ntextviewi);

    } return 0.0;

    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
}