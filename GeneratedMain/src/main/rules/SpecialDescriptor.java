package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class SpecialDescriptor extends ConcreteRule {

	public static final IRule parser = new SpecialDescriptor();

	public SpecialDescriptor(){
		super("special_descriptor");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					new AddTokenParser(
						StateTokens.NNN,"newline"),
					Rules.statement));

	}

}