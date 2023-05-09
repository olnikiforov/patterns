package Homework10.Task1;

public class Task1 {
    public static void main(String[] args) {
        Outputer outputer;
        outputer = new InitDecorator();
        outputer = new PreWordDecorator(outputer,"hello");
        outputer = new PostComaDecorator(outputer);
        outputer = new PostSpaceDecorator(outputer);
        outputer = new PostWordDecorator(outputer,"world");
        outputer = new PostExclaimDecorator(outputer);
        outputer = new PostEndlDecorator(outputer);
        outputer.print();
    }
}
