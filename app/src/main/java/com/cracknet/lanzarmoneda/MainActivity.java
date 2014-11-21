package com.cracknet.lanzarmoneda;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.lanzarMoneda);
        boton.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                Context ctx = v.getContext();
                Toast toast = Toast.makeText(ctx, R.string.helpLanzar, Toast.LENGTH_SHORT);
                toast.show();

                Log.i("Button [onLongClick]", "Mostrada información con exito");
                return false;
            }
        });
    }

    public void lanzarMoneda(View view) {
        ImageView moneda = (ImageView) findViewById(R.id.moneda);
        int imgId = LanzarMoneda.lanzarMoneda(this);
        moneda.setImageResource(imgId);

        Log.i("Button [onClick]", "Lanzamiento moneda con exito");
    }
}
