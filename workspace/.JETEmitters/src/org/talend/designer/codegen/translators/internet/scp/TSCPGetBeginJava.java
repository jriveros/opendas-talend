package org.talend.designer.codegen.translators.internet.scp;

import org.talend.core.model.process.INode;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

public class TSCPGetBeginJava
{
  protected static String nl;
  public static synchronized TSCPGetBeginJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TSCPGetBeginJava result = new TSCPGetBeginJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "\t";
  protected final String TEXT_3 = NL + "\t\tlog.info(\"";
  protected final String TEXT_4 = " - Start to work.\");" + NL + "\t";
  protected final String TEXT_5 = NL + "\tint nb_file_";
  protected final String TEXT_6 = " = 0;" + NL + "" + NL + "    /* Create a connection instance */" + NL + "\t";
  protected final String TEXT_7 = NL + "\t" + NL + "\tch.ethz.ssh2.Connection conn_";
  protected final String TEXT_8 = " = (ch.ethz.ssh2.Connection)globalMap.get(\"";
  protected final String TEXT_9 = "\");" + NL + "\t";
  protected final String TEXT_10 = NL + "\t\tif(conn_";
  protected final String TEXT_11 = "!=null) {" + NL + "\t\t\tlog.info(\"";
  protected final String TEXT_12 = " - Uses an existing connection. Connection hostname: \" + conn_";
  protected final String TEXT_13 = ".getHostname() + \". Connection port: \" + conn_";
  protected final String TEXT_14 = ".getPort() + \".\"); " + NL + "\t\t}" + NL + "\t";
  protected final String TEXT_15 = NL;
  protected final String TEXT_16 = NL + NL + "\t    String hostname_";
  protected final String TEXT_17 = " = ";
  protected final String TEXT_18 = ";" + NL + "\t    String username_";
  protected final String TEXT_19 = " = ";
  protected final String TEXT_20 = ";" + NL;
  protected final String TEXT_21 = NL + "              ch.ethz.ssh2.Connection conn_";
  protected final String TEXT_22 = " = new ch.ethz.ssh2.Connection(hostname_";
  protected final String TEXT_23 = ");";
  protected final String TEXT_24 = NL + "              ch.ethz.ssh2.Connection conn_";
  protected final String TEXT_25 = " = new ch.ethz.ssh2.Connection(hostname_";
  protected final String TEXT_26 = ",";
  protected final String TEXT_27 = ");";
  protected final String TEXT_28 = NL + "              /* Now connect */" + NL + "\t\t";
  protected final String TEXT_29 = NL + "\t\t\tlog.info(\"";
  protected final String TEXT_30 = " - Connection attempt to '\" + hostname_";
  protected final String TEXT_31 = " + \"' as '\" + ";
  protected final String TEXT_32 = " + \"'.\");" + NL + "\t\t";
  protected final String TEXT_33 = NL + "        conn_";
  protected final String TEXT_34 = ".connect();" + NL + "\t\t";
  protected final String TEXT_35 = NL + "\t\t\tlog.info(\"";
  protected final String TEXT_36 = " - Connection to '\" + hostname_";
  protected final String TEXT_37 = " + \"' has succeeded.\");" + NL + "\t\t";
  protected final String TEXT_38 = NL + "\t\t";
  protected final String TEXT_39 = NL + "\t\t\tlog.info(\"";
  protected final String TEXT_40 = " - Authentication using a public key\");" + NL + "\t\t\tlog.debug(\"";
  protected final String TEXT_41 = " - Private key: '\" + ";
  protected final String TEXT_42 = " + \"'.\" );" + NL + "\t\t";
  protected final String TEXT_43 = NL + "        java.io.File keyfile_";
  protected final String TEXT_44 = " = new java.io.File(";
  protected final String TEXT_45 = "); ";
  protected final String TEXT_46 = " " + NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_47 = " = routines.system.PasswordEncryptUtil.decryptPassword(";
  protected final String TEXT_48 = ");";
  protected final String TEXT_49 = NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_50 = " = ";
  protected final String TEXT_51 = "; ";
  protected final String TEXT_52 = NL + "\t        " + NL + "\t\t\tboolean isAuthenticated_";
  protected final String TEXT_53 = " = conn_";
  protected final String TEXT_54 = ".authenticateWithPublicKey(username_";
  protected final String TEXT_55 = ", keyfile_";
  protected final String TEXT_56 = ", decryptedPassword_";
  protected final String TEXT_57 = ");" + NL + "              if (isAuthenticated_";
  protected final String TEXT_58 = " == false){" + NL + "\t\t\t\t\t";
  protected final String TEXT_59 = NL + "\t\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_60 = " - Authentication failed.\");" + NL + "\t\t\t\t\t";
  protected final String TEXT_61 = NL + "                      throw new RuntimeException(\"Authentication failed.\");" + NL + "\t\t\t  }" + NL + "\t\t\t  ";
  protected final String TEXT_62 = NL + "\t\t\t\tlog.info(\"";
  protected final String TEXT_63 = " - Authentication succeeded.\");" + NL + "\t\t\t  ";
  protected final String TEXT_64 = NL + "\t\t";
  protected final String TEXT_65 = NL + "\t\t\tlog.info(\"";
  protected final String TEXT_66 = " - Authentication using a password\");" + NL + "\t\t";
  protected final String TEXT_67 = " " + NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_68 = " = routines.system.PasswordEncryptUtil.decryptPassword(";
  protected final String TEXT_69 = ");";
  protected final String TEXT_70 = NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_71 = " = ";
  protected final String TEXT_72 = "; ";
  protected final String TEXT_73 = NL + "\t\t\t" + NL + "        \tboolean isAuthenticated_";
  protected final String TEXT_74 = " = conn_";
  protected final String TEXT_75 = ".authenticateWithPassword(username_";
  protected final String TEXT_76 = ", decryptedPassword_";
  protected final String TEXT_77 = ");" + NL + "        \tif (isAuthenticated_";
  protected final String TEXT_78 = " == false){" + NL + "\t\t\t\t";
  protected final String TEXT_79 = NL + "\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_80 = " - Authentication failed.\");" + NL + "\t\t\t\t";
  protected final String TEXT_81 = NL + "            \tthrow new RuntimeException(\"Authentication failed.\");" + NL + "\t\t\t}" + NL + "\t\t\t";
  protected final String TEXT_82 = NL + "\t\t\t\tlog.info(\"";
  protected final String TEXT_83 = " - Authentication succeeded.\");" + NL + "\t\t\t";
  protected final String TEXT_84 = NL + "\t\t";
  protected final String TEXT_85 = NL + "\t\t\tlog.info(\"";
  protected final String TEXT_86 = " - Authentication using an interactive action\");" + NL + "\t\t";
  protected final String TEXT_87 = NL + "        boolean isAuthenticated_";
  protected final String TEXT_88 = " = conn_";
  protected final String TEXT_89 = ".authenticateWithKeyboardInteractive(username_";
  protected final String TEXT_90 = ", " + NL + "            new ch.ethz.ssh2.InteractiveCallback() {" + NL + "        " + NL + "        \t\tpublic String[] replyToChallenge(String name," + NL + "        \t\t\t\tString instruction, int numPrompts," + NL + "        \t\t\t\tString[] prompt, boolean[] echo)" + NL + "        \t\t\t\tthrows java.lang.Exception {" + NL + "        \t\t\t// TODO Auto-generated method stub" + NL + "        \t\t\tString[] reply = new String[numPrompts];";
  protected final String TEXT_91 = " " + NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_92 = " = routines.system.PasswordEncryptUtil.decryptPassword(";
  protected final String TEXT_93 = ");";
  protected final String TEXT_94 = NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_95 = " = ";
  protected final String TEXT_96 = "; ";
  protected final String TEXT_97 = NL + "\t        \t\t\t" + NL + "        \t\t\tfor (int i = 0; i < reply.length; i++) {" + NL + "\t        \t\t\t\treply[i] = decryptedPassword_";
  protected final String TEXT_98 = ";" + NL + "        \t\t\t}" + NL + "        " + NL + "        \t\t\treturn reply;" + NL + "        \t\t}" + NL + "        \t}\t" + NL + "        );" + NL + "        \tif (isAuthenticated_";
  protected final String TEXT_99 = " == false){" + NL + "\t\t\t\t";
  protected final String TEXT_100 = NL + "\t\t\t\t\tlog.fatal(\"";
  protected final String TEXT_101 = " - Authentication failed.\");" + NL + "\t\t\t\t";
  protected final String TEXT_102 = NL + "            \tthrow new RuntimeException(\"Authentication failed.\");" + NL + "\t\t\t}" + NL + "\t\t\t";
  protected final String TEXT_103 = NL + "\t\t\t\tlog.info(\"";
  protected final String TEXT_104 = " - Authentication succeeded.\");" + NL + "\t\t\t";
  protected final String TEXT_105 = NL + "        ch.ethz.ssh2.SCPClient scp_";
  protected final String TEXT_106 = " = new  ch.ethz.ssh2.SCPClient(conn_";
  protected final String TEXT_107 = ");";
  protected final String TEXT_108 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
        CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
        INode node = (INode)codeGenArgument.getArgument();
        boolean isLog4jEnabled = ("true").equals(ElementParameterParser.getValue(node.getProcess(), "__LOG4J_ACTIVATE__"));
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
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_3);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_5);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_6);
    
	String useExistingConn = ElementParameterParser.getValue(node, "__USE_EXISTING_CONNECTION__");
	
	if(("true").equals(useExistingConn)){
		String connection = ElementParameterParser.getValue(node, "__CONNECTION__");
		String conn= "conn_" + connection;
	
    stringBuffer.append(TEXT_7);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_8);
    stringBuffer.append(conn );
    stringBuffer.append(TEXT_9);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_13);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    }
    stringBuffer.append(TEXT_15);
    }else{
    stringBuffer.append(TEXT_16);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(host);
    stringBuffer.append(TEXT_18);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(user);
    stringBuffer.append(TEXT_20);
    
        if(("").equals(port)){

    stringBuffer.append(TEXT_21);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_23);
    
        } else {

    stringBuffer.append(TEXT_24);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(port);
    stringBuffer.append(TEXT_27);
    
        }

    stringBuffer.append(TEXT_28);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_29);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(user);
    stringBuffer.append(TEXT_32);
    }
    stringBuffer.append(TEXT_33);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_34);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_35);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_37);
    }
            
        if (("PUBLICKEY").equals(authMethod)) {

    stringBuffer.append(TEXT_38);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_39);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_40);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_41);
    stringBuffer.append(privatekey);
    stringBuffer.append(TEXT_42);
    }
    stringBuffer.append(TEXT_43);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_44);
    stringBuffer.append(privatekey);
    stringBuffer.append(TEXT_45);
    
            String passwordFieldName = "__PASSPHRASE__";
            
    if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_48);
    } else {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_50);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_51);
    }
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
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_58);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_59);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_60);
    }
    stringBuffer.append(TEXT_61);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_62);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_63);
    }
    
        }
        if (("PASSWORD").equals(authMethod)) {

    stringBuffer.append(TEXT_64);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_65);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_66);
    }
    
            String passwordFieldName = "__PASSWORD__";
            
    if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {
    stringBuffer.append(TEXT_67);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_68);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_69);
    } else {
    stringBuffer.append(TEXT_70);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_71);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_72);
    }
    stringBuffer.append(TEXT_73);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_74);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_75);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_76);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_77);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_78);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_79);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_80);
    }
    stringBuffer.append(TEXT_81);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_82);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_83);
    }
    
        }
        if (("KEYBOARDINTERACTIVE").equals(authMethod)) {

    stringBuffer.append(TEXT_84);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_85);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_87);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_88);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_89);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_90);
    
                        String passwordFieldName = "__PASSWORD__";
                        
    if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {
    stringBuffer.append(TEXT_91);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_92);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_93);
    } else {
    stringBuffer.append(TEXT_94);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_95);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_96);
    }
    stringBuffer.append(TEXT_97);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_98);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_99);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_100);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_101);
    }
    stringBuffer.append(TEXT_102);
    if(isLog4jEnabled){
    stringBuffer.append(TEXT_103);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_104);
    }
    
        }
	}//if(useExistingConn)        

    stringBuffer.append(TEXT_105);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_106);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_107);
    stringBuffer.append(TEXT_108);
    return stringBuffer.toString();
  }
}
