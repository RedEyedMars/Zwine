package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ChoiceElement extends ConcreteRule {

	public static final IRule parser = new ChoiceElement();

	public ChoiceElement(){
		super("choice_element");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
				new ChainParser(
					StateTokens.TOOL_TIP,
					new MultipleParser(
							
								new ChainParser(
									GeneralTokens.NEWTABTAB,
									new MultipleParser(
											
											new ChoiceParser(
													StateAltBraces.TOOL_TIP_LINE,
													new MultipleParser(
															GeneralTokens.NEWLINE)))))),
					Rules.entry_element));

	}

}