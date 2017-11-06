package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class HasChance extends ConcreteRule {

	public static final IRule parser = new HasChance();

	public HasChance(){
		super("has_chance");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					Rules.num,
					GeneralTokens.PERCENT,
					GeneralTokens.CHANCE));

	}

}