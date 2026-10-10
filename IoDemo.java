import java.io.*;
public class IoDemo
{
    public static void main(String[] args) throws IOException{
        FileWriter writer=null;
        FileReader reader=null;
        try{
        File file=new File("D:\\JAVA PROGRAMS\\vinay.txt");
           reader=new FileReader(file);
          char[] ch=new char[(int)file.length()];
          writer=new FileWriter(file,true);
          writer.write("hey vs code keep my data intact ");
          reader.read(ch);
          for(char c:ch)
          {
            System.out.print(c);
          }
         
        
        }
        catch(IOException e)
        {
            System.out.println("Something Went Wrong "+ e);
        }
        finally{
            
                writer.close();
                reader.close();
        }

    }
}