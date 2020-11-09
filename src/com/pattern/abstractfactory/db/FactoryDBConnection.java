package com.pattern.abstractfactory.db;

import com.pattern.abstractfactory.db.model.IConexionBD;
import com.pattern.abstractfactory.db.model.SQLMotor;
import com.pattern.abstractfactory.db.model.impl.*;
import com.pattern.abstractfactory.inter.AbstractFactory;
import com.pattern.abstractfactory.rest.Department;
import com.pattern.abstractfactory.rest.model.IConexionREST;

public class FactoryDBConnection extends AbstractFactory {


    @Override
    public IConexionBD getBD(SQLMotor motor) {
        IConexionBD connection = new ConexionVacia();
        switch (motor){
            case ORACLE:
                connection = new ConexionOracle();
                break;
            case MYSQL:
                connection = new ConexionMySQL();
                break;

            case POSTGRE:
                connection = new ConexionPostgreSQL();
                break;
            case SQL:
                connection = new ConexionSQLServer();
                break;
        }
        return connection;
    }

    @Override
    public IConexionREST getREST(Department area) {
        return null;
    }

}
