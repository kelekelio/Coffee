import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine(550, 9, 120, 540, 400);

        Scanner scanner = new Scanner(System.in);

        String operation;



        do {
            System.out.println(Constants.INITIAL.string);
            operation = scanner.next();
            machine.actions(operation);
        }while (!operation.equals("exit"));


    }
}
