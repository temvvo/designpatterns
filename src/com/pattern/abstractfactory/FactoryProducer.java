package com.pattern.abstractfactory;

import com.pattern.abstractfactory.db.FactoryDBConnection;
import com.pattern.abstractfactory.inter.AbstractFactory;
import com.pattern.abstractfactory.rest.FactoryRESTConnection;

public class FactoryProducer {

        public static AbstractFactory getFactory(Source source) {

            AbstractFactory factory = null;
            switch (source) {
                case DB:
                    factory = new FactoryDBConnection();
                    break;
                case REST:
                    factory = new FactoryRESTConnection();
                    break;
            }
            return factory;

        }

}
