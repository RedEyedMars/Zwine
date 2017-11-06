package clgen;
import java.util.*;
import java.io.*;
import lists.*;
import com.rem.parser.generation.classwise.*;
import com.rem.parser.generation.*;
import com.rem.parser.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.*;
import clgen.MainFlow;
import com.rem.parser.generation.*;
import com.rem.parser.generation.classwise.*;
import clent.*;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.lang.Math;
import java.lang.StringBuilder;
import java.lang.Thread;
import java.lang.Runnable;
import java.lang.Iterable;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collection;
import java.util.Collections;
import java.io.File;
import com.rem.parser.generation.Entry;
import com.rem.parser.generation.ListEntry;
import com.rem.parser.generation.Generator;
import com.rem.parser.parser.IParser;
import com.rem.parser.token.IToken;
import com.rem.parser.ParseContext;
import com.rem.parser.parser.RegexParser;
import lists.Rules;
import lists.GeneralTokens;
import lists.Listnames;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Color;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import com.rem.parser.generation.classwise.ExternalImportEntry;
import com.rem.parser.generation.StringEntry;
import java.io.Serializable;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import clgen.VersionIdentifier;
import clgen.Classes;
public class MainFlow extends FlowController  {
	public static class classes {
		public static final States StatesClass = new States();
		public static final State StateClass = new State();
		public static final Listener ListenerClass = new Listener();
		public static final Events EventsClass = new Events();
		public static final Event EventClass = new Event();
		public static final Listenable ListenableClass = new Listenable();
		public static final Source SourceClass = new Source();
		public static final Loaddable LoaddableClass = new Loaddable();
		public static final Tickable TickableClass = new Tickable();
		public static final Range RangeClass = new Range();
		public static final ListMaps ListMapsClass = new ListMaps();
		public static final Criteria CriteriaClass = new Criteria();
		public static final Factory FactoryClass = new Factory();
		public static final Gui GuiClass = new Gui();
		public static final Game GameClass = new Game();
		public static final DataWriter DataWriterClass = new DataWriter();
		public static final DataReader DataReaderClass = new DataReader();
		public static final SaveThread SaveThreadClass = new SaveThread();
	}
	public static MainFlow variables = null;
	public static MainFlow methods = null;
	//Externals


	//Internals
	protected final String __VAR__packageName = "com.rem.zwine";
	protected final IParser __VAR__rootParser = Rules.base;
	protected final List __VAR__listnames = Listnames.parser;
	protected final List __VAR__rules = Rules.parser;
	protected final RegexParser __VAR__lazyNameParser = GeneralTokens.NAME;
	protected final Map<String,List<String>> __VAR__classIdentifierMap = new HashMap<String,List<String>>();
	protected final Map<String,List<String>> __VAR__classIdentifierClassMap = new HashMap<String,List<String>>();
	protected final Set<String> __VAR__declaredCritSet = new HashSet<String>();
	protected final Set<String> __VAR__declaredListSet = new HashSet<String>();
	protected final Set<String> __VAR__declaredMapSet = new HashSet<String>();
	protected final String __VAR__TT = "<T>T";
	protected final String __VAR__mainStringArgs = "String[]";
	protected final VersionIdentifier __VAR__version = new VersionIdentifier();
	protected final Classes __VAR__classHandler = new Classes();

	public static void main(final String[] args)  {
		if(args.length==1) {
	new MainFlow().parse(args[0]);
		}
		else {
	System.err.println("No filename provided!");
		}
	}
	public String getPackageName()  {
		return __VAR__packageName;
	}
	public String get_packageName()  {
		return __VAR__packageName;
	}
	public IParser getRootParser()  {
		return __VAR__rootParser;
	}
	public IParser get_rootParser()  {
		return __VAR__rootParser;
	}
	public List getListnames()  {
		return __VAR__listnames;
	}
	public List get_listnames()  {
		return __VAR__listnames;
	}
	public List getRules()  {
		return __VAR__rules;
	}
	public List get_rules()  {
		return __VAR__rules;
	}
	public RegexParser getLazyNameParser()  {
		return __VAR__lazyNameParser;
	}
	public RegexParser get_lazyNameParser()  {
		return __VAR__lazyNameParser;
	}
	public ExternalStatement.Body getStateBodyElements(final IToken elementsToken,final ExternalContext context)  {
		final ExternalStatement.Body result = new ExternalStatement.Body();
		result.setParentContext(context);
		for(final IToken element:elementsToken.getAllSafely("body_element")) {
				result.add(MainFlow.methods.getStateBodyElement(element,result.getContext()));
		}
		return result;
	}
	public ExternalStatement getStateBodyElement(final IToken elementToken,final ExternalContext context)  {
		for(IToken.Key __element__KEY:elementToken.keySet()) {
			if(__element__KEY.getName().equals("statement")){ final IToken element = elementToken.get(__element__KEY);
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getStateStatement(element,context))))));
			}
			if(__element__KEY.getName().equals("return_statement")){ final IToken element = elementToken.get(__element__KEY);
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getStateStatement(element,context))))));
			}
			if(__element__KEY.getName().equals("variable_declaration")){ final IToken element = elementToken.get(__element__KEY);
				return MainFlow.methods.getStateVariableDeclaration(element,context);
			}
			if(__element__KEY.getName().equals("if_statement")){ final IToken element = elementToken.get(__element__KEY);
				return MainFlow.methods.getStateIfStatement(element,context);
			}
			if(__element__KEY.getName().equals("for_statement")){ final IToken element = elementToken.get(__element__KEY);
				return MainFlow.methods.getStateForStatement(element,context);
			}
		}
		return null;
	}
	public ExternalStatement getStateVariableDeclaration(final IToken variableDeclarationToken,final ExternalContext context)  {
		final String typeName = MainFlow.methods.getTypeName(variableDeclarationToken.get("variable_header").get("type_name"));
		final ExternalContext type = context.getClassContext(typeName);
		if (type == null) {
			throw new RuntimeException(Generator.completeTokenErrorMessage(variableDeclarationToken) + "Could not find type:"+typeName+"!");
		}
		if (variableDeclarationToken.get("statement") != null) {
			return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(variableDeclarationToken.get("variable_header").get("variableName").toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getStateStatement(variableDeclarationToken.get("statement"),context)))))));
		}
		else  {
			return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(variableDeclarationToken.get("variable_header").get("variableName").toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))));
		}
	}
	public ExternalStatement getStateIfStatement(final IToken ifStatementToken,final ExternalContext context)  {
		final ExternalStatement header = new ExternalStatement();
		final ExternalStatement elseHeader = new ExternalStatement();
		final ExternalStatement.Body body = new ExternalStatement.Body();
		final ExternalStatement.Body elseBody = new ExternalStatement.Body();
		Integer mode = 0;
		for(IToken.Key __element__KEY:ifStatementToken.keySet()) {
			if(__element__KEY.getName().equals("boolean_statement")){ final IToken element = ifStatementToken.get(__element__KEY);
				header.add(MainFlow.methods.getStateBooleanStatement(element,context));
			}
			if(__element__KEY.getName().equals("body_element")){ final IToken element = ifStatementToken.get(__element__KEY);
				body.add(MainFlow.methods.getStateBodyElement(element,context));
			}
			if(__element__KEY.getName().equals("else_statement")){ final IToken element = ifStatementToken.get(__element__KEY);
				mode = 1;
				for(IToken.Key __atom__KEY:element.keySet()) {
				if(__atom__KEY.getName().equals("body_element")){ final IToken atom = element.get(__atom__KEY);
					elseBody.add(MainFlow.methods.getStateBodyElement(atom,context));
				}
				if(__atom__KEY.getName().equals("boolean_statement")){ final IToken atom = element.get(__atom__KEY);
					elseHeader.add(MainFlow.methods.getStateBooleanStatement(atom,context));
					mode = 2;
				}
				}
			}
		}
		if (mode == 0 ) {
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(header))),
			/*InCl*/new ExternalStatement(body)));
		}
		else if (mode == 1 ) {
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(header))),
			/*InCl*/new ExternalStatement(body)),
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*InCl*/new ExternalStatement(elseBody)));
		}
		else if (mode == 2 ) {
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(header))),
			/*InCl*/new ExternalStatement(body)),
		/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(elseHeader))),
			/*InCl*/new ExternalStatement(elseBody)));
		}
		else  {
			return null;
		}
	}
	public ExternalStatement getStateForStatement(final IToken forStatementToken,final ExternalContext context)  {
		if (forStatementToken.get("fromList") != null) {
			final IToken variableHeaderToken = forStatementToken.get("fromList").get("variable_header");
			final String typeName = MainFlow.methods.getTypeName(variableHeaderToken.get("type_name"));
			final ExternalContext type = context.getClassContext(typeName);
			if (type == null) {
				throw new RuntimeException(Generator.completeTokenErrorMessage(variableHeaderToken) + "Could not find type:"+typeName+"!");
			}
			context.add(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(variableHeaderToken.get("variableName").toString()))));
			final ExternalStatement right = MainFlow.methods.getStateStatement(forStatementToken.get("fromList").get("statement"),context);
			final ExternalStatement.Body body = MainFlow.methods.getStateBodyElements(forStatementToken,context);
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(variableHeaderToken.get("variableName").toString()))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(right)))),
			/*InCl*/new ExternalStatement(body)));
		}
		return null;
	}
	public ExternalStatement getStateBooleanStatement(final IToken booleanStatement,final ExternalContext context)  {
		return MainFlow.methods.getStateBooleanStatement(booleanStatement,false,context);
	}
	public ExternalStatement getStateBooleanStatement(final IToken booleanStatement,final Boolean negate,final ExternalContext context)  {
		final ExternalStatement operator = new ExternalStatement();
		for(IToken.Key __element__KEY:booleanStatement.keySet()) {
			if(__element__KEY.getName().equals("has_chance")){ final IToken element = booleanStatement.get(__element__KEY);
				operator.add(MainFlow.methods.getChance(element));
			}
			if(__element__KEY.getName().equals("statement")){ final IToken element = booleanStatement.get(__element__KEY);
				operator.add(MainFlow.methods.getStateStatement(element,negate,context));
			}
			if(__element__KEY.getName().equals("operator")){ final IToken element = booleanStatement.get(__element__KEY);
				if (element.toString() == "&") {
				if (negate) {
					operator.set("||");
				}
				else  {
					operator.set("&&");
				}
				}
				else if (element.toString() == "|") {
				if (negate) {
					operator.set("&&");
				}
				else  {
					operator.set("||");
				}
				}
			}
		}
		return operator;
	}
	public ExternalStatement getStateStatement(final IToken statementToken,final ExternalContext context)  {
		return MainFlow.methods.getStateStatement(statementToken,false,context);
	}
	public ExternalStatement getStateStatement(final IToken statementToken,final Boolean initialNegate,final ExternalContext context)  {
		final ExternalStatement ret = new ExternalStatement();
		Boolean negate = initialNegate;
		for(IToken.Key __element__KEY:statementToken.keySet()) {
			if(__element__KEY.getName().equals("NOT")){ final IToken element = statementToken.get(__element__KEY);
				negate =! negate;
			}
			if(__element__KEY.getName().equals("variable_call")){ final IToken element = statementToken.get(__element__KEY);
				final ExternalStatement variableCall = MainFlow.methods.getStateVariableCall(element,context);
				ret.add(variableCall);
			}
			if(__element__KEY.getName().equals("statement")){ final IToken element = statementToken.get(__element__KEY);
				final ExternalStatement subStatement = MainFlow.methods.getStateStatement(element,context);
				ret.add(subStatement);
			}
			if(__element__KEY.getName().equals("operator")){ final IToken element = statementToken.get(__element__KEY);
				if (negate) {
				ret.set(MainFlow.methods.negateOperator(element.toString()));
				}
				else  {
				ret.set(element.toString());
				}
			}
			if(__element__KEY.getName().equals("braced")){ final IToken element = statementToken.get(__element__KEY);
				final ExternalStatement subStatement = MainFlow.methods.getStateStatement(element,context);
				subStatement.brace();
				ret.add(subStatement);
			}
		}
		if (ret.getSize() == 1  && negate) {
			ret.negate();
		}
		return ret;
	}
	public ExternalStatement getStateVariableCall(final IToken variableCallToken,final ExternalContext context)  {
		ExternalContext currentContext = context;
		final ExternalStatement ret = new ExternalStatement(".");
		for(IToken.Key __element__KEY:variableCallToken.keySet()) {
			if(__element__KEY.getName().equals("range")){ final IToken element = variableCallToken.get(__element__KEY);
				ret.add(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Range"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.get("left").toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.get("right").toString()))))))));
			}
			if(__element__KEY.getName().equals("braced")){ final IToken element = variableCallToken.get(__element__KEY);
				final ExternalStatement subStatement = MainFlow.methods.getStateStatement(element,context);
				subStatement.brace();
				ret.add(subStatement);
			}
			if(__element__KEY.getName().equals("exact")){ final IToken element = variableCallToken.get(__element__KEY);
				if (element.get("FLOAT") != null) {
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(element.toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))));
				}
				else  {
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.toString())))));
				}
			}
			if(__element__KEY.getName().equals("quote")){ final IToken element = variableCallToken.get(__element__KEY);
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(element.toString())))));
			}
			if(__element__KEY.getName().equals("cast")){ final IToken element = variableCallToken.get(__element__KEY);
				final String typeName = MainFlow.methods.getTypeName(element.get("type_name"));
				final ExternalContext typeContext = currentContext.getClassContext(typeName);
				if (typeContext == null) {
				throw new RuntimeException("Could not find "+typeName.toString()+" type in context!");
				}
				final ExternalStatement castStatement = new ExternalStatement();
				castStatement.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))))));
				castStatement.brace();
				final ExternalStatement fullStatement = new ExternalStatement();
				fullStatement.add(castStatement);
				fullStatement.add(MainFlow.methods.getStateStatement(element.get("statement"),context));
				ret.add(fullStatement);
			}
			if(__element__KEY.getName().equals("getIndex")){ final IToken element = variableCallToken.get(__element__KEY);
				final String methodName = "get";
				final ExternalStatement.Parameters parameters = new ExternalStatement.Parameters();
				for(final IToken atom:element.getAllSafely("statement")) {
					parameters.add(MainFlow.methods.getStateStatement(atom,context));
				}
				currentContext = currentContext.link(methodName);
				if (currentContext == null) {
				throw new RuntimeException("Could not find GET in context!");
				}
				ret.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("get")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(parameters)))))));
			}
			if(__element__KEY.getName().equals("variableName")){ final IToken element = variableCallToken.get(__element__KEY);
				currentContext = currentContext.link(element.toString());
				if (currentContext == null) {
				throw new RuntimeException("Could not find "+element.toString()+" variable in context!");
				}
				if (ret.size() == 0 ) {
				ret.add(/*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("State"))))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("data"))), /*Enty*/new ExternalStatement(new StringEntry("get"+FlowController.camelize(element.toString()).toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))));
				}
				else  {
				ret.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry("get"+FlowController.camelize(element.toString()).toString())),new ExternalStatement.Parameters())));
				}
			}
			if(__element__KEY.getName().equals("method")){ final IToken element = variableCallToken.get(__element__KEY);
				final String methodName;
				if (element.get("methodName") != null) {
				methodName = element.get("methodName").toString();
				}
				else  {
				methodName = MainFlow.methods.getTypeName(element.get("type_name"));
				}
				final ExternalStatement.Parameters parameters = new ExternalStatement.Parameters();
				for(final IToken atom:element.getAllSafely("statement")) {
					parameters.add(MainFlow.methods.getStateStatement(atom,context));
				}
				if (element.get("NEW") != null) {
				currentContext = currentContext.getClassContext(methodName);
				if (currentContext == null) {
					throw new RuntimeException("Could not find \"+methodName+\" type in context!");
				}
				ret.add(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(methodName.toString())))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(parameters)))))));
				}
				else  {
				currentContext = currentContext.link(methodName);
				if (currentContext == null) {
					throw new RuntimeException("Could not find "+element.toString()+" method in context!");
				}
				ret.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry(element.toString())),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(parameters)))))));
				}
			}
		}
		if (currentContext != null && currentContext.hasEnder()) {
			ret.add(currentContext.getEnder());
		}
		return ret;
	}
	public String addListVariable(final String listName,final String pluralizer,final String listType,final ExternalClassEntry acceptingClass)  {
		if (MainFlow.variables.get_classIdentifierMap().containsKey(listType) == false || MainFlow.variables.get_classIdentifierMap().get(listType).isEmpty()) {
acceptingClass.addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(listType.toString())))))),"", /*Enty*/new ExternalStatement(new StringEntry(listName+pluralizer.toString())), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(listType.toString())))))),new ExternalStatement.Parameters()))));
acceptingClass.addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(listType.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry("get"+FlowController.camelize(listName.toString()).toString())), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Enty*/new ExternalStatement(new StringEntry("indexOf"+FlowController.camelize(listName.toString()).toString())))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(listName+pluralizer.toString()))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry("indexOf"+FlowController.camelize(listName.toString()).toString()))))))))))));
acceptingClass.addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Enty*/new ExternalStatement(new StringEntry("add"+FlowController.camelize(listName.toString()).toString())), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(listType.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry("new"+FlowController.camelize(listName.toString()).toString())))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(listName+pluralizer.toString()))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry("new"+FlowController.camelize(listName.toString()).toString()))))))))))));
acceptingClass.addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Enty*/new ExternalStatement(new StringEntry("remove"+FlowController.camelize(listName.toString()).toString())), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(listType.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry("new"+FlowController.camelize(listName.toString()).toString())))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(listName+pluralizer.toString()))), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry("new"+FlowController.camelize(listName.toString()).toString()))))))))))));
			return "List<" + listType.toString() + ">";
		}
		else  {
			final String realListName = listName.toString() + pluralizer;
			String realListType = listType;
			Integer i = MainFlow.variables.get_classIdentifierMap().get(listType.toString()).size() - 1;
			final Map<Integer,String> intermittentTypes = new HashMap<Integer,String>();
			while (i >= 0 ) {
				intermittentTypes.put(i,realListType);
				realListType = "Map<" + MainFlow.variables.get_classIdentifierClassMap().get(listType.toString()).get(i) + "," + realListType + ">";
				i -= 1;
			}
			final String realListTypeValue = realListType;
acceptingClass.addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(realListTypeValue.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(realListName.toString())), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry("Hash"+realListTypeValue.toString())))),new ExternalStatement.Parameters()))));
			final String newVariable = "new"+FlowController.camelize(listName.toString()).toString();
			final String addMethodName = "add"+FlowController.camelize(listName.toString()).toString();
			final String removeMethodName = "remove"+FlowController.camelize(listName.toString()).toString();
acceptingClass.addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Enty*/new ExternalStatement(new StringEntry(addMethodName.toString())), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(listType.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(newVariable.toString())))}), "", /*Body*/new ExternalStatement.Body()));
acceptingClass.addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Enty*/new ExternalStatement(new StringEntry(removeMethodName.toString())), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(listType.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(newVariable.toString())))}), "", /*Body*/new ExternalStatement.Body()));
			ExternalStatement currentListName = new ExternalStatement();
			currentListName.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(realListName.toString())))));
			ExternalStatement currentListIndex = new ExternalStatement();
			currentListIndex.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(realListName.toString())))));
			final ExternalStatement.Parameters currentListGetParameters = new ExternalStatement.Parameters();
			for (Integer j = 0; j <  MainFlow.variables.get_classIdentifierMap().get(listType.toString()).size() - 1; ++j) {
				final ExternalStatement currentListNameValue = currentListName;
				final ExternalStatement currentListIndexValue = currentListIndex;
				final String identifier = MainFlow.variables.get_classIdentifierMap().get(listType.toString()).get(j);
				final String identifierClass = MainFlow.variables.get_classIdentifierClassMap().get(listType.toString()).get(j);
				acceptingClass.getMethod(addMethodName.toString()).appendToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(currentListNameValue)), /*Enty*/new ExternalStatement(new StringEntry("containsKey"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(newVariable.toString()))), /*Enty*/new ExternalStatement(new StringEntry("get"+FlowController.camelize(identifier.toString()).toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(currentListNameValue)), /*Enty*/new ExternalStatement(new StringEntry("put"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(newVariable.toString()))), /*Enty*/new ExternalStatement(new StringEntry("get"+FlowController.camelize(identifier.toString()).toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry("Hash"+intermittentTypes.get(j).toString())))),new ExternalStatement.Parameters())))))))))));
				currentListName = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(currentListNameValue)), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(newVariable.toString()))), /*Enty*/new ExternalStatement(new StringEntry("get"+FlowController.camelize(identifier.toString()).toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))));
				currentListIndex = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(currentListIndexValue)), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry("key"+FlowController.camelize(identifier.toString()).toString()))))))));
				currentListGetParameters.add(new ExternalVariableEntry(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(identifierClass.toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry("key"+FlowController.camelize(identifier.toString()).toString()))))));
			}
			final Integer lastIndex = MainFlow.variables.get_classIdentifierMap().get(listType.toString()).size() - 1;
			final ExternalStatement currentListNameValue = currentListName;
			final ExternalStatement currentListIndexValue = currentListIndex;
			final String identifier = MainFlow.variables.get_classIdentifierMap().get(listType.toString()).get(lastIndex);
			final String identifierClass = MainFlow.variables.get_classIdentifierClassMap().get(listType.toString()).get(lastIndex);
			currentListGetParameters.add(new ExternalVariableEntry(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(identifierClass.toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry("key"+FlowController.camelize(identifier.toString()).toString()))))));
acceptingClass.addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(listType.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry("get"+FlowController.camelize(listName.toString()).toString())), currentListGetParameters, "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(currentListIndexValue)), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry("key"+FlowController.camelize(identifier.toString()).toString()))))))))))));
			acceptingClass.getMethod(addMethodName.toString()).appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(currentListNameValue)), /*Enty*/new ExternalStatement(new StringEntry("put"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(newVariable.toString()))), /*Enty*/new ExternalStatement(new StringEntry("get"+FlowController.camelize(identifier.toString()).toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(newVariable.toString())))))))))));
			acceptingClass.getMethod(removeMethodName.toString()).appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(currentListNameValue)), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(newVariable.toString()))), /*Enty*/new ExternalStatement(new StringEntry("get"+FlowController.camelize(identifier.toString()).toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))))));
			return realListTypeValue.toString();
		}
	}
	public void addStorageElement(final String type,final String name,final ExternalClassEntry storageClass)  {
		storageClass.getMethod("save").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("writer"))), /*Enty*/new ExternalStatement(new StringEntry("writeAsBoolean"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(name.toString())))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("writer"))), /*Enty*/new ExternalStatement(new StringEntry("write"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(name.toString())))))))))));
		storageClass.getMethod("load").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"try ", null,
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("acceptor"))), /*Enty*/new ExternalStatement(new StringEntry("accept"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Data")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Variables")))))), /*Enty*/new ExternalStatement(new StringEntry("valueOf"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(name.toString().toString())))))))),/*Optr*/new ExternalStatement(":", /*Optr*/new ExternalStatement("?", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("reader"))), /*Enty*/new ExternalStatement(new StringEntry("readAsBoolean"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("reader"))), /*Enty*/new ExternalStatement(new StringEntry("read"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"catch ", 
			/*Optr*/new ExternalStatement(" ", /*Exac*/new ExternalStatement(new StringEntry("Exception")), /*Exac*/new ExternalStatement(new StringEntry("e0"))),
			/*Body*/new ExternalStatement.Body())));
	}
	public Map<String,List<String>> getClassIdentifierMap()  {
		return __VAR__classIdentifierMap;
	}
	public Map<String,List<String>> get_classIdentifierMap()  {
		return __VAR__classIdentifierMap;
	}
	public Map<String,List<String>> getClassIdentifierClassMap()  {
		return __VAR__classIdentifierClassMap;
	}
	public Map<String,List<String>> get_classIdentifierClassMap()  {
		return __VAR__classIdentifierClassMap;
	}
	public ExternalStatement.Body getBodyElements(final IToken elementsToken,final ExternalContext context)  {
		final ExternalStatement.Body result = new ExternalStatement.Body();
		result.setParentContext(context);
		for(final IToken element:elementsToken.getAllSafely("body_element")) {
				result.add(MainFlow.methods.getBodyElement(element,result.getContext()));
		}
		return result;
	}
	public ExternalStatement getBodyElement(final IToken elementToken,final ExternalContext context)  {
		for(IToken.Key __element__KEY:elementToken.keySet()) {
			if(__element__KEY.getName().equals("statement")){ final IToken element = elementToken.get(__element__KEY);
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getStatement(element,context))))));
			}
			if(__element__KEY.getName().equals("return_statement")){ final IToken element = elementToken.get(__element__KEY);
				if (element.get("VOID") != null) {
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry(""))));
				}
				else  {
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getStatement(element,context))))));
				}
			}
			if(__element__KEY.getName().equals("variable_declaration")){ final IToken element = elementToken.get(__element__KEY);
				return MainFlow.methods.getVariableDeclaration(element,context);
			}
			if(__element__KEY.getName().equals("if_statement")){ final IToken element = elementToken.get(__element__KEY);
				return MainFlow.methods.getIfStatement(element,context);
			}
			if(__element__KEY.getName().equals("for_statement")){ final IToken element = elementToken.get(__element__KEY);
				return MainFlow.methods.getForStatement(element,context);
			}
		}
		return null;
	}
	public ExternalStatement getVariableDeclaration(final IToken variableDeclarationToken,final ExternalContext context)  {
		final String typeName = MainFlow.methods.getTypeName(variableDeclarationToken.get("variable_header").get("type_name"));
		final ExternalContext type = context.getClassContext(typeName);
		if (type == null) {
			throw new RuntimeException(Generator.completeTokenErrorMessage(variableDeclarationToken) + "Could not find type:"+typeName+"!");
		}
		if (variableDeclarationToken.get("statement") != null) {
			return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(variableDeclarationToken.get("variable_header").get("variableName").toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getStatement(variableDeclarationToken.get("statement"),context)))))));
		}
		else  {
			return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(variableDeclarationToken.get("variable_header").get("variableName").toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))));
		}
	}
	public ExternalVariableEntry addVariableHeader(final IToken variableHeaderToken,final ExternalClassEntry inputClass)  {
		final String typeName = MainFlow.methods.getTypeName(variableHeaderToken.get("type_name"));
		final ExternalContext type = inputClass.getContext().getClassContext(typeName);
		if (type == null) {
			throw new RuntimeException(Generator.completeTokenErrorMessage(variableHeaderToken) + "Could not find type:"+typeName+"!");
		}
inputClass.addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(variableHeaderToken.get("variableName").toString()))));
		return inputClass.getVariable(variableHeaderToken.get("variableName").toString());
	}
	public ExternalStatement getIfStatement(final IToken ifStatementToken,final ExternalContext context)  {
		final ExternalStatement header = new ExternalStatement();
		final ExternalStatement elseHeader = new ExternalStatement();
		final ExternalStatement.Body body = new ExternalStatement.Body();
		final ExternalStatement.Body elseBody = new ExternalStatement.Body();
		Integer mode = 0;
		for(IToken.Key __element__KEY:ifStatementToken.keySet()) {
			if(__element__KEY.getName().equals("boolean_statement")){ final IToken element = ifStatementToken.get(__element__KEY);
				header.add(MainFlow.methods.getBooleanStatement(element,context));
			}
			if(__element__KEY.getName().equals("body_element")){ final IToken element = ifStatementToken.get(__element__KEY);
				body.add(MainFlow.methods.getBodyElement(element,context));
			}
			if(__element__KEY.getName().equals("else_statement")){ final IToken element = ifStatementToken.get(__element__KEY);
				mode = 1;
				for(IToken.Key __atom__KEY:element.keySet()) {
				if(__atom__KEY.getName().equals("body_element")){ final IToken atom = element.get(__atom__KEY);
					elseBody.add(MainFlow.methods.getBodyElement(atom,context));
				}
				if(__atom__KEY.getName().equals("boolean_statement")){ final IToken atom = element.get(__atom__KEY);
					elseHeader.add(MainFlow.methods.getBooleanStatement(atom,context));
					mode = 2;
				}
				}
			}
		}
		if (mode == 0 ) {
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(header))),
			/*InCl*/new ExternalStatement(body)));
		}
		else if (mode == 1 ) {
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(header))),
			/*InCl*/new ExternalStatement(body)),
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*InCl*/new ExternalStatement(elseBody)));
		}
		else if (mode == 2 ) {
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(header))),
			/*InCl*/new ExternalStatement(body)),
		/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(elseHeader))),
			/*InCl*/new ExternalStatement(elseBody)));
		}
		else  {
			return null;
		}
	}
	public ExternalStatement getForStatement(final IToken forStatementToken,final ExternalContext context)  {
		if (forStatementToken.get("fromList") != null) {
			final IToken variableHeaderToken = forStatementToken.get("fromList").get("variable_header");
			final String typeName = MainFlow.methods.getTypeName(variableHeaderToken.get("type_name"));
			final ExternalContext type = context.getClassContext(typeName);
			if (type == null) {
				throw new RuntimeException(Generator.completeTokenErrorMessage(variableHeaderToken) + "Could not find type:"+typeName+"!");
			}
			context.add(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(variableHeaderToken.get("variableName").toString()))));
			final ExternalStatement right = MainFlow.methods.getStatement(forStatementToken.get("fromList").get("statement"),context);
			final ExternalStatement.Body body = MainFlow.methods.getBodyElements(forStatementToken,context);
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(variableHeaderToken.get("variableName").toString()))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(right)))),
			/*InCl*/new ExternalStatement(body)));
		}
		return null;
	}
	public ExternalStatement getBooleanStatement(final IToken booleanStatement,final ExternalContext context)  {
		return MainFlow.methods.getBooleanStatement(booleanStatement,false,context);
	}
	public ExternalStatement getBooleanStatement(final IToken booleanStatement,final Boolean negate,final ExternalContext context)  {
		final ExternalStatement operator = new ExternalStatement();
		for(IToken.Key __element__KEY:booleanStatement.keySet()) {
			if(__element__KEY.getName().equals("has_chance")){ final IToken element = booleanStatement.get(__element__KEY);
				operator.add(MainFlow.methods.getChance(element));
			}
			if(__element__KEY.getName().equals("statement")){ final IToken element = booleanStatement.get(__element__KEY);
				operator.add(MainFlow.methods.getStatement(element,negate,context));
			}
			if(__element__KEY.getName().equals("operator")){ final IToken element = booleanStatement.get(__element__KEY);
				if (element.toString() == "&") {
				if (negate) {
					operator.set("||");
				}
				else  {
					operator.set("&&");
				}
				}
				else if (element.toString() == "|") {
				if (negate) {
					operator.set("&&");
				}
				else  {
					operator.set("||");
				}
				}
			}
		}
		return operator;
	}
	public ExternalStatement getStatement(final IToken statementToken,final ExternalContext context)  {
		return MainFlow.methods.getStatement(statementToken,false,context);
	}
	public ExternalStatement getStatement(final IToken statementToken,final Boolean initialNegate,final ExternalContext context)  {
		final ExternalStatement ret = new ExternalStatement();
		Boolean negate = initialNegate;
		for(IToken.Key __element__KEY:statementToken.keySet()) {
			if(__element__KEY.getName().equals("NOT")){ final IToken element = statementToken.get(__element__KEY);
				negate =! negate;
			}
			if(__element__KEY.getName().equals("variable_call")){ final IToken element = statementToken.get(__element__KEY);
				final ExternalStatement variableCall = MainFlow.methods.getVariableCall(element,context);
				ret.add(variableCall);
			}
			if(__element__KEY.getName().equals("statement")){ final IToken element = statementToken.get(__element__KEY);
				final ExternalStatement subStatement = MainFlow.methods.getStatement(element,context);
				ret.add(subStatement);
			}
			if(__element__KEY.getName().equals("operator")){ final IToken element = statementToken.get(__element__KEY);
				if (negate) {
				ret.set(MainFlow.methods.negateOperator(element.toString()));
				}
				else  {
				ret.set(element.toString());
				}
			}
			if(__element__KEY.getName().equals("braced")){ final IToken element = statementToken.get(__element__KEY);
				final ExternalStatement subStatement = MainFlow.methods.getStatement(element,context);
				subStatement.brace();
				ret.add(subStatement);
			}
		}
		if (ret.getSize() == 1  && negate) {
			ret.negate();
		}
		return ret;
	}
	public ExternalStatement getVariableCall(final IToken variableCallToken,final ExternalContext context)  {
		ExternalContext currentContext = context;
		final ExternalStatement ret = new ExternalStatement(".");
		for(IToken.Key __element__KEY:variableCallToken.keySet()) {
			if(__element__KEY.getName().equals("range")){ final IToken element = variableCallToken.get(__element__KEY);
				ret.add(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Range"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.get("left").toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.get("right").toString()))))))));
			}
			if(__element__KEY.getName().equals("braced")){ final IToken element = variableCallToken.get(__element__KEY);
				final ExternalStatement subStatement = MainFlow.methods.getStatement(element,context);
				subStatement.brace();
				ret.add(subStatement);
			}
			if(__element__KEY.getName().equals("exact")){ final IToken element = variableCallToken.get(__element__KEY);
				if (element.get("FLOAT") != null) {
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(element.toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))));
				}
				else  {
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.toString())))));
				}
			}
			if(__element__KEY.getName().equals("quote")){ final IToken element = variableCallToken.get(__element__KEY);
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(element.toString())))));
			}
			if(__element__KEY.getName().equals("cast")){ final IToken element = variableCallToken.get(__element__KEY);
				final String typeName = MainFlow.methods.getTypeName(element.get("type_name"));
				final ExternalContext typeContext = currentContext.getClassContext(typeName);
				if (typeContext == null) {
				throw new RuntimeException("Could not find "+typeName.toString()+" type in context!");
				}
				final ExternalStatement castStatement = new ExternalStatement();
				castStatement.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))))));
				castStatement.brace();
				final ExternalStatement fullStatement = new ExternalStatement();
				fullStatement.add(castStatement);
				fullStatement.add(MainFlow.methods.getStatement(element.get("statement"),context));
				ret.add(fullStatement);
			}
			if(__element__KEY.getName().equals("variableName")){ final IToken element = variableCallToken.get(__element__KEY);
				currentContext = currentContext.link(element.toString());
				if (currentContext == null) {
				throw new RuntimeException("Could not find "+element.toString()+" variable in context!");
				}
				if (ret.size() == 0 ) {
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.toString())))));
				}
				else  {
				ret.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry("get"+FlowController.camelize(element.toString()).toString())),new ExternalStatement.Parameters())));
				}
			}
			if(__element__KEY.getName().equals("method")){ final IToken element = variableCallToken.get(__element__KEY);
				final String methodName;
				if (element.get("methodName") != null) {
				methodName = element.get("methodName").toString();
				}
				else  {
				methodName = MainFlow.methods.getTypeName(element.get("type_name"));
				}
				final ExternalStatement.Parameters parameters = new ExternalStatement.Parameters();
				for(final IToken atom:element.getAllSafely("statement")) {
					parameters.add(MainFlow.methods.getStatement(atom,context));
				}
				if (element.get("NEW") != null) {
				currentContext = currentContext.getClassContext(methodName);
				if (currentContext == null) {
					throw new RuntimeException("Could not find \"+methodName+\" type in context!");
				}
				ret.add(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(methodName.toString())))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(parameters)))))));
				}
				else  {
				currentContext = currentContext.link(methodName);
				if (currentContext == null) {
					throw new RuntimeException("Could not find "+element.toString()+" method in context!");
				}
				ret.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry(element.toString())),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(parameters)))))));
				}
			}
		}
		if (currentContext != null && currentContext.hasEnder()) {
			ret.add(currentContext.getEnder());
		}
		return ret;
	}
	public ExternalStatement primeRange(final IToken rangeToken)  {
		String left = rangeToken.get("left").toString();
		String right = rangeToken.get("right").toString();
		if (rangeToken.get("percent") != null) {
			left = MainFlow.methods.percentify(left);
			right = MainFlow.methods.percentify(right);
		}
		return /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Range"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(left.toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(right.toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))))));
	}
	public ExternalStatement getChance(final IToken chanceToken)  {
		final Double value = Double.parseDouble(chanceToken.toString()) / 100.0;
		return /*Optr*/new ExternalStatement("<=", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("random"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(value.toString()))));
	}
	public void createList(final ExternalClassEntry listClass)  {
		final String listName = listClass.getFullName() + "List";
		if (MainFlow.variables.get_declaredListSet().add(listName)) {
listClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry("List"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(listClass.getFullName())))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("List").get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"))),"", /*Exac*/new ExternalStatement(new StringEntry("*")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(listClass.getFullName()))),"", new ExternalStatement(new StringEntry("..."), /*Name*/new ExternalStatement(new StringEntry("elements"))))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("super")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Arrays")))), /*Enty*/new ExternalStatement(new StringEntry("asList"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("elements"))))))))))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
		}
	}
	public void createCriteria(final ExternalClassEntry critClass)  {
		final String critName = critClass.getName() + "Criteria";
		if (MainFlow.variables.get_declaredCritSet().add(critName)) {
			
			final ExternalClassEntry critNameClass = new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("criteria")).get(__BUILDER__);
			}
		}, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(critName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Criteria"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(critClass.getFullName())))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry(critName).get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))),"", /*Exac*/new ExternalStatement(new StringEntry("satisfies")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(critClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("candidate")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}};
			critNameClass.__INIT__();
			final StringBuilder __BUILDER__;
			final File __DIRECTORY__;
			__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("criteria")).get(__BUILDER__);
	__DIRECTORY__ = new File(MainFlow.__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	MainFlow.methods.addFile(__DIRECTORY__,FlowController.camelize(critName)+".java", critNameClass);
		}
	}
	public void createListMap(final ExternalClassEntry leftClass,final ExternalClassEntry rightClass)  {
		final String leftName = leftClass.getName() + "s";
		final String rightName = "_" + rightClass.getName();
		final String fullName = "Maps."+leftName+"."+rightName;
		if (MainFlow.variables.get_declaredListSet().add(fullName)) {
			if (MainFlow.classes.ListMapsClass.getSubClass(leftName) == null) {
MainFlow.classes.ListMapsClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
			}
		}, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(leftName), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry(leftName).get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
			}
MainFlow.classes.ListMapsClass.getSubClass(leftName).addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
			}
		}, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(rightName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("HashMap"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName())),/*TypeName*/new ExternalStatement.TypeName(new StringEntry("LinkedList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName())))))), new ArrayList<Entry>(Arrays.asList(new Entry[]{/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Iterable"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry(rightName).get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("LinkedList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))),"", /*Name*/new ExternalStatement(new StringEntry("completeList")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("LinkedList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))),new ExternalStatement.Parameters()))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Iterator"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))),"", /*Exac*/new ExternalStatement(new StringEntry("iterator")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList"))), /*Enty*/new ExternalStatement(new StringEntry("iterator"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("LinkedList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))),"", /*Exac*/new ExternalStatement(new StringEntry("getFrom")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("key")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))))))),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("add")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("key"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("element")))}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("&&!", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("containsKey"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("put"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key")))),/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("LinkedList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))),new ExternalStatement.Parameters()))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("element"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("element"))))))))))),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("removeLast")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("key")))}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("&&!", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("containsKey"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key")))))))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))), /*Enty*/new ExternalStatement(new StringEntry("isEmpty"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList"))), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))), /*Enty*/new ExternalStatement(new StringEntry("removeLast"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))))))),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("removeAll")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("key")))}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("containsKey"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList"))), /*Enty*/new ExternalStatement(new StringEntry("removeAll"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))), /*Enty*/new ExternalStatement(new StringEntry("clear"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("remove")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("key"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("element")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("element"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList"))), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("element"))))))))))),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))),"", /*Exac*/new ExternalStatement(new StringEntry("getAll")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList")))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
		}
	}
	public void createMap(final ExternalClassEntry keyClass,final ExternalClassEntry valueClass)  {
		final String keyName = keyClass.getName() + "Map";
		final String valueName = "_" + valueClass.getName();
		final String fullName = "Maps."+keyName+"."+valueName;
		if (MainFlow.variables.get_declaredMapSet().add(fullName)) {
			
			final ExternalClassEntry keyNameClass = new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("maps")).get(__BUILDER__);
			}
		}, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(keyName), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry(keyName).get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{})) ;}};
			keyNameClass.__INIT__();
			final StringBuilder __BUILDER__;
			final File __DIRECTORY__;
			__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("maps")).get(__BUILDER__);
	__DIRECTORY__ = new File(MainFlow.__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	MainFlow.methods.addFile(__DIRECTORY__,FlowController.camelize(keyName)+".java", keyNameClass);
keyNameClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("maps")).get(__BUILDER__);
			}
		}, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(valueName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("HashMap"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(keyClass.getFullName())),/*TypeName*/new ExternalStatement.TypeName(new StringEntry(valueClass.getFullName())))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry(valueName).get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(valueClass.getFullName()))),"", /*Exac*/new ExternalStatement(new StringEntry("get")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(keyClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("key"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(valueClass.getFullName())), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Factory"))))),"", /*Name*/new ExternalStatement(new StringEntry("factory")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(valueClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("result")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("get")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("result")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("factory"))), /*Enty*/new ExternalStatement(new StringEntry("create"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("put")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result")))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result")))))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
		}
	}
	public String percentify(final String input)  {
		final Double result = Double.parseDouble(input) / 100.0;
		return result.toString();
	}
	public String percentify(final IToken input)  {
		return MainFlow.methods.percentify(input.toString());
	}
	public String negateOperator(final String operator)  {
		if ("==".equals(operator)) {
			return "!=";
		}
		else if ("!=".equals(operator)) {
			return "==";
		}
		else if ("<".equals(operator)) {
			return ">=";
		}
		else if ("<=".equals(operator)) {
			return ">";
		}
		else if (">".equals(operator)) {
			return "<=";
		}
		else if (">=".equals(operator)) {
			return "<";
		}
		else if ("&&".equals(operator)) {
			return "||";
		}
		else if ("||".equals(operator)) {
			return "&&";
		}
		else  {
			return "COULD NOT NEGATE ("+operator+")";
		}
	}
	public String determineType(final IToken statement,final ExternalContext context)  {
		if (statement.get("NOT") != null) {
			return "Boolean";
		}
		else  {
			if (statement.get("operator") != null) {
				for(final IToken element:statement.getAllSafely("operator")) {
						if (element.toString().contains("&") || element.toString().contains("|") || element.toString().contains("==") || element.toString().contains("!=")) {
						return "Boolean";
						}
				}
				for(final IToken element:statement.getAllSafely("variable_call")) {
						for(IToken.Key __atom__KEY:element.keySet()) {
						if(__atom__KEY.getName().equals("exact")){ final IToken atom = element.get(__atom__KEY);
							for(IToken.Key __quark__KEY:atom.keySet()) {
							if(__quark__KEY.getName().equals("NULL")){ final IToken quark = atom.get(__quark__KEY);
								return "Object";
							}
							if(__quark__KEY.getName().equals("FLOAT")){ final IToken quark = atom.get(__quark__KEY);
								return "Double";
							}
							}
						}
						if(__atom__KEY.getName().equals("quote")){ final IToken atom = element.get(__atom__KEY);
							return "String";
						}
						}
				}
				return "Integer";
			}
			else  {
				for(final IToken element:statement.getAllSafely("variable_call")) {
						for(IToken.Key __atom__KEY:element.keySet()) {
						if(__atom__KEY.getName().equals("range")){ final IToken atom = element.get(__atom__KEY);
							return "Range";
						}
						if(__atom__KEY.getName().equals("exact")){ final IToken atom = element.get(__atom__KEY);
							for(IToken.Key __quark__KEY:atom.keySet()) {
							if(__quark__KEY.getName().equals("NULL")){ final IToken quark = atom.get(__quark__KEY);
								return "Object";
							}
							if(__quark__KEY.getName().equals("TRUE")){ final IToken quark = atom.get(__quark__KEY);
								return "Boolean";
							}
							if(__quark__KEY.getName().equals("FALSE")){ final IToken quark = atom.get(__quark__KEY);
								return "Boolean";
							}
							if(__quark__KEY.getName().equals("FLOAT")){ final IToken quark = atom.get(__quark__KEY);
								return "Double";
							}
							if(__quark__KEY.getName().equals("INTEGER")){ final IToken quark = atom.get(__quark__KEY);
								return "Integer";
							}
							}
						}
						if(__atom__KEY.getName().equals("braced")){ final IToken atom = element.get(__atom__KEY);
							return MainFlow.methods.determineType(atom,context);
						}
						}
				}
				ExternalContext currentContext = context;
				String result = "State.Data";
				for(final IToken call:statement.getAllSafely("variable_call")) {
						for(IToken.Key __element__KEY:call.keySet()) {
						if(__element__KEY.getName().equals("quote")){ final IToken element = call.get(__element__KEY);
							result = "String";
							currentContext = context.getClassContext("String");
						}
						if(__element__KEY.getName().equals("variableName")){ final IToken element = call.get(__element__KEY);
							if (currentContext.hasLink(element.toString())) {
							result = currentContext.type(element.toString());
							currentContext = currentContext.link(element.toString());
							}
							else  {
							System.err.println("$AS QUOTE NOT IMPLEMENTED FOR INNER$" + element.toString() + "$AS QUOTE NOT IMPLEMENTED FOR INNER$" + result);
							return "Object";
							}
						}
						if(__element__KEY.getName().equals("method")){ final IToken element = call.get(__element__KEY);
							if (element.get("NEW") != null) {
							result = MainFlow.methods.getTypeName(element.get("type_name"));
							currentContext = context.getClassContext(result);
							}
							else  {
							if (currentContext.hasLink(element.get("methodName").toString())) {
								result = currentContext.type(element.get("methodName").toString());
								currentContext = currentContext.link(element.get("methodName").toString());
							}
							else  {
								System.err.println("$AS QUOTE NOT IMPLEMENTED FOR INNER$" + element.get("methodName").toString() + "$AS QUOTE NOT IMPLEMENTED FOR INNER$" + result);
								return "Object";
							}
							}
						}
						}
				}
				return result;
			}
		}
	}
	public Set<String> getDeclaredCritSet()  {
		return __VAR__declaredCritSet;
	}
	public Set<String> get_declaredCritSet()  {
		return __VAR__declaredCritSet;
	}
	public Set<String> getDeclaredListSet()  {
		return __VAR__declaredListSet;
	}
	public Set<String> get_declaredListSet()  {
		return __VAR__declaredListSet;
	}
	public Set<String> getDeclaredMapSet()  {
		return __VAR__declaredMapSet;
	}
	public Set<String> get_declaredMapSet()  {
		return __VAR__declaredMapSet;
	}
	public String getTT()  {
		return __VAR__TT;
	}
	public String get_TT()  {
		return __VAR__TT;
	}
	public String getMainStringArgs()  {
		return __VAR__mainStringArgs;
	}
	public String get_mainStringArgs()  {
		return __VAR__mainStringArgs;
	}
	public VersionIdentifier getVersionId()  {
		return MainFlow.variables.get_version();
	}
	public void setVersionId(final Integer newVersion)  {
		__VAR__version.setId(newVersion);
	}
	public void assignListElementNames(final ParseContext context,final IToken root)  {
	}
	public String getDirectory(final String fileName,final String knownDirectory)  {
		return "../Resource/";
	}
	public void setup(final ParseContext data)  {
	}
	public void generate(final ParseContext data)  {
		MainFlow.methods.setup("../ZWine/src");
		MainFlow.classes.GuiClass.setup();
		MainFlow.classes.StatesClass.setup();
		final IToken root = data.getRoot();
		for(final IToken imports:root.getAllSafely("import_any")) {
				MainFlow.methods.importClasses(imports);
		}
		for(final IToken imports:root.getAllSafely("import_any")) {
				MainFlow.methods.importMethods(imports);
		}
		MainFlow.classes.GuiClass.output();
		MainFlow.classes.StateClass.DataClass.output();
		output(data);
	}
	public void importClasses(final IToken import_any)  {
		for(final IToken import_events:import_any.getAllSafely("IMPORT_EVENT")) {
				for(final IToken element:import_events.getAllSafely("event_declaration")) {
					MainFlow.classes.EventsClass.declaration(element);
				}
		}
		for(final IToken import_classes:import_any.getAllSafely("IMPORT_CLASSES")) {
				for(final IToken import_class:import_classes.getAllSafely("class_declaration")) {
					MainFlow.variables.get_classHandler().declaration(import_class);
				}
		}
	}
	public void importMethods(final IToken import_any)  {
		for(final IToken import_images:import_any.getAllSafely("IMPORT_IMAGES")) {
				for(final IToken import_image:import_images.getAllSafely("image_declaration")) {
					MainFlow.classes.GuiClass.image_declaration(import_image);
				}
		}
		for(final IToken import_map:import_any.getAllSafely("IMPORT_STATES")) {
				for(final IToken import_state:import_map.getAllSafely("state_declaration")) {
					MainFlow.classes.StatesClass.declaration(import_state);
				}
		}
	}
	public String getTypeName(final IToken nameToken)  {
		final StringBuilder nameBuilder = new StringBuilder();
		Boolean isFirst = true;
		for(final IToken element:nameToken.getAllSafely("typeName")) {
				if (isFirst == false) {
				nameBuilder.append(".");
				}
				else  {
				isFirst = false;
				}
				nameBuilder.append(FlowController.camelize(element.toString()));
		}
		return nameBuilder.toString();
	}
	public VersionIdentifier getVersion()  {
		return __VAR__version;
	}
	public VersionIdentifier get_version()  {
		return __VAR__version;
	}
	public Classes getClassHandler()  {
		return __VAR__classHandler;
	}
	public Classes get_classHandler()  {
		return __VAR__classHandler;
	}
	public Generator[] getGenerators()  {
		final MainFlow self = this;
		return new Generator[]{
		new Generator(){
			public String getName(){
				return "Main";
			}
			public void setup(ParseContext data){
			}
			public void generate(ParseContext data){
				StringBuilder __BUILDER__;
				File __DIRECTORY__;
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("states")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("States")+".java", MainFlow.classes.StatesClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("states")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("State")+".java", MainFlow.classes.StateClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Listener")+".java", MainFlow.classes.ListenerClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Events")+".java", MainFlow.classes.EventsClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Event")+".java", MainFlow.classes.EventClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("interfaces")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Listenable")+".java", MainFlow.classes.ListenableClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("interfaces")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Source")+".java", MainFlow.classes.SourceClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("interfaces")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Loaddable")+".java", MainFlow.classes.LoaddableClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("interfaces")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Tickable")+".java", MainFlow.classes.TickableClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Range")+".java", MainFlow.classes.RangeClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("ListMaps")+".java", MainFlow.classes.ListMapsClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Criteria")+".java", MainFlow.classes.CriteriaClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Factory")+".java", MainFlow.classes.FactoryClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("gui")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Gui")+".java", MainFlow.classes.GuiClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("game")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Game")+".java", MainFlow.classes.GameClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("DataWriter")+".java", MainFlow.classes.DataWriterClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("DataReader")+".java", MainFlow.classes.DataReaderClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("SaveThread")+".java", MainFlow.classes.SaveThreadClass);
				outputAll();
			}
			public void generateRoot(IToken rootToken){
			}
		}};
	}
	public static String __ROOT_DIRECTORY__ = ".";
	@Override
	public void initializeFlowController(){
	  MainFlow.variables = this;
	  MainFlow.methods = this;
	}
	public void setup(String rootDirectory){
		__ROOT_DIRECTORY__ = rootDirectory;
		ExternalClassEntry.suppliment("Math", "java.lang");
		ExternalClassEntry.suppliment("StringBuilder", "java.lang");
		ExternalClassEntry.suppliment("Thread", "java.lang");
		ExternalClassEntry.suppliment("Runnable", "java.lang");
		ExternalClassEntry.suppliment("Iterable", "java.lang");
		ExternalClassEntry.suppliment("Comparable", "java.lang");
		ExternalClassEntry.suppliment("Iterator", "java.util");
		ExternalClassEntry.suppliment("List", "java.util");
		ExternalClassEntry.suppliment("LinkedList", "java.util");
		ExternalClassEntry.suppliment("ArrayList", "java.util");
		ExternalClassEntry.suppliment("Arrays", "java.util");
		ExternalClassEntry.suppliment("Map", "java.util");
		ExternalClassEntry.suppliment("HashMap", "java.util");
		ExternalClassEntry.suppliment("Set", "java.util");
		ExternalClassEntry.suppliment("HashSet", "java.util");
		ExternalClassEntry.suppliment("TreeSet", "java.util");
		ExternalClassEntry.suppliment("Comparator", "java.util");
		ExternalClassEntry.suppliment("Scanner", "java.util");
		ExternalClassEntry.suppliment("Iterator", "java.util");
		ExternalClassEntry.suppliment("Collection", "java.util");
		ExternalClassEntry.suppliment("Collections", "java.util");
		ExternalClassEntry.suppliment("File", "java.io");
		ExternalClassEntry.suppliment("Entry", "com.rem.parser.generation");
		ExternalClassEntry.suppliment("ListEntry", "com.rem.parser.generation");
		ExternalClassEntry.suppliment("Generator", "com.rem.parser.generation");
		ExternalClassEntry.suppliment("IParser", "com.rem.parser.parser");
		ExternalClassEntry.suppliment("IToken", "com.rem.parser.token");
		ExternalClassEntry.suppliment("ParseContext", "com.rem.parser");
		ExternalClassEntry.suppliment("RegexParser", "com.rem.parser.parser");
		ExternalClassEntry.suppliment("Rules", "lists");
		ExternalClassEntry.suppliment("GeneralTokens", "lists");
		ExternalClassEntry.suppliment("Listnames", "lists");
		ExternalClassEntry.suppliment("JFrame", "javax.swing");
		ExternalClassEntry.suppliment("JPanel", "javax.swing");
		ExternalClassEntry.suppliment("Image", "java.awt");
		ExternalClassEntry.suppliment("Color", "java.awt");
		ExternalClassEntry.suppliment("ImageIO", "javax.imageio");
		ExternalClassEntry.suppliment("Graphics", "java.awt");
		ExternalClassEntry.suppliment("ExternalImportEntry", "com.rem.parser.generation.classwise");
		ExternalClassEntry.suppliment("StringEntry", "com.rem.parser.generation");
		MainFlow.classes.StatesClass.__INIT__();
		MainFlow.classes.StateClass.__INIT__();
		ExternalClassEntry.suppliment("Serializable", "java.io");
		ExternalClassEntry.suppliment("Random", "java.util");
		MainFlow.classes.ListenerClass.__INIT__();
		MainFlow.classes.EventsClass.__INIT__();
		MainFlow.classes.EventClass.__INIT__();
		MainFlow.classes.ListenableClass.__INIT__();
		MainFlow.classes.SourceClass.__INIT__();
		MainFlow.classes.LoaddableClass.__INIT__();
		MainFlow.classes.TickableClass.__INIT__();
		MainFlow.classes.RangeClass.__INIT__();
		MainFlow.classes.ListMapsClass.__INIT__();
		MainFlow.classes.CriteriaClass.__INIT__();
		MainFlow.classes.FactoryClass.__INIT__();
		ExternalClassEntry.suppliment("BorderLayout", "java.awt");
		ExternalClassEntry.suppliment("Dimension", "java.awt");
		ExternalClassEntry.suppliment("JPanel", "javax.swing");
		MainFlow.classes.GuiClass.__INIT__();
		ExternalClassEntry.suppliment("MouseMotionListener", "java.awt.event");
		ExternalClassEntry.suppliment("MouseListener", "java.awt.event");
		ExternalClassEntry.suppliment("KeyListener", "java.awt.event");
		ExternalClassEntry.suppliment("MouseEvent", "java.awt.event");
		ExternalClassEntry.suppliment("KeyEvent", "java.awt.event");
		MainFlow.classes.GameClass.__INIT__();
		ExternalClassEntry.suppliment("DataOutputStream", "java.io");
		ExternalClassEntry.suppliment("DataInputStream", "java.io");
		ExternalClassEntry.suppliment("ObjectOutputStream", "java.io");
		ExternalClassEntry.suppliment("FileOutputStream", "java.io");
		ExternalClassEntry.suppliment("ObjectInputStream", "java.io");
		ExternalClassEntry.suppliment("FileInputStream", "java.io");
		ExternalClassEntry.suppliment("Runnable", "java.lang");
		MainFlow.classes.DataWriterClass.__INIT__();
		MainFlow.classes.DataReaderClass.__INIT__();
		MainFlow.classes.SaveThreadClass.__INIT__();
		ExternalClassEntry.suppliment("Entry", "com.rem.parser.generation");
	}
	public void output(ParseContext data){
		ExternalImportEntry.solidify();
		getGenerators()[0].generate(data);
		for(Generator gen:privateFiles){
			gen.outputAll();
		}
		System.out.println("Output Complete");
	}

}