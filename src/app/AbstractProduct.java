package app;

public abstract class AbstractProduct implements AppInterface {
    public float calInterest(float importPrice, float exportPrice) {
        return exportPrice - importPrice;
    }
    public abstract void eat();
}
