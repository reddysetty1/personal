import java.util.*;

//using peek intermediate method

class program8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<String> n = new ArrayList<>(0);
        int c = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<c;i++)
        {
            n.add(sc.nextLine());
        }
        List<String> m = n.stream().peek(x -> System.out.println(x)).map(String:: toUpperCase).peek(x -> System.out.println(x)).toList();
        System.out.println(m);

    }
}
