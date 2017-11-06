package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class VariableDeclaration extends ConcreteRule {

	public static final IRule parser = new VariableDeclaration();

	public VariableDeclaration(){
		super("variable_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					Rules.variable_header,
					new OptionalParser(
							
								new ChainParser(
									GeneralTokens.EQUALSIGN,
									Rules.statement))));

	}

}