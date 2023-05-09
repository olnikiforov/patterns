package Homework10.Task1;

public class AbstractDecorator implements Outputer{
    private final Outputer wrapper;

    public AbstractDecorator(Outputer outputer) {
        this.wrapper = outputer;
    }

    @Override
    public void print() {
        wrapper.print();
    }
}
