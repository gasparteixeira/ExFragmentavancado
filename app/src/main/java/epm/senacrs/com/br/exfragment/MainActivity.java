package epm.senacrs.com.br.exfragment;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements CliqueLista{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void clicou(String time) {
        FragmentManager fragmentManager = getFragmentManager();
        DetalheFrag detalheFrag = (DetalheFrag)fragmentManager.findFragmentById(R.id.detalheFrag);

        if(detalheFrag != null && detalheFrag.isInLayout()) {

        } else {

        }
    }
}
