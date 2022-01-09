import java.util.Scanner;

 public class faktoriyel{

public static void main(String[]args){

Scanner giris=new Scanner(System.in);

System.out.print("LUTFEN BIR SAYI GIRINIZ=");

int sayi=giris.nextInt();
int faktoriyel=1;
 for(;sayi>0;sayi--){
faktoriyel=faktoriyel*sayi;
}
System.out.println("FAKTORİYEL="+faktoriyel);
}
 }