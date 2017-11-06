package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class EventTokens extends ParseList {

	@Override
	public String getName() {
		return "eventTokens";
	}
	@Override
	public String getSingular() {
		return "eventToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","eventTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","eventTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","eventTokens","\n");
	public static final ExactParser NEWTAB = new ExactParser("NEWTAB","eventTokens","\n\t");
	public static final ExactParser EVTS = new ExactParser("EVTS","eventTokens","evts");
	public static final ExactParser EVENT = new ExactParser("EVENT","eventTokens","event");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,EVTS,EVENT);
}