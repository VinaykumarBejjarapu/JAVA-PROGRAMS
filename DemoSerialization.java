import java.io.*;
public class DemoSerialization {
    public static void main(String args[])
    {
        FileOutputStream fout=null;
        BufferedOutputStream bout=null;
        ObjectOutputStream oos=null;
        // Student s1=new Student(20,"John",true);
        // s1.display();
        try{
            fout=new FileOutputStream("D:\\JAVA PROGRAMS\\arjun.txt");
             bout=new BufferedOutputStream(fout);
            oos=new ObjectOutputStream(bout);
            oos.writeObject(s1);

        }
        catch(FileNotFoundException e)
        {
           e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        

    }
}
