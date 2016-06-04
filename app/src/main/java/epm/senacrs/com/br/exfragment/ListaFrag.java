package epm.senacrs.com.br.exfragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by 631110317 on 04/06/16.
 */
public class ListaFrag extends ListFragment {

    private String[] times = new String[]{
            "Sport", "Farroupilha", "Gremio", "Juventude", "Caxias", "Internacional"
    };

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setListAdapter(
                new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                times));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        ((CliqueLista)getActivity()).clicou(times[position]);
    }
}
