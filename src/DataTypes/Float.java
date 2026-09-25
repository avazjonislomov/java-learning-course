package DataTypes;// float - hajmi 32 bit. Kasr sonlarni saqlash uchun ishlatiladi. Oraliq 3,40282347 * 10^38, 1,40239846 * 10^45

public class Float {

    float f1;
    float f2;

    public Float(){
        f1 = 3.14f;
        f2 = 1.2f;

    }


    public String toString(){

        return "f1: " + f1 + "; f2: " + f2;
    }


}
