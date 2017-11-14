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
import java.awt.Font;
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
public class Game extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
			new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("game")).get(__BUILDER__);
			}
		}, 
			new Entry(){
				public void get(StringBuilder __BUILDER__){
				}}, 
			new StringEntry("Game"), 
			"class ", 
			/*TypeName*/new ExternalStatement.TypeName(new StringEntry("JPanel")), 
			new ArrayList<Entry>(Arrays.asList(new Entry[]{/*TypeName*/new ExternalStatement.TypeName(new StringEntry("MouseListener")),/*TypeName*/new ExternalStatement.TypeName(new StringEntry("KeyListener")),/*TypeName*/new ExternalStatement.TypeName(new StringEntry("MouseMotionListener"))})),
			
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry("Game").get(builder);
			new StringEntry("").get(builder);
		}
	},
			Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("boolean"))),"", /*Name*/new ExternalStatement(new StringEntry("running")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true"))))),new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("loadFileName")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("./res/saves/auto.save".toString()))))),new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("saveFileName")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("./res/saves/auto.save".toString()))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui"))),"", /*Name*/new ExternalStatement(new StringEntry("gui")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler"))),"", /*Name*/new ExternalStatement(new StringEntry("handler")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))),"", /*Name*/new ExternalStatement(new StringEntry("lastTick")), /*Optr*/new ExternalStatement("/", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("System"))), /*Enty*/new ExternalStatement(new StringEntry("currentTimeMillis"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000.0"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))),"", /*Name*/new ExternalStatement(new StringEntry("thisTick")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("lastTick"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("boolean"))),"[]", /*Name*/new ExternalStatement(new StringEntry("pressedKeys")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("boolean"))),new ExternalStatement.ArrayParameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("128"))))))))}), 
			Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, true,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("main")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"[]", /*Name*/new ExternalStatement(new StringEntry("args")))}), "", /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("arg"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("args"))))),
			/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("arg"))), /*Enty*/new ExternalStatement(new StringEntry("startsWith"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("-s".toString())))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game")))), /*Enty*/new ExternalStatement(new StringEntry("loadFileName")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("arg"))), /*Enty*/new ExternalStatement(new StringEntry("substring"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2"))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+", /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game")))), /*Enty*/new ExternalStatement(new StringEntry("saveFileName")))), /*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("./res/saves/".toString())))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("arg"))), /*Enty*/new ExternalStatement(new StringEntry("substring"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2"))))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("arg"))), /*Enty*/new ExternalStatement(new StringEntry("startsWith"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("-i".toString())))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+", /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game")))), /*Enty*/new ExternalStatement(new StringEntry("loadFileName")))), /*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("./res/saves/".toString())))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("arg"))), /*Enty*/new ExternalStatement(new StringEntry("substring"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2"))))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("arg"))), /*Enty*/new ExternalStatement(new StringEntry("startsWith"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("-o".toString())))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+", /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game")))), /*Enty*/new ExternalStatement(new StringEntry("saveFileName")))), /*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("./res/saves/".toString())))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("arg"))), /*Enty*/new ExternalStatement(new StringEntry("substring"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2"))))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("arg"))), /*Enty*/new ExternalStatement(new StringEntry("startsWith"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("-reset".toString())))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game")))), /*Enty*/new ExternalStatement(new StringEntry("loadFileName")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui"))),new ExternalStatement.Parameters()))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("load")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui"))),"", /*Name*/new ExternalStatement(new StringEntry("gui")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))), /*Name*/new ExternalStatement(new StringEntry("gui")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("gui"))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("setPreferredSize")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Dimension"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("600")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("400"))))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("setSize")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Dimension"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("600")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("400"))))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("gui"))), /*Enty*/new ExternalStatement(new StringEntry("addKeyListener"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("gui"))), /*Enty*/new ExternalStatement(new StringEntry("addMouseListener"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("gui"))), /*Enty*/new ExternalStatement(new StringEntry("addMouseMotionListener"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game")))), /*Enty*/new ExternalStatement(new StringEntry("handler")))), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("30")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("210")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("540")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("180")))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game")))), /*Enty*/new ExternalStatement(new StringEntry("loadFileName")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Data")))))), /*Enty*/new ExternalStatement(new StringEntry("loadFile"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game")))), /*Enty*/new ExternalStatement(new StringEntry("loadFileName"))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")))), /*Enty*/new ExternalStatement(new StringEntry("data")))), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Data"))))),new ExternalStatement.Parameters()))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentState"))), /*Enty*/new ExternalStatement(new StringEntry("enter"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentState"))), /*Enty*/new ExternalStatement(new StringEntry("display"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("handler"))))))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("keyReleased")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("KeyEvent"))),"", /*Name*/new ExternalStatement(new StringEntry("event")))}), "", /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getKeyCode"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("27 ")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("gui"))), /*Enty*/new ExternalStatement(new StringEntry("dispose"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("System")))), /*Enty*/new ExternalStatement(new StringEntry("exit"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("pressedKeys")), new ExternalStatement.ArrayParameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getKeyCode"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false"))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentState")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentState"))), /*Enty*/new ExternalStatement(new StringEntry("keyPress"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getKeyCode"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("keyPressed")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("KeyEvent"))),"", /*Name*/new ExternalStatement(new StringEntry("event")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("pressedKeys")), new ExternalStatement.ArrayParameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getKeyCode"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true"))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("keyTyped")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("KeyEvent"))),"", /*Name*/new ExternalStatement(new StringEntry("event")))}), "", /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("mouseClicked")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("MouseEvent"))),"", /*Name*/new ExternalStatement(new StringEntry("event")))}), "", /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("mousePressed")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("MouseEvent"))),"", /*Name*/new ExternalStatement(new StringEntry("event")))}), "", /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("mouseReleased")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("MouseEvent"))),"", /*Name*/new ExternalStatement(new StringEntry("event")))}), "", /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentState")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentState"))), /*Enty*/new ExternalStatement(new StringEntry("mouseRelease"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getY"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("mouseExited")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("MouseEvent"))),"", /*Name*/new ExternalStatement(new StringEntry("event")))}), "", /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("mouseEntered")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("MouseEvent"))),"", /*Name*/new ExternalStatement(new StringEntry("event")))}), "", /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("mouseDragged")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("MouseEvent"))),"", /*Name*/new ExternalStatement(new StringEntry("event")))}), "", /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("mouseMoved")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("MouseEvent"))),"", /*Name*/new ExternalStatement(new StringEntry("event")))}), "", /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentState")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentState"))), /*Enty*/new ExternalStatement(new StringEntry("mouseHover"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getY"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("paintComponent")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Graphics"))),"", /*Name*/new ExternalStatement(new StringEntry("g")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g"))), /*Enty*/new ExternalStatement(new StringEntry("setColor"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Color")))), /*Enty*/new ExternalStatement(new StringEntry("black"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g"))), /*Enty*/new ExternalStatement(new StringEntry("drawImage"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")))), /*Enty*/new ExternalStatement(new StringEntry("textBackground")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("10")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("180")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentState")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("handler"))), /*Enty*/new ExternalStatement(new StringEntry("display"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g"))))))))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("update")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("thisTick")), /*Optr*/new ExternalStatement("/", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("System"))), /*Enty*/new ExternalStatement(new StringEntry("currentTimeMillis"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000.0")))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("lastTick")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("thisTick")))))))),new ExternalMethodEntry(0, true,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("transition")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("State"))),"", /*Name*/new ExternalStatement(new StringEntry("newState")))}), "", /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newState")))), /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game")))), /*Enty*/new ExternalStatement(new StringEntry("currentState")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game")))), /*Enty*/new ExternalStatement(new StringEntry("currentState")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newState"))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game")))), /*Enty*/new ExternalStatement(new StringEntry("currentState"))), /*Enty*/new ExternalStatement(new StringEntry("display"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("handler"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")))), /*Enty*/new ExternalStatement(new StringEntry("refresh"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))),new ExternalMethodEntry(0, true,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(new StringEntry("refresh")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game")))), /*Enty*/new ExternalStatement(new StringEntry("currentState"))), /*Enty*/new ExternalStatement(new StringEntry("display"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("handler"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")))), /*Enty*/new ExternalStatement(new StringEntry("refresh"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))}), 
			Arrays.asList(new ExternalClassEntry[]{}));
	}
}