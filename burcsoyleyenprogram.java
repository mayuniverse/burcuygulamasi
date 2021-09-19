import java.util.Scanner;

public class burcsoyleyenprogram {
    public static void main(String[] args) {
        // değişkenleri tanımlayalım
        int day,month;

        //import sınıfını tanımlayalım
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan input alalım
        System.out.println("Hangi ay doğdunuz? (sayı olarak yazınız örn: mayıs = 5");
        month = inp.nextInt();

        System.out.println("Hangi gün doğdunuz?");
        day = inp.nextInt();

        // hesaplamaları yapalım
        switch(month){
            case 1:
                if(day >= 1 && day <= 21){
                    System.out.println("Oğlak burcusunuz");
                }else{
                    System.out.println("Kova burcusunuz");
                }
                break;
            
            case 2:
                if(day >= 1 && day <= 19){
                    System.out.println("Kova burcusunuz");
                }else{
                    System.out.println("Balık burcu");
                }
                break;
            
            case 3:
                if(day >= 1 && day <= 20){
                    System.out.println("Balık burcusunuz");
                }else{
                    System.out.println("Koç burcusunuz");
                }
                break;
            
            case 4:
                if(day >= 1 && day <=21){
                    System.out.println("Koç burcusunuz");
                }else{
                    System.out.println("Boğa burcusunuz");
                }
                break;
            
            case 5:
                if(day >= 1 && day <=21){
                    System.out.println("Boğa burcusunuz");
                }else{
                    System.out.println("İkizler burcusunuz");
                }
                break;

            case 6:
                if(day >= 1 && day <=22){
                    System.out.println("İkizler burcusunuz");
                }else{
                    System.out.println("Yengeç burcusunuz");
                }
                break;
            
            case 7:
                if(day >= 1 && day <=22){
                    System.out.println("Yengeç burcusunuz");
                }else{
                    System.out.println("Aslan burcusunuz");
                }
                break;
            
            case 8:
                if(day >= 1 && day <=22){
                    System.out.println("Aslan burcusunuz");
                }else{
                    System.out.println("Başak burcusunuz");
                }
                break;
            
            case 9:
                if(day >= 1 && day <=22){
                    System.out.println("Başak burcusunuz");
                }else{
                    System.out.println("Terazi burcusunuz");
                }
                break;
            
            case 10:
                if(day >= 1 && day <=22){
                    System.out.println("Terazi burcusunuz");
                }else{
                    System.out.println("Akrep burcusunuz");
                }
                break;
            
            case 11:
                if(day >= 1 && day <=21){
                    System.out.println("Akrep burcusunuz");
                }else {
                    System.out.println("Yay burcusunuz");
                }
                break;
            
            case 12: 
                if(day >= 1 && day <=22){
                    System.out.println("Yay burcusunuz");
                }else {
                    System.out.println("Oğlak burcusunuz");
                }
                break;
        }
    }    
}
