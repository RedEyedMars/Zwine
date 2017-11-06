package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ClassBraces extends ParseList {

	@Override
	public String getName() {
		return "classBraces";
	}
	@Override
	public String getSingular() {
		return "classBrace";
	}

	public static final BracedParser CLASS_FILE = new BracedParser(
							new AddTokenParser(
								GeneralTokens.WILD,"class_file_name"),"CLASS_FILE","classBraces",",.");
	public static final BracedParser EX_CLASS = new BracedParser(
						new ChainParser(
							
							new ChoiceParser(
									GeneralTokens.COMMA,
									new AddTokenParser(
										GeneralTokens.NAME,"extendsClassName")),
							new ManyParser(
									
										new ChainParser(
											new OptionalParser(
													GeneralTokens.COMMA),
											new AddTokenParser(
												GeneralTokens.NAME,"implementsClassName")))),"EX_CLASS","classBraces","[,]");

	public static final ChoiceParser parser = new ChoiceParser(
				CLASS_FILE,EX_CLASS);
}