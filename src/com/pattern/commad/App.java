package com.pattern.commad;

import com.pattern.commad.commands.Invoker;
import com.pattern.commad.commands.impl.DepositarImpl;
import com.pattern.commad.commands.impl.RetirarImpl;
import com.pattern.commad.model.Cuenta;

public class App {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1, 200);

        DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
        RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);

        Invoker ivk = new Invoker();
        ivk.recibirOperacion(opDepositar);
        ivk.recibirOperacion(opRetirar);

        ivk.realizarOperaciones();
    }
}
