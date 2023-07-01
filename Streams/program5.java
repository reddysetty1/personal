import java.util.*;

//using sorted and reverse order intermediate method

class program5
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
        List<Integer> m = n.stream().sorted().toList();
        System.out.println(m);
        List<Integer> k = n.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(k);
    }
}
