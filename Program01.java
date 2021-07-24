import java.util.*;
class Program01
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Size of Array ");
  int n=sc.nextInt();
  int a[]=new int[n];
  System.out.println("Enter elements in to Array ");
  for(int i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
  }
  HashSet<Integer> hs=new HashSet<>();
  for(int i=0;i<n;i++)
  {
   hs.add(a[i]);
  } 
  Iterator <Integer> iter= hs.iterator();		
  System.out.println("The iterator values");   
  while (iter.hasNext())                                            
  {
  System.out.print(iter.next() +" ");                    
  }                                                             
 }
}

Output________________________________________________________
Enter the Size of Array
5
Enter elements in to Array
10
20
30
40
50
The iterator values
50 20 40 10 30