import java.util.*;

//using filter intermediate method
class program1{
    public static void main(String[] args) 
    {
         Scanner s = new Scanner(System.in);
         List<Integer> n = new ArrayList<>(0);
         n.add(s.nextInt());
         n.add(s.nextInt());
         n.add(s.nextInt());
         n.add(s.nextInt());
         n.add(s.nextInt());
         n.add(s.nextInt());
         List<Integer> m = n.stream().filter(x-> x%2==0).toList();
         System.out.println(m);
         n.stream().filter(x -> x%2 == 0).forEach(x -> System.out.println(x));
    }
}
