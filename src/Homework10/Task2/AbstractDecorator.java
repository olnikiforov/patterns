package Homework10.Task2;

abstract public class AbstractDecorator extends Beverage {

    final protected Beverage wrapper;

    public AbstractDecorator(Beverage beverage) {
        this.wrapper = beverage;
    }
}