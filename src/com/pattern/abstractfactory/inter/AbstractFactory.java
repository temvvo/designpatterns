package com.pattern.abstractfactory.inter;

import com.pattern.abstractfactory.db.model.IConexionBD;
import com.pattern.abstractfactory.db.model.SQLMotor;
import com.pattern.abstractfactory.rest.Department;
import com.pattern.abstractfactory.rest.model.IConexionREST;

public abstract class AbstractFactory {
    public abstract IConexionBD getBD(SQLMotor motor);
    public abstract IConexionREST getREST(Department area);
}
