import java.util.*;

//using distinct intermediate method

class program4
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
        List<Integer> m = n.stream().distinct().toList();
        System.out.println(m);
    }
}
