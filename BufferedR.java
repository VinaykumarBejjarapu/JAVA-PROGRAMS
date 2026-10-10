import java.io.*;
class BufferedR{
    public static void main(String[] args) throws IOException
    {
      
        BufferedReader br=null;
         FileReader reader=null;
        try{
            File file=new File("D:\\JAVA PROGRAMS\\arjun.txt");
            
            reader=new FileReader(file);
            br =new BufferedReader(reader);
            String s=br.readLine();
            while(s!=null)
            {
                System.out.println(s);
                s=br.readLine();
            }

        }
        catch(Exception e){
            System.out.println("Something went wrong"+ e);
        }
        finally{
            br.close(); 
            reader.close();
        }
        
    }
}