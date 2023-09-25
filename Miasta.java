public class Miasta
{
    public static void main(String[] args)
    {
        String miasto = new String("Warszawa");
        int stringLength = miasto.length();
        char oneChar = miasto.charAt(0);
        String upperCity = miasto.toUpperCase();
        String lowerCity = miasto.toLowerCase();

        System.out.println("String Length: "+ stringLength);
        System.out.println("One Char: "+ oneChar);
        System.out.println("Upper Ciy: "+ upperCity);
        System.out.println("Lower City: " + lowerCity);

        
    }
}