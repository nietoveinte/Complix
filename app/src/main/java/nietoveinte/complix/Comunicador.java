package nietoveinte.complix;

/**
 * Created by NietoAll on 19/10/2017.
 */

public interface Comunicador {


    double getValorReal(int textview);
    double getValorImagi(int textview);


    void setValores(int fragment, int idSegment, double datos, double datos2);
    void setValor(int textview, double real, double imagi);
    //void setValorPolar();
    double getValorReal(int fragment, int segmn);
    double getValorImagi(int fragment, int segmn);
    void setSistema(int currentitem);

    //17018016375625111700559009

}
