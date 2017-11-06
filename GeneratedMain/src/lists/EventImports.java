package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class EventImports extends ParseList {

	@Override
	public String getName() {
		return "eventImports";
	}
	@Override
	public String getSingular() {
		return "eventImport";
	}

	public static final ImportParser IMPORT_EVENT = new ImportParser(
						new ChainParser(
							EventBraces.EVENT_FILE,
							EventTokens.EVTS),"IMPORT_EVENT","eventImports","><<\"events/\",event_file_name,\".evts\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											GeneralTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.event_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_EVENT);
}