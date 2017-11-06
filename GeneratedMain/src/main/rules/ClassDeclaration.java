package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ClassDeclaration extends ConcreteRule {

	public static final IRule parser = new ClassDeclaration();

	public ClassDeclaration(){
		super("class_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new MultipleParser(
							ClassTokens.CLASS_DEF),
					new AddTokenParser(
						GeneralTokens.NAME,"className"),
					new MultipleParser(
							ClassTokens.CLASS_DEF),
					new MultipleParser(
							
									Rules.class_element)));

	}

}