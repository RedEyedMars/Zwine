package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class StateBraces extends ParseList {

	@Override
	public String getName() {
		return "stateBraces";
	}
	@Override
	public String getSingular() {
		return "stateBrace";
	}

	public static final BracedParser STATES_FILE = new BracedParser(
							new AddTokenParser(
								GeneralTokens.WILD,"states_file_name"),"STATES_FILE","stateBraces",",.");
	public static final BracedParser TRANSITION_ELEMENTS = new BracedParser(
							new ManyParser(
									
									new ChoiceParser(
											new MultipleParser(
													GeneralTokens.NEWLINE),
											Rules.entry_element)),"TRANSITION_ELEMENTS","stateBraces","{,}");
	public static final BracedParser TRANSITION_INDEX = new BracedParser(
							new AddTokenParser(
								
							new ChoiceParser(
								new ChainParser(
									GeneralTokens.INTEGER,
									new OptionalParser(
											GeneralTokens.NAME)),
									GeneralTokens.NAME),"transitionIndex"),"TRANSITION_INDEX","stateBraces","[,]");
	public static final BracedParser SPECIAL_DESCRIPTOR = new BracedParser(
							new OptionalParser(
									Rules.special_descriptor),"SPECIAL_DESCRIPTOR","stateBraces","/,/");
	public static final BracedParser CHOICE_NAME = new BracedParser(
							new AddTokenParser(
								
									new ManyParser(
											new AddTokenParser(
												
											new ChoiceParser(
													StateTokens.SPACE,
												new ChainParser(
													StateTokens.BACKSLASH,
													new AddTokenParser(
														GeneralTokens.COLON,"special_descriptor")),
													new AddTokenParser(
														StateBraces.SPECIAL_DESCRIPTOR,"special_descriptor"),
													StateTokens.NON_SPACE_OR_SQUARE),"descriptor")),"choiceName"),"CHOICE_NAME","stateBraces",",:");
	public static final BracedParser STATE_STATEMENT = new BracedParser(
							new AddTokenParser(
								Rules.statement,"state_statement"),"STATE_STATEMENT","stateBraces","|,|");
	public static final BracedParser DYNAMIC_STATE_NAME = new BracedParser(
						new ChainParser(
							new OptionalParser(
									new AddTokenParser(
										GeneralTokens.NAME,"transitionStateName")),
							new AddTokenParser(
								StateBraces.TRANSITION_INDEX,"state_name")),"DYNAMIC_STATE_NAME","stateBraces","|,|");

	public static final ChoiceParser parser = new ChoiceParser(
				STATES_FILE,TRANSITION_ELEMENTS,TRANSITION_INDEX,SPECIAL_DESCRIPTOR,CHOICE_NAME,STATE_STATEMENT,DYNAMIC_STATE_NAME);
}