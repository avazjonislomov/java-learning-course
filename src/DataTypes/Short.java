package DataTypes;// short - hajmi 16 bit. Butun sonlarni saqlash uchun ishlatiladi. Oraliq -32,768.......32,767

public class Short {

    short s1;
    short s2;


    public Short(){
        s1 = 32767;
        s2 = -32768;  // namuna: -32769 - hato
    }


    @Override

    public String toString(){
        return "s1= " + s1 + "; s2= " + s2;
    }

}
