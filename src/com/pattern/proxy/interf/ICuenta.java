package com.pattern.proxy.interf;

import com.pattern.proxy.model.Cuenta;

public interface ICuenta {

    Cuenta retirarDinero(Cuenta cuenta, double monto);
    Cuenta depositarDinero(Cuenta cuenta, double monto);
    void mostrarSaldo(Cuenta cuenta);
}
