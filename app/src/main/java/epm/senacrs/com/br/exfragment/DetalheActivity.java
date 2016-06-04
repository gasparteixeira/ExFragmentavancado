package epm.senacrs.com.br.exfragment;

import android.app.FragmentManager;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetalheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
        }
        setContentView(R.layout.activity_detalhe);

        String time = getIntent().getStringExtra("time");

        FragmentManager fragmentManager = getFragmentManager();
        DetalheFrag detalheFrag = (DetalheFrag)fragmentManager.findFragmentById(R.id.detalhe_frag);
        detalheFrag.setNomes(time);
    }
}
