package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ImportAny extends ConcreteRule {

	public static final IRule parser = new ImportAny();

	public ImportAny(){
		super("import_any");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					EventImports.IMPORT_EVENT,
					GuiImports.IMPORT_IMAGES,
					ClassImports.IMPORT_CLASSES,
					StateImports.IMPORT_STATES));

	}

}