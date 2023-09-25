//W tym programie poakzano jak uzywac danych typu double

public class Sale
{
    public static void main(String[] args)
    {
        Double price, tax, total;

        tax=1.76;
        price=29.75;
        total = 31.51;

        System.out.println("Cena roduktu wynosi: " + price);
        System.out.println("Podatek wynois: " + tax);
        System.out.println("Laczna kwota wynosi: "+total);
    }
}