package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class StateImports extends ParseList {

	@Override
	public String getName() {
		return "stateImports";
	}
	@Override
	public String getSingular() {
		return "stateImport";
	}

	public static final ImportParser IMPORT_STATES = new ImportParser(
						new ChainParser(
							StateBraces.STATES_FILE,
							StateTokens.STATES),"IMPORT_STATES","stateImports","><<\"states/\",states_file_name,\".states\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											GeneralTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.state_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_STATES);
}