package colorlib;

import colorlib.utilities.BeforeSuite;
import colorlib.utilities.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

import java.io.IOException;

//@RunWith(CucumberWithSerenity.class)
@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = "src/test/resources/features/autenticacion.feature",
        glue = "colorlib.definitions",
        snippets = SnippetType.UNDERSCORE
        //,tags =  "@EjecucionManualExitosa"
)

public class RunnerTags {
    @BeforeSuite
    public static void test() throws IOException, InvalidFormatException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/autenticacion.feature");
    }
}
