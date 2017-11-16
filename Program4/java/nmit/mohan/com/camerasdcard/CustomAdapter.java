package nmit.mohan.com.camerasdcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by mohan on 9/19/17.
 */

public class CustomAdapter extends BaseAdapter{
    Context c;
    ArrayList<ImageModel> imageModels;

    public CustomAdapter(Context c,ArrayList<ImageModel> imageModels) {
        this.c = c;
        this.imageModels=imageModels;
    }

    @Override
    public int getCount() {
        return imageModels.size();
    }

    @Override
    public Object getItem(int position) {
        return imageModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            convertView= LayoutInflater.from(c).inflate(R.layout.itemlayout,parent,false);
        }

        final ImageModel im=(ImageModel) this.getItem(position);

        TextView nameText= (TextView) convertView.findViewById(R.id.itemtv);
        ImageView img= (ImageView) convertView.findViewById(R.id.itemiv);


        nameText.setText(im.getName());
        Picasso.with(c).load(im.getUri()).placeholder(R.drawable.cameraicon).into(img);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c, im.getName(), Toast.LENGTH_LONG).show();
            }
        });

        return convertView;
    }
}
