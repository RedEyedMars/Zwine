package clgen;
import java.util.*;
import java.io.*;
import lists.*;
import com.rem.parser.generation.classwise.*;
import com.rem.parser.generation.*;
import com.rem.parser.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.*;
import clgen.StateListName;
import com.rem.parser.generation.*;
import com.rem.parser.generation.classwise.*;
import clent.*;
import java.util.*;
import java.io.*;
import java.nio.*;
import com.rem.parser.token.IToken;
public class  StateListName   {
	public static class classes {
	}
	public static StateListName variables = null;
	public static StateListName methods = null;
	//Externals


	//Internals
protected String pluralizer = "";
protected final ExternalStatement withoutLast = new ExternalStatement();
protected String last = null;
protected String previous = null;
protected Integer size = 0;
protected String innerType = null;
protected String lastType = null;

	public String getPluralizer()  {
		return pluralizer;
	}
	public String get_pluralizer()  {
		return pluralizer;
	}
	public ExternalStatement getWithoutLast()  {
		return withoutLast;
	}
	public ExternalStatement get_withoutLast()  {
		return withoutLast;
	}
	public String getLast()  {
		return last;
	}
	public String get_last()  {
		return last;
	}
	public String getPrevious()  {
		return previous;
	}
	public String get_previous()  {
		return previous;
	}
	public Integer getSize()  {
		return size;
	}
	public Integer get_size()  {
		return size;
	}
	public String getInnerType()  {
		return innerType;
	}
	public String get_innerType()  {
		return innerType;
	}
	public String getLastType()  {
		return lastType;
	}
	public String get_lastType()  {
		return lastType;
	}
public StateListName (final IToken atom,final ExternalContext context)  {
	withoutLast.set(".");
	withoutLast.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("State"))))));
	withoutLast.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("data")))));
	ExternalContext currentContext = context;
	if (atom.get("pluralizer") != null) {
		pluralizer = atom.get("pluralizer").toString();
	}
	for(final IToken quark:atom.getAllSafely("variableName")) {
			if (previous != null) {
			withoutLast.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry("get"+FlowController.camelize(previous.toString()).toString())),new ExternalStatement.Parameters())));
			}
			last = quark.toString();
			previous = quark.toString();
			size += 1;
			if (currentContext.hasLink(last)) {
			currentContext = currentContext.link(last);
			if (pluralizer == null && currentContext.hasLink(last)) {
				lastType = currentContext.type(last);
			}
			}
	}
	if (pluralizer != null) {
		if (currentContext.hasLink(last + pluralizer)) {
			lastType = currentContext.type(last + pluralizer);
		}
	}
	if (lastType != null) {
		final Integer indexOfAngle = lastType.indexOf("<");
		if (indexOfAngle > -1 ) {
			innerType = lastType.substring(indexOfAngle + 1,lastType.lastIndexOf(">"));
		}
	}
}

}