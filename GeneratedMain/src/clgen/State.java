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
public class State extends ExternalClassEntry {
		protected Integer stateVersionId = 0;



	public final Acceptor AcceptorClass = new Acceptor();
	public class Acceptor extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Acceptor"), "interface ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static interface ");
			new StringEntry("Acceptor").get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("load")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("DataReader"))),"", /*Name*/new ExternalStatement(new StringEntry("reader"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Acceptor"))))),"", /*Name*/new ExternalStatement(new StringEntry("acceptor")))}), " throws IOException,ClassNotFoundException ", /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("accept")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Data")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Variables"))))),"", /*Name*/new ExternalStatement(new StringEntry("variable"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object"))),"", /*Name*/new ExternalStatement(new StringEntry("toSet")))}), "", /*Body*/new ExternalStatement.Body())}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	public final Data DataClass = new Data();
	public class Data extends ExternalClassEntry {
		protected final ExternalStatement.Body acceptSwitchBody = new ExternalStatement.Body();

	
	public void output()  {
		Integer newVersion = 7;
		for (final String key : variables.keySet()) {
			newVersion += key.hashCode();
			final StringBuilder typeBuilder = new StringBuilder();
			variables.get(key).getType().get(typeBuilder);
			newVersion += typeBuilder.toString().hashCode();
		}
		newVersion *= variables.keySet().size();
		newVersion *= stateVersionId;
		try  {
			final Set<Integer> oldVersions = new HashSet<Integer>();
			final DataInputStream inStream = new DataInputStream(new FileInputStream("../Resource/old.versions"));
			try  {
				Integer nextId = inStream.readInt();
				while (nextId != -1 ) {
					oldVersions.add(nextId);
					nextId = inStream.readInt();
				}
			}
			catch (EOFException   e0) {
			}
			inStream.close();
			MainFlow.methods.setVersionId(newVersion);
			if (oldVersions.add(newVersion)) {
				final DataOutputStream outStream = new DataOutputStream(new FileOutputStream("../Resource/old.versions"));
				for (final Integer v :  oldVersions) {
					outStream.writeInt(v);
				}
				outStream.close();
				final String newDataClassName;
				if (newVersion < 0 ) {
					newDataClassName = "DataNeg" + (-1 * MainFlow.variables.get_version().getId());
				}
				else  {
					newDataClassName = "Data" + MainFlow.variables.get_version().getId();
				}
				
				final ExternalClassEntry newDataClassNameClass = new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("old")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("data")).get(__BUILDER__);
			}
		}, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(newDataClassName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")), new ArrayList<Entry>(Arrays.asList(new Entry[]{/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Acceptor"))))})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry(newDataClassName).get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("accept")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Data")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Variables"))))),"", /*Name*/new ExternalStatement(new StringEntry("variable"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object"))),"", /*Name*/new ExternalStatement(new StringEntry("toSet")))}), "", /*Body*/new ExternalStatement.Body())}), Arrays.asList(new ExternalClassEntry[]{})) ;}};
				newDataClassNameClass.__INIT__();
				final StringBuilder __BUILDER__;
				final File __DIRECTORY__;
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("old")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("data")).get(__BUILDER__);
	__DIRECTORY__ = new File(MainFlow.__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	MainFlow.methods.addFile(__DIRECTORY__,FlowController.camelize(newDataClassName)+".java", newDataClassNameClass);
				newDataClassNameClass.addMethod(methods.get("load[DataReader,State.Acceptor]"));
				newDataClassNameClass.setDisplayConstructors(false);
			}
			for (final Integer oldVersionId :  oldVersions) {
				final String oldDataClassName;
				if (oldVersionId < 0 ) {
					oldDataClassName = "DataNeg" + (-1 * oldVersionId);
				}
				else  {
					oldDataClassName = "Data" + oldVersionId;
				}
				ExternalImportEntry.solidPackages.put(oldDataClassName,MainFlow.variables.get_packageName().toString() + ".old.data");
				MainFlow.classes.StateClass.DataClass.addImport(new ExternalImportEntry.ImportEntry(new StringEntry(oldDataClassName)));
				MainFlow.classes.StateClass.DataClass.OldVersionClass.getMethod("setup").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Data")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("OldVersion")))))), /*Enty*/new ExternalStatement(new StringEntry("map"))), /*Enty*/new ExternalStatement(new StringEntry("put"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(oldVersionId.toString())))),/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(oldDataClassName.toString())))),new ExternalStatement.Parameters())))))))));
			}
		}
		catch (Exception   e0) {
			e0.printStackTrace();
		}
	}


	public final Variables VariablesClass = new Variables();
	public class Variables extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Variables"), "enum ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static enum ");
			new StringEntry("Variables").get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	public final EmptyFile EmptyFileClass = new EmptyFile();
	public class EmptyFile extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("EmptyFile"), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Acceptor"))))})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("EmptyFile").get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("load")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("DataReader"))),"", /*Name*/new ExternalStatement(new StringEntry("reader"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Acceptor"))))),"", /*Name*/new ExternalStatement(new StringEntry("acceptor")))}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")))), /*Enty*/new ExternalStatement(new StringEntry("data")))), /*Cast*/new ExternalStatement("",new ExternalStatement(new StringEntry("("),new StringEntry(")"),"", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Data")))))))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("acceptor"))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game")))), /*Enty*/new ExternalStatement(new StringEntry("currentState"))), /*Enty*/new ExternalStatement(new StringEntry("enter"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))),new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("accept")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Data")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Variables"))))),"", /*Name*/new ExternalStatement(new StringEntry("variable"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object"))),"", /*Name*/new ExternalStatement(new StringEntry("toSet")))}), "", /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("save")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("DataWriter"))),"", /*Name*/new ExternalStatement(new StringEntry("writer")))}), " throws IOException ", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("writer"))), /*Enty*/new ExternalStatement(new StringEntry("writeVersion"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getVersionId())))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("writer"))), /*Enty*/new ExternalStatement(new StringEntry("writeState"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	public final OldVersion OldVersionClass = new OldVersion();
	public class OldVersion extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("OldVersion"), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("OldVersion").get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Map"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer")),/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Acceptor"))))))),"", /*Name*/new ExternalStatement(new StringEntry("map")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("HashMap"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer")),/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Acceptor"))))))),new ExternalStatement.Parameters()))),new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("boolean"))),"", /*Name*/new ExternalStatement(new StringEntry("hasSetup")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(2, true,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setup")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("hasSetup")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry(""))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("hasSetup")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true"))))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
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
			}
		}, new StringEntry("Data"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")), new ArrayList<Entry>(Arrays.asList(new Entry[]{/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Acceptor"))))})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("Data").get(builder);
			new StringEntry("").get(builder);
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("write")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("saveFile")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("DataWriter"))),"", /*Name*/new ExternalStatement(new StringEntry("writer")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("DataWriter"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("saveFile"))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"try ", null,
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("save")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("writer")))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"catch ", 
			/*Optr*/new ExternalStatement(" ", /*Exac*/new ExternalStatement(new StringEntry("IOException")), /*Exac*/new ExternalStatement(new StringEntry("e0"))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry("e0.printStackTrace()"))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("writer"))), /*Enty*/new ExternalStatement(new StringEntry("close"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("read")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("saveFile")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("DataReader"))),"", /*Name*/new ExternalStatement(new StringEntry("reader")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("DataReader"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("saveFile"))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"try ", null,
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"try ", null,
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("load")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("reader")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"catch ", 
			/*Optr*/new ExternalStatement(" ", /*Exac*/new ExternalStatement(new StringEntry("ClassNotFoundException")), /*Exac*/new ExternalStatement(new StringEntry("e0"))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry("e0.printStackTrace()"))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"catch ", 
			/*Optr*/new ExternalStatement(" ", /*Exac*/new ExternalStatement(new StringEntry("IOException")), /*Exac*/new ExternalStatement(new StringEntry("e0"))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry("e0.printStackTrace()"))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("reader"))), /*Enty*/new ExternalStatement(new StringEntry("close"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("save")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("DataWriter"))),"", /*Name*/new ExternalStatement(new StringEntry("writer")))}), " throws IOException ", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("writer"))), /*Enty*/new ExternalStatement(new StringEntry("writeVersion"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getVersionId())))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("writer"))), /*Enty*/new ExternalStatement(new StringEntry("writeState"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("load")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("DataReader"))),"", /*Name*/new ExternalStatement(new StringEntry("reader"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Acceptor"))))),"", /*Name*/new ExternalStatement(new StringEntry("acceptor")))}), " throws IOException,ClassNotFoundException ", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Acceptor"))))),"", /*Name*/new ExternalStatement(new StringEntry("correctState")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("reader"))), /*Enty*/new ExternalStatement(new StringEntry("correctStateFromVersion"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("correctState")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("correctState"))), /*Enty*/new ExternalStatement(new StringEntry("load"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("reader")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry(""))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game")))), /*Enty*/new ExternalStatement(new StringEntry("currentState")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("reader"))), /*Enty*/new ExternalStatement(new StringEntry("readState"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))),new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("accept")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Data")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Variables"))))),"", /*Name*/new ExternalStatement(new StringEntry("variable"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object"))),"", /*Name*/new ExternalStatement(new StringEntry("toSet")))}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"switch ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("variable")))),
			/*InCl*/new ExternalStatement(acceptSwitchBody)))),new ExternalMethodEntry(1, true,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("loadFile")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("fileName")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Data"))))),"", /*Name*/new ExternalStatement(new StringEntry("data")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Data"))))),new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("data"))), /*Enty*/new ExternalStatement(new StringEntry("read"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("fileName"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")))), /*Enty*/new ExternalStatement(new StringEntry("data")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("data")))))))}), Arrays.asList(new ExternalClassEntry[]{MainFlow.classes.StateClass.DataClass.VariablesClass,MainFlow.classes.StateClass.DataClass.EmptyFileClass,MainFlow.classes.StateClass.DataClass.OldVersionClass}));
	}
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
			new StringEntry("State"), 
			"class ", 
			null, 
			new ArrayList<Entry>(Arrays.asList(new Entry[]{})),
			
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry("State").get(builder);
			new StringEntry("").get(builder);
		}
	},
			Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("State")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Data"))))),"", /*Name*/new ExternalStatement(new StringEntry("data")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))}), 
			Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Exac*/new ExternalStatement(new StringEntry("getId")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1"))))))),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("enter")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("exit")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("display")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Graphics"))),"", /*Name*/new ExternalStatement(new StringEntry("g")))}), "", /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("mouseRelease")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("x"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("y")))}), "", /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("mousePress")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("x"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("y")))}), "", /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("mouseHover")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("x"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("y")))}), "", /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("keyPress")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))),"", /*Name*/new ExternalStatement(new StringEntry("keyCode")))}), "", /*Body*/new ExternalStatement.Body())}), 
			Arrays.asList(new ExternalClassEntry[]{MainFlow.classes.StateClass.AcceptorClass,MainFlow.classes.StateClass.DataClass}));
	}
}