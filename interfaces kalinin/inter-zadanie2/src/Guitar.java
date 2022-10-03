public class Guitar implements Instrument
{
    int NumberOfStrings;

    @Override //метод используется именно для этого класса
    public void play()
    {
        System.out.println("Играет гитара с "+NumberOfStrings+" струнами");
    }
}
