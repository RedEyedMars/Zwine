package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class GeneralBraces extends ParseList {

	@Override
	public String getName() {
		return "generalBraces";
	}
	@Override
	public String getSingular() {
		return "generalBrace";
	}

	public static final BracedParser QUOTE = new BracedParser(
							new AddTokenParser(
								GeneralTokens.WILD,"quote"),"QUOTE","generalBraces","\",\"");
	public static final BracedParser BODY = new BracedParser(
							new ManyParser(
									
									new ChoiceParser(
											GeneralTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.body_element)),"BODY","generalBraces","{,}");
	public static final BracedParser METHOD_ARGUMENTS = new BracedParser(
						new ChainParser(
							new ManyParser(
									GeneralTokens.NEWLINE),
							new OptionalParser(
									Rules.statement),
							new ManyParser(
									
										new ChainParser(
											GeneralTokens.COMMA,
											new ManyParser(
													GeneralTokens.NEWLINE),
											Rules.statement))),"METHOD_ARGUMENTS","generalBraces","(,)");
	public static final BracedParser METHOD_PARAMETERS = new BracedParser(
							new OptionalParser(
									
										new ChainParser(
											Rules.variable_header,
											new ManyParser(
													
														new ChainParser(
															GeneralTokens.COMMA,
															Rules.variable_header)))),"METHOD_PARAMETERS","generalBraces","(,)");
	public static final BracedParser BRACED_STATEMENT = new BracedParser(
							Rules.statement,"BRACED_STATEMENT","generalBraces","(,)");
	public static final BracedParser GET_INDEX = new BracedParser(
							new AddTokenParser(
								Rules.statement,"getIndex"),"GET_INDEX","generalBraces","[,]");

	public static final ChoiceParser parser = new ChoiceParser(
				QUOTE,BODY,METHOD_ARGUMENTS,METHOD_PARAMETERS,BRACED_STATEMENT,GET_INDEX);
}