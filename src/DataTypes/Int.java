package DataTypes;// int - hajmi 32 bit. Butun sonlarni saqlash uchun ishlatiladi. Oraliq -2,147,483,648 ....... 2,147,483,647

public class Int {
   int a;
   int b;
   int c;
   int d;

   public Int(){
       a = 123;
       b = -1000000000;
       c = 2112325452;
       d = 777777;
   }


   @Override

    public String toString(){
       return "a: " + a + "; b: " + b + "; c: " + c + "; d: " + d;
   }
}
