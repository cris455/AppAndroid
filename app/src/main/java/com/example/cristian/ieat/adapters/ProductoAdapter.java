package com.example.cristian.ieat.adapters;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cristian.ieat.R;
import com.example.cristian.ieat.models.Producto;

import java.util.List;

/**
 * Created by Cristian on 22/06/2017.
 */

public class ProductoAdapter extends BaseAdapter {

    LayoutInflater inflater;
    List<Producto> data;

    public List<Producto> getData() {
        return data;
    }

    public void setData(List<Producto> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public ProductoAdapter(LayoutInflater inflater, List<Producto> list) {
        this.inflater = inflater;
        this.data = list;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return data.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;
        if (v==null)
            v = inflater.inflate(R.layout.template_comidas, viewGroup, false);

        Producto prod = data.get(i);

        TextView nombre = (TextView) v.findViewById(R.id.txtNombreProd);
        TextView precio = (TextView) v.findViewById(R.id.txtPrecioProd);
        ImageView img  = (ImageView) v.findViewById(R.id.imgProd);

        nombre.setText(prod.getNombre());
        precio.setText(""+prod.getPrecio());
        //img.setImageURI(prod.setImg(););

        return null;
    }
}
