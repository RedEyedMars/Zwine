package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class EventBraces extends ParseList {

	@Override
	public String getName() {
		return "eventBraces";
	}
	@Override
	public String getSingular() {
		return "eventBrace";
	}

	public static final BracedParser EVENT_FILE = new BracedParser(
							new AddTokenParser(
								GeneralTokens.WILD,"event_file_name"),"EVENT_FILE","eventBraces",",.");

	public static final ChoiceParser parser = new ChoiceParser(
				EVENT_FILE);
}