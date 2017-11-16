package nmit.mohan.com.program2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView FlowerList;
    FlowerAdapter mAdapter;
    String flower[] = {"Rose", "Jasmine", "lily", "tulips","lotus","Rose", "Jasmine", "lily", "tulips","lotus" };

    List<String> flowerlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FlowerList = (ListView) findViewById(R.id.listflower);

        for (String flowername: flower) {
            flowerlist.add(flowername);
        }

        mAdapter = new FlowerAdapter(MainActivity.this, flowerlist);
        FlowerList.setAdapter(mAdapter);
    }
}
