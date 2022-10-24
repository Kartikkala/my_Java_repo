public class Person {
    private String Name;
    private int nou;
    public void setName(String str)
    {
        Name = str;
    }
    public void setNo(int phNo)
    {
        nou = phNo;
    }
    public void showName()
    {
        System.out.println(Name);
    }
    public void showPN()
    {
        System.out.println("Phone No: "+nou);
    }
}
