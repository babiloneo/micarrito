package itesloscabos.com.carrito;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adapters.TVSeriesAdapter;
import models.carrito;

public class AddCartActivity extends AppCompatActivity {

    EditText nombre,categoria,resena,calificacion;
    List<carrito> carritos = new ArrayList<>();
    TVSeriesAdapter adapter = null;
    ListView listView;
    Button agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cart);

        conectarControles();

        enlazaEventos();

        enlazaLista();


    }

    @Override
    protected void onResume() {
        super.onResume();

        enlazaAdaptadores();
        enlazaEventosDeLista();
    }


    private void enlazaEventos() {
        // Botón de agregar
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregaSerie();
            }
        });
    }

    private void enlazaLista() {
        listView = (ListView) findViewById(R.id.lista);
    }

    public void conectarControles(){
        nombre=(EditText)findViewById(R.id.nombre);
        categoria=(EditText)findViewById(R.id.categoria);
        resena=(EditText)findViewById(R.id.resena);
        calificacion=(EditText)findViewById(R.id.calificacion);
        agregar=(Button)findViewById(R.id.agregar);
    }
    //
    private void enlazaAdaptadores() {
        adapter = new TVSeriesAdapter(this, R.layout.listview_tvseries,carritos);
        listView.setAdapter(adapter);
    }
    private void enlazaEventosDeLista() {

    }
    
    public void agregaSerie(){
    carrito add = new carrito();
        add.setNombre(nombre.getText().toString());
        add.setCategoria(categoria.getText().toString());
        add.setResena(resena.getText().toString());
        add.setCalif(calificacion.getText().toString());

        carritos.add(add);
        adapter.notifyDataSetChanged();
    }
}
