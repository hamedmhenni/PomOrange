package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// path de feature cucumber dans son dossier//
		features = { "src/test/features/AuthentificationOrange.feature" },
		// nom de package src test java de notre cas
		glue = { "StepsDefinitionsLoginOrange","Hooks" }, plugin = { "pretty", "html:target/cucumber-reports.html",
				"json:target/cucumber-reports.json" }
		// le nom de senarios
		, tags = "@tag"

		, publish = true, snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE, monochrome = true)
public class Run {

}
