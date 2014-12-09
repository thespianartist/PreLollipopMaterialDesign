package la.mejorando.prelollipopmaterialdesign;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import la.mejorando.prelollipopmaterialdesign.adapters.PusheenAdapter;
import la.mejorando.prelollipopmaterialdesign.models.Pusheen;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Configurando que el Toolbar como ActionBar
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_my_toolbar);
        //En este ejemplo, ocultamos el titulo de la aplicación, esto es opcional
        toolbar.setTitle("I am Pusheen");
        setSupportActionBar(toolbar);


        //Creando el Dataset, recuerda que esto no siempre es hardcodeado
        ArrayList<Pusheen> pusheens = new ArrayList<>();

        Pusheen pusheen = new Pusheen();
        pusheen.setId(1);
        pusheen.setName("Pusheen");
        pusheen.setPasTime("Blogger");
        pusheens.add(pusheen);

        Pusheen pusheen2 = new Pusheen();
        pusheen2.setId(2);
        pusheen2.setName("Pusheen");
        pusheen2.setPasTime("Sculpor");
        pusheens.add(pusheen2);

        Pusheen pusheen3 = new Pusheen();
        pusheen3.setId(3);
        pusheen3.setName("Stormy");
        pusheen3.setPasTime("Mage");
        pusheens.add(pusheen3);

        Pusheen pusheen4 = new Pusheen();
        pusheen4.setId(4);
        pusheen4.setName("Pusheen");
        pusheen4.setPasTime("Tribute");
        pusheens.add(pusheen4);

        Pusheen pusheen5 = new Pusheen();
        pusheen5.setId(5);
        pusheen5.setName("Stormy");
        pusheen5.setPasTime("adventurer");
        pusheens.add(pusheen5);

        Pusheen pusheen6 = new Pusheen();
        pusheen6.setId(1);
        pusheen6.setName("Pusheen");
        pusheen6.setPasTime("Blogger");
        pusheens.add(pusheen6);

        Pusheen pusheen7 = new Pusheen();
        pusheen7.setId(2);
        pusheen7.setName("Pusheen");
        pusheen7.setPasTime("Sculpor");
        pusheens.add(pusheen7);

        Pusheen pusheen8 = new Pusheen();
        pusheen8.setId(3);
        pusheen8.setName("Stormy");
        pusheen8.setPasTime("Mage");
        pusheens.add(pusheen8);


        //Fin de nuestro dataset

        //Configuración del recyclerView, con nuestro dataSet y nuestro Adapter

        //Aqui buscamos el Widget recyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        //A pesar del tamaño de la pantalla, asegurar que los elementos se vean siempre igual.
        recyclerView.setHasFixedSize(true);

        //Configuramos la animación por defecto
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //Ahora le pasamos nuestro dataset y la forma en que se vera cada fila.
        recyclerView.setAdapter(new PusheenAdapter(pusheens, R.layout.row));

        //Importante, ahora podemos indicar si mostrar los elementos como fila o como grilla, en este
        //caso setLayoutManager() esta  configurado como grilla de una columna, es por es eso que se ve
        //como fila, recordar que el mismo resultado se obtiene con
        // recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
