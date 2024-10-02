import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>();
        int n = 10;
        int first = 0;
        int second = 1;
        
        for (int i = 0; i < n; i++) {
            list.add(first); 
            int next = first + second;
            first = second;
            second = next;
        }
        
        System.out.print("Digite um número para verificar se pertence a Sequência Fibonacci: ");
        int num = sc.nextInt();
        System.out.println();
        
        if (list.contains(num)){
        	System.out.println("O número " + num + " pertence a Sequência Fibonacci.");
        }
        else {
        	System.out.println("O número " + num + " não pertence a Sequência Fibonacci. ");
        }
        
        System.out.println("A sequencia de Fibonacci é: " + list);
      
        sc.close();
	}

}

