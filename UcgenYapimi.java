import java.util.Scanner;

public class UcgenYapimi {
    public static void main(String[] args) {
        String str1, str2;
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz.   ");
        number = input.nextInt();

        for(int i = 1; i <= number;i++){

            str1 = "";
            int temp1 = number-i;
            while (temp1>0){
                str1 += " ";
                temp1--;
            }

            str2 = "";
            int temp2 = 2*i-1;
            while (temp2>0){
                str2 += "*";
                temp2--;
            }
            System.out.println(str1+str2);
        }
// elmasın alt kısmı için aynı kodu kopyalıyıp modifiye edicez.

        // ve taban kısmının 2 kere yazmaması için 2 looptan birinin tabanını kısaltıcaz.

        for(int i = number-1; i >= 1;i--){

            str1 = "";
            int temp1 = number-i;
            while (temp1>0){
                str1 += " ";
                temp1--;
            }

            str2 = "";
            int temp2 = 2*i-1;
            while (temp2>0){
                str2 += "*";
                temp2--;
            }
            System.out.println(str1+str2);
        }

    }
}
