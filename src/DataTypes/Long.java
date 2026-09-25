package DataTypes;// long - hajmi 32 bit, Butun sonlarni saqlash uchin ishlatiladi. Oraliq  -9,223,372,036,854,775,808 ....... 9,223,372,036,854,775,807

public class Long {

    long a;
    long b;


    public Long(){
        a = -1232244049;
        b = 548584545;
    }


    @Override
    public String toString(){

        return "a: " + a + "; b: " + b;
    }
}
