package com.video20ControlListView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView tv1;
    private ListView lv1;

    private String nombres [] = {"Pedro", "Antonio", "Alvaro", "Benjamin", "Roberto", "Ernesto", "Ricardo", "Belen", "Dolores", "Eloisa"};
    private String edades [] = {"8", "9", "7", "6", "10", "19", "37", "36", "18", "33"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.tv1);
        lv1 = (ListView)findViewById(R.id.lv1);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.item_lisview_formato,nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {   tv1.setText(" La edad de " + lv1.getItemAtPosition(i) + " es " + edades [i] + " años");

            }
        });
    }
}
//cambios
