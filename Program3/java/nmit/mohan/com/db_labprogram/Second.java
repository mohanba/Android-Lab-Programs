package nmit.mohan.com.db_labprogram;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class Second extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String,String>> Data;
    DBHelper dbh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Data=new ArrayList<>();
        HashMap<String,String> dbData=new HashMap<>();


        listView= (ListView) findViewById(R.id.lv);


        dbh=new DBHelper(this);

        Cursor cursor=dbh.fetchData();
        while (cursor.moveToNext()){
            dbData=new HashMap<>();
            dbData.put("name",cursor.getString(0));
            dbData.put("usn",cursor.getString(1));
            Data.add(dbData);
        }
        ListAdapter la=new SimpleAdapter(this,Data,R.layout.list_item,new String[]{"name","usn"},new int[]{R.id.tvName,R.id.tvUsn});
        listView.setAdapter(la);

    }
}
