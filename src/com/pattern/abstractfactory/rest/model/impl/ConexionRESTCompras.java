package com.pattern.abstractfactory.rest.model.impl;

import com.pattern.abstractfactory.rest.model.IConexionREST;

public class ConexionRESTCompras implements IConexionREST {

    @Override
    public void leerURL(String url) {
        System.out.println("Conectándose a " + url);
    }
}