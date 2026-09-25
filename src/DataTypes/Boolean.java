package DataTypes;//boolean - ikkita qiymatni saqlash mumkin. ture(to'g'ri) va false(yolg'on)

public class Boolean {
    boolean n1;
    boolean n2;




    public  Boolean(){
        n1 = true;
        n2 = false;

    }

    @Override
    public String toString(){
        return "n1 = " + n1 + " , n2 = " + n2;
    }

    public static class Byte {
            byte from;
            byte to;

            public Byte(){
                from = -128 ;
                to = 127;
            }

            @Override
        public String toString(){
                return "from: " + from + "; to: " + to;
            }
    }

    public static class Char {

        char c1;
        char c2;
        char c3;
        char c4;


        public Char(){
            c1 = 'A';
            c2 = 'b';
            c3 = 'c';
            c4 = 'D';

        }


        @Override

        public String toString(){
            return "c1:" + c1 + " c2:" + c2 + " c3:" + c3 + " c4:" + c4;
        }
    }
}
