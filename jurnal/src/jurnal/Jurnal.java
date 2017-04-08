package jurnal;

import java.util.Scanner;

public class Jurnal {
    
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Deret Fibonacci : ");
        int n = input.nextInt();
        long fib[] = new long[n];
        long hasil = 0;
         
        fib[0] = 1;
        fib[1] = 1;
         
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
         
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] +  " ");
            hasil = fib[i] + hasil;
        }
        System.out.println("");
        System.out.println("Hasil : " + hasil);
    
    }
    
}
