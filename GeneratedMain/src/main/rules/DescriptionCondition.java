package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class DescriptionCondition extends ConcreteRule {

	public static final IRule parser = new DescriptionCondition();

	public DescriptionCondition(){
		super("description_condition");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
				new ChainParser(
					GeneralTokens.IF,
					Rules.boolean_statement,
					
					new ChoiceParser(
						new ChainParser(
							new ManyParser(
									GeneralTokens.NEWLINE),
							GeneralTokens.COLON,
							new ManyParser(
									StateTokens.NEWTLINE)),
							new MultipleParser(
									StateTokens.NEWTLINE))),
				new ChainParser(
					new AddTokenParser(
						GeneralTokens.FLOAT,"timed"),
					
					new ChoiceParser(
							StateTokens.SSS,
							StateTokens.MS),
					
					new ChoiceParser(
						new ChainParser(
							new ManyParser(
									GeneralTokens.NEWLINE),
							GeneralTokens.COLON,
							new ManyParser(
									StateTokens.NEWTLINE)),
							new MultipleParser(
									StateTokens.NEWTLINE))),
				new ChainParser(
					StateTokens.EACH,
					Rules.state_list_name,
					
					new ChoiceParser(
						new ChainParser(
							new ManyParser(
									GeneralTokens.NEWLINE),
							GeneralTokens.COLON,
							new ManyParser(
									StateTokens.NEWTLINE)),
							new MultipleParser(
									StateTokens.NEWTLINE)))));

	}

}