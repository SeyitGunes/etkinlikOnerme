import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen Sıcaklığı giriniz");
        sicaklik = inp.nextInt();

        if (sicaklik < 5){
            System.out.println("Kayak yapabilirsin");
        } else if (sicaklik<=25) {
            if (sicaklik <=15){
                System.out.println("Sinemaya gidebilirisin");
            }
            if (sicaklik>=10){
                System.out.println("Pikniğe gidebilirisin");
            }
        }
        else {System.out.println("Yüzme yapabilirsiniz");}

    }
    }
