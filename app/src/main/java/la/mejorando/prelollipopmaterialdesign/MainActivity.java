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

        //Configurando que el Toolbar como ActionBarActivity
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_my_toolbar);
        toolbar.setTitle("");
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

        //Fin de nuestro dataset

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(new PusheenAdapter(pusheens, R.layout.row));
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
