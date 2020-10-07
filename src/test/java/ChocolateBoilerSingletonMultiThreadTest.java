import cs.lab.ChocolateBoiler;
import cs.lab.ChocolateBoilerSingleton;
import org.testng.annotations.Test;

@Test
public class ChocolateBoilerSingletonMultiThreadTest {

    @Test(invocationCount = 1000, threadPoolSize = 1000)
    public void testTime() throws Exception {
        ChocolateBoilerSingleton chocolateBoilerSingleton1 = ChocolateBoilerSingleton.getInstance();
        ChocolateBoilerSingleton chocolateBoilerSingleton2 = ChocolateBoilerSingleton.getInstance();
        if(chocolateBoilerSingleton1 != chocolateBoilerSingleton2){
            throw new Exception("Singleton error!");
        }
    }
}
