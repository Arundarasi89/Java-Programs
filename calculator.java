import java.util.*;

class calculator
{
public static void main(String args[])
{
int c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter value for a:");
int a=sc.nextInt();
System.out.println("Enter value for b:");
int b=sc.nextInt();
System.out.println("\n1.ADD\n2.SUBTRACT\n3.MULTIPLY\n4.DIVISION\nEnter your choice:");
int ch=sc.nextInt();
switch(ch)
{
case 1:c=a+b;
System.out.println("Ans:"+c);
break;
case 2:c=a-b;
System.out.println("Ans:"+c);
break;
case 3:c=a*b;
System.out.println("Ans:"+c);
break;
case 4:c=a/b;
System.out.println("Ans:"+c);
default:System.out.println("invalid choice");
}
}
}