package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class StateTokens extends ParseList {

	@Override
	public String getName() {
		return "stateTokens";
	}
	@Override
	public String getSingular() {
		return "stateToken";
	}

	public static final RegexParser TOOL_TIP = new RegexParser("TOOL_TIP","stateTokens","[tT]ool( )*[tT]ips?");
	public static final RegexParser NEWTLINE = new RegexParser("NEWTLINE","stateTokens","\\n");
	public static final ExactParser TAB = new ExactParser("TAB","stateTokens","\t");
	public static final ExactParser SEMICOLON = new ExactParser("SEMICOLON","stateTokens",";");
	public static final ExactParser ENTER = new ExactParser("ENTER","stateTokens","Enter");
	public static final ExactParser EXIT = new ExactParser("EXIT","stateTokens","Exit");
	public static final ExactParser STATES = new ExactParser("STATES","stateTokens","states");
	public static final ExactParser TRANSITION_ARROW = new ExactParser("TRANSITION_ARROW","stateTokens","->");
	public static final ExactParser STATE_NAME = new ExactParser("STATE_NAME","stateTokens","*");
	public static final RegexParser SPACE = new RegexParser("SPACE","stateTokens","[ \\t]+");
	public static final RegexParser NON_SPACE = new RegexParser("NON_SPACE","stateTokens","[^\\s]+");
	public static final RegexParser NON_SPACE_OR_SQUARE = new RegexParser("NON_SPACE_OR_SQUARE","stateTokens","[^\\s\\[\\]]+");
	public static final ExactParser NNN = new ExactParser("NNN","stateTokens","n");
	public static final ExactParser BACKSLASH = new ExactParser("BACKSLASH","stateTokens","\\");

	public static final ChoiceParser parser = new ChoiceParser(
				TOOL_TIP,NEWTLINE,TAB,SEMICOLON,ENTER,EXIT,STATES,TRANSITION_ARROW,STATE_NAME,SPACE,NON_SPACE,NON_SPACE_OR_SQUARE,NNN,BACKSLASH);
}