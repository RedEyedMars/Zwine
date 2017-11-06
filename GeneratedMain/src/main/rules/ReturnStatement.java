package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ReturnStatement extends ConcreteRule {

	public static final IRule parser = new ReturnStatement();

	public ReturnStatement(){
		super("return_statement");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
				new ChainParser(
					GeneralTokens.RETURN,
					GeneralTokens.VOID),
				new ChainParser(
					GeneralTokens.RETURN,
					Rules.statement)));

	}

}