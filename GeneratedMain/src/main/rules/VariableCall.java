package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class VariableCall extends ConcreteRule {

	public static final IRule parser = new VariableCall();

	public VariableCall(){
		super("variable_call");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					new AddTokenParser(
						Rules.range,"range"),
					new AddTokenParser(
						
					new ChoiceParser(
							GeneralTokens.TRUE,
							GeneralTokens.FALSE,
							GeneralTokens.NULL,
							GeneralTokens.FLOAT,
							GeneralTokens.INTEGER),"exact"),
					new AddTokenParser(
						GeneralBraces.BRACED_STATEMENT,"braced"),
				new ChainParser(
					
					new ChoiceParser(
							Rules.method,
							new AddTokenParser(
								GeneralTokens.NAME,"variableName"),
							GeneralBraces.QUOTE),
					new ManyParser(
							GeneralBraces.GET_INDEX),
					new ManyParser(
							
								new ChainParser(
									GeneralTokens.DOT,
									
									new ChoiceParser(
											Rules.method,
											new AddTokenParser(
												GeneralTokens.NAME,"variableName")),
									new ManyParser(
											GeneralBraces.GET_INDEX))))));

	}

}