package com.pattern.decorator.decorator;

import com.pattern.decorator.interf.ICuentaBancaria;
import com.pattern.decorator.model.Cuenta;

public abstract class CuentaDecorator implements ICuentaBancaria {

    protected ICuentaBancaria cuentaDecorada;

    public CuentaDecorator(ICuentaBancaria cuentaDecorada) {
        this.cuentaDecorada = cuentaDecorada;
    }

    @Override
    public void abrirCuenta(Cuenta c) {
        this.cuentaDecorada.abrirCuenta(c);
    }
}
