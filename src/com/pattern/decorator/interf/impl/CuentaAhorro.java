package com.pattern.decorator.interf.impl;

import com.pattern.decorator.interf.ICuentaBancaria;
import com.pattern.decorator.model.Cuenta;

public class CuentaAhorro implements ICuentaBancaria {

    @Override
    public void abrirCuenta(Cuenta c) {
        System.out.println("-------------------------");
        System.out.println("Se abrió una cuenta de Ahorros");
        System.out.println("Cliente: " + c.getCliente());
    }
}
