package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class GuiImports extends ParseList {

	@Override
	public String getName() {
		return "guiImports";
	}
	@Override
	public String getSingular() {
		return "guiImport";
	}

	public static final ImportParser IMPORT_IMAGES = new ImportParser(
						new ChainParser(
							GuiBraces.IMAGE_FILE,
							GuiTokens.IMGS),"IMPORT_IMAGES","guiImports","><<\"gui/images/\",image_file_name,\".imgs\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											GeneralTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.image_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_IMAGES);
}