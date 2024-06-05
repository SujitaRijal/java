import java.util.Scanner;
import java.util.Stack;
public class postfix{
public static void main(String[] args)
{
 Scanner input=new Scanner(System.in);
 Stack<Integer>stack=new Stack<>();

System.out.println("expression that ends with '$':");
while(true)
{
  String token=input.next();

if(token.equals("$"))
{
if(!stack.isEmpty())
{
  int result=stack.pop();
  System.out.println("result:"+ result);
}
else
{
 System.out.println("error!! no operands on stack");
}
break;
}

if(!((token.equals("+") || token.equals("-") ||token.equals("*")||token.equals("/")))) {
	stack.push(Integer.parseInt(token));
} else {
	if(stack.size()<2)
	{
	  System.out.println("error performing with less than two operands");
	}
	int operand2=stack.pop();
	int operand1=stack.pop();
	int result=0;
   switch(token)
	{
	case "+":
	result=operand1+operand2;
	break;
 	
	case "-":
	result=operand1-operand2;
	break;

	case "*":
	result=operand1*operand2;
	break;

	case "/":
	if(operand2==0)
	{
	  System.out.println("error perfoming when divisible by zero");
	}
        result=operand1/operand2;
	break;
	
	
 	
	default:
	System.out.println("invalid expression:");
	break;
	}

	stack.push(result);
	
	
}
}
}
}


