package xslt.code.generator.java;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Main {

	   public static void main(String[] args) throws IOException, URISyntaxException, TransformerException {
	        TransformerFactory factory = TransformerFactory.newInstance();
	        
	        Source xslt = new StreamSource(new File("C:/Users/User/Desktop/versions/14.08/EclipseWorkspace/xslt.code.generator.java/src/xslt/code/generator/java/transform.xsl"));
	        Transformer transformer = factory.newTransformer(xslt);

	        Source text = new StreamSource(new File("C:/Users/User/Desktop/versions/14.08/EclipseWorkspace/xslt.code.generator.java/src/xslt/code/generator/java/source.xml"));
	        transformer.transform(text, new StreamResult(new File("C:/Users/User/Desktop/versions/14.08/EclipseWorkspace/xslt.code.generator.java/src/xslt/code/generator/java/output.cc")));
	        System.out.println("hallo");
	    }

}
