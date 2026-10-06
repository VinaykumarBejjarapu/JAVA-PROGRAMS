public class Mythread implements Runnable {
    @Override
    public void run()
    {
        for(int i=0;i<2;i++)
        {
            System.out.println("Om Namah Shivaya");
        }
    }

}
class ThreadbyRunnable{
    public static void main(String args[])
    {
       Thread t = new Thread(new Mythread());
       Thread s= new Thread(new Mythread());

       t.start();
       s.start();
           
    }
}
