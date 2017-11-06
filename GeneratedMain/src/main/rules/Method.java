package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class Method extends ConcreteRule {

	public static final IRule parser = new Method();

	public Method(){
		super("method");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
				new ChainParser(
					GeneralTokens.NEW,
					Rules.type_name,
					GeneralBraces.METHOD_ARGUMENTS),
				new ChainParser(
					new AddTokenParser(
						GeneralTokens.NAME,"methodName"),
					GeneralBraces.METHOD_ARGUMENTS)));

	}

}