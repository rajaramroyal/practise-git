import java.util.Scanner;
interface Calci
{
 public int getSum(int a,int b);
 public int getProduct(int a,int b);
}
class CalCiImple implements Calci
{
  public int getSum(int a,int b);
{
return a+b;
}

public int getDiff(int a ,int b)
{
return a-b;
}
}

class CalciDriver
{
  CalciImple imple=new CalciImple();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter 1st number");
  int n1=s.nextInt();
  System.out.println("Enter 2nd number");
  int n2=s.nextInt();
  System.out.println(n1+"+"+n2+"="+c.getSum(n1,n2);
  System.out.println(n1+"-"+n2+"="+c.getDiff(n1,n2);

  
}

