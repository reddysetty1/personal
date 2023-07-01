import java.util.*;

//using map and filter intermediate method

class program3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> n = new ArrayList<>(0);
        int c = sc.nextInt();
        for(int i = 0; i<c;i++)
        {
            n.add(sc.nextInt());
        }
        List<Integer> m = n.stream().filter(x -> x<10).filter(x -> x>4).filter(x -> x%2==0).map(x -> x*x).toList();
        System.out.println(m);
    }
}
