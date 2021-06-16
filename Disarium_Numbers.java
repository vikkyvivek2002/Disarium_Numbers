import java.util.Scanner;
class Disarium_Numbers
{
static int count(int n)
{
int nd = 0;
while(n!=0)
{
nd = nd+1;
n = n/10;
}
return nd;
}

public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter a number:");
int num = s.nextInt();

int len = count(num);
int a = num;
int sum = 0;

while(num>0)
{
int x = num%10;
sum = sum + (int)Math.pow(x,len);
 num = num/10;
 len--;
}
if (sum == a)
System.out.println(a + " is a disarium number.");
else
System.out.println(a + " is not a disarium number. ");
}
}
