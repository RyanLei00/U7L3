import java.util.ArrayList;

public class ArrayListTest
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jamal");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");

        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }

        for (String x: names)
        {
            System.out.println(x);
        }

        int i = 0;
        while (i < names.size())
                {
                    System.out.println(names.get(i));
                    i++;
                }
    }
}

