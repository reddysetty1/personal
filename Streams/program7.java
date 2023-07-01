import java.util.*;

//using skip intermediate method

class program7
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
        List<Integer> m = n.stream().skip(3).toList();
        System.out.println(m);

    }
}
