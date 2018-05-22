package com.ivaangb.material.material;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ivang on 30/4/2018.
 */

public class adaptadorPersonas extends RecyclerView.Adapter<adaptadorPersonas.personaViewHolder> {
    private ArrayList<Persona> personas;
    private onPersonaClickListener clickListener;

    public adaptadorPersonas(ArrayList<Persona> personas, onPersonaClickListener clickListener) {
        this.personas = personas;
        this.clickListener = clickListener;
    }


    @Override
    public personaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personas, parent, false);

        return new personaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(personaViewHolder holder, int position) {
        final Persona p = personas.get(position);
        holder.foto.setImageResource(p.getFoto());
        holder.cedula.setText(p.getCedula());
        holder.nombre.setText(p.getNombre());
        holder.apellido.setText(p.getApellido());


        holder.v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onPersonaClick(p);
            }
        });

    }

    @Override
    public int getItemCount() {
        return personas.size();
    }

    public static class personaViewHolder extends RecyclerView.ViewHolder{

        private ImageView foto;
        private TextView cedula, nombre, apellido;
        private View v;

        public personaViewHolder(View itemView){
            super(itemView);

            v = itemView;
            foto = v.findViewById(R.id.imgFoto);
            cedula = v.findViewById(R.id.lblCedula);
            nombre = v.findViewById(R.id.lblNombre);
            apellido = v.findViewById(R.id.lblApellido);

        }
    }

    public interface onPersonaClickListener{
        void onPersonaClick(Persona p);
    }

}
