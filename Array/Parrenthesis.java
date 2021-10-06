package com.algo.array;

import java.util.ArrayDeque;
import java.util.Deque;

public class Parrenthesis {

	static boolean areBracketsBalanced(String expr)
    {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack
            = new ArrayDeque<Character>();
 
        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }
 
            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        // Check Empty Stack
        return (stack.isEmpty());
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String expr = "([{}])";
 
        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
	
	/*static boolean areBreacketBalanced(String expr)
	{
		Deque<Character> stack=new ArrayDeque<Character>();
		
		for(int i=0;i<expr.length();i++)
		{
			char x=expr.charAt(i);
			if(x=='(' || x=='[' || x=='}')
			{
				stack.push(x);
				continue;
			}
			if(stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check=stack.pop();
				if(check=='{' || check=='[')
				return false;
			    break;
			
			case '}':
				check=stack.pop();
				if(check=='('|| check=='[')
					return false;
				    break;
			case ']':
				check=stack.pop();
				if(check=='('|| check=='{')
					return false;
				    break;
			}
		}
		return (stack.isEmpty());
	}
	public static void main(String args[])
	{
		String expr = "([{}])";
		 
        // Function call
        if (areBreacketBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
	}
}*/
