import java.util.HashMap;
class HashMapExample{
    public static void main(String args[])
    {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(001,"Arjun");
        map.put(002,"Varun");
        map.put(003,"Karan");
        System.out.println(map);
        System.out.println("Size of the map is :"+ map.size());

    }
}