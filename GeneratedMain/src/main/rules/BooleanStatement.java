package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class BooleanStatement extends ConcreteRule {

	public static final IRule parser = new BooleanStatement();

	public BooleanStatement(){
		super("boolean_statement");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					Rules.boolean_element,
					new ManyParser(
							
								new ChainParser(
									new AddTokenParser(
										
									new ChoiceParser(
											GeneralTokens.AND,
											GeneralTokens.OR),"operator"),
									Rules.boolean_element))));

	}

}