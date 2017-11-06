package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class GeneralAltBraces extends ParseList {

	@Override
	public String getName() {
		return "generalAltBraces";
	}
	@Override
	public String getSingular() {
		return "generalAltBrace";
	}

	public static final CharitableBracedParser description = new CharitableBracedParser(
							new AddTokenParser(
								GeneralTokens.WILD,"description"),"description","generalAltBraces",",\n");

	public static final ChoiceParser parser = new ChoiceParser(
				description);
}