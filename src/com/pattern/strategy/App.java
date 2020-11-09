package com.pattern.strategy;

import com.pattern.strategy.factory.AntiVirusStrategy;
import com.pattern.strategy.factory.AntivirusFactory;

public class App {
    public static void main(String[] args) {
        //Strategy can be changed in execution time from the frontend:
        // IE: A button in FE to select Advanced or Simple antivirus execution
        //     Context context = new Context(AntivirusFactory.getStrategy(AntiVirusStrategy.SIMPLE));
        Context context = new Context(AntivirusFactory.getStrategy(AntiVirusStrategy.ADVANCED));
        context.execute();
    }
}
