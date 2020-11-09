package com.pattern.abstractfactory.rest;

import com.pattern.abstractfactory.db.model.IConexionBD;
import com.pattern.abstractfactory.db.model.SQLMotor;
import com.pattern.abstractfactory.inter.AbstractFactory;
import com.pattern.abstractfactory.rest.model.IConexionREST;
import com.pattern.abstractfactory.rest.model.impl.ConexionRESTCompras;
import com.pattern.abstractfactory.rest.model.impl.ConexionRESTNoArea;
import com.pattern.abstractfactory.rest.model.impl.ConexionRESTVentas;

public class FactoryRESTConnection extends AbstractFactory {

    @Override
    public IConexionREST getREST(Department area) {
        IConexionREST rest = new ConexionRESTNoArea();
        
        switch (area) {
            case SALES:
                rest= new ConexionRESTVentas();
                break;
            case BOUGHTS:
                rest = new ConexionRESTCompras();
                break;
        }

        return rest;
    }

    @Override
    public IConexionBD getBD(SQLMotor motor) {
        return null;
    }
}
