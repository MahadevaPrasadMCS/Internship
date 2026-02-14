package day_4;

// The function accepts R and Unit, and a positive integer array named arr of n as its arguments.
// 1. 'r' represents number of rats present in the area.
//2. unit --> amount of food each rat consumes.
//3. house no. where  i <= 0;

//Notes:
//return -1 if array is empty
//return 0 if total amount of food from all houses is not sufficient for all rats.
//computed values lies within integer range.

//Example:
// r = 7, unit = 2, n = 8, arr = [2, 8, 3, 5, 7, 4, 1, 2]
// output : 4

class Accenture_Question_1
{
    public static int total_house_to_visit(int r, int unit, int [] arr)
    {
        int total_house=0;
        int total_food = r * unit;
        int sum = 0;
        if(arr.length == 0)
        {
            return -1;
        }
        for(int food_unit : arr)
        {
            sum += food_unit;
            total_house++;
            if(sum >= total_food)
            {
                return total_house;
            }
        }
        return 0;
    }
    public static void main(String [] args)
    {
        int [] arr = { };
        System.out.println(total_house_to_visit(7, 2, arr));
    }
}