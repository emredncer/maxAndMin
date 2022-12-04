import java.util.Scanner;

public class maxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0 , min = 0;
        System.out.print("Kaç sayı girmek istiyorsunuz");
        int n = input.nextInt();
        for (int i = 0 ; i < n; i++){
            System.out.print("sayı giriniz: ");
            int number = input.nextInt();
            if (i == 0){
                max = number;
                min = number;
            }
            if (number > max){
                max = number;
            }else if (number < min){
                min = number;
            }
        }
        System.out.println("En büyük sayı: "+ max);
        System.out.print("En küçük sayı: "+ min);
    }
}
