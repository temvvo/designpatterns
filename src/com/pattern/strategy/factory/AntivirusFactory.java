package com.pattern.strategy.factory;

import com.pattern.abstractfactory.rest.model.IConexionREST;
import com.pattern.abstractfactory.rest.model.impl.ConexionRESTCompras;
import com.pattern.abstractfactory.rest.model.impl.ConexionRESTNoArea;
import com.pattern.abstractfactory.rest.model.impl.ConexionRESTVentas;
import com.pattern.strategy.model.AdvancedAntivirus;
import com.pattern.strategy.model.SimpleAntivirus;
import com.pattern.strategy.strategy.IStrategy;

public class AntivirusFactory {

    public static IStrategy getStrategy(AntiVirusStrategy antivirusStrategy) {
    IStrategy strategy = null;

        switch (antivirusStrategy) {
        case ADVANCED:
            strategy=  new AdvancedAntivirus();
            break;
        case SIMPLE:
            strategy = new SimpleAntivirus();
            break;
    }

        return strategy;
    }
}
