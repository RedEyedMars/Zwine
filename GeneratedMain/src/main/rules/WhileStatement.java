package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class WhileStatement extends ConcreteRule {

	public static final IRule parser = new WhileStatement();

	public WhileStatement(){
		super("while_statement");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					GeneralTokens.WHILE,
					Rules.statement,
					new ManyParser(
							GeneralTokens.NEWLINE),
					GeneralBraces.BODY));

	}

}