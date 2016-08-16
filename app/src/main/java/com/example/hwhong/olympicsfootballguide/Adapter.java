package com.example.hwhong.olympicsfootballguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hwhong on 7/2/16.
 */
public class Adapter extends ArrayAdapter<String> {

    int[] images = {};
    String[] countries = {};
    String[] nextGame = {};
    Context c;
    LayoutInflater inflater;

    public Adapter(Context context, String[] countries, String[] nextGame, int[] images) {
        super(context, R.layout.countryview, countries);
        this.c = context;
        this.images = images;
        this.countries = countries;
        this.nextGame = nextGame;
    }

    public class ViewHolder {
        TextView country;
        TextView nextGame;
        ImageView img;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.countryview, null);
        }

        final ViewHolder holder = new  ViewHolder();

        holder.country = (TextView) convertView.findViewById(R.id.name);
        holder.nextGame = (TextView) convertView.findViewById(R.id.nextGame);
        holder.img = (ImageView) convertView.findViewById(R.id.imageView);

        holder.img.setImageResource(images[position]);
        holder.country.setText(countries[position]);
        holder.nextGame.setText(nextGame[position]);

        return convertView;
    }
}
