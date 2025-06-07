public class singletonClass
{
    private String color = "Blue";

    // Eager Initialization
    private static singletonClass INSTANCE = new singletonClass();
    
    private singletonClass()
    {

    }

    public static singletonClass getInstance() 
    {
        return INSTANCE;
    }

    public void setColor(String color_) 
    {
        color = color_;
    }

    public void getColor()
    {
        System.out.println(color);
    }


}
