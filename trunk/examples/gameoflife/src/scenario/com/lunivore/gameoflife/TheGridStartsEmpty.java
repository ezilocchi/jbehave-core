package com.lunivore.gameoflife;

import org.jbehave.scenario.PropertyBasedConfiguration;
import org.jbehave.scenario.Scenario;
import org.jbehave.scenario.parser.PatternScenarioParser;
import org.jbehave.scenario.parser.ScenarioFileLoader;
import org.jbehave.scenario.parser.UnderscoredCamelCaseResolver;

import com.lunivore.gameoflife.steps.GridSteps;

public class TheGridStartsEmpty extends Scenario {

    public TheGridStartsEmpty() {
        super(new GridSteps());
    }

    public TheGridStartsEmpty(final ClassLoader classLoader) {
        super(new PropertyBasedConfiguration() {
            @Override
            public ScenarioFileLoader forDefiningScenarios() {
                return new ScenarioFileLoader(new UnderscoredCamelCaseResolver(), classLoader,
                        new PatternScenarioParser());
            }
        }, new GridSteps());
    }
}