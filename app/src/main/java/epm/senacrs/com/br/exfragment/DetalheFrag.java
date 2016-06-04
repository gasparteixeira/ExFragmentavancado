package epm.senacrs.com.br.exfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by 631110317 on 04/06/16.
 */
public class DetalheFrag extends Fragment {

    private TextView txViewTimes;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_detalhe, null);
        txViewTimes = (TextView)view.findViewById(R.id.textView);
        return view;
    }

    public void setNomes(String nome) {
        txViewTimes.setText(nome);
    }
}
