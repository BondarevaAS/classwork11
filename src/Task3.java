import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();
        switch (animal) {
            case "cow": {
                System.out.println("Mu");
                break;
            }
            case "dog": {
                System.out.println("Woof");
                break;
            }
            case "mouse": {
                System.out.println("Pipi");
                break;
        }
        case "cat":{
        System.out.println("Meow");
        break;
    }
            case"crow": {
                System.out.println("croak");
            break;
}
            default: System.out.println("Ya vam seychas pokazhu kakiye zvuki izdayut zhivotnyye");
        }
    }
}
