import cs.lab.ChocolateBoiler;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Test
public class ChocolateBoilerTest {
    @Test
    public void testFill() throws Exception{
        ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
        chocolateBoiler.fill();
        if(chocolateBoiler.isEmpty()){
            throw new Exception("Error");
        }
    }

    @Test
    public void testBoil() throws Exception{
        ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        if(chocolateBoiler.isEmpty() && !chocolateBoiler.isBoiled()){
            throw new Exception("Error");
        }
    }

    @Test
    public void testDrain() throws Exception{
        ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
        if(!chocolateBoiler.isEmpty() && !chocolateBoiler.isBoiled()){
            throw new Exception("Error");
        }
    }
}
