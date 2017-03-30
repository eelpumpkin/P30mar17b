package com.example.yvtc.p30mar17b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    String cites[] = {"taipei","taichu","tainan","koushung","Hsinchu"};
    String code[]  = {"02","04","06","07","03"};
    int imgs[] = new int[]{R.drawable.tc, R.drawable.hc, R.drawable.kh, R.drawable.tpe, R.drawable.tn};

    ArrayList<Map<String,Object>> mylist = new ArrayList<>();
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i;
        lv = (ListView) findViewById(R.id.listView);
        for(i=0;i<cites.length;i++){
            Map<String,Object> m = new HashMap();
            m.put("cities",cites[i]);
            m.put("code",code[i]);
            m.put("img",imgs[i]);
            mylist.add(m);
        }
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,mylist,
                R.layout.myitem,new String[]{"cities","code","img"},
                new int[] {R.id.textView,R.id.textView2,R.id.imageView});

        lv.setAdapter(adapter);
    }
}
