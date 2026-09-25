import DataTypes.Float;
import DataTypes.Int;

public class Main1 {

    public static void main(String[] args){

        DataTypes.Boolean b = new DataTypes.Boolean();
        DataTypes.Boolean.Char c = new DataTypes.Boolean.Char();
        DataTypes.Boolean.Byte by = new DataTypes.Boolean.Byte();
        DataTypes.Short ss = new DataTypes.Short();
        Int i = new Int();
        DataTypes.Long l = new DataTypes.Long();
        DataTypes.Float f = new Float();

        System.out.println(f);
        System.out.println(l);
        System.out.println(i);
        System.out.println(ss);
        System.out.println(by);
        System.out.println(c);
        System.out.println(b);

    }
}