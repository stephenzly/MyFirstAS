package zly.com.recycle;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    TextView textView1;
    RecyclerView recyclerView;
    List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleview);
        textView1 = findViewById(R.id.textView1);
        for (int i = 0; i <5; i++){
            list.add("this is NO." + (i + 1) + "item");
        }
        adapter adapter = new adapter(list,this);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
    }
}
