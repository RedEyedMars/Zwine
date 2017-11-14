package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class StateListName extends ConcreteRule {

	public static final IRule parser = new StateListName();

	public StateListName(){
		super("state_list_name");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenParser(
						GeneralTokens.NAME,"variableName"),
					new ManyParser(
							
								new ChainParser(
									GeneralTokens.DOT,
									new AddTokenParser(
										GeneralTokens.NAME,"variableName"))),
					
						new ChainParser(
							GeneralTokens.SLASH,
							new AddTokenParser(
								GeneralTokens.NAME,"pluralizer"))));

	}

}