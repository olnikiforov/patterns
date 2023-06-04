package Homework14.Task3;

public class ArithmeticSimulator {
    public static void main(String[] args) {
        OperationHandler additionHandler = new AdditionHandler();
        OperationHandler subtractionHandler = new SubtractionHandler();
        OperationHandler multiplicationHandler = new MultiplicationHandler();
        OperationHandler divisionHandler = new DivisionHandler();


        additionHandler.setNext(subtractionHandler);
        subtractionHandler.setNext(multiplicationHandler);
        multiplicationHandler.setNext(divisionHandler);

        additionHandler.handleRequest(10, 5, "+");
        additionHandler.handleRequest(10, 5, "-");
        additionHandler.handleRequest(10, 5, "*");
        additionHandler.handleRequest(10, 5, "/");


        additionHandler.handleRequest(10, 5, "%");
    }
}
