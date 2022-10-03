public class Main
{
    public static void main(String[] args)
    {
        Book book1 = new Book();
        book1.Name ="Рассказы";
        Book book2 = new Book();
        book2.Name ="Василий Теркин";
        Magazine magazine1 = new Magazine();
        magazine1.Name ="Максим";
        Magazine magazine2 = new Magazine();
        magazine2.Name ="Трэшэр";
        Printable[] prnt ={book1,book2 ,magazine1, magazine2}; //массив принт

        for(int i=0; i< prnt.length; i++)
        {
            prnt[i].Print();
            if(prnt[i] instanceof Book) //чтобы проверить, был ли объект, на который ссылается переменная, создан на основе какого-либо класса
            {
                ((Book) prnt[i]).printBooks(prnt);
            }
            if(prnt[i] instanceof Magazine)
            {
                ((Magazine) prnt[i]).printMagazines(prnt);
            }

        }
    }
}
