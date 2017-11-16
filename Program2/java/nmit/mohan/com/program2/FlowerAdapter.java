package nmit.mohan.com.program2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohan on 11/15/17.
 */

public class FlowerAdapter extends BaseAdapter {

    Context mContext;
    List<String> mFlowers;

    public FlowerAdapter(Context mContext, List<String> mFlowers) {
        this.mContext = mContext;
        this.mFlowers = mFlowers;
    }

    @Override
    public int getCount() {
        return mFlowers.size();
    }

    @Override
    public Object getItem(int position) {
        return mFlowers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).
                    inflate(R.layout.rowlayout, parent, false);
        }        TextView title = (TextView) convertView.findViewById(R.id.flowerlist);
        title.setText(mFlowers.get(position));
        return convertView;
    }
}

