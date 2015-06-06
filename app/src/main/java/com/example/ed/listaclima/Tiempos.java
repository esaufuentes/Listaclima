package com.example.ed.listaclima;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ed on 06/06/2015.
 */
public class Tiempos extends Activity {
    private List<Tiempo> myTiempo=new ArrayList<Tiempo>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiempos);
        Dias();
        DiasView();
    }

    private void Dias(){

        myTiempo.add(new Tiempo("Lunes","nublado", android.R.drawable.nublado));
        myTiempo.add(new Tiempo("Martes", "nublado", android.R.drawable.nublado));
        myTiempo.add(new Tiempo("Miercoles", "nublado", android.R.drawable.nublado));
        myTiempo.add(new Tiempo("Jueves", "nublado", android.R.drawable.nublado));
        myTiempo.add(new Tiempo("Viernes", "nublado", android.R.drawable.nublado));
    }
    private void DiasView(){
        ArrayAdapter<Tiempo>adapter=new MyListAdapter();
        ListView list=(ListView)findViewById(R.id.listview);


    }

    private class MyListAdapter extends ArrayAdapter<Tiempo>{
        public MyListAdapter(){
            super(Tiempos.this,R.layout,item_vie,myTiempo);
        }

        public View geView(int position,View converView,ViewGroup parent){
            View itemView=converView;
            if (itemView==null)
                itemView=getLayoutInflater().inflate(R.layout.item_vie,parent,false);
            Tiempo CurrentTiempo=myTiempo.get(position);

            ImageView imageViewp=(ImageView)itemView.findViewById(R.id.imageItem_icon);

        }
    }
}




