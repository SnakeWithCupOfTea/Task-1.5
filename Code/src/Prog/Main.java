//Ввести с клавиатуры 2 строки login и password.
// При выводе на экран обоих строк заменить символы строки password символами *.

package Prog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter login");
        Scanner in = new Scanner(System.in);
        String login = in.nextLine();
        System.out.println("Enter password");
        String password = in.nextLine();
        System.out.println(login);
        int l = password.length();
        String shifr="";
        for (int i=0; i<l; i++){
            shifr=shifr+"*";
        }
        System.out.println(shifr);


    }
}
