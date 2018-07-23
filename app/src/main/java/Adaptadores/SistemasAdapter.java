package Adaptadores;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import fragmentos.S22Fragment;
import fragmentos.S33Fragment;
import fragmentos.S44Fragment;


public class SistemasAdapter extends FragmentPagerAdapter {


    private static final String TAG = "SistemasAdapter";
    public static final int FRAG_S22 = 0;
    public static final int FRAG_S33 = 1;
    public static final int FRAG_S44 = 2;
    private static final int NUM_PAGES = 2;
//    private static final int NUM_PAGES = 3;

    private Fragment[] fragmentList;
    private FragmentManager fragmentManager;

    private S22Fragment s22Fragment = new S22Fragment();
    private S33Fragment s33Fragment = new S33Fragment();
    private S44Fragment s44Fragment = new S44Fragment();


    public SistemasAdapter(FragmentManager fm) {
        super(fm);
        this.fragmentManager = fm;
        fragmentList = new Fragment[NUM_PAGES];
        fragmentList[0] = s22Fragment;
        fragmentList[1] = s33Fragment;
        // fragmentList[2] = s44Fragment;
    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case FRAG_S22:
                fragmentList[position] = new S22Fragment();
                return fragmentList[position];
            case FRAG_S33:
                fragmentList[position] = new S33Fragment();
                return fragmentList[position];
            case FRAG_S44:
              /*  fragmentList[position] = new S44Fragment();
                return fragmentList[position];*/
        }
        return null;
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }


    public void updateFragment(int fragment, int segmn, double real, double imagi) {
        switch (fragment) {
            case FRAG_S22:
                ((S22Fragment) fragmentList[fragment]).updateMessage(segmn, real, imagi);
                break;
            case FRAG_S33:
                ((S33Fragment) fragmentList[fragment]).updateMessage(segmn, real, imagi);
                break;
            case FRAG_S44:
                ((S44Fragment) fragmentList[fragment]).updateMessage(segmn, real, imagi);
                break;
        }
    }

    public void updateFragmentExpress(int fragment) {
        switch (fragment) {
            case FRAG_S22:
                ((S22Fragment) fragmentList[fragment]).updateExpressPolar();
                break;
            case FRAG_S33:
                ((S33Fragment) fragmentList[fragment]).updateExpressPolar();
                break;
            case FRAG_S44:
                ((S44Fragment) fragmentList[fragment]).updateExpressPolar();
                break;
        }
    }

    public void updateFragmentBack(int fragment) {

        switch (fragment) {
            case FRAG_S22:
                ((S22Fragment) fragmentList[fragment]).updateExpressRectangular();
                break;
            case FRAG_S33:
                ((S33Fragment) fragmentList[fragment]).updateExpressRectangular();
                break;
            case FRAG_S44:
                ((S44Fragment) fragmentList[fragment]).updateExpressRectangular();
                break;
        }


    }


    public double getFragmentReal(int fragment, int ntextviewr) {


        switch (fragment) {

            case FRAG_S22:
                return ((S22Fragment) fragmentList[fragment]).getReal(ntextviewr);

            case FRAG_S33:
                return ((S33Fragment) fragmentList[fragment]).getReal(ntextviewr);

            case FRAG_S44:
                return ((S44Fragment) fragmentList[fragment]).getReal(ntextviewr);

        }
        return 0.0;
    }


    public double getFragmentImagi(int fragment, int ntextviewi) {

        switch (fragment) {

            case FRAG_S22:
                return ((S22Fragment) fragmentList[fragment]).getImagi(ntextviewi);
            case FRAG_S33:
                return ((S33Fragment) fragmentList[fragment]).getImagi(ntextviewi);
            case FRAG_S44:
                return ((S44Fragment) fragmentList[fragment]).getImagi(ntextviewi);

        }
        return 0.0;

    }


    @Override
    public int getCount() {
        return NUM_PAGES;
    }

}
