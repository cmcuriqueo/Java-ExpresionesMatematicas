/*****************************************************************************

JEP - Java Math Expression Parser 2.24
      December 30 2002
      (c) Copyright 2002, Nathan Funk
      See LICENSE.txt for license information.

*****************************************************************************/
package org.nfunk.jep.function;

import java.lang.Math;
import java.util.*;
import org.nfunk.jep.*;
import org.nfunk.jep.type.*;

public class Not extends PostfixMathCommand
{
	public Not()
	{
		numberOfParameters = 1;
	
	}
	
	public void run(Stack inStack)
		throws ParseException 
	{
		checkStack(inStack);// check the stack
		Object param = inStack.pop();
		if (param instanceof Number)
		{
			int r = (((Number)param).doubleValue() == 0) ? 1 : 0;
			inStack.push(new Double(r));//push the result on the inStack
		}
		else
			throw new ParseException("Invalid parameter type");
		return;
	}

}
