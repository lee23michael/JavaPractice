public class HelloWorld
{
    /**
     * First Java practice program
     */
    public static void main(String[] args)
    {
        System.out.println("Hello World!"); // print out from console
        // Using variables
        int num = 7; //initialize variable
        System.out.println(num);
        // primitive variables
        short shortType = 16; // short type hold 16 bits value -2^15(-32,768)to 2^15 -1(32,767)
        int intType = 32; // int type hold 32 bits value, -2^31(-2,147,483,648)to 2^31 -1(2,147,483,647)
        long longType = 64; // long type hold 64 bits value -2^63(-9,223,372,036,854,775,808)to 2^63 -1(-9,223,372,036,854,775,807)

        float floatType = 32; //float type hold 32 bits value, 2^-149(1.4E-45)to (2-2^-23)2^127(3.402,823,5E+38)
        double doubleType = 64; //int type hold 32 bits value, 2^1074(4.9E-324)to (2-2^-52)2^1023(1.797,693,134,862,315,7E+308)

        byte byteType = 8; // byte type hold 8 bits value -128 to 127
        char charType = 'z'; // char type holds unicode values
        boolean booleanType = true; // boolean type hold true or false value
        System.out.println("short holds "+shortType+" bits values");
        System.out.println("int holds "+intType+" bits values");
        System.out.println("long holds "+longType+" bits values");
        System.out.println("float holds "+floatType+" bits values");
        System.out.println("double holds "+doubleType+" bits values");
        System.out.println("byte holds "+byteType+" bits values");
        System.out.println("chart holds unicode values such as "+charType);
        System.out.println("boolean holds " + booleanType + " or " + !booleanType + " values");





    }
}
