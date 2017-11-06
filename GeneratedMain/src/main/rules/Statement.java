package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class Statement extends ConcreteRule {

	public static final IRule parser = new Statement();

	public Statement(){
		super("statement");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new OptionalParser(
							GeneralTokens.NOT),
					Rules.variable_call,
					new ManyParser(
							
								new ChainParser(
									Rules.operator,
									new ManyParser(
											GeneralTokens.NEWLINE),
									Rules.statement))));

	}

}