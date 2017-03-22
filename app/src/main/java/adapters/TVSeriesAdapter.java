package adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;
import models.carrito;
import itesloscabos.com.carrito.R;

public class TVSeriesAdapter extends ArrayAdapter<carrito> {

    Context context;
    int resource;
    List<carrito> list;

    public TVSeriesAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<carrito> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        this.list = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = null;

        // Inflar el layout que definimos para este ListView
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(resource, parent, false);

        // Conectar los controles que se encuentrane en el layout que
        // acabamos de inflar
        TextView nombre, categoria, resena,califi;
        Button borrar;

        nombre = (TextView) v.findViewById(R.id.nombre);
        categoria = (TextView) v.findViewById(R.id.categoria);
        resena = (TextView) v.findViewById(R.id.resena);
        califi=(TextView)v.findViewById(R.id.calificacion);
        borrar = (Button) v.findViewById(R.id.list_borrar);


        // Obtener el objeto de serie de TV que tenemos en esta posicion
        carrito serie = list.get(position);

        // Establecer los textos de la vista
        nombre.setText(serie.getNombre());

        categoria.setText(serie.getCategoria());

        resena.setText(serie.getResena());

        califi.setText(serie.getCalif());

        return v;
    }
}
