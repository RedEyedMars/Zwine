package clgen;
import java.util.*;
import java.io.*;
import lists.*;
import com.rem.parser.generation.classwise.*;
import com.rem.parser.generation.*;
import com.rem.parser.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.*;
import clgen.Classes;
import com.rem.parser.generation.*;
import com.rem.parser.generation.classwise.*;
import clent.*;
import java.util.*;
import java.io.*;
import java.nio.*;
import com.rem.parser.token.IToken;
import java.util.Set;
import java.util.Random;
import java.util.ArrayList;
import com.rem.parser.generation.StringEntry;
import java.util.HashSet;
public class  Classes   {
	public static class classes {
	}
	public static Classes variables = null;
	public static Classes methods = null;
	//Externals


	//Internals

public void getReturnType(final IToken body_element,final Set<String> typeNames,final ExternalContext context)  {
	for(IToken.Key __element__KEY:body_element.keySet()) {
		if(__element__KEY.getName().equals("return_statement")){ final IToken element = body_element.get(__element__KEY);
			typeNames.add(MainFlow.methods.determineType(element.get("statement"),context));
		}
		if(__element__KEY.getName().equals("if_statement")){ final IToken element = body_element.get(__element__KEY);
			for(final IToken atom:element.getAllSafely("body_element")) {
				getReturnType(atom,typeNames,context);
			}
		}
		if(__element__KEY.getName().equals("while_statement")){ final IToken element = body_element.get(__element__KEY);
			for(final IToken atom:element.getAllSafely("body_element")) {
				getReturnType(atom,typeNames,context);
			}
		}
		if(__element__KEY.getName().equals("for_statement")){ final IToken element = body_element.get(__element__KEY);
			for(final IToken atom:element.getAllSafely("body_element")) {
				getReturnType(atom,typeNames,context);
			}
		}
	}
}
public void declaration(final IToken declaration)  {
	final String newClassName = FlowController.camelize(declaration.get("className").toString());
	final Long randomSerial = new Random(newClassName.hashCode()).nextLong();
	final String serialValue = randomSerial + "L";
	final String finalLong = "final long";
	
	final ExternalClassEntry newClassNameClass = new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("defs")).get(__BUILDER__);
			}
		}, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(newClassName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")), new ArrayList<Entry>(Arrays.asList(new Entry[]{/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Serializable"))})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry(newClassName).get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(finalLong.toString())))),"", /*Name*/new ExternalStatement(new StringEntry("serialVersionUID")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(serialValue.toString())))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("double"))),"", /*Exac*/new ExternalStatement(new StringEntry("random")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Math")))), /*Enty*/new ExternalStatement(new StringEntry("random"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}};
	newClassNameClass.__INIT__();
	final StringBuilder __BUILDER__;
	final File __DIRECTORY__;
	__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("defs")).get(__BUILDER__);
	__DIRECTORY__ = new File(MainFlow.__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	MainFlow.methods.addFile(__DIRECTORY__,FlowController.camelize(newClassName)+".java", newClassNameClass);
	newClassNameClass.removeMethod(newClassNameClass.getMethod("getSerialVersionUID"));
	final ExternalContext context = MainFlow.classes.GameClass.getContext().getClassContext(newClassName);
	for(final IToken element:declaration.getAllSafely("class_element")) {
			for(IToken.Key __atom__KEY:element.keySet()) {
			if(__atom__KEY.getName().equals("extendsClassName")){ final IToken atom = element.get(__atom__KEY);
				newClassNameClass.addParentClass(ExternalClassEntry.classMap.get(FlowController.camelize(atom.toString())));
			}
			if(__atom__KEY.getName().equals("implementsClassName")){ final IToken atom = element.get(__atom__KEY);
				newClassNameClass.addInterfaceClass(ExternalClassEntry.classMap.get(FlowController.camelize(atom.toString())));
			}
			}
	}
	for(final IToken element:declaration.getAllSafely("class_element")) {
			for(final IToken atom:element.getAllSafely("variable")) {
				final String variableName = atom.get("variableName").toString();
				final String variableTypeName;
				if (atom.get("array_type") == null) {
				if (atom.get("type_name") != null) {
					variableTypeName = MainFlow.methods.getTypeName(atom.get("type_name"));
				}
				else  {
					variableTypeName = MainFlow.methods.determineType(atom.get("statement"),context);
				}
				final ExternalStatement statement = MainFlow.methods.getStatement(atom.get("statement"),context);
newClassNameClass.addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(variableTypeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(variableName.toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(statement)))));
newClassNameClass.addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Enty*/new ExternalStatement(new StringEntry("set"+FlowController.camelize(variableName.toString()).toString())), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(variableTypeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry("new"+FlowController.camelize(variableName.toString()).toString())))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Enty*/new ExternalStatement(new StringEntry(variableName.toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry("new"+FlowController.camelize(variableName.toString()).toString())))))))));
				}
				else  {
				String pluralizer = "";
				if (atom.get("pluralizer") != null) {
					pluralizer = atom.get("pluralizer").toString();
				}
				variableTypeName = MainFlow.methods.addListVariable(variableName,pluralizer,atom.get("array_type").toString(),newClassNameClass);
				}
				if (atom.get("IDENTIFIER") != null) {
				if (MainFlow.variables.get_classIdentifierMap().containsKey(newClassName) == false) {
					MainFlow.variables.get_classIdentifierMap().put(newClassName,new ArrayList<String>());
					MainFlow.variables.get_classIdentifierClassMap().put(newClassName,new ArrayList<String>());
				}
				MainFlow.variables.get_classIdentifierMap().get(newClassName).add(variableName.toString());
				MainFlow.variables.get_classIdentifierClassMap().get(newClassName).add(variableTypeName.toString());
				}
			}
			for(final IToken atom:element.getAllSafely("method")) {
				final String methodTypeName;
				final String methodName = atom.get("methodName").toString();
				final ExternalMethodEntry methodDummy = new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("dummyMethod")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body());
				context.add(methodDummy);
				final ExternalContext methodContext = methodDummy.getContext();
				final ExternalStatement.Parameters parameters = new ExternalStatement.Parameters();
				for(final IToken quark:atom.getAllSafely("variable_header")) {
					final String typeName = MainFlow.methods.getTypeName(quark.get("type_name"));
					final String variableName = quark.get("variableName").toString();
					final ExternalVariableEntry param = new ExternalVariableEntry(new StringEntry(typeName.toString()),new StringEntry(variableName.toString()));
					parameters.add(param);
					methodContext.add(param);
				}
				final ExternalStatement.Body methodBody = MainFlow.methods.getBodyElements(atom.get("body"),methodContext);
				if (atom.get("type_name") != null) {
				methodTypeName = MainFlow.methods.getTypeName(atom.get("type_name"));
				}
				else  {
				final Set<String> typeNames = new HashSet<String>();
				for(final IToken quark:atom.get("body").getAllSafely("body_element")) {
						getReturnType(quark,typeNames,methodContext);
				}
				if (typeNames.isEmpty() == false) {
					methodTypeName = typeNames.iterator().next();
				}
				else  {
					methodTypeName = "void";
				}
				}
newClassNameClass.addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(methodTypeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(methodName.toString())), parameters, "", /*Body*/new ExternalStatement.Body()));
				newClassNameClass.getMethod(methodName.toString()).appendToBody(methodBody);
			}
	}
}

}