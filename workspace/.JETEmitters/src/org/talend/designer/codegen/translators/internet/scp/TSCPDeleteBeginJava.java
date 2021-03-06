package org.talend.designer.codegen.translators.internet.scp;

import org.talend.core.model.process.INode;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

public class TSCPDeleteBeginJava
{
  protected static String nl;
  public static synchronized TSCPDeleteBeginJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TSCPDeleteBeginJava result = new TSCPDeleteBeginJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "\tint nb_file_";
  protected final String TEXT_3 = " = 0;" + NL + "" + NL + "    /* Create a connection instance */" + NL + "    ch.ethz.ssh2.Connection conn_";
  protected final String TEXT_4 = "=null;" + NL + "\t";
  protected final String TEXT_5 = NL + "\t" + NL + "\tconn_";
  protected final String TEXT_6 = " = (ch.ethz.ssh2.Connection)globalMap.get(\"";
  protected final String TEXT_7 = "\");" + NL + "    String hostname_";
  protected final String TEXT_8 = " = ";
  protected final String TEXT_9 = ";" + NL + "    String username_";
  protected final String TEXT_10 = " = ";
  protected final String TEXT_11 = ";" + NL + "\t";
  protected final String TEXT_12 = NL + NL + "    String hostname_";
  protected final String TEXT_13 = " = ";
  protected final String TEXT_14 = ";" + NL + "    String username_";
  protected final String TEXT_15 = " = ";
  protected final String TEXT_16 = ";" + NL + "    ";
  protected final String TEXT_17 = NL + "              conn_";
  protected final String TEXT_18 = " = new ch.ethz.ssh2.Connection(hostname_";
  protected final String TEXT_19 = ");";
  protected final String TEXT_20 = NL + "              conn_";
  protected final String TEXT_21 = " = new ch.ethz.ssh2.Connection(hostname_";
  protected final String TEXT_22 = ",";
  protected final String TEXT_23 = ");";
  protected final String TEXT_24 = NL + "              /* Now connect */" + NL + "        conn_";
  protected final String TEXT_25 = ".connect();";
  protected final String TEXT_26 = NL + "        java.io.File keyfile_";
  protected final String TEXT_27 = " = new java.io.File(";
  protected final String TEXT_28 = "); ";
  protected final String TEXT_29 = " " + NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_30 = " = routines.system.PasswordEncryptUtil.decryptPassword(";
  protected final String TEXT_31 = ");";
  protected final String TEXT_32 = NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_33 = " = ";
  protected final String TEXT_34 = "; ";
  protected final String TEXT_35 = NL + "\t\t\t" + NL + "            boolean isAuthenticated_";
  protected final String TEXT_36 = " = conn_";
  protected final String TEXT_37 = ".authenticateWithPublicKey(username_";
  protected final String TEXT_38 = ", keyfile_";
  protected final String TEXT_39 = ", decryptedPassword_";
  protected final String TEXT_40 = ");" + NL + "              if (isAuthenticated_";
  protected final String TEXT_41 = " == false)" + NL + "                      throw new RuntimeException(\"Authentication failed.\");";
  protected final String TEXT_42 = " " + NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_43 = " = routines.system.PasswordEncryptUtil.decryptPassword(";
  protected final String TEXT_44 = ");";
  protected final String TEXT_45 = NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_46 = " = ";
  protected final String TEXT_47 = "; ";
  protected final String TEXT_48 = NL + "\t\t\t" + NL + "\t        boolean isAuthenticated_";
  protected final String TEXT_49 = " = conn_";
  protected final String TEXT_50 = ".authenticateWithPassword(username_";
  protected final String TEXT_51 = ", decryptedPassword_";
  protected final String TEXT_52 = ");" + NL + "        if (isAuthenticated_";
  protected final String TEXT_53 = " == false)" + NL + "            throw new RuntimeException(\"Authentication failed.\");";
  protected final String TEXT_54 = NL + "        boolean isAuthenticated_";
  protected final String TEXT_55 = " = conn_";
  protected final String TEXT_56 = ".authenticateWithKeyboardInteractive(username_";
  protected final String TEXT_57 = ", " + NL + "            new ch.ethz.ssh2.InteractiveCallback() {" + NL + "        " + NL + "        \t\tpublic String[] replyToChallenge(String name," + NL + "        \t\t\t\tString instruction, int numPrompts," + NL + "        \t\t\t\tString[] prompt, boolean[] echo)" + NL + "        \t\t\t\tthrows java.lang.Exception {" + NL + "        \t\t\t// TODO Auto-generated method stub" + NL + "        \t\t\tString[] reply = new String[numPrompts];";
  protected final String TEXT_58 = " " + NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_59 = " = routines.system.PasswordEncryptUtil.decryptPassword(";
  protected final String TEXT_60 = ");";
  protected final String TEXT_61 = NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_62 = " = ";
  protected final String TEXT_63 = "; ";
  protected final String TEXT_64 = NL + "\t        \t\t\t" + NL + "        \t\t\tfor (int i = 0; i < reply.length; i++) {" + NL + "\t        \t\t\t\treply[i] = decryptedPassword_";
  protected final String TEXT_65 = ";" + NL + "        \t\t\t}" + NL + "        " + NL + "        \t\t\treturn reply;" + NL + "        \t\t}" + NL + "        \t}\t" + NL + "        );" + NL + "        if (isAuthenticated_";
  protected final String TEXT_66 = " == false)" + NL + "            throw new RuntimeException(\"Authentication failed.\");";
  protected final String TEXT_67 = "     ";
  protected final String TEXT_68 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
        CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
        INode node = (INode)codeGenArgument.getArgument();
        String cid = node.getUniqueName();

        String host = ElementParameterParser.getValue(
            node,
            "__HOST__"
        );

        String port = ElementParameterParser.getValue(
            node,
            "__PORT__"
        );

        String user = ElementParameterParser.getValue(
            node,
            "__USERNAME__"
        );

        String authMethod = ElementParameterParser.getValue(
            node,
            "__AUTH_METHOD__"
        );

        String privatekey = ElementParameterParser.getValue(
            node,
            "__PRIVATEKEY__"
        );

    stringBuffer.append(TEXT_2);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    
	String useExistingConn = ElementParameterParser.getValue(node, "__USE_EXISTING_CONNECTION__");
	
	if(("true").equals(useExistingConn)){
		String connection = ElementParameterParser.getValue(node, "__CONNECTION__");
		String conn= "conn_" + connection;
	
    stringBuffer.append(TEXT_5);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_6);
    stringBuffer.append(conn );
    stringBuffer.append(TEXT_7);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(host);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(user);
    stringBuffer.append(TEXT_11);
    }else{
    stringBuffer.append(TEXT_12);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(host);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(user);
    stringBuffer.append(TEXT_16);
    
        if(("").equals(port)){

    stringBuffer.append(TEXT_17);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_18);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_19);
    
        } else {

    stringBuffer.append(TEXT_20);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(port);
    stringBuffer.append(TEXT_23);
    
        }

    stringBuffer.append(TEXT_24);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_25);
            
        if (("PUBLICKEY").equals(authMethod)) {

    stringBuffer.append(TEXT_26);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(privatekey);
    stringBuffer.append(TEXT_28);
    
            String passwordFieldName = "__PASSPHRASE__";
            
    if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_31);
    } else {
    stringBuffer.append(TEXT_32);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_33);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_34);
    }
    stringBuffer.append(TEXT_35);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_40);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_41);
    
        }
        if (("PASSWORD").equals(authMethod)) {

    
            String passwordFieldName = "__PASSWORD__";
            
    if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_43);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_44);
    } else {
    stringBuffer.append(TEXT_45);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_46);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_47);
    }
    stringBuffer.append(TEXT_48);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_50);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_51);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_53);
    
        }
        if (("KEYBOARDINTERACTIVE").equals(authMethod)) {

    stringBuffer.append(TEXT_54);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_56);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_57);
    
                        String passwordFieldName = "__PASSWORD__";
                        
    if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {
    stringBuffer.append(TEXT_58);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_59);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_60);
    } else {
    stringBuffer.append(TEXT_61);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_62);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_63);
    }
    stringBuffer.append(TEXT_64);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_65);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_66);
    
        }
	}//if(isExistingConn)        

    stringBuffer.append(TEXT_67);
    stringBuffer.append(TEXT_68);
    return stringBuffer.toString();
  }
}
