import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");
        String n = scanner.nextLine();

        String nInvertida = inverterString(n);

        System.out.println("String invertida: " + nInvertida);

        scanner.close();
    }

    public static String inverterString(String str) {
   
        char[] charArray = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(str.length() - 1 - i);
        }

        return new String(charArray);
    }
}
