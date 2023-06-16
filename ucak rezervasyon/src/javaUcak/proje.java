package javaUcak;
import java.util.Scanner;
import java.util.Date; 
import java.text.SimpleDateFormat;

	public class proje {
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Date objDate = new Date();
	        SimpleDateFormat bicim3 = new SimpleDateFormat("16-01-20028- hh:mm:ss");
	        
		   

                ucakBilgileri ucak0 = new ucakBilgileri();
				ucak0.ucak = "Yolcu Uçağı";
				ucak0.seriNo = 180116;
				ucak0.yolcusayisi = 150;
				ucak0.tarih = "16, 01, 2028";

				ucakBilgileri musteri = new ucakBilgileri();
				System.out.println("müsteri ad soyad:");
				musteri.adsoyad = scanner.nextLine();
				System.out.println("müsteri cinsiyeti:)");
				musteri.cinsiyet = scanner.nextLine();
				System.out.println("müsteri yaşı:");
				musteri.yas = scanner.nextInt();

				lokasyon lokasyon0 = new lokasyon();
				System.out.println("ucak hangi ulkeye gidiyor?:");
				lokasyon0.Ulke = scanner.nextLine();
				System.out.println("ucag hangi sehire gidiyor?:");
				lokasyon0.Sehir = scanner.nextLine();
				System.out.println("hangi havaalani:");
				lokasyon0.Havalani = scanner.nextLine();
		}
	   
	}
