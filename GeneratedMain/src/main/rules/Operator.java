package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class Operator extends ConcreteRule {

	public static final IRule parser = new Operator();

	public Operator(){
		super("operator");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					GeneralTokens.PLUSEQUALS,
					GeneralTokens.MINUSEQUALS,
					GeneralTokens.PLUS,
					GeneralTokens.MINUS,
					GeneralTokens.DIVIDE,
					GeneralTokens.MULTIPLY,
					GeneralTokens.EQUALS,
					GeneralTokens.NOTEQUALS,
					GeneralTokens.ORDINAL,
					GeneralTokens.EQUALSIGN));

	}

}