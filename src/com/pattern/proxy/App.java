package com.pattern.proxy;

import com.pattern.proxy.interf.ICuenta;
import com.pattern.proxy.interf.impl.CuentaBancoBImpl;
import com.pattern.proxy.model.Cuenta;
import com.pattern.proxy.proxy.CuentaProxy;

public class App {
    public static void main(String[] args) {
    Cuenta c = new Cuenta(1, "Carlos", 100);

    //Si quiero cambiar la implementación solo cambio el mismo en la creación del proxy
        // ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoAImpl());

    ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
		cuentaProxy.mostrarSaldo(c);
    c = cuentaProxy.depositarDinero(c, 50);
    c = cuentaProxy.retirarDinero(c, 20);
		cuentaProxy.mostrarSaldo(c);

}
}
