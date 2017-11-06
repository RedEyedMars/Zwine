package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class TypeName extends ConcreteRule {

	public static final IRule parser = new TypeName();

	public TypeName(){
		super("type_name");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenParser(
						GeneralTokens.NAME,"typeName"),
					new ManyParser(
							
								new ChainParser(
									GeneralTokens.DOT,
									new AddTokenParser(
										GeneralTokens.NAME,"typeName")))));

	}

}