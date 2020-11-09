package com.pattern.decorator;

import com.pattern.decorator.decorator.BlindajeDecorator;
import com.pattern.decorator.interf.ICuentaBancaria;
import com.pattern.decorator.interf.impl.CuentaAhorro;
import com.pattern.decorator.model.Cuenta;

public class App {

    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "Carlos");

        ICuentaBancaria cuenta = new CuentaAhorro();
        ICuentaBancaria cuentaBlindada = new BlindajeDecorator(cuenta);

        //cuenta.abrirCuenta(c);
        cuentaBlindada.abrirCuenta(c);
    }
}
