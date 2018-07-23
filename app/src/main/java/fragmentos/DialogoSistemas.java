package fragmentos;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

import nietoveinte.complix.Comunicador;
import nietoveinte.complix.R;

/**
 * Created by nietoAll on 06/02/2018.
 */
public class DialogoSistemas extends DialogFragment {

    Comunicador comunicacion;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        comunicacion = (Comunicador) getActivity();

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Sistema de Ecuaciones:")
                .setItems(R.array.items_array, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        comunicacion.setSistema(item);
                        String sist;
                        if(item==0){sist="Sistema Ecuaciones: 2x2";
                            Toast.makeText(getContext(),sist, Toast.LENGTH_SHORT).show();}
                        if(item==1){sist="Sistema Ecuaciones: 3x3";
                            Toast.makeText(getContext(),sist, Toast.LENGTH_SHORT).show();}
                        if(item==2){sist="Sistema Ecuaciones: 4x4";}




                    }
                });
        return builder.create();
    }


}