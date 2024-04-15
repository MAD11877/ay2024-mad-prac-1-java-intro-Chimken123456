import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> data = new ArrayList<Integer>();
    int num = in.nextInt();
    int final_ans = 0;
    int highest_occur = 0;
    
    for(int i = 0; i<num; i++)
      {
        //System.out.println("What is the number: ");
        int num1 = in.nextInt();
        data.add(num1);
      }
    for(int i: data)
      {
        int occurance = 0;
        for(int j : data)
          {
            if(i == j)
            {
              occurance++;
              if(occurance > highest_occur)
              {
                highest_occur = occurance;
                final_ans = i;
              }
            }
          }
      }
    System.out.println(final_ans);
    
  }
}
