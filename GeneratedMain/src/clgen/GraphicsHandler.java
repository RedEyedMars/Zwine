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
public class GraphicsHandler extends ExternalClassEntry {



	public final Justified JustifiedClass = new Justified();
	public class Justified extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Justified"), "enum ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static enum ");
			new StringEntry("Justified").get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(new StringEntry("LEFT")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),new ExternalStatement.Parameters())),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(new StringEntry("RIGHT")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),new ExternalStatement.Parameters())),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(new StringEntry("CENTER")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),new ExternalStatement.Parameters()))}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	public final Element ElementClass = new Element();
	public class Element extends ExternalClassEntry {



	public final Style StyleClass = new Style();
	public class Style extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Style"), "class ", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("Style").get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Color"))),"", /*Name*/new ExternalStatement(new StringEntry("colour")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Font"))),"", /*Name*/new ExternalStatement(new StringEntry("font")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))),"", /*Exac*/new ExternalStatement(new StringEntry("*")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Color"))),"", /*Name*/new ExternalStatement(new StringEntry("newColour")))}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("colour")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newColour")))))))),new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))),"", /*Exac*/new ExternalStatement(new StringEntry("*")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Font"))),"", /*Name*/new ExternalStatement(new StringEntry("newFont")))}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("font")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newFont")))))))),new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))),"", /*Exac*/new ExternalStatement(new StringEntry("*")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Color"))),"", /*Name*/new ExternalStatement(new StringEntry("newColour"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Font"))),"", /*Name*/new ExternalStatement(new StringEntry("newFont")))}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("colour")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newColour")))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("font")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newFont")))))))),new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),"", /*Exac*/new ExternalStatement(new StringEntry("display")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Graphics"))),"", /*Name*/new ExternalStatement(new StringEntry("g"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),"", /*Name*/new ExternalStatement(new StringEntry("s")))}), "", /*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("s")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),
			/*Body*/new ExternalStatement.Body(
				/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("colour")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g"))), /*Enty*/new ExternalStatement(new StringEntry("setColor"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("colour"))))))))))),
/*BODY*/				
				/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("font")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g"))), /*Enty*/new ExternalStatement(new StringEntry("setFont"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("font"))))))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	public final Text TextClass = new Text();
	public class Text extends ExternalClassEntry {



	public final Line LineClass = new Line();
	public class Line extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Line"), "class ", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("Line").get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Justified"))),"", /*Name*/new ExternalStatement(new StringEntry("justified")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Justified")))), /*Enty*/new ExternalStatement(new StringEntry("LEFT"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("startX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("y")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("width")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("cWidth")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("xPad")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Text"))))),"", /*Name*/new ExternalStatement(new StringEntry("texts")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Text"))))),new ExternalStatement.Parameters())))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(3, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("add")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Text"))),"", /*Name*/new ExternalStatement(new StringEntry("newText")))}), "", /*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("texts"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newText"))))))))))),new ExternalMethodEntry(3, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),"", /*Exac*/new ExternalStatement(new StringEntry("display")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Graphics"))),"", /*Name*/new ExternalStatement(new StringEntry("g"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),"", /*Name*/new ExternalStatement(new StringEntry("s")))}), "", /*Body*/new ExternalStatement.Body(
				/*Cond*/new ExternalStatement.Conditional(
			"switch ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("justified")))),
			/*Body*/new ExternalStatement.Body(
					/*Case*/new ExternalStatement.Conditional(
			"case ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("LEFT")))),
			/*Body*/new ExternalStatement.Body(
						/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Text"))),"", /*Name*/new ExternalStatement(new StringEntry("text"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("texts"))))),
			/*Body*/new ExternalStatement.Body(
							/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("s")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("text"))), /*Enty*/new ExternalStatement(new StringEntry("display"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("s")))))))))))),
/*BODY*/				
						/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("s"))))))).setBraces("",":"),
/*BODY*/				
					/*Case*/new ExternalStatement.Conditional(
			"case ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("CENTER")))),
			/*Body*/new ExternalStatement.Body(
						/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("x")), /*Optr*/new ExternalStatement("/", /*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("startX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("width")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2")))))),
/*BODY*/				
						/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Text"))),"", /*Name*/new ExternalStatement(new StringEntry("text"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("texts"))))),
			/*Body*/new ExternalStatement.Body(
							/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("-=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))), /*BrOp*/new ExternalStatement("",new ExternalStatement(new StringEntry("("),new StringEntry(")"),"", /*Optr*/new ExternalStatement("+", /*Optr*/new ExternalStatement("*", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("text"))), /*Enty*/new ExternalStatement(new StringEntry("length"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cWidth")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("xPad"))))), new ExternalStatement("/"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2"))))))))),
/*BODY*/				
						/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Text"))),"", /*Name*/new ExternalStatement(new StringEntry("text"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("texts"))))),
			/*Body*/new ExternalStatement.Body(
							/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("storedX")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("text"))), /*Enty*/new ExternalStatement(new StringEntry("getX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
							/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("text"))), /*Enty*/new ExternalStatement(new StringEntry("setX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x"))))))))),
/*BODY*/				
							/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+", /*Optr*/new ExternalStatement("*", /*Optr*/new ExternalStatement("+=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("text"))), /*Enty*/new ExternalStatement(new StringEntry("length"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cWidth")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("xPad"))))),
/*BODY*/				
							/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("s")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("text"))), /*Enty*/new ExternalStatement(new StringEntry("display"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("s")))))))))),
/*BODY*/				
							/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("text"))), /*Enty*/new ExternalStatement(new StringEntry("setX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("storedX"))))))))))),
/*BODY*/				
						/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("s"))))))).setBraces("",":"),
/*BODY*/				
					/*Case*/new ExternalStatement.Conditional(
			"case ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("RIGHT")))),
			/*Body*/new ExternalStatement.Body(
						/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("x")), /*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("startX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("width")))))),
/*BODY*/				
						/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Text"))),"", /*Name*/new ExternalStatement(new StringEntry("text"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("texts"))))),
			/*Body*/new ExternalStatement.Body(
							/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+", /*Optr*/new ExternalStatement("*", /*Optr*/new ExternalStatement("-=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("text"))), /*Enty*/new ExternalStatement(new StringEntry("length"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cWidth")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("xPad"))))))),
/*BODY*/				
						/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Text"))),"", /*Name*/new ExternalStatement(new StringEntry("text"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("texts"))))),
			/*Body*/new ExternalStatement.Body(
							/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("storedX")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("text"))), /*Enty*/new ExternalStatement(new StringEntry("getX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
							/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("text"))), /*Enty*/new ExternalStatement(new StringEntry("setX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x"))))))))),
/*BODY*/				
							/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+", /*Optr*/new ExternalStatement("*", /*Optr*/new ExternalStatement("+=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("text"))), /*Enty*/new ExternalStatement(new StringEntry("length"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cWidth")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("xPad"))))),
/*BODY*/				
							/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("s")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("text"))), /*Enty*/new ExternalStatement(new StringEntry("display"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("s")))))))))),
/*BODY*/				
							/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("text"))), /*Enty*/new ExternalStatement(new StringEntry("setX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("storedX"))))))))))),
/*BODY*/				
						/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("s"))))))).setBraces("",":"))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("s")))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}

	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Text"), "class ", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("Text").get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("text")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("x")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("y")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),"", /*Name*/new ExternalStatement(new StringEntry("style")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Exac*/new ExternalStatement(new StringEntry("length")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("text"))), /*Enty*/new ExternalStatement(new StringEntry("length"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))),new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setX")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("newX")))}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("x")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newX")))))))),new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),"", /*Exac*/new ExternalStatement(new StringEntry("display")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Graphics"))),"", /*Name*/new ExternalStatement(new StringEntry("g"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),"", /*Name*/new ExternalStatement(new StringEntry("s")))}), "", /*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("style")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("s")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("style"))), /*Enty*/new ExternalStatement(new StringEntry("display"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("s")))))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g"))), /*Enty*/new ExternalStatement(new StringEntry("drawString"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("text")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y"))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("s")))))))}), Arrays.asList(new ExternalClassEntry[]{MainFlow.classes.GraphicsHandlerClass.ElementClass.TextClass.LineClass}));
	}
}
	public final Selection SelectionClass = new Selection();
	public class Selection extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Selection"), "class ", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("Selection").get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("u")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("w")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("x")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("y")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("boolean"))),"", /*Name*/new ExternalStatement(new StringEntry("show")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Color"))),"", /*Name*/new ExternalStatement(new StringEntry("colour")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Color")))), /*Enty*/new ExternalStatement(new StringEntry("white")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),"", /*Exac*/new ExternalStatement(new StringEntry("display")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Graphics"))),"", /*Name*/new ExternalStatement(new StringEntry("g"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),"", /*Name*/new ExternalStatement(new StringEntry("s")))}), "", /*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Optr*/new ExternalStatement("||", /*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("s")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("s"))), /*Enty*/new ExternalStatement(new StringEntry("getColour"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("colour")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g"))), /*Enty*/new ExternalStatement(new StringEntry("setColor"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("colour"))))))))),
/*BODY*/				
				/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("show")))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g"))), /*Enty*/new ExternalStatement(new StringEntry("drawRoundRect"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("u")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("w")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("15")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("10"))))))))))),
/*BODY*/				
				/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("s")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("s"))), /*Enty*/new ExternalStatement(new StringEntry("display"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("s"))))))))))),
/*BODY*/				
				/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
				/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("show")))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g"))), /*Enty*/new ExternalStatement(new StringEntry("drawRoundRect"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("u")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("w")))),/*Optr*/new ExternalStatement("-", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("u")))),/*Optr*/new ExternalStatement("-", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("w")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("15")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("10"))))))))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("s")))))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}

	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Element"), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("Element").get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),"", /*Exac*/new ExternalStatement(new StringEntry("display")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Graphics"))),"", /*Name*/new ExternalStatement(new StringEntry("g"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),"", /*Name*/new ExternalStatement(new StringEntry("s")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))))}), Arrays.asList(new ExternalClassEntry[]{MainFlow.classes.GraphicsHandlerClass.ElementClass.StyleClass,MainFlow.classes.GraphicsHandlerClass.ElementClass.TextClass,MainFlow.classes.GraphicsHandlerClass.ElementClass.SelectionClass}));
	}
}

	public void __INIT__(){
		super.__SETUP__(
			new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("gui")).get(__BUILDER__);
			}
		}, 
			new Entry(){
				public void get(StringBuilder __BUILDER__){
				}}, 
			new StringEntry("GraphicsHandler"), 
			"class ", 
			null, 
			new ArrayList<Entry>(Arrays.asList(new Entry[]{})),
			
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry("GraphicsHandler").get(builder);
			new StringEntry("").get(builder);
		}
	},
			Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("startX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("startY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("x")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("y")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("width")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("height")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element"))))))),"", /*Name*/new ExternalStatement(new StringEntry("elements")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element"))))))),new ExternalStatement.Parameters()))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("cWidth")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("6"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("cHeight")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("12"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("xPad")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("6"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("yPad")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("3"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("boolean"))),"", /*Name*/new ExternalStatement(new StringEntry("cropWhiteSpace")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("sectionX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("sectionY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Text")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Line"))))),"", /*Name*/new ExternalStatement(new StringEntry("currentLine")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Color"))),"", /*Name*/new ExternalStatement(new StringEntry("defaultColour")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Color")))), /*Enty*/new ExternalStatement(new StringEntry("white"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Font"))),"", /*Name*/new ExternalStatement(new StringEntry("defaultFont")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Font"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("Arial".toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Font")))), /*Enty*/new ExternalStatement(new StringEntry("PLAIN")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("12")))))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),"", /*Name*/new ExternalStatement(new StringEntry("currentStyle")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Color")))), /*Enty*/new ExternalStatement(new StringEntry("white")))),/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Font"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("Arial".toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Font")))), /*Enty*/new ExternalStatement(new StringEntry("PLAIN")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("12")))))))))))}), 
			Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("sectionStart")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("sectionX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("sectionY")), /*Optr*/new ExternalStatement("-", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("5")))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("MouseHandler"))),"", /*Exac*/new ExternalStatement(new StringEntry("sectionEnd")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("MouseHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Action"))))),"", /*Name*/new ExternalStatement(new StringEntry("onRelease"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("MouseHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Action"))))),"", /*Name*/new ExternalStatement(new StringEntry("onPress"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("MouseHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Action"))))),"", /*Name*/new ExternalStatement(new StringEntry("onHover")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("MouseHandler"))),"", /*Name*/new ExternalStatement(new StringEntry("result")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("MouseHandler"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("startX")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("sectionY")))),/*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("startX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("width")))),/*Optr*/new ExternalStatement("-", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("5"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("setOnRelease"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("onRelease"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("setOnPress"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("onPress"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("setOnHover"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("onHover"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("elements"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Name*/new ExternalStatement(new StringEntry("selection"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("styleStart")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Color"))),"", /*Name*/new ExternalStatement(new StringEntry("colour"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Font"))),"", /*Name*/new ExternalStatement(new StringEntry("font")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("currentStyle")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("colour")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("font"))))))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("styleEnd")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("currentStyle")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("defaultColour")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("defaultFont"))))))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(new StringEntry("text")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("newString")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))), /*Name*/new ExternalStatement(new StringEntry("text"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newString")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(new StringEntry("text")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("newString"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Color"))),"", /*Name*/new ExternalStatement(new StringEntry("newColor")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))), /*Name*/new ExternalStatement(new StringEntry("text"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newString")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newColor")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(new StringEntry("text")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("newString"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Font"))),"", /*Name*/new ExternalStatement(new StringEntry("newFont")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))), /*Name*/new ExternalStatement(new StringEntry("text"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newString")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newFont"))))))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(new StringEntry("text")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("newString"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Color"))),"", /*Name*/new ExternalStatement(new StringEntry("newColor"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Font"))),"", /*Name*/new ExternalStatement(new StringEntry("newFont")))}), "", /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cropWhiteSpace")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("firstNonSpace")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"while ", 
			/*Optr*/new ExternalStatement("<", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("firstNonSpace")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newString"))), /*Enty*/new ExternalStatement(new StringEntry("length"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newString"))), /*Enty*/new ExternalStatement(new StringEntry("charAt"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("firstNonSpace")))))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("' '")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("break"))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("firstNonSpace")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement(">", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("firstNonSpace")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0 ")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("newString")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newString"))), /*Enty*/new ExternalStatement(new StringEntry("substring"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("firstNonSpace")))))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newString"))), /*Enty*/new ExternalStatement(new StringEntry("length"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0 ")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry(""))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("+", /*Optr*/new ExternalStatement(">", /*Optr*/new ExternalStatement("*", /*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newString"))), /*Enty*/new ExternalStatement(new StringEntry("length"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cWidth")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("startX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("width")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("x")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("startX")))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+", /*Optr*/new ExternalStatement("+=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cHeight")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yPad"))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("cropWhiteSpace")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("currentLine")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Text")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Line"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("startX")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("width")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cWidth")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("xPad"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("elements"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentLine"))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Optr*/new ExternalStatement("&&", /*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newColor")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newFont")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Text"))))),"", /*Name*/new ExternalStatement(new StringEntry("newText")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Text"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newString")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newText"))), /*Enty*/new ExternalStatement(new StringEntry("setStyle"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentStyle"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentLine"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newText"))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Text"))))),"", /*Name*/new ExternalStatement(new StringEntry("newText")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Text"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newString")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newText"))), /*Enty*/new ExternalStatement(new StringEntry("setStyle"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newColor")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newFont")))))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentLine"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newText"))))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+", /*Optr*/new ExternalStatement("*", /*Optr*/new ExternalStatement("+=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newString"))), /*Enty*/new ExternalStatement(new StringEntry("length"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cWidth")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("xPad"))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("newline")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("x")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("startX")))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+", /*Optr*/new ExternalStatement("+=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cHeight")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("3"))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("cropWhiteSpace")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("currentLine")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Text")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Line"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("startX")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("width")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cWidth")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("xPad"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("elements"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentLine"))))))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("justify")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Justified"))),"", /*Name*/new ExternalStatement(new StringEntry("newJustify")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentLine"))), /*Enty*/new ExternalStatement(new StringEntry("setJustified"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newJustify"))))))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("display")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Graphics"))),"", /*Name*/new ExternalStatement(new StringEntry("g")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),"", /*Name*/new ExternalStatement(new StringEntry("style")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element"))))),"", /*Name*/new ExternalStatement(new StringEntry("element"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("elements"))))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("style")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("element"))), /*Enty*/new ExternalStatement(new StringEntry("display"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("g")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("style")))))))))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("clear")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("elements"))), /*Enty*/new ExternalStatement(new StringEntry("clear"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("x")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("startX")))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("y")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("startY")))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("elements"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Style"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Color")))), /*Enty*/new ExternalStatement(new StringEntry("white")))))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("currentLine")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("GraphicsHandler")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Element")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Text")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Line"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("startX")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("width")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cWidth")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("xPad"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("elements"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentLine")))))))))))}), 
			Arrays.asList(new ExternalClassEntry[]{MainFlow.classes.GraphicsHandlerClass.JustifiedClass,MainFlow.classes.GraphicsHandlerClass.ElementClass}));
	}
}