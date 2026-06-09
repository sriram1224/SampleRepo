    import org.junit.jupiter.api.*;
    import org.junit.jupiter.api.extension.ExtendWith;

    @ExtendWith(MyExtension.class)
     class LifeCycleTest {

    //    public LifeCycleTest() {
    //        System.out.println("Constructor Called");
    //    }
        @BeforeAll
        static void beforeAll(){
            System.out.println("1. Before All");
        }
        @BeforeEach
        void beforeEach() {
            System.out.println("2. Before Each");
        }
        @Test
        void testOne() {

            System.out.println("3. Test One ");
        }
        @Test
        void testTwo() {

            System.out.println("4. Test Two ");
        }
        @AfterEach
        void afterEach() {
            System.out.println("5. After Each");
        }
        @AfterAll
        static void AfterAll(){
            System.out.println("6. After All");
        }

    }
