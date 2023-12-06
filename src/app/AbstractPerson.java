package app;

public abstract class AbstractPerson implements AppInterface {
    public int addNumber(int number1, int number2) {
        return number1 + number2;
    }
    public void hello(){
        System.out.println("hello");
    }
    public abstract void study();
    public abstract void love();
}
