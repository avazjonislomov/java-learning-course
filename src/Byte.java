public class Byte {
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
