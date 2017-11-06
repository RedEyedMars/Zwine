package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class Comments extends ParseList {

	@Override
	public String getName() {
		return "comments";
	}
	@Override
	public String getSingular() {
		return "comment";
	}

	public static final BracedParser COMMENTS = new BracedParser(
							new AddTokenParser(
								GeneralTokens.WILD,"comment"),"COMMENTS","comments","#,#");

	public static final ChoiceParser parser = new ChoiceParser(
				COMMENTS);
}