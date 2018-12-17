package com.nyoba.app.nyoba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListFragment extends Fragment {
    ListView listView;
    String[] sepedaNames = {"Modief Ninja Banter","Modief Ninja Kilat","Modief Ninja Balap","Modief Ninja Kontes","Modief Ninja Mawut"};
    int[] sepedaImages = {R.drawable.ninja1,R.drawable.ninja2,R.drawable.ninja3,R.drawable.ninja4,R.drawable.ninja5};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);
        //finding listview
        listView = rootView.findViewById(R.id.listview);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(),Detail.class);
                intent.putExtra("name",sepedaNames[position]);
                intent.putExtra("image",sepedaImages[position]);
                startActivity(intent);

            }
        });
        return rootView;
    }
    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return sepedaImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.item_sepeda,null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.txtJudul);
            ImageView image = view1.findViewById(R.id.imgSepeda);

            name.setText(sepedaNames[i]);
            image.setImageResource(sepedaImages[i]);
            return view1;



        }
    }
}
