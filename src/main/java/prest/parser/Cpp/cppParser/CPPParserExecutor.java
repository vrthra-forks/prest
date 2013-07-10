package prest.parser.Cpp.cppParser;


import prest.parser.Java.MetricsRelatedFiles.ClassContainer;
import prest.parser.enumeration.Language;
import prest.parser.parserinterface.IParser;

import prest.common.data.DataContext;

public class CPPParserExecutor implements IParser {

	public CPPParserExecutor() {
		super();
	}

	Language language = Language.CPP;

	public DataContext startExecution(String fileNames[], String projectName,
			String xmlFileName, String packageCsvFileName,
		    String fileCsvFileName, String classCsvFileName, String methodCsvFileName) {

		CPPParser parser = new CPPParser(System.in);

		ClassContainer con = parser.IdentifyModules(fileNames);
		try {
			con.writeToFileAsXml(xmlFileName);
			con.writeToFileAsXls(xmlFileName, packageCsvFileName,
				    fileCsvFileName, classCsvFileName, methodCsvFileName); // converts the given xml to csv file
		} catch (Exception e) {
			System.out.println("file exception");
			e.printStackTrace();
		}
		return con.getDataContextFormat();
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
}
