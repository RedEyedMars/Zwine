package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class BooleanElement extends ConcreteRule {

	public static final IRule parser = new BooleanElement();

	public BooleanElement(){
		super("boolean_element");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
					Rules.has_chance,
					Rules.statement));

	}

}