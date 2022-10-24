public class Student extends Person {
    private int Roll;
    public void setRoll(int Nu)
    {
        Roll = Nu;
    }
    public int getRoll(int print)
    {
        if(print == 1)
        System.out.println("Roll no: "+Roll);
        return Roll;
    }
}
