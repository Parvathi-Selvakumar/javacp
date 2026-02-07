import java.util.Scanner;

public class ArrPractic {
public static void main(String[] args)
{
    int[] arr = {10,20,30,40,34,50};
    int length = arr.length - 1;
    arr[length] = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a search element which should be in integer format = ");
    int searchElement = input.nextInt();
    System.out.println("the search element you entered is = "+ searchElement);
    boolean isSearchElementfound = false;
    for(int i=0; i<arr.length; i++){
        if(arr[i] == searchElement ) {
            System.out.println("The searchElement is found at index= " + i);
            isSearchElementfound = true;
            break;

        }

        }
    if(isSearchElementfound == false){
        System.out.println("There is no search element found");
    }
}
}

