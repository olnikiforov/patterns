package Homework8.Task2;

public class DropdownButton extends Button{
    public DropdownButton(Size size) {
        super(size);
    }

    @Override
    void draw() {
        System.out.println("Setting size to " + size.getSize() + "...");
        System.out.println("Drawing a dropdown button.\n");
    }
}
