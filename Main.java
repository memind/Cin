import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int yil, zodyak;
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        yil = inp.nextInt();

        zodyak = yil%12;
        switch(zodyak){
            case 0:
                System.out.print("Doğum Yılınız: "+yil+"\nÇin Zodyağı Burcunuz: Maymun");
            break;
            case 1:
                System.out.print("Doğum Yılınız: "+yil+"\nÇin Zodyağı Burcunuz: Horoz");
            break;
            case 2:
                System.out.print("Doğum Yılınız: "+yil+"\nÇin Zodyağı Burcunuz: Köpek");
            break;
            case 3:
                System.out.print("Doğum Yılınız: "+yil+"\nÇin Zodyağı Burcunuz: Domuz");
            break;
            case 4:
                System.out.print("Doğum Yılınız: "+yil+"\nÇin Zodyağı Burcunuz: Fare");
            break;
            case 5:
                System.out.print("Doğum Yılınız: "+yil+"\nÇin Zodyağı Burcunuz: Öküz");
            break;
            case 6:
                System.out.print("Doğum Yılınız: "+yil+"\nÇin Zodyağı Burcunuz: Kaplan");
            break;
            case 7:
                System.out.print("Doğum Yılınız: "+yil+"\nÇin Zodyağı Burcunuz: Tavşan");
            break;
            case 8:
                System.out.print("Doğum Yılınız: "+yil+"\nÇin Zodyağı Burcunuz: Ejderha");
            break;
            case 9:
                System.out.print("Doğum Yılınız: "+yil+"\nÇin Zodyağı Burcunuz: Yılan");
            break;
            case 10:
                System.out.print("Doğum Yılınız: "+yil+"\nÇin Zodyağı Burcunuz: At");
            break;
            case 11:
                System.out.print("Doğum Yılınız: "+yil+"\nÇin Zodyağı Burcunuz: Koyun");
            break;
            default:
                System.out.println("İmkansız");
        }
    }
}