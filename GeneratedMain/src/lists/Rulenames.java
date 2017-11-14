package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class Rulenames extends ParseList {

	@Override
	public String getName() {
		return "rulenames";
	}
	@Override
	public String getSingular() {
		return "rulename";
	}

	public static final RegexParser base = new RegexParser("base","rulenames","base");
	public static final RegexParser import_any = new RegexParser("import_any","rulenames","import_any");
	public static final RegexParser num = new RegexParser("num","rulenames","num");
	public static final RegexParser range = new RegexParser("range","rulenames","range");
	public static final RegexParser operator = new RegexParser("operator","rulenames","operator");
	public static final RegexParser body_element = new RegexParser("body_element","rulenames","body_element");
	public static final RegexParser if_statement = new RegexParser("if_statement","rulenames","if_statement");
	public static final RegexParser for_statement = new RegexParser("for_statement","rulenames","for_statement");
	public static final RegexParser while_statement = new RegexParser("while_statement","rulenames","while_statement");
	public static final RegexParser boolean_statement = new RegexParser("boolean_statement","rulenames","boolean_statement");
	public static final RegexParser boolean_element = new RegexParser("boolean_element","rulenames","boolean_element");
	public static final RegexParser has_chance = new RegexParser("has_chance","rulenames","has_chance");
	public static final RegexParser return_statement = new RegexParser("return_statement","rulenames","return_statement");
	public static final RegexParser statement = new RegexParser("statement","rulenames","statement");
	public static final RegexParser variable_declaration = new RegexParser("variable_declaration","rulenames","variable_declaration");
	public static final RegexParser variable_header = new RegexParser("variable_header","rulenames","variable_header");
	public static final RegexParser variable_call = new RegexParser("variable_call","rulenames","variable_call");
	public static final RegexParser method = new RegexParser("method","rulenames","method");
	public static final RegexParser type_name = new RegexParser("type_name","rulenames","type_name");
	public static final RegexParser image_extension = new RegexParser("image_extension","rulenames","image_extension");
	public static final RegexParser image_declaration = new RegexParser("image_declaration","rulenames","image_declaration");
	public static final RegexParser special_descriptor = new RegexParser("special_descriptor","rulenames","special_descriptor");
	public static final RegexParser state_declaration = new RegexParser("state_declaration","rulenames","state_declaration");
	public static final RegexParser state_element = new RegexParser("state_element","rulenames","state_element");
	public static final RegexParser description_condition = new RegexParser("description_condition","rulenames","description_condition");
	public static final RegexParser choice_condition = new RegexParser("choice_condition","rulenames","choice_condition");
	public static final RegexParser entry_element = new RegexParser("entry_element","rulenames","entry_element");
	public static final RegexParser state_list_name = new RegexParser("state_list_name","rulenames","state_list_name");
	public static final RegexParser choice_element = new RegexParser("choice_element","rulenames","choice_element");
	public static final RegexParser event_declaration = new RegexParser("event_declaration","rulenames","event_declaration");
	public static final RegexParser class_declaration = new RegexParser("class_declaration","rulenames","class_declaration");
	public static final RegexParser class_element = new RegexParser("class_element","rulenames","class_element");

	public static final ChoiceParser parser = new ChoiceParser(
				base,import_any,num,range,operator,body_element,if_statement,for_statement,while_statement,boolean_statement,boolean_element,has_chance,return_statement,statement,variable_declaration,variable_header,variable_call,method,type_name,image_extension,image_declaration,special_descriptor,state_declaration,state_element,description_condition,choice_condition,entry_element,state_list_name,choice_element,event_declaration,class_declaration,class_element);
}