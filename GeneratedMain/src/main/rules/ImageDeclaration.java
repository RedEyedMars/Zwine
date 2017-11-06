package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ImageDeclaration extends ConcreteRule {

	public static final IRule parser = new ImageDeclaration();

	public ImageDeclaration(){
		super("image_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenParser(
						GeneralTokens.NAME,"imageId"),
					new OptionalParser(
							new AddTokenParser(
								
								new ChainParser(
									new AddTokenParser(
										GeneralTokens.INTEGER,"width"),
									new OptionalParser(
											
												new ChainParser(
													GeneralTokens.CROSS,
													new AddTokenParser(
														GeneralTokens.INTEGER,"height")))),"dimensions")),
					GeneralTokens.COLON,
					GuiBraces.IMAGE_FILE,
					Rules.image_extension));

	}

}