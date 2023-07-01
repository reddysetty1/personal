import java.util.*;
//using map intermediate method
//And also implemented multiple other terminal methods
class program2
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

        //toList
        List<Integer> m = n.stream().map(x -> x*x).toList();
        System.out.println(m);

        //forEach terminal operator
        n.stream().map(x -> x*x).forEach(x -> System.out.println(x));

        //reduce terminal operator
        int k = m.stream().map(x-> x).reduce(0, (a,b) -> a+b); // returns 0 if the stream is emplty which is called as identity.
        System.out.println("sum of elements: "+k);

        //min and max terminal operators
        Optional<Integer> min = m.stream().map(x -> x).min(Integer::compareTo);
        if(min.isPresent())
            System.out.println(min.get());
        else
            System.out.println("Empty");

        Optional<Integer> max = m.stream().map(x -> x).max(Integer::compareTo);
        if(max.isPresent())
            System.out.println(max.get());
        else
            System.out.println("Empty");

        //count terminal operator
        long l = m.stream().map(x -> x).count(); //because count returns datatype long
        System.out.println("Count: "+l);

        //anymatch and allMatch terminal operators
        boolean check = m.stream().map(x->x).anyMatch(x -> x==1);
        if(check)
            System.out.println("1 is there");
        else
            System.out.println("1 is not there");

        boolean check2 = m.stream().map(x->x).allMatch(x -> x%2!=0);
        if(check2)
            System.out.println("all odd numbers");
        else
            System.out.println("all even/mixed numbers");

        //findFirst and findAny terminal operators
        System.out.println(m.stream().map(x -> x+2).findFirst());//returns first element in the list
        System.out.println(m.stream().map(x -> x+2).findAny());//check if anything is there in the list and it can be Optional Integer. datatype

    }
}
