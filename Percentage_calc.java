import java.util.Scanner;

public class Percentage_calc {
    public static void main(String [] ar)
    {
        Stats.get_input();
        System.out.println("and percentage scored by you is: "+Stats.percentage()+"%");
    }
}

class Stats
{
    private static float maths;
    private static float physics;
    private static float chemistry;
    private static float cs;
    private static float english;
    private static float max_marks;


    public static float percentage()
    {
        float percentage = maths+physics+chemistry+cs+english;
        System.out.println("Marks scored by you: "+percentage+"/"+max_marks);
        percentage = percentage/max_marks;
        percentage*=100;
        return percentage; 
    }


    public static void get_input()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks scored in maths: ");
        maths = input.nextFloat();
        System.out.print("Enter marks scored in physics: ");
        physics = input.nextFloat();
        System.out.print("Enter marks scored in chemistry: ");
        chemistry = input.nextFloat();
        System.out.print("Enter marks scored in cs: ");
        cs = input.nextFloat();
        System.out.print("Enter marks scored in english: ");
        english = input.nextFloat();
        System.out.print("Enter max marks: ");
        max_marks = input.nextFloat();
        input.close();
    }
}