import java.util.Scanner;
class StringSort
{
    public static void main(String[] args) 
    {
        int count;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strings:");
        count = sc.nextInt();
        
        String str[] = new String[count];
		Scanner sc1 = new Scanner(System.in);
 		System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < count; i++)
        {
            str[i] = sc1.nextLine();
        }
     
       
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        
        
        System.out.println("Strings in Sorted Order:");
        for (int i = 0; i <= count - 1; i++) 
        {
            System.out.println(str[i] + " ");
        }
    }
}