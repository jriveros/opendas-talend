package org.talend.designer.codegen.translators.processing;

import org.talend.core.model.process.ElementParameterParser;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.process.INode;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import org.talend.core.model.process.IConnectionCategory;
import org.talend.core.model.process.IConnection;
import java.util.List;
import java.util.Map;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.metadata.types.JavaType;

public class TFilterRowMainJava
{
  protected static String nl;
  public static synchronized TFilterRowMainJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TFilterRowMainJava result = new TFilterRowMainJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "          ";
  protected final String TEXT_3 = " = null;";
  protected final String TEXT_4 = NL + "    Operator_";
  protected final String TEXT_5 = " ope_";
  protected final String TEXT_6 = " = new Operator_";
  protected final String TEXT_7 = "(\"";
  protected final String TEXT_8 = "\");";
  protected final String TEXT_9 = "    " + NL + "        ope_";
  protected final String TEXT_10 = ".matches((";
  protected final String TEXT_11 = ")" + NL + "                       , \"";
  protected final String TEXT_12 = " failed\");";
  protected final String TEXT_13 = NL + "\t        ope_";
  protected final String TEXT_14 = ".matches((";
  protected final String TEXT_15 = ")" + NL + "\t                       , \"";
  protected final String TEXT_16 = " failed\");";
  protected final String TEXT_17 = NL + "            ope_";
  protected final String TEXT_18 = ".matches((";
  protected final String TEXT_19 = ")" + NL + "                           , \"";
  protected final String TEXT_20 = " failed\");" + NL + "\t\t \t";
  protected final String TEXT_21 = NL + "            ope_";
  protected final String TEXT_22 = ".matches((";
  protected final String TEXT_23 = ")" + NL + "                           , \"";
  protected final String TEXT_24 = " failed\");";
  protected final String TEXT_25 = "  " + NL + "          ope_";
  protected final String TEXT_26 = ".matches((";
  protected final String TEXT_27 = ")" + NL + "                         , \"";
  protected final String TEXT_28 = " failed\");";
  protected final String TEXT_29 = NL + "      ope_";
  protected final String TEXT_30 = ".matches((";
  protected final String TEXT_31 = "), \"advanced condition failed\");";
  protected final String TEXT_32 = NL + "    " + NL + "    if (ope_";
  protected final String TEXT_33 = ".getMatchFlag()) {";
  protected final String TEXT_34 = NL + "              if(";
  protected final String TEXT_35 = " == null){ ";
  protected final String TEXT_36 = NL + "                ";
  protected final String TEXT_37 = " = new ";
  protected final String TEXT_38 = "Struct();" + NL + "              }";
  protected final String TEXT_39 = NL + "               ";
  protected final String TEXT_40 = ".";
  protected final String TEXT_41 = " = ";
  protected final String TEXT_42 = ".";
  protected final String TEXT_43 = ";";
  protected final String TEXT_44 = NL + "\t\t\t\t\tlog4jSb_";
  protected final String TEXT_45 = ".append(";
  protected final String TEXT_46 = ".";
  protected final String TEXT_47 = ");" + NL + "\t\t\t\t\t";
  protected final String TEXT_48 = NL + "\t\t\t\t\t\tlog4jSb_";
  protected final String TEXT_49 = ".append(\"|\");" + NL + "\t\t\t\t\t";
  protected final String TEXT_50 = NL + "\t\t\t\t\tlog.debug(\"";
  protected final String TEXT_51 = " - Process the record \" + (nb_line_";
  protected final String TEXT_52 = "+1) + \".\");" + NL + "\t\t\t\t\tlog.trace(\"";
  protected final String TEXT_53 = " - Content of the record \" + (nb_line_";
  protected final String TEXT_54 = "+1) + \": \" + log4jSb_";
  protected final String TEXT_55 = " + \".\");" + NL + "\t\t\t\t\tlog4jSb_";
  protected final String TEXT_56 = ".delete(0,log4jSb_";
  protected final String TEXT_57 = ".length());" + NL + "\t\t\t\t\t";
  protected final String TEXT_58 = "    " + NL + "      nb_line_ok_";
  protected final String TEXT_59 = "++;" + NL + "    } else {";
  protected final String TEXT_60 = NL + "            if (";
  protected final String TEXT_61 = " == null){";
  protected final String TEXT_62 = NL + "              ";
  protected final String TEXT_63 = " = new ";
  protected final String TEXT_64 = "Struct();" + NL + "            }";
  protected final String TEXT_65 = NL + "\t            ";
  protected final String TEXT_66 = ".errorMessage = ope_";
  protected final String TEXT_67 = ".getErrorMsg();";
  protected final String TEXT_68 = NL + "                ";
  protected final String TEXT_69 = ".";
  protected final String TEXT_70 = " = ";
  protected final String TEXT_71 = ".";
  protected final String TEXT_72 = ";";
  protected final String TEXT_73 = NL + "\t\t\t\t\tlog4jSb_";
  protected final String TEXT_74 = ".append(";
  protected final String TEXT_75 = ".";
  protected final String TEXT_76 = ");" + NL + "\t\t\t\t\t";
  protected final String TEXT_77 = NL + "\t\t\t\t\t\tlog4jSb_";
  protected final String TEXT_78 = ".append(\"|\");" + NL + "\t\t\t\t\t";
  protected final String TEXT_79 = NL + "\t\t\t\t\tlog.debug(\"";
  protected final String TEXT_80 = " - Process the record \" + (nb_line_";
  protected final String TEXT_81 = "+1) + \".\");" + NL + "\t\t\t\t\tlog.trace(\"";
  protected final String TEXT_82 = " - Content of the record \" + (nb_line_";
  protected final String TEXT_83 = "+1) + \": \" + log4jSb_";
  protected final String TEXT_84 = " + \".\");" + NL + "\t\t\t\t\tlog.debug(\"";
  protected final String TEXT_85 = " - Reject the record \" + (nb_line_";
  protected final String TEXT_86 = "+1) + \". Caused by: \" + ";
  protected final String TEXT_87 = ".errorMessage+ \".\");" + NL + "\t\t\t\t\tlog4jSb_";
  protected final String TEXT_88 = ".delete(0,log4jSb_";
  protected final String TEXT_89 = ".length());" + NL + "\t\t\t\t\t";
  protected final String TEXT_90 = NL + "      nb_line_reject_";
  protected final String TEXT_91 = "++;" + NL + "    }";
  protected final String TEXT_92 = NL + NL + "nb_line_";
  protected final String TEXT_93 = "++;";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
INode node = (INode)codeGenArgument.getArgument();
String cid = node.getUniqueName();
String connName = null;

if (node.getIncomingConnections().size() == 1) {
  IConnection conn = node.getIncomingConnections().get(0);
  connName = conn.getName();
}
List<IMetadataTable> metadatas = node.getMetadataList();

if ((metadatas != null) && (metadatas.size() > 0)) {
  IMetadataTable metadata = metadatas.get(0);

  if (metadata!=null && connName != null) {
    String logical = ElementParameterParser.getValue(node,"__LOGICAL_OP__");    
    List<? extends IConnection> conns = node.getOutgoingSortedConnections();
    List<? extends IConnection> connsFilter = node.getOutgoingConnections("FILTER");
    List<? extends IConnection> connsReject = node.getOutgoingConnections("REJECT");
    boolean use_advanced = ("true").equals(ElementParameterParser.getValue(node, "__USE_ADVANCED__"));
    String advancedCondition = ElementParameterParser.getValue(node, "__ADVANCED_COND__");    
    List<Map<String, String>> keyColumns = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node,  "__CONDITIONS__");
    boolean isLog4jEnabled = ("true").equals(ElementParameterParser.getValue(node.getProcess(), "__LOG4J_ACTIVATE__"));
    
    if (conns != null && conns.size() > 0) {
       
      for (int i = 0; i < conns.size(); i++) {
        IConnection conn = conns.get(i);
        if (conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {
        
    stringBuffer.append(TEXT_2);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_3);
    
        }
      }
    }
    
    stringBuffer.append(TEXT_4);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(logical);
    stringBuffer.append(TEXT_8);
    
    for (Map<String, String> keyColumn : keyColumns) {
      String sFunction = keyColumn.get("FUNCTION");
      
      if (!"".equals(keyColumn.get("FUNCTION"))) {
        String sPartFunction = sFunction.substring(sFunction.indexOf(":") < 0 ? 0 : sFunction.indexOf(":") + 1); 
        
    stringBuffer.append(TEXT_9);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(keyColumn.get("FUNCTION").replace("$source", connName + "." + keyColumn.get("INPUT_COLUMN")).replace("$target", keyColumn.get("RVALUE")).replace("$operator", keyColumn.get("OPERATOR")));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(sPartFunction.replace("$source", keyColumn.get("INPUT_COLUMN")).replace("$target", keyColumn.get("RVALUE").replace("\\", "\\\\").replace("\"", "\\\"")).replace("$operator", keyColumn.get("OPERATOR")));
    stringBuffer.append(TEXT_12);
    
      } else {
        IMetadataColumn rightColumn = metadata.getColumn(keyColumn.get("INPUT_COLUMN"));
        JavaType javaType = JavaTypesManager.getJavaTypeFromId(rightColumn.getTalendType());

        if (!JavaTypesManager.isJavaPrimitiveType(javaType, rightColumn.isNullable())) {
          //this is only for bug:8133, when "Oject" type, and "Empty" function, and compare with "null"
          
          if (keyColumn.get("RVALUE") != null && keyColumn.get("RVALUE").equals("null")){
	      
    stringBuffer.append(TEXT_13);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_14);
    stringBuffer.append("$source $operator $target".replace("$source", connName + "." + keyColumn.get("INPUT_COLUMN")).replace("$target", keyColumn.get("RVALUE")).replace("$operator", keyColumn.get("OPERATOR")));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(keyColumn.get("INPUT_COLUMN"));
    stringBuffer.append(keyColumn.get("OPERATOR"));
    stringBuffer.append(keyColumn.get("RVALUE").replace("\\", "\\\\").replace("\"", "\\\""));
    stringBuffer.append(TEXT_16);
    } else {
			if( JavaTypesManager.isNumberType(javaType, rightColumn.isNullable())) {
				String typeToGenerate = JavaTypesManager.getTypeToGenerate(rightColumn.getTalendType(), rightColumn.isNullable());
          
    stringBuffer.append(TEXT_17);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_18);
    stringBuffer.append("$source == null? false : $source.compareTo($target) $operator 0".replace("$source", connName + "." + keyColumn.get("INPUT_COLUMN")).replace("$target", "ParserUtils.parseTo_"+typeToGenerate+"("+keyColumn.get("RVALUE")+"+\"\")").replace("$operator", keyColumn.get("OPERATOR")));
    stringBuffer.append(TEXT_19);
    stringBuffer.append("$source.compareTo($target) $operator 0".replace("$source", keyColumn.get("INPUT_COLUMN")).replace("$target", keyColumn.get("RVALUE").replace("\\", "\\\\").replace("\"", "\\\"")).replace("$operator", keyColumn.get("OPERATOR")));
    stringBuffer.append(TEXT_20);
    
			}else{
         	
    stringBuffer.append(TEXT_21);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_22);
    stringBuffer.append("$source == null? false : $source.compareTo($target) $operator 0".replace("$source", connName + "." + keyColumn.get("INPUT_COLUMN")).replace("$target", keyColumn.get("RVALUE")).replace("$operator", keyColumn.get("OPERATOR")));
    stringBuffer.append(TEXT_23);
    stringBuffer.append("$source.compareTo($target) $operator 0".replace("$source", keyColumn.get("INPUT_COLUMN")).replace("$target", keyColumn.get("RVALUE").replace("\\", "\\\\").replace("\"", "\\\"")).replace("$operator", keyColumn.get("OPERATOR")));
    stringBuffer.append(TEXT_24);
    
         	}
	      }
        } else {
        
    stringBuffer.append(TEXT_25);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_26);
    stringBuffer.append("$source $operator $target".replace("$source", connName + "." + keyColumn.get("INPUT_COLUMN")).replace("$target", keyColumn.get("RVALUE")).replace("$operator", keyColumn.get("OPERATOR")) );
    stringBuffer.append(TEXT_27);
    stringBuffer.append(keyColumn.get("INPUT_COLUMN"));
    stringBuffer.append(keyColumn.get("OPERATOR"));
    stringBuffer.append(keyColumn.get("RVALUE").replace("\\", "\\\\").replace("\"", "\\\""));
    stringBuffer.append(TEXT_28);
    
	    }
      }
    }
    
    if (use_advanced) {
    
    stringBuffer.append(TEXT_29);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(advancedCondition.replace("input_row", connName));
    stringBuffer.append(TEXT_31);
    
    }
    
    stringBuffer.append(TEXT_32);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_33);
    
      if (connsFilter != null) {

        if (connsFilter.size() > 0) {

          for (int i = 0; i < connsFilter.size(); i++) {
            IConnection conn = connsFilter.get(i);

            if (conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {
            
    stringBuffer.append(TEXT_34);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_38);
    
				int curCount = 0;
              for (IMetadataColumn column: metadata.getListColumns()) {
              
    stringBuffer.append(TEXT_39);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_42);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_43);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_44);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_45);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_47);
    if(curCount < metadata.getListColumns().size()-1){
    stringBuffer.append(TEXT_48);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_49);
    }
				}
            	curCount ++;
            	
    
	          }
				if(isLog4jEnabled){
				
    stringBuffer.append(TEXT_50);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_51);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_54);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_56);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_57);
    
				}
            }
          }
        }
      }
      
    stringBuffer.append(TEXT_58);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_59);
    
      if (connsReject != null && connsReject.size() > 0) {
       
        for (int i = 0; i < connsReject.size(); i++) {
          IConnection conn = connsReject.get(i);
          String sRejectConnName = conn.getName();

          if (conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {
          
    stringBuffer.append(TEXT_60);
    stringBuffer.append(sRejectConnName);
    stringBuffer.append(TEXT_61);
    stringBuffer.append(TEXT_62);
    stringBuffer.append(sRejectConnName);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(sRejectConnName);
    stringBuffer.append(TEXT_64);
    
				int curCount = 0;
            for (IMetadataColumn column: conn.getMetadataTable().getListColumns()) {
              String columnName = column.getLabel();
              
              if ("errorMessage".equals(columnName)) {
              
    stringBuffer.append(TEXT_65);
    stringBuffer.append(sRejectConnName);
    stringBuffer.append(TEXT_66);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_67);
    
              } else {
              
    stringBuffer.append(TEXT_68);
    stringBuffer.append(sRejectConnName);
    stringBuffer.append(TEXT_69);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_70);
    stringBuffer.append(connName);
    stringBuffer.append(TEXT_71);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_72);
    
                 if(isLog4jEnabled){
    stringBuffer.append(TEXT_73);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_74);
    stringBuffer.append(sRejectConnName);
    stringBuffer.append(TEXT_75);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_76);
    if(curCount < conn.getMetadataTable().getListColumns().size()-2){
    stringBuffer.append(TEXT_77);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_78);
    }
				 }
              }
            	curCount ++;
	        }
				if(isLog4jEnabled){
				
    stringBuffer.append(TEXT_79);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_80);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_81);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_82);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_83);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_84);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_85);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(sRejectConnName);
    stringBuffer.append(TEXT_87);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_88);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_89);
    
				}
          }
        }
      }
      
    stringBuffer.append(TEXT_90);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_91);
    
  }
}

    stringBuffer.append(TEXT_92);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_93);
    return stringBuffer.toString();
  }
}
