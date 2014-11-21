package com.cracknet.lanzarmoneda;

import android.app.Activity;
import android.content.res.TypedArray;

import java.security.SecureRandom;

/**
 * Created by usuario.apellido on 14/11/2014.
 */
public class LanzarMoneda {

    public static int lanzarMoneda(Activity actividad) {
        TypedArray imgs = actividad.getResources().obtainTypedArray(R.array.monedas);

        SecureRandom rnd = new SecureRandom();
        int imgIndex = rnd.nextInt(imgs.length());
        return imgs.getResourceId(imgIndex, -1);
    }
}
