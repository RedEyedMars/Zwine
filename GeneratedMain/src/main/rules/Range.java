package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class Range extends ConcreteRule {

	public static final IRule parser = new Range();

	public Range(){
		super("range");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
				new ChainParser(
					new AddTokenParser(
						Rules.num,"left"),
					
						new ChainParser(
							
							new ChoiceParser(
									GeneralTokens.DOTDOT,
									GeneralTokens.DASH),
							new AddTokenParser(
								Rules.num,"right")),
					new OptionalParser(
							new AddTokenParser(
								GeneralTokens.PERCENT,"percent"))));

	}

}