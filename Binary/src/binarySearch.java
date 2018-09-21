import java.util.Scanner;

class binarySearch
{
    public static void main(String args[])
    {
        int c, a, b, d, n, searchItem, arr[];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        arr = new int[n]; //initialize the array

        System.out.println("Enter " + n + " number of  elements");


        for (c = 0; c < n; c++)
            arr[c] = in.nextInt();

        System.out.println("Enter value to find");
        searchItem = in.nextInt();

        a  = 0;          //first value
        b   = n - 1;     //Second value
        d = (a + b)/2;   //third value

        while( a <= b )
        {
            if ( arr[d] < searchItem )
                a = d + 1;
            else if ( arr[d] == searchItem )
            {
                System.out.println(searchItem + " found at position " + (d + 1));
                //break;
            }
            else
                b = d - 1;

            d = (a + b)/2;
        }
        if ( a > b )
            System.out.println(searchItem + " isn't present in the list.\n");
    }
}
