public class singletonClass
{
    // Eager Initialization
    private static singletonClass INSTANCE = null;
    
    private singletonClass()
    {

    }

    public static singletonClass getInstance() 
    {
        if(INSTANCE == null){
            return new singletonClass();
        }

        return INSTANCE;
    }

}
