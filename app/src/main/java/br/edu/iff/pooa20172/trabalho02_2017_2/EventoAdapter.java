package br.edu.iff.pooa20172.trabalho02_2017_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by fazenda on 30/11/17.
 */

public class EventoAdapter extends ArrayAdapter<Evento> {

    private final Context context;
    private final ArrayList<Evento> elementos;

    public EventoAdapter(Context context, ArrayList<Evento> elementos) {
        super(context, R.layout.item_evento, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.item_evento, parent, false);

        TextView nomeEvento = (TextView) rowView.findViewById(R.id.tvNome);
        TextView data = (TextView) rowView.findViewById(R.id.tvData);
        TextView local = (TextView) rowView.findViewById(R.id.tvLocal);

        nomeEvento.setText(elementos.get(position).getNome());
        data.setText(elementos.get(position).getData());
        local.setText(elementos.get(position).getLocal());
        return rowView;
    }
}
