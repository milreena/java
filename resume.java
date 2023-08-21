import java.util.Scanner;
interface Resume
{
    void biodata();
    void printResume();
}
class teacher implements Resume
{
    String name;
    String qualification,achievements;
    int experience;
    public void biodata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        name=sc.next();
         System.out.println("enter qualification");
         qualification=sc.next();
          System.out.println("enter achievments");
          achievements=sc.next();
          System.out.println("enter experience");
            experience=sc.nextInt();
    }
    public void printResume()
    {
        System.out.println("name="+name);
        System.out.println("qualification="+qualification);
        System.out.println("experience="+experience);
         System.out.println("achievements="+achievements);
    }
}
class student implements Resume
{
    String name;
    String result;
    String discipline;
    public void biodata()
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter name");
        name=sc.next();
        System.out.println("enter result");
        result=sc.next();
        System.out.println("enter discipline");
        discipline=sc.next();
    }
    public void printResume()
    {
        System.out.println("name="+name);
        System.out.println("result="+result);
         System.out.println("discipline="+discipline);
    }
}
class demo
{
    public static void main(String args[])
    {
        teacher t1=new teacher();
        t1.biodata();
        t1.printResume();
        student s1=new student();
        s1.biodata();
        s1.printResume();
    }
}



