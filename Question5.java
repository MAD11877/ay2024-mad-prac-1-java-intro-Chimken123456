import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> data = new ArrayList<Integer>();
    int num = in.nextInt();
    int final_ans = 0;
    for(int i = 0; i<num; i++)
      {
        //System.out.println("What is the number: ");
        int num1 = in.nextInt();
        data.add(num1);
      }
    Collections.sort(data);
    for(int i: data)
      {
        int num2 = i;
        int count = 0;
        
        //if(i && data.get(count+1))
        if(num2 == data.get(count+1))
        {
          final_ans = num2;
          break;
        }
        count++;
      }
    System.out.println(final_ans);
    
  }
}
