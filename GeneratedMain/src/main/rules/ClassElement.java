package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ClassElement extends ConcreteRule {

	public static final IRule parser = new ClassElement();

	public ClassElement(){
		super("class_element");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					ClassBraces.EX_CLASS,
					new AddTokenParser(
						
						new ChainParser(
							Rules.type_name,
							new AddTokenParser(
								GeneralTokens.NAME,"methodName"),
							GeneralBraces.METHOD_PARAMETERS,
							new AddTokenParser(
								GeneralBraces.BODY,"body")),"method"),
					new AddTokenParser(
						
						new ChainParser(
							new AddTokenParser(
								GeneralTokens.NAME,"methodName"),
							GeneralBraces.METHOD_PARAMETERS,
							new AddTokenParser(
								GeneralBraces.BODY,"body")),"method"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									ClassTokens.IDENTIFIER),
							Rules.type_name,
							new AddTokenParser(
								GeneralTokens.NAME,"variableName"),
							new OptionalParser(
									
										new ChainParser(
											GeneralTokens.SLASH,
											new AddTokenParser(
												GeneralTokens.NAME,"pluralizer"))),
							GeneralTokens.EQUALSIGN,
							
							new ChoiceParser(
								new ChainParser(
									new AddTokenParser(
										Rules.type_name,"array_type"),
									ClassTokens.ARRAY_TYPE),
									Rules.statement)),"variable"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									ClassTokens.IDENTIFIER),
							new AddTokenParser(
								GeneralTokens.NAME,"variableName"),
							new OptionalParser(
									
										new ChainParser(
											GeneralTokens.SLASH,
											new AddTokenParser(
												GeneralTokens.NAME,"pluralizer"))),
							GeneralTokens.EQUALSIGN,
							
							new ChoiceParser(
								new ChainParser(
									new AddTokenParser(
										Rules.type_name,"array_type"),
									ClassTokens.ARRAY_TYPE),
									Rules.statement)),"variable"),
					new MultipleParser(
							GeneralTokens.NEWLINE)));

	}

}