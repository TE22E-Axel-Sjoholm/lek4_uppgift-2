import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        System.out.print("Skriv in en text: ");
        String text1 = tangentbord.nextLine();
        System.out.println("\""+text1+"\" har " +text1.length()+" bokstäver");   
        System.out.print("Tecknet du letar efter: ");
        String tecken = tangentbord.nextLine();
        int plats = text1.indexOf(tecken);
        System.out.println("Tecknet finns på den "+(plats+1)+" platsen");
        System.out.print("Startpunkten på delen av texten du ska plocka ut: ");
        int start = tangentbord.nextInt();
        System.out.print("Slutpunkten på delen av texten du ska plocka ut: ");
        int slut = tangentbord.nextInt();
        String TextDel = text1.substring(start, slut);
        System.out.println("Delen är \""+TextDel+"\"");
    tangentbord.close();
    }
}
