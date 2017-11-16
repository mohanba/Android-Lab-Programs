package nmit.mohan.com.db_labprogram;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mohan on 11/14/17.
 */

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, "StuDB", null, 3);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table student (name text,usn text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("drop table student");
        onCreate(db);
    }

    public boolean addData(String  item,String  item1){
    SQLiteDatabase db=getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("name",item);
        cv.put("usn",item1);

        long l=db.insert("student",null,cv);
        if(l==-1)
            return false;
            else
        return true;
    }

    public Cursor fetchData()
    {
    Cursor curData=null;
        SQLiteDatabase db=getWritableDatabase();
    curData=db.rawQuery("select * from student",null);
        return curData;
    }
}
