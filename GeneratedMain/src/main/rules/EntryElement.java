package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class EntryElement extends ConcreteRule {

	public static final IRule parser = new EntryElement();

	public EntryElement(){
		super("entry_element");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
				new ChainParser(
					new MultipleParser(
							new AddTokenParser(
								
								new ChainParser(
									StateTokens.TRANSITION_ARROW,
									new OptionalParser(
											new AddTokenParser(
												GeneralTokens.NAME,"transitionStateName")),
									StateBraces.TRANSITION_INDEX),"transition")),
					new OptionalParser(
							StateBraces.TRANSITION_ELEMENTS)),
				new ChainParser(
					GeneralTokens.PLUS,
					Rules.type_name,
					new AddTokenParser(
						GeneralTokens.NAME,"newVariable"),
					GeneralTokens.EQUALSIGN,
					Rules.statement),
				new ChainParser(
					GeneralTokens.PLUS,
					new AddTokenParser(
						GeneralTokens.NAME,"newVariable"),
					GeneralTokens.EQUALSIGN,
					Rules.statement),
				new ChainParser(
					new AddTokenParser(
						GeneralTokens.NAME,"variableName"),
					new ManyParser(
							
								new ChainParser(
									GeneralTokens.DOT,
									new AddTokenParser(
										GeneralTokens.NAME,"variableName"))),
					GeneralTokens.EQUALSIGN,
					Rules.statement),
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
								GeneralTokens.NAME,"pluralizer")),
					
					new ChoiceParser(
							GeneralTokens.PLUSEQUALS,
							GeneralTokens.MINUSEQUALS),
					Rules.statement),
					GeneralBraces.BODY));

	}

}