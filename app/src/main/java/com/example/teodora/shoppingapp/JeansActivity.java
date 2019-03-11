package com.example.teodora.shoppingapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class JeansActivity extends AppCompatActivity {

    ListView mylistView;
    int[] images = {R.drawable.dresslace,R.drawable.dress2,R.drawable.dress3,R.drawable.dresspolka,
            R.drawable.dressfloral,R.drawable.dress7,R.drawable.dress8,
            R.drawable.dress9,R.drawable.dress10,R.drawable.dressblack};
    String[] prices={"75lei","60lei","60lei","30.5lei","60lei","89.5lei","75lei","90lei","120lei","70lei"};
    String[] descriptions={"Lace Dress","Elegant Green Dress","Lace Dress","Polka Dress",
            "Floral Print Dress","Navy Blue Dress","Brown Sexy Dress","Cocktail Dress","Red Belt Dress","Casual Dress"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeans);

        Resources res = getResources();
        mylistView = (ListView) findViewById(R.id.myListViewJeans);

        CustomAdapter adapter = new CustomAdapter();
        mylistView.setAdapter(adapter);

    }
    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return prices[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.mylayoutforthelist,null);
            ImageView imagev = (ImageView)convertView.findViewById(R.id.myImageView);
            TextView textViewStore = (TextView) convertView.findViewById(R.id.myTextView);
            TextView textViewDescription = (TextView) convertView.findViewById(R.id.TextViewDescription);
            imagev.setImageResource(images[position]);
            textViewStore.setText(prices[position]);
            textViewDescription.setText(descriptions[position]);
            return convertView;
        }
    }
}
