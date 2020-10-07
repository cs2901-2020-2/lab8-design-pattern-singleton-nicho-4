package cs.lab;

public class ChocolateBoilerSingleton {
    private static ChocolateBoilerSingleton instance;
    private static final Object mutex = new Object();
    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerSingleton(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerSingleton getInstance(){
        ChocolateBoilerSingleton result = instance;
        if (instance == null){
            synchronized (mutex){
                result = instance;
                if(result == null){
                    instance = result = new ChocolateBoilerSingleton();
                }
            }
        }
        return result;
    }
}
