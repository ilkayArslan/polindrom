import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayıyı giriniz : ");
        int num = input.nextInt();

        polinom(num);
    }
    static void polinom(int a){
       int newnum=0,lastnum,firstnum = a;
       while (a>0){
           lastnum = a % 10;
           newnum = (newnum*10)+lastnum;
           a/=10;
       }
        if (newnum == firstnum ){
            System.out.print("evet doğru ");
        }else {
            System.out.println("hayır değil");
        }

    };
}