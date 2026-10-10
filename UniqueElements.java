import java.util.HashSet;
import java.util.Arrays;

class UniqueElements{
    public static void main(String[] args){
        int[] arr={1,2,9,18,18,2,36,27,36,54};
        HashSet<Integer> set=new HashSet<>(Arrays.asList(arr));
        
        System.out.println(set.size());
    }

}