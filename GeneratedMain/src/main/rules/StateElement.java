package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class StateElement extends ConcreteRule {

	public static final IRule parser = new StateElement();

	public StateElement(){
		super("state_element");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
					new AddTokenParser(
						
						new ChainParser(
							
							new ChoiceParser(
									StateTokens.ENTER,
									StateTokens.EXIT),
							new ManyParser(
									GeneralTokens.NEWLINE),
							GeneralTokens.COLON,
							new ManyParser(
									GeneralTokens.NEWLINE),
							new OptionalParser(
									Rules.entry_element),
							new ManyParser(
									StateTokens.NEWTLINE),
							new ManyParser(
									
										new ChainParser(
											
											new ChoiceParser(
													StateTokens.TAB,
													GeneralTokens.SEMICOLON),
											Rules.entry_element,
											new ManyParser(
													StateTokens.NEWTLINE))),
							new OptionalParser(
									GeneralTokens.SEMICOLON)),"stateChange"),
				new ChainParser(
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									Rules.description_condition),
							new MultipleParser(
									
										new ChainParser(
											StateTokens.TAB,
											StateAltBraces.DESCRIPTION_LINE,
											new ManyParser(
													StateTokens.NEWTLINE)))),"stateDescription"),
					new OptionalParser(
							GeneralTokens.SEMICOLON)),
				new ChainParser(
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									Rules.choice_condition),
							new ManyParser(
									GeneralTokens.NEWLINE),
							
							new ChoiceParser(
									
										new ChainParser(
											new AddTokenParser(
												GeneralTokens.FLOAT,"timedChoiceName"),
											
											new ChoiceParser(
													StateTokens.SSS,
													StateTokens.MS),
											GeneralTokens.COLON),
									StateBraces.CHOICE_NAME),
							new ManyParser(
									GeneralTokens.NEWLINE),
							new OptionalParser(
									Rules.choice_element),
							new ManyParser(
									StateTokens.NEWTLINE),
							new ManyParser(
									
										new ChainParser(
											
											new ChoiceParser(
													StateTokens.TAB,
													GeneralTokens.SEMICOLON),
											Rules.choice_element,
											new ManyParser(
													StateTokens.NEWTLINE)))),"stateChange"),
					new OptionalParser(
							GeneralTokens.SEMICOLON))));

	}

}