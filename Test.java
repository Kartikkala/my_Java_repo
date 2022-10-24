public class Test {
    public static void main(String [] a)
    {
        Student s1 = new Student();
        s1.setName("Kartik");
        s1.setNo(91121);
        s1.setRoll(12);

        s1.showName();
        s1.showPN();
        int Rno = s1.getRoll(0);
        System.out.println("Roll No: "+Rno);

    }
}
