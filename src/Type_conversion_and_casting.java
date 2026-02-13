class Type_convert_and_cast
{
    public static void main(String[] args)
    {
        int a = 100;
        long b = a;

        System.out.println("Implicit Conversion");
        System.out.println("Value of a (int): " + a);
        System.out.println("Value of b (long): " + b);

        System.out.println("Type of a: int");
        System.out.println("Type of b: long");

        long c = 100;
        int d = (int)(c);

        System.out.println("Exlicit Conversion");

        System.out.println("Value of a (long): " + c);
        System.out.println("Value of b (int): " + d);

        System.out.println("Type of c: int");
        System.out.println("Type of d: long");
    }
}