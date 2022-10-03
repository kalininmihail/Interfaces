public class Magazine implements Printable
{
    String Name;

    public void Print()
    {
        System.out.println("Печать журнала: ");
    }
    public void printMagazines(Printable[] printable)
    {
        System.out.println(Name);
    }
}

