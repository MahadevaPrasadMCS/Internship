package OOPs_in_Java;

class Add
{
    public int addition(int a, int b){
        return a + b;
    }
}

class main
{
    public static void main(String [] args)
    {
        int a = 10, b = 20;
        Add obj = new Add();
        System.out.println(obj.addition(a, b));
    }
}