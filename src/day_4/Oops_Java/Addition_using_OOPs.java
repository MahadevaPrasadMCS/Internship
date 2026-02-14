package day_4.Oops_Java;

class Add
{
    public int addition(int a, int b){
        return a + b;
    }
}

class Addition_using_OOPs
{
    public static void main(String [] args)
    {
        Add sum = new Add();
        System.out.println("Your sum is: "+sum.addition(10, 14));
    }
}
