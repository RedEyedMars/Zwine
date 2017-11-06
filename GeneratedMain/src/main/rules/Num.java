package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class Num extends ConcreteRule {

	public static final IRule parser = new Num();

	public Num(){
		super("num");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
					GeneralTokens.FLOAT,
					GeneralTokens.INTEGER));

	}

}