package Homework10.Task1;

public class PostSpaceDecorator extends AbstractDecorator {

    public PostSpaceDecorator(Outputer outputer) {
        super(outputer);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" ");
    }
}
