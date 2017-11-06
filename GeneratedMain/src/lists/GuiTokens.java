package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class GuiTokens extends ParseList {

	@Override
	public String getName() {
		return "guiTokens";
	}
	@Override
	public String getSingular() {
		return "guiToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","guiTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","guiTokens",".*");
	public static final ExactParser IMGS = new ExactParser("IMGS","guiTokens","imgs");
	public static final ExactParser PNG = new ExactParser("PNG","guiTokens","png");
	public static final ExactParser JPEG = new ExactParser("JPEG","guiTokens","jpeg");
	public static final ExactParser BMP = new ExactParser("BMP","guiTokens","bmp");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,IMGS,PNG,JPEG,BMP);
}