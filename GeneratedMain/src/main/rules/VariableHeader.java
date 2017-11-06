package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class VariableHeader extends ConcreteRule {

	public static final IRule parser = new VariableHeader();

	public VariableHeader(){
		super("variable_header");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					Rules.type_name,
					new AddTokenParser(
						GeneralTokens.NAME,"variableName")));

	}

}