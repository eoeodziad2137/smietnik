public class Imiona
{
    public static void main(String[] args)
    {
        String name = new String("Kamil");
        String surname = new String("Zdun");
        String city = new String("Targowek");

        int dod = name.length() + surname.length() + city.length();
        int mno = name.length() * surname.length() * city.length();

        System.out.println(dod);
        System.out.println(mno);

    }
}