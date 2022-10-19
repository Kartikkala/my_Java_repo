import java.util.Scanner;


public class calculator {
    public static void main(String [] args)
    {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = a.nextInt();
        System.out.print("Enter another number: ");
        int y = a.nextInt();
        
        System.out.println("Choose operation: ");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.print("Enter choice(1/2/3/4): ");
        int choice = a.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Addition is: "+Operation.Add(x,y));
                break;
            case 2:
                System.out.println("Subtraction is: "+Operation.Subtract(x,y));
                break;
            case 3:
                System.out.println("Multiplication is: "+Operation.Multiply(x,y));
                break;
            case 4:
                System.out.println("Division is: "+Operation.Divide(x,y));
                break;
        }

        a.close();

    }
    public class Operation
    {
        public static int Add(int x, int y)
        {
            return x+y;
        }
        public static int Subtract(int x, int y)
        {
            return x-y;
        }
        public static int Multiply(int x, int y)
        {
            return x*y;
        }
        public static int Divide(int x, int y)
        {
            return x/y;
        }
    }
}