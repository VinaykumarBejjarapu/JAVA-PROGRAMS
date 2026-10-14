import java.util.HashSet;
public class UnionOfArrays {
        
    public static void main(String args[])
    {
         int [] a={1,2,3,4,5,6,7};
         int []b={2,3,2,11,21,12};
         HashSet<Integer> s= new HashSet<>();
         for(int i=0;i<b.length;i++)
         {
            s.add(b[i]);

         }
         for(int i=0;i<a.length;i++)
         {
            s.add(a[i]);
         }
         System.out.println(s);
    }
}
