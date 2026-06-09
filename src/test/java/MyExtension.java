import org.junit.jupiter.api.extension.*;

public class MyExtension implements BeforeAllCallback, AfterAllCallback, BeforeEachCallback, AfterEachCallback,BeforeTestExecutionCallback,AfterTestExecutionCallback {


    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        System.out.println("AfterAll");
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        System.out.println("Teardown");
    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println("Before All");

    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {

        System.out.println("Setup");
    }

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        System.out.println("Just after test");
    }

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        System.out.println("Just before test");


    }
}

