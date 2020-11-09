package com.pattern.abstractfactory.rest.model.impl;


import com.pattern.abstractfactory.rest.model.IConexionREST;

public class ConexionRESTNoArea implements IConexionREST {

    @Override
    public void leerURL(String url) {
        System.out.println("AREA NO ELEGIDA");
    }

}