package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class Listnames extends ParseList {

	@Override
	public String getName() {
		return "listnames";
	}
	@Override
	public String getSingular() {
		return "listname";
	}

	public static final RegexParser comment = new RegexParser("comment","listnames","comments\b");
	public static final RegexParser generalToken = new RegexParser("generalToken","listnames","generalTokens\b");
	public static final RegexParser generalBrace = new RegexParser("generalBrace","listnames","generalBraces\b");
	public static final RegexParser generalAltBrace = new RegexParser("generalAltBrace","listnames","generalAltBraces\b");
	public static final RegexParser image_name = new RegexParser("image_name","listnames","image_names\b");
	public static final RegexParser guiToken = new RegexParser("guiToken","listnames","guiTokens\b");
	public static final RegexParser guiBrace = new RegexParser("guiBrace","listnames","guiBraces\b");
	public static final RegexParser guiImport = new RegexParser("guiImport","listnames","guiImports\b");
	public static final RegexParser stateToken = new RegexParser("stateToken","listnames","stateTokens\b");
	public static final RegexParser stateBrace = new RegexParser("stateBrace","listnames","stateBraces\b");
	public static final RegexParser stateAltBrace = new RegexParser("stateAltBrace","listnames","stateAltBraces\b");
	public static final RegexParser stateImport = new RegexParser("stateImport","listnames","stateImports\b");
	public static final RegexParser event_name = new RegexParser("event_name","listnames","event_names\b");
	public static final RegexParser eventToken = new RegexParser("eventToken","listnames","eventTokens\b");
	public static final RegexParser eventBrace = new RegexParser("eventBrace","listnames","eventBraces\b");
	public static final RegexParser eventImport = new RegexParser("eventImport","listnames","eventImports\b");
	public static final RegexParser defined_class_name = new RegexParser("defined_class_name","listnames","defined_class_names\b");
	public static final RegexParser classToken = new RegexParser("classToken","listnames","classTokens\b");
	public static final RegexParser classBrace = new RegexParser("classBrace","listnames","classBraces\b");
	public static final RegexParser classImport = new RegexParser("classImport","listnames","classImports\b");

	public static final ChoiceParser parser = new ChoiceParser(
				comment,generalToken,generalBrace,generalAltBrace,image_name,guiToken,guiBrace,guiImport,stateToken,stateBrace,stateAltBrace,stateImport,event_name,eventToken,eventBrace,eventImport,defined_class_name,classToken,classBrace,classImport);
}