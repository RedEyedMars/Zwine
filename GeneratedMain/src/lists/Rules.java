package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import main.rules.*;

public class Rules extends ParseList {

	@Override
	public String getName() {
		return "rules";
	}
	@Override
	public String getSingular() {
		return "rule";
	}

	public static final IRule base = Base.parser;
	public static final IRule import_any = ImportAny.parser;
	public static final IRule num = Num.parser;
	public static final IRule range = Range.parser;
	public static final IRule operator = Operator.parser;
	public static final IRule body_element = BodyElement.parser;
	public static final IRule if_statement = IfStatement.parser;
	public static final IRule for_statement = ForStatement.parser;
	public static final IRule while_statement = WhileStatement.parser;
	public static final IRule boolean_statement = BooleanStatement.parser;
	public static final IRule boolean_element = BooleanElement.parser;
	public static final IRule has_chance = HasChance.parser;
	public static final IRule return_statement = ReturnStatement.parser;
	public static final IRule statement = Statement.parser;
	public static final IRule variable_declaration = VariableDeclaration.parser;
	public static final IRule variable_header = VariableHeader.parser;
	public static final IRule variable_call = VariableCall.parser;
	public static final IRule method = Method.parser;
	public static final IRule type_name = TypeName.parser;
	public static final IRule image_extension = ImageExtension.parser;
	public static final IRule image_declaration = ImageDeclaration.parser;
	public static final IRule special_descriptor = SpecialDescriptor.parser;
	public static final IRule state_declaration = StateDeclaration.parser;
	public static final IRule state_element = StateElement.parser;
	public static final IRule description_condition = DescriptionCondition.parser;
	public static final IRule choice_condition = ChoiceCondition.parser;
	public static final IRule entry_element = EntryElement.parser;
	public static final IRule state_list_name = StateListName.parser;
	public static final IRule choice_element = ChoiceElement.parser;
	public static final IRule event_declaration = EventDeclaration.parser;
	public static final IRule class_declaration = ClassDeclaration.parser;
	public static final IRule class_element = ClassElement.parser;

	public static final ChoiceParser parser = new ChoiceParser(
				base,import_any,num,range,operator,body_element,if_statement,for_statement,while_statement,boolean_statement,boolean_element,has_chance,return_statement,statement,variable_declaration,variable_header,variable_call,method,type_name,image_extension,image_declaration,special_descriptor,state_declaration,state_element,description_condition,choice_condition,entry_element,state_list_name,choice_element,event_declaration,class_declaration,class_element);
}