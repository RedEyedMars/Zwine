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
public class SaveThread extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
			new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
			}
		}, 
			new Entry(){
				public void get(StringBuilder __BUILDER__){
				}}, 
			new StringEntry("SaveThread"), 
			"class ", 
			/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")), 
			new ArrayList<Entry>(Arrays.asList(new Entry[]{/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Runnable"))})),
			
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry("SaveThread").get(builder);
			new StringEntry("").get(builder);
		}
	},
			Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("fileName")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("boolean"))),"", /*Name*/new ExternalStatement(new StringEntry("isWaiting")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))}), 
			Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("run")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"while ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game")))), /*Enty*/new ExternalStatement(new StringEntry("running")))),
			/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"try ", null,
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"synchronized ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("isWaiting")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("wait")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000")))))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("isWaiting")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")))), /*Enty*/new ExternalStatement(new StringEntry("data")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")))), /*Enty*/new ExternalStatement(new StringEntry("data"))), /*Enty*/new ExternalStatement(new StringEntry("write"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("fileName"))))))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"catch ", 
			/*Optr*/new ExternalStatement(" ", /*Exac*/new ExternalStatement(new StringEntry("Exception")), /*Exac*/new ExternalStatement(new StringEntry("e0"))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry("e0.printStackTrace()"))))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(new StringEntry("end")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("isWaiting")))),
			/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"synchronized ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("notifyAll")),new ExternalStatement.Parameters())))))))))}), 
			Arrays.asList(new ExternalClassEntry[]{}));
	}
}