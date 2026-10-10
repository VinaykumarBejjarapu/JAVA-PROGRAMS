import java.util.HashSet;
public class HashSetExample{
    public static void main(String args[])
    {
        HashSet<Integer> set=new HashSet<Integer>();
        set.add(81);
        set.add(25);
        set.add(49);
        System.out.println(set);
        for(Integer i:set)
        {
            System.out.println(i);
        }
          System.out.println(set.contains(81));
    }

    
}