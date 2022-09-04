import java.util.Scanner;

public class Soal5 {
    public static String capitalize(String str){
        return str.substring(0, 1). toUpperCase () + str.substring(1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System. in);
    System.out.println("Masukkan string 1: ");
    String str1 = input.nextLine();
    System.out.println("Masukkan string 2: ") ;
    String str2 = input. nextLine();
    input.close();
    System.out.println(str1.length() + str2.length());
    if(str1.compareTo(str2)>0) {
        System.out.println("yes");
    }else {
        System.out.println("No");
    }
    System.out.println(capitalize(str1)+ " " + capitalize(str2));
}
}