import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber",
               "pretty", "json:target/report.json",
                "com.juliangb.framework.util.reporting.ReportListener"

}
)
public class CucumberTest {
}
