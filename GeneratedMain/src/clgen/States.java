package clgen;
import java.util.*;
import java.io.*;
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
public class States extends ExternalClassEntry {
		protected final Set<String> entersAdded = new HashSet<String>();
		protected final Set<String> exitsAdded = new HashSet<String>();
		protected final Set<String> listsAdded = new HashSet<String>();
		protected Boolean firstStateAdded = false;
		protected Integer stateId = 0;
		protected final ExternalStatement.Body createSwitchBody = new ExternalStatement.Body();

	
public void setup()  {
}
	
public void declaration(final IToken declaration)  {
	final String stateName = declaration.get("stateName").toString();
	final String stateClassName = FlowController.camelize(stateName.toString());
	for(final IToken element:declaration.getAllSafely("subState")) {
			final String subStateName = element.get("transitionIndex").toString();
			final String subStateClassName = FlowController.camelize(subStateName.toString());
			definition(element,stateName,stateClassName,stateName + subStateName,stateClassName + subStateClassName);
	}
}
	
public void definition(final IToken definition,final String parentStateName,final String parentStateClassName,final String stateName,final String stateClassName)  {
	boolean firstSelectedAdded = false;
	final ExternalStatement.Body transitionSwitchBody = new ExternalStatement.Body();
	final ExternalStatement.Body transitionTextSwitchBody = new ExternalStatement.Body();
	final Integer stateIdValue = stateId;
	MainFlow.classes.StateClass.stateVersionId += stateClassName.hashCode();
	createSwitchBody.add(/*InCl*/new ExternalStatement(
		/*Case*/new ExternalStatement.Conditional(
			"case ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(stateId.toString())))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(stateClassName.toString())))),new ExternalStatement.Parameters()))))).setBraces("",":")));
MainFlow.classes.StatesClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(stateClassName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry(stateClassName).get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Exac*/new ExternalStatement(new StringEntry("getTransitionText")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(stateClassName)))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Transition")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))),"", /*Name*/new ExternalStatement(new StringEntry("transitionId")))}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"switch ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("transitionId")))),
			/*InCl*/new ExternalStatement(transitionTextSwitchBody)),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("State"))),"", /*Exac*/new ExternalStatement(new StringEntry("transition")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(stateClassName)))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Transition")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))),"", /*Name*/new ExternalStatement(new StringEntry("transitionId")))}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"switch ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("transitionId")))),
			/*InCl*/new ExternalStatement(transitionSwitchBody)),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("enter")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("exit")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("display")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Graphics"))),"", /*Name*/new ExternalStatement(new StringEntry("g")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("yOffset")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))))))),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("mouseRelease")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("x"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("y")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("yOffset")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))))))),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("mouseHover")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("x"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("y")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("yOffset")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))))))),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Exac*/new ExternalStatement(new StringEntry("getId")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(stateIdValue.toString())))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
	stateId += 1;
MainFlow.classes.StatesClass.getSubClass(stateClassName.toString()).addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry("Transition"), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("Transition").get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
MainFlow.classes.StatesClass.getSubClass(stateClassName.toString()).getSubClass("TransitionClass").addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry("Id"), "enum ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static enum ");
			new StringEntry("Id").get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
	if (firstStateAdded == false) {
MainFlow.classes.GameClass.addVariable(new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("State"))),"", /*Name*/new ExternalStatement(new StringEntry("currentState")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(stateClassName.toString())))))),new ExternalStatement.Parameters()))));
	}
	Integer displayLineIndex = -1;
	final List<String> displayLines = new ArrayList<String>();
	final List<String> choiceNameLines = new ArrayList<String>();
	final List<String> choiceEnumLines = new ArrayList<String>();
	final List<ExternalStatement> conditionStatements = new ArrayList<ExternalStatement>();
	String firstChoiceEnum = null;
	final ExternalStatement.Body completeDisplayBody = new ExternalStatement.Body();
	for(final IToken element:definition.getAllSafely("stateChange")) {
			final ExternalStatement.Body changeBody = new ExternalStatement.Body();
			Integer currentIndex = 0;
			String previousStateTransition = null;
			Integer previousIndex = -1;
			ExternalContext context = MainFlow.classes.StateClass.DataClass.getContext();
			for(final IToken atom:element.getAllSafely("entry_element")) {
				context = MainFlow.classes.StateClass.DataClass.getContext();
				if (atom.get("PLUS") != null) {
				final ExternalStatement variableName = new ExternalStatement();
				variableName.set(".");
				variableName.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("State"))))));
				variableName.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("data")))));
				for(final IToken quark:atom.getAllSafely("variableName")) {
						variableName.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry("get"+FlowController.camelize(quark.toString()).toString())),new ExternalStatement.Parameters())));
				}
				final ExternalStatement newVariableAssignment = MainFlow.methods.getStateStatement(atom.get("statement"),context);
				final String newVariableName = atom.get("newVariable").toString();
				final String newVariableType;
				if (atom.get("type_name") != null) {
					newVariableType = MainFlow.methods.getTypeName(atom.get("type_name"));
				}
				else  {
					newVariableType = MainFlow.methods.determineType(atom.get("statement"),context);
				}
MainFlow.classes.StateClass.DataClass.addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(newVariableType.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(newVariableName.toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
MainFlow.classes.StateClass.DataClass.VariablesClass.addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(newVariableType.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(newVariableName.toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
				MainFlow.classes.StateClass.DataClass.acceptSwitchBody.add(/*InCl*/new ExternalStatement(
		/*Case*/new ExternalStatement.Conditional(
			"case ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(newVariableName.toString())))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry("set"+FlowController.camelize(newVariableName.toString()).toString())),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Cast*/new ExternalStatement("",new ExternalStatement(new StringEntry("("),new StringEntry(")"),"", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(newVariableType.toString()))))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("toSet")))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("break"))))))).setBraces("",":")));
MainFlow.classes.StateClass.DataClass.addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Enty*/new ExternalStatement(new StringEntry("set"+FlowController.camelize(newVariableName.toString()).toString())), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(newVariableType.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry("new"+FlowController.camelize(newVariableName.toString()).toString())))}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(newVariableName.toString())))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Enty*/new ExternalStatement(new StringEntry(newVariableName.toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry("new"+FlowController.camelize(newVariableName.toString()).toString())))))))))));
				MainFlow.methods.addStorageElement(newVariableType.toString(),newVariableName.toString(),MainFlow.classes.StateClass.DataClass);
				changeBody.add(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(variableName)), /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("set")), /*Enty*/new ExternalStatement(new StringEntry(FlowController.camelize(newVariableName.toString()).toString()))))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(newVariableAssignment))))))))));
				}
				else if (atom.get("PLUSEQUALS") != null || atom.get("MINUSEQUALS") != null) {
				final ExternalStatement variableNameWithoutLast = new ExternalStatement();
				variableNameWithoutLast.set(".");
				variableNameWithoutLast.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("State"))))));
				variableNameWithoutLast.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("data")))));
				String lastVariableName = null;
				Integer numberOfVariableNames = 0;
				String previousVariableName = null;
				for(final IToken quark:atom.getAllSafely("variableName")) {
						if (previousVariableName != null) {
						variableNameWithoutLast.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry("get"+FlowController.camelize(previousVariableName.toString()).toString())),new ExternalStatement.Parameters())));
						}
						lastVariableName = quark.toString();
						previousVariableName = quark.toString();
						numberOfVariableNames += 1;
				}
				final ExternalStatement newVariableAssignment = MainFlow.methods.getStateStatement(atom.get("statement"),context);
				final String listType = MainFlow.methods.determineType(atom.get("statement"),context);
				if (numberOfVariableNames == 1  && listsAdded.add(lastVariableName.toString())) {
					String pluralizer = "";
					if (atom.get("pluralizer") != null) {
						pluralizer = atom.get("pluralizer").toString();
					}
					final String newVariableType = MainFlow.methods.addListVariable(lastVariableName.toString(),pluralizer,listType.toString(),MainFlow.classes.StateClass.DataClass);
					final String newVariableName = lastVariableName.toString() + pluralizer;
MainFlow.classes.StateClass.DataClass.VariablesClass.addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(newVariableType.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(newVariableName.toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
					MainFlow.classes.StateClass.DataClass.acceptSwitchBody.add(/*InCl*/new ExternalStatement(
		/*Case*/new ExternalStatement.Conditional(
			"case ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(newVariableName.toString())))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry("set"+FlowController.camelize(newVariableName.toString()).toString())),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Cast*/new ExternalStatement("",new ExternalStatement(new StringEntry("("),new StringEntry(")"),"", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(newVariableType.toString()))))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("toSet")))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("break"))))))).setBraces("",":")));
					MainFlow.methods.addStorageElement(newVariableType.toString(),newVariableName.toString(),MainFlow.classes.StateClass.DataClass);
				}
				if (atom.get("PLUSEQUALS") != null) {
					changeBody.add(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(variableNameWithoutLast)), /*Enty*/new ExternalStatement(new StringEntry("add"+FlowController.camelize(lastVariableName.toString()).toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(newVariableAssignment))))))))));
				}
				else  {
					changeBody.add(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(variableNameWithoutLast)), /*Enty*/new ExternalStatement(new StringEntry("remove"+FlowController.camelize(lastVariableName.toString()).toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(newVariableAssignment))))))))));
				}
				}
				else if (atom.get("EQUALSIGN") != null) {
				final List<String> variableNames = new ArrayList<String>();
				for(final IToken quark:atom.getAllSafely("variableName")) {
						variableNames.add(FlowController.camelize(quark.toString()));
				}
				final ExternalStatement changeToAdd = new ExternalStatement();
				changeToAdd.set(".");
				changeToAdd.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("State"))))));
				changeToAdd.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("data")))));
				for (Integer i = 0; i <  variableNames.size() - 1 ; ++i) {
					changeToAdd.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("get")), /*Enty*/new ExternalStatement(new StringEntry(variableNames.get(i).toString())))),new ExternalStatement.Parameters())));
				}
				changeToAdd.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("set")), /*Enty*/new ExternalStatement(new StringEntry(variableNames.get(variableNames.size() - 1).toString())))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getStateStatement(atom.get("statement"),context))))))));
				changeBody.add(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(changeToAdd))))));
				}
				else if (atom.get("transition") != null) {
				for(final IToken quark:atom.getAllSafely("transition")) {
						final Integer currentIndexValue = currentIndex;
						final Integer previousIndexValue = previousIndex;
						currentIndex += 1;
						previousIndex += 1;
						final String transitionStateClassName;
						if (quark.get("transitionStateName") != null) {
						transitionStateClassName = FlowController.camelize(quark.get("transitionStateName").toString()) + FlowController.camelize(quark.get("transitionIndex").toString());
						}
						else  {
						transitionStateClassName = parentStateClassName + FlowController.camelize(quark.get("transitionIndex").toString());
						}
						previousStateTransition = transitionStateClassName;
						if (currentIndexValue == 0 ) {
						changeBody.add(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("exit")),new ExternalStatement.Parameters()))),
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(transitionStateClassName.toString())))))),"", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("newState")), /*Enty*/new ExternalStatement(new StringEntry(currentIndexValue.toString())))), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(transitionStateClassName.toString())))),new ExternalStatement.Parameters())))),
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("newState")), /*Enty*/new ExternalStatement(new StringEntry(currentIndexValue.toString()))))), /*Enty*/new ExternalStatement(new StringEntry("enter"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))));
						}
						else  {
						changeBody.add(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("newState")), /*Enty*/new ExternalStatement(new StringEntry(previousIndexValue.toString()))))), /*Name*/new ExternalStatement(new StringEntry("exit"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(transitionStateClassName.toString())))))),"", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("newState")), /*Enty*/new ExternalStatement(new StringEntry(currentIndexValue.toString())))), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(transitionStateClassName.toString())))),new ExternalStatement.Parameters())))),
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("newState")), /*Enty*/new ExternalStatement(new StringEntry(currentIndexValue.toString()))))), /*Enty*/new ExternalStatement(new StringEntry("enter"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))));
						}
				}
				}
			}
			if (currentIndex > 0 ) {
			final String previousStateTransitionValue = previousStateTransition;
			final Integer previousIndexValue = previousIndex;
			changeBody.add(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(previousStateTransitionValue.toString())))),"", /*Name*/new ExternalStatement(new StringEntry("newState")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("newState")), /*Enty*/new ExternalStatement(new StringEntry(previousIndexValue.toString()))))))))));
			}
			if (element.get("ENTER") != null) {
			MainFlow.classes.StatesClass.getSubClass(stateClassName.toString()).getMethod("enter").appendToBody(changeBody);
			firstStateAdded = true;
			}
			else if (element.get("EXIT") != null) {
			MainFlow.classes.StatesClass.getSubClass(stateClassName.toString()).getMethod("exit").appendToBody(changeBody);
			firstStateAdded = true;
			}
			else  {
			final ExternalStatement.Body transitionBody = new ExternalStatement.Body();
			final StringBuilder choiceEnum = new StringBuilder();
			final StringBuilder choiceNameBuilder = new StringBuilder();
			for(final IToken atom:element.getAllSafely("choiceName")) {
					for(final IToken quark:atom.getAllSafely("descriptor")) {
						if (quark.get("special_descriptor") == null) {
						choiceNameBuilder.append(" ");
						choiceNameBuilder.append(quark.toString());
						}
						else  {
						for(final IToken quanta:quark.getAllSafely("special_descriptor")) {
								for(IToken.Key __string__KEY:quanta.keySet()) {
								if(__string__KEY.getName().equals("newline")){ final IToken string = quanta.get(__string__KEY);
									choiceNameBuilder.append("\n");
								}
								if(__string__KEY.getName().equals("statement")){ final IToken string = quanta.get(__string__KEY);
									choiceNameBuilder.append(" \"+");
									final ExternalStatement statement = MainFlow.methods.getStateStatement(string,context);
									statement.get(choiceNameBuilder);
									choiceNameBuilder.append("+\"");
								}
								}
						}
						}
					}
			}
			final String choiceName = choiceNameBuilder.toString();
			if (choiceName.matches("\\s*")) {
				return ;
			}
			boolean doom = false;
			for (final char c :  choiceName.toCharArray()) {
				if (doom == false) {
					if (("" + c) . matches("[a-zA-Z0-9 \\t]")) {
						if (("" + c) . matches("[a-zA-Z0-9]")) {
							choiceEnum.append("" + c);
						}
					}
					else  {
						doom = true;
					}
				}
			}
			choiceEnum.append(choiceNameLines.size());
			if (firstChoiceEnum == null) {
				firstChoiceEnum = choiceEnum.toString();
			}
			transitionTextSwitchBody.add(/*InCl*/new ExternalStatement(
		/*Case*/new ExternalStatement.Conditional(
			"case ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(choiceEnum.toString())))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(choiceName.toString()))))))).setBraces("",":")));
			transitionSwitchBody.add(/*InCl*/new ExternalStatement(
		/*Case*/new ExternalStatement.Conditional(
			"case ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(choiceEnum.toString())))),
			/*InCl*/new ExternalStatement(transitionBody)).setBraces("",":")));
			transitionBody.add(changeBody);
			transitionBody.add(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newState")))))));
			choiceNameLines.add(choiceName);
			choiceEnumLines.add(choiceEnum.toString());
MainFlow.classes.StatesClass.getSubClass(stateClassName.toString()).getSubClass("TransitionClass").getSubClass("Id").addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Enty*/new ExternalStatement(new StringEntry(choiceEnum.toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
			if (element.get("boolean_statement") != null) {
				conditionStatements.add(MainFlow.methods.getStateBooleanStatement(element.get("boolean_statement"),context));
			}
			else  {
				conditionStatements.add(null);
			}
			}
	}
	for(final IToken element:definition.getAllSafely("stateDescription")) {
			final StringBuilder linesBuilder = new StringBuilder();
			final ExternalContext context = MainFlow.classes.StateClass.DataClass.getContext();
			for(final IToken atom:element.getAllSafely("descriptionLine")) {
				for(final IToken quark:atom.getAllSafely("descriptor")) {
					if (quark.get("special_descriptor") == null) {
					linesBuilder.append(" ");
					linesBuilder.append(quark.toString());
					}
					else  {
					for(final IToken quanta:quark.getAllSafely("special_descriptor")) {
							for(IToken.Key __string__KEY:quanta.keySet()) {
							if(__string__KEY.getName().equals("newline")){ final IToken string = quanta.get(__string__KEY);
								linesBuilder.append("\n");
							}
							if(__string__KEY.getName().equals("statement")){ final IToken string = quanta.get(__string__KEY);
								linesBuilder.append(" \"+");
								final ExternalStatement statement = MainFlow.methods.getStateStatement(string,context);
								statement.get(linesBuilder);
								linesBuilder.append("+\"");
							}
							}
					}
					}
				}
			}
			final Integer displayLineIndexStartValue = displayLineIndex + 1;
			displayLineIndex = handleLines(linesBuilder.toString(),displayLines,displayLineIndex);
			final Integer displayLineIndexEndValue = displayLineIndex;
			Integer i = displayLineIndexStartValue;
			while (i <= displayLineIndexEndValue) {
			final Integer yOffset = 205 + i * 15;
			final Integer xOffset = 30;
			MainFlow.classes.StatesClass.getSubClass(stateClassName.toString()).getMethod("display").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g"))), /*Enty*/new ExternalStatement(new StringEntry("drawString"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(displayLines.get(i).toString().toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(xOffset.toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(yOffset.toString())))))))))));
			i += 1;
			}
	}
	if (firstChoiceEnum != null) {
		firstSelectedAdded = true;
		final String firstChoiceEnumValue = firstChoiceEnum;
MainFlow.classes.StatesClass.getSubClass(stateClassName.toString()).addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(stateClassName.toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Transition")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))),"", /*Name*/new ExternalStatement(new StringEntry("selected")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
		MainFlow.classes.StatesClass.getSubClass(stateClassName.toString()).getMethod("mouseRelease").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("mouseHover")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y")))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game")))), /*Enty*/new ExternalStatement(new StringEntry("transition"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("transition")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("selected"))))))))))))));
		displayLineIndex += 1;
		displayLines.add("");
	}
	for (Integer choiceIndex = 0; choiceIndex <  choiceNameLines.size(); ++choiceIndex) {
		displayLineIndex += 1;
		displayLines.add("");
		final String choiceName = choiceNameLines.get(choiceIndex);
		final String choiceEnum = choiceEnumLines.get(choiceIndex);
		final ExternalStatement conditionStatement = conditionStatements.get(choiceIndex);
		final Integer displayLineIndexStartValue = displayLineIndex + 1;
		displayLineIndex = handleLines(choiceName,displayLines,displayLineIndex);
		final Integer displayLineIndexEndValue = displayLineIndex;
		final ExternalStatement.Body conditionBody = new ExternalStatement.Body();
		Integer i = displayLineIndexStartValue;
		while (i <= displayLineIndexEndValue) {
			final Integer yOffset = 190 + i * 15;
			final Integer xOffset = 30 + (101 - displayLines.get(i).toString().length()) * 5 / 2;
			conditionBody.add(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g"))), /*Enty*/new ExternalStatement(new StringEntry("drawString"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(displayLines.get(i).toString().toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(xOffset.toString())))),/*Optr*/new ExternalStatement("-", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(yOffset.toString())))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yOffset")))))))))));
			i += 1;
		}
		final Integer conditionYOffset = (displayLineIndexEndValue - displayLineIndexStartValue + 2) * 15;
		if (conditionStatement != null) {
			completeDisplayBody.add(/*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(conditionStatement))),
			/*InCl*/new ExternalStatement(conditionBody)),
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yOffset")))), /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(conditionYOffset.toString())))))))));
		}
		else  {
			completeDisplayBody.add(conditionBody);
		}
		final Integer xOffset = 30;
		final Integer yOffset = 170 + displayLineIndexStartValue * 15;
		final Integer cWidth = 600 - 30 - 30;
		final Integer cHeight = (i - displayLineIndexEndValue + 1) * 15;
		completeDisplayBody.add(/*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("selected")))), /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(stateClassName.toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Transition")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id")))), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(choiceEnum.toString())))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g"))), /*Enty*/new ExternalStatement(new StringEntry("drawRoundRect"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(xOffset.toString())))),/*Optr*/new ExternalStatement("-", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(yOffset.toString())))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yOffset")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(cWidth.toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(cHeight.toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("10")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("15")))))))))))));
		final Integer mxOffset = 30;
		final Integer myOffset = 170 + (displayLineIndexStartValue) * 15;
		final Integer xMax = mxOffset + cWidth;
		final Integer yMax = myOffset + cHeight;
		if (conditionStatement != null) {
			MainFlow.classes.StatesClass.getSubClass(stateClassName.toString()).getMethod("mouseHover").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(conditionStatement))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("-", /*Optr*/new ExternalStatement("<=", /*Optr*/new ExternalStatement("&&", /*Optr*/new ExternalStatement("-", /*Optr*/new ExternalStatement(">=", /*Optr*/new ExternalStatement("&&", /*Optr*/new ExternalStatement("<=", /*Optr*/new ExternalStatement("&&", /*Optr*/new ExternalStatement(">=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))), /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(mxOffset.toString())))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))), /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(xMax.toString())))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y")))), /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(myOffset.toString())))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yOffset")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y")))), /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(yMax.toString())))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yOffset")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("selected")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(stateClassName.toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Transition")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id")))), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(choiceEnum.toString())))))))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")))), /*Enty*/new ExternalStatement(new StringEntry("refresh"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yOffset")))), /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(conditionYOffset.toString())))))))));
		}
		else  {
			MainFlow.classes.StatesClass.getSubClass(stateClassName.toString()).getMethod("mouseHover").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("-", /*Optr*/new ExternalStatement("<=", /*Optr*/new ExternalStatement("&&", /*Optr*/new ExternalStatement("-", /*Optr*/new ExternalStatement(">=", /*Optr*/new ExternalStatement("&&", /*Optr*/new ExternalStatement("<=", /*Optr*/new ExternalStatement("&&", /*Optr*/new ExternalStatement(">=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))), /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(mxOffset.toString())))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))), /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(xMax.toString())))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y")))), /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(myOffset.toString())))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yOffset")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y")))), /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(yMax.toString())))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yOffset")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("selected")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(stateClassName.toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Transition")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id")))), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(choiceEnum.toString())))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")))), /*Enty*/new ExternalStatement(new StringEntry("refresh"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))));
		}
	}
	MainFlow.classes.StatesClass.getSubClass(stateClassName.toString()).getMethod("display").appendToBody(completeDisplayBody);
}
	
public Integer handleLines(final String input,final List<String> displayLines,final Integer displayLineIndexValue)  {
	Integer displayLineIndex = displayLineIndexValue;
	displayLineIndex += 1;
	final Integer displayLineIndexStartValue = displayLineIndex;
	StringBuilder currentLine = new StringBuilder();
	StringBuilder currentWord = new StringBuilder();
	Integer currentLineCount = 0;
	for (int i = 0; i <  input.length(); ++i) {
		final char c = input.charAt(i);
		if (("" + c) . matches("[a-zA-Z0-9]")) {
			currentWord.append(c);
		}
		else  {
			boolean justLined = false;
			if (currentLineCount + currentWord.toString().length() > 100 ) {
				displayLineIndex += 1;
				displayLines.add(currentLine.toString());
				currentLine = new StringBuilder();
				currentLineCount = 0;
				justLined = true;
			}
			if (currentLineCount != 0  || currentWord.toString().length() != 0  || ("" + c) . matches("[ \\t]") == false) {
				currentLine.append(currentWord.toString());
				if (("" + c) . equals("\n")) {
					if (justLined == false) {
						displayLineIndex += 1;
						displayLines.add(currentLine.toString());
						currentLine = new StringBuilder();
						currentLineCount = 0;
					}
				}
				else  {
					currentLine.append(c);
					currentLineCount += currentWord.toString().length() + 1;
				}
				currentWord = new StringBuilder();
			}
		}
	}
	if (currentLineCount + currentWord.toString().length() > 100 ) {
		displayLineIndex += 1;
		displayLines.add(currentLine.toString());
		currentLine = new StringBuilder();
	}
	currentLine.append(currentWord.toString());
	displayLines.add(currentLine.toString());
	return displayLineIndex;
}



	public void __INIT__(){
		super.__SETUP__(
			new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("states")).get(__BUILDER__);
			}
		}, 
			new Entry(){
				public void get(StringBuilder __BUILDER__){
				}}, 
			new StringEntry("States"), 
			"class ", 
			null, 
			new ArrayList<Entry>(Arrays.asList(new Entry[]{})),
			
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry("States").get(builder);
			new StringEntry("").get(builder);
		}
	},
			Arrays.asList(new ExternalVariableEntry[]{}), 
			Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, true,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("State"))),"", /*Exac*/new ExternalStatement(new StringEntry("create")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("stateId")))}), "", /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"switch ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("stateId")))),
			/*InCl*/new ExternalStatement(createSwitchBody)),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))))}), 
			Arrays.asList(new ExternalClassEntry[]{}));
	}
}