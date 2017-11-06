package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ClassImports extends ParseList {

	@Override
	public String getName() {
		return "classImports";
	}
	@Override
	public String getSingular() {
		return "classImport";
	}

	public static final ImportParser IMPORT_CLASSES = new ImportParser(
						new ChainParser(
							ClassBraces.CLASS_FILE,
							ClassTokens.DEF),"IMPORT_CLASSES","classImports","><<\"defs/\",class_file_name,\".def\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											GeneralTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.class_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_CLASSES);
}