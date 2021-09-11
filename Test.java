import java.util.Date;

public class Test {

   public static void main(String args[]) {
      
      Date date = new Date();

      
      String str = String.format("now: %tc", date);

      //System.out.printf(str);
	  //System.out.println("");
	  
	  char des = str.charAt(17);
	  char edi = str.charAt(18);
	  
	  int desatki = Character.getNumericValue(des);
	  int edinici = Character.getNumericValue(edi);
	  
	  int chislo = desatki*10 + edinici;
	  
	  if (chislo>=0 && chislo<6){
	  System.out.println("Pochemy ne spim?");}
	  if (chislo>=6 && chislo<11){
	  System.out.println("Dobroe ytro, Mikhail!");}
	  if (chislo>=11 && chislo<18){
	  System.out.println("Dobri den`, Mikhail!");}
	  if (chislo>=18 && chislo<=23){
	  System.out.println("Dobri vecher, Mikhail!");}
	  
	  
   }
}