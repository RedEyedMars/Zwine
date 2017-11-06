package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ImageExtension extends ConcreteRule {

	public static final IRule parser = new ImageExtension();

	public ImageExtension(){
		super("image_extension");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					GuiTokens.PNG,
					GuiTokens.JPEG,
					GuiTokens.BMP));

	}

}