package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class StateAltBraces extends ParseList {

	@Override
	public String getName() {
		return "stateAltBraces";
	}
	@Override
	public String getSingular() {
		return "stateAltBrace";
	}

	public static final CharitableBracedParser TOOL_TIP_LINE = new CharitableBracedParser(
							new AddTokenParser(
								GeneralTokens.WILD,"toolTipLine"),"TOOL_TIP_LINE","stateAltBraces",",\n");
	public static final CharitableBracedParser DESCRIPTION_LINE = new CharitableBracedParser(
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
													StateTokens.NON_SPACE),"descriptor")),"descriptionLine"),"DESCRIPTION_LINE","stateAltBraces",",\n");

	public static final ChoiceParser parser = new ChoiceParser(
				TOOL_TIP_LINE,DESCRIPTION_LINE);
}