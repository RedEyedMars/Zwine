package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class StateDeclaration extends ConcreteRule {

	public static final IRule parser = new StateDeclaration();

	public StateDeclaration(){
		super("state_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new MultipleParser(
							StateTokens.STATE_NAME),
					new AddTokenParser(
						GeneralTokens.NAME,"stateName"),
					new MultipleParser(
							StateTokens.STATE_NAME),
					new ManyParser(
							GeneralTokens.NEWLINE),
					new ManyParser(
							new AddTokenParser(
								
								new ChainParser(
									StateBraces.TRANSITION_INDEX,
									new ManyParser(
											StateTokens.NEWTLINE),
									new ManyParser(
											
												new ChainParser(
													Rules.state_element,
													new ManyParser(
															GeneralTokens.NEWLINE)))),"subState"))));

	}

}