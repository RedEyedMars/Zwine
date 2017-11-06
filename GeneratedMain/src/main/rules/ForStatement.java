package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ForStatement extends ConcreteRule {

	public static final IRule parser = new ForStatement();

	public ForStatement(){
		super("for_statement");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
				new ChainParser(
					new AddTokenParser(
						
						new ChainParser(
							GeneralTokens.FOR,
							Rules.variable_header,
							GeneralTokens.COLON,
							Rules.statement,
							new ManyParser(
									GeneralTokens.NEWLINE)),"fromList"),
					GeneralBraces.BODY),
				new ChainParser(
					new AddTokenParser(
						
						new ChainParser(
							GeneralTokens.FOR,
							Rules.variable_header,
							GeneralTokens.ORDINAL,
							Rules.statement,
							new ManyParser(
									GeneralTokens.NEWLINE)),"fromVariable"),
					GeneralBraces.BODY)));

	}

}