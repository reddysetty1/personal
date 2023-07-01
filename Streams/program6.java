import java.util.*;

//using sorted intermediate method

class program6
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
        List<Integer> m = n.stream().limit(5).toList();
        System.out.println(m);

    }
}
