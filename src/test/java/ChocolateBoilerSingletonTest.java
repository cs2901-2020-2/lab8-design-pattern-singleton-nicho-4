import cs.lab.ChocolateBoiler;
import cs.lab.ChocolateBoilerSingleton;
import org.testng.annotations.Test;

@Test
public class ChocolateBoilerSingletonTest {

    @Test
    public void testSingleton() throws Exception{
        ChocolateBoilerSingleton chocolateBoilerSingleton1 = ChocolateBoilerSingleton.getInstance();
        ChocolateBoilerSingleton chocolateBoilerSingleton2 = ChocolateBoilerSingleton.getInstance();
        if(chocolateBoilerSingleton1 != chocolateBoilerSingleton2){
            throw new Exception("Singleton error!");
        }
    }

}
