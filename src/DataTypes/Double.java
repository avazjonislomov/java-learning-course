package DataTypes;// double - hajmi 64 bit. Kasr sonlarni saqlash uchun ishlatiladi. Orlaiq 1,7976931348623157 * 10^308, 4,9406564584124654 * 10^324

public class Double {

    double d1;
    double d2;

    public Double(){
        d1 = 123.456;
        d2 = 31.6;
    }

    public String toString1(){
        return "d1: " + d1 + "; d2: " + d2;
    }
}
