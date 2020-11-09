package com.pattern.abstractfactory;

import com.pattern.abstractfactory.db.model.IConexionBD;
import com.pattern.abstractfactory.db.model.SQLMotor;
import com.pattern.abstractfactory.inter.AbstractFactory;
import com.pattern.abstractfactory.rest.Department;
import com.pattern.abstractfactory.rest.model.IConexionREST;

public class App {
    public static void main(String[] args) {
        AbstractFactory fabricaBD = FactoryProducer.getFactory(Source.DB);
        IConexionBD cxBD1 = fabricaBD.getBD(SQLMotor.MYSQL);

        cxBD1.conectar();

        AbstractFactory fabricaREST = FactoryProducer.getFactory(Source.REST);
        IConexionREST cxRS1 = fabricaREST.getREST(Department.BOUGHTS);

        cxRS1.leerURL("https://www.youtube.com/subscription_center?add_user=mitocode");
    }
}
