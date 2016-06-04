package epm.senacrs.com.br.exfragment;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements CliqueLista{

    private String timeBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(timeBack != null) {
            clicou(timeBack);
            timeBack = null;
        }
    }

    @Override
    public void clicou(String time) {
        FragmentManager fragmentManager = getFragmentManager();
        DetalheFrag detalheFrag = (DetalheFrag)fragmentManager.findFragmentById(R.id.detalheFrag);

        if(detalheFrag != null && detalheFrag.isInLayout()) {
            detalheFrag.setNomes(time);
        } else {
            timeBack = time;
            Intent intent = new Intent(this, DetalheActivity.class);
            intent.putExtra("time", time);
            startActivity(intent);
        }
    }
}
