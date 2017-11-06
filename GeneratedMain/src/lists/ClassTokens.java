package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ClassTokens extends ParseList {

	@Override
	public String getName() {
		return "classTokens";
	}
	@Override
	public String getSingular() {
		return "classToken";
	}

	public static final ExactParser DEF = new ExactParser("DEF","classTokens","def");
	public static final ExactParser CLASS_DEF = new ExactParser("CLASS_DEF","classTokens","*");
	public static final ExactParser IDENTIFIER = new ExactParser("IDENTIFIER","classTokens","/i/");
	public static final ExactParser ARRAY_TYPE = new ExactParser("ARRAY_TYPE","classTokens","[]");
	public static final ExactParser SLASH = new ExactParser("SLASH","classTokens","/");

	public static final ChoiceParser parser = new ChoiceParser(
				DEF,CLASS_DEF,IDENTIFIER,ARRAY_TYPE,SLASH);
}