// https://youtu.be/6GemznTpC3s

public class singletonDemo {
    public static void main(String[] args) {

        singletonClass obj = singletonClass.getInstance();
        singletonClass obj1 = singletonClass.getInstance();

        // A single object is being used
        obj.getColor();
        obj.setColor("Red");
        obj1.getColor();
    }
}