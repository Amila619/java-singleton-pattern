public class singletonClass
{
    // Eager Initialization
    private static singletonClass INSTANCE = new singletonClass();
    
    private singletonClass()
    {

    }

    public static singletonClass getInstance() 
    {
        return INSTANCE;
    }

}
