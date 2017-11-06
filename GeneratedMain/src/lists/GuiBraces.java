package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class GuiBraces extends ParseList {

	@Override
	public String getName() {
		return "guiBraces";
	}
	@Override
	public String getSingular() {
		return "guiBrace";
	}

	public static final BracedParser IMAGE_FILE = new BracedParser(
							new AddTokenParser(
								GeneralTokens.WILD,"image_file_name"),"IMAGE_FILE","guiBraces",",.");

	public static final ChoiceParser parser = new ChoiceParser(
				IMAGE_FILE);
}