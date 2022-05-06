import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class minandmaxlab2Test {
    minandmaxlab2 A;
    int[] x = {2,4,1,9,5};
    int max=9;
    int min=1;
    @BeforeEach
    public void init(){
        A = new minandmaxlab2();
    }
    @Test
    public void findmax(){
        assertEquals(max,A.findmax(x));
    }
    @Test
    public void findmin(){
        assertEquals(min,A.findmin(x));
    }
    @AfterEach
    public void cleanuo(){
        x=null;
    }
}
class minandmax2{
    minandmaxlab2 A;
    int[] y = {2,4,1,9,5};
    int max=9;
    int min=1;
    @BeforeEach
    public void init(){
        A = new minandmaxlab2();
    }
    @Nested
    class Maxtest{
        @Test
        @DisplayName("max value of the array")
        public void findmax() {
            assertEquals(max,A.findmax(y));
        }
    }
    @Nested
    class Mintest{
        @Test
        @DisplayName("min value of the array is")
        public void findmin() {
            assertEquals(min,A.findmin(y));
        }
    }
    @AfterEach
    public void cleanup(){
        y=null;
    }

}