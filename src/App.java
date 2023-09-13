import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        System.out.print("Skriv in en text: ");
        String text1 = tangentbord.nextLine();
        System.out.print("\""+text1+"\" har " +text1.length()+" bokstäver");   
    
    tangentbord.close();
    }
}
