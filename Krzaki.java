/**safsdsdgs */

import java.util.*;  


public class Krzaki
{
    public static void main(String[] args)
    {
        int r, s, e;

        //v sadzonki
        //r dlugosc rzedu w metrach
        //e ilosc miejsca zajmowanego przez okratowanie
        //s fleglosc miedzy sadzonkami w  metrach

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj dlugosc rzedu: ");
        r = in.nextInt();

        System.out.println("Podaj ilosc miejsca zajmowanego przez okratowanie: ");
        e = in.nextInt();

        System.out.println("Podaj fleglosc miedzy sadzonkami w  metrach: ");
        s = in.nextInt();

        in.close();

        float v = (r - (2*e))/s;

        System.out.println("V = " + v);

        

        
    }
}