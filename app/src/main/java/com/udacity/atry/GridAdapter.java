package com.udacity.atry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ahmad on 25/07/2018.
 */
public class GridAdapter extends BaseAdapter {
    private Context context;
    public static ArrayList<MyData> data= new ArrayList<MyData>();;
    private final String BASE_URL = "WEB URL";

    public GridAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public String getItem(int position) {
        return""+ position;
    }
    public static Object getData(int position) {
        return data.get(position);
    }
    public void adapter(ArrayList<MyData> movie) {
        this.data= movie;
    }
    public ArrayList<MyData> getmymovies(){
        return data;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = new View(context);
        ImageView imageView;
        TextView title;

        row = LayoutInflater.from(context).inflate(R.layout.grid_item, null);
            imageView = (ImageView) row.findViewById(R.id.image);
            title = (TextView) row.findViewById(R.id.title);
        TextView desc = (TextView) row.findViewById(R.id.desc);
        title.setText(data.get(position).gettitle());
        desc.setText(data.get(position).get_title_data());
        TextView vote_number = (TextView) row.findViewById(R.id.vote_num);
        vote_number.setText(data.get(position).getNumStars());

        imageView.setImageDrawable(context.getResources().getDrawable( R.drawable.birthdayimage));
//        Picasso.with(context).load(movie.get(position).getUrl()).into(imageView);

        return row;
    }
}

