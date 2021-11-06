import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    
    public static void main(String[] args) {
        ArrayList<String> words= new ArrayList<String>();
        Scanner myObj= new Scanner(System.in);
        System.out.println("Please enter the elements until putting the dot ! :\n");
        situtationOne(words, myObj);
        situationTwo(words);
        situtationThree(words,myObj);
        situationFour(words);
        situationFive(words);
    }
    static void situtationOne(ArrayList<String> words, Scanner myObj)
    {
        do {
            words.add(myObj.next());
        }while (!words.get(words.size()-1).equals("."));
        words.remove(words.size()-1);
        System.out.println("___Situation One___\n");
        System.out.println("Description : Print the element size, last element and all the elements.\n");
        System.out.println("Number of elements are : "+ words.size());
        System.out.println("Last element is : "+ words.get(words.size()-1));
        System.out.println("Elements are : "+ words);
    }
    static void situationTwo(ArrayList<String> words)
    {
        System.out.println("\n___Situation Two___\n");
        System.out.println("Description : Set 'abc' string at index 2 and last index and prints the elements again.");
        words.set(2,"abc");
        words.set(words.size()-1, "abc");
        System.out.println("Number of elements are : "+ words.size());
        System.out.println("Last element is : "+ words.get(words.size()-1));
        System.out.println("Elements are : "+ words);
    }
    static void situtationThree(ArrayList<String> words,Scanner myObj)
    {
        System.out.println("\n___Situation Three___\n");
        System.out.println("Description : This methods shows the indexes of 'abc' string and searches the user input in arraylist if it exist.");

        Indexof(words);
        LastIndexOf(words);
        System.out.println("\n Please Enter the word you want to search : ");
        String userInput= myObj.next();
        searchInput(userInput, words);
    }
    static void situationFour(ArrayList<String> words)
    {
        System.out.println("\n___Situation Four___\n");
        System.out.println("Description : If the size larges than five removes the fourth index element.");
        System.out.println("If the size betweens five and three removes the index one.");
        System.out.println("If the size smaller than 3 removes the first index.");
        System.out.println("the size of Arraylist is : "+(words.size()-1));
        if (words.size()-1>3&&words.size()<=5)
            words.remove(1);
        if (words.size()-1>5)
            words.remove(4);
        else
            words.remove(0);
        System.out.println("Elements are : "+ words);

    }
    static void situationFive(ArrayList<String> words)
    {

        System.out.println("\n___Situation Five___\n");
        System.out.println("Description : This method converts arraylist to object array and prints.");
        Object []wordsArray=  words.toArray();
        for (Object i :
                wordsArray) {
            System.out.print(i+" ");
        }
    }
    public static void Indexof(ArrayList<String> words)
    {
        for (int i = 0; i < words.size()-1; i++)
        {
            if (words.get(i).equals("abc"))
            {
                System.out.println("First Index of 'abc' is : "+ i);
                break;
            }
        }
    }
    public static void LastIndexOf(ArrayList<String> words)
    {
        for (int i = words.size()-1; i >=0 ; i--)
        {
            if (words.get(i).equals("abc"))
            {
                System.out.println("Last Index of 'abc' is : "+ i);
                break;
            }
        }
    }
    static void searchInput(String userInput, ArrayList<String> words)
    {
        boolean isFound=false;


        for (int i = 0; i < words.size() - 1; i++) {
            if (words.get(i).equals(userInput))
            {
                System.out.println(userInput + " is in the arraylist!");
                isFound= true;
                break;
            }
        }
        if(!isFound)
            System.out.println(userInput+" is not in the arraylist! ");
    }
}
