package com.co.choucair.reto_seis.star_sharp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/startSharp.feature",
        tags = "@stories",
        glue = "com.co.choucair.reto_seis.star_sharp.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {

}
