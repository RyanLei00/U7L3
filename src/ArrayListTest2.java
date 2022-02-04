import java.util.ArrayList;

public class ArrayListTest2
{
    public static void main(String[] args)
    {
        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Patty"));
        catList.add(new Cat("Keith"));
        catList.add(new Cat("Jerry"));
        catList.add(new Cat("Mary"));

        for (int i = 0; i < catList.size(); i++)
        {
            System.out.println(catList.get(i).getName());
        }

        for (Cat x: catList)
        {
            System.out.println(x.getName());
        }

        int i = 0;
        while (i < catList.size())
        {
                    System.out.println(catList.get(i).getName());
                    i++;
        }
    }
}
