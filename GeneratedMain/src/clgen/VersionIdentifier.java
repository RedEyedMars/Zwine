package clgen;
import java.util.*;
import java.io.*;
import lists.*;
import com.rem.parser.generation.classwise.*;
import com.rem.parser.generation.*;
import com.rem.parser.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.*;
import clgen.VersionIdentifier;
import com.rem.parser.generation.*;
import com.rem.parser.generation.classwise.*;
import clent.*;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.lang.StringBuilder;
public class  VersionIdentifier  implements Entry {
	public static class classes {
	}
	public static VersionIdentifier variables = null;
	public static VersionIdentifier methods = null;
	//Externals


	//Internals
protected Integer id = 0;

	public Integer getId()  {
		return id;
	}
	public Integer get_id()  {
		return id;
	}
public void get(final StringBuilder builder)  {
	builder.append(id);
}
public void setId(final Integer newID)  {
	id = newID;
}

}