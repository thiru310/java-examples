package com.example.xml;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class CommentLastNodeinXml {
    public static void main(String[] args) {
        // XML string with elements
    	
    	File file = new File("C:\\Users\\tpurusot\\Downloads\\new 351.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	    Document document;
	    try {
	    document = dbf.newDocumentBuilder().parse(file);
//        String xml = nodeToString((Node)document);
//        System.out.println(xml);
	    String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<case1 createdate=\"19/Jul/2023 19:21:51\" system=\"\" batchid=\"0\" transactionno=\"1\">\n" +
                "    <tx></tx>\n" +
                "    <review-doc bo-class=\"\" bo-name=\"\" styleset-resid=\"157645080\">\n" +
                "        <review-channel channel=\"2\" destination=\"-5\" layout-resid=\"157719905\"></review-channel>\n" +
                "        <review-channel channel=\"1\" destination=\"-5\" layout-resid=\"157719905\"></review-channel>\n" +
                "        <review-channel channel=\"3\" destination=\"-6\" layout-resid=\"157719905\"></review-channel>\n" +
                "    </review-doc>\n" +
                "</case1>";

     // Regular expression to find the last <review-channel> element with attributes channel="3" and destination="-6"
        Pattern pattern = Pattern.compile("(<review-doc[\\s\\S]*?<review-channel[^>]*channel=\"3\"[^>]*destination=\"-6\"[^>]*>[\\s\\S]*?)</review-channel>");
        Matcher matcher = pattern.matcher(xml);

        // Check if a valid <review-channel> element with attributes is found
        if (matcher.find()) {
            // Get the matched content
            String reviewChannelElement = matcher.group(1);

            // Comment out the <review-channel> element with attributes
            String commentedXMLString = xml.replace(reviewChannelElement, "<!--" + reviewChannelElement + "-->");

            // Print the updated XML string with the <review-channel> element commented out
            System.out.println(commentedXMLString);
        } else {
            System.out.println("No valid <review-channel> element with attributes found.");
        }
	} catch (SAXException | IOException | ParserConfigurationException /* | TransformerException */ e) {
	        e.printStackTrace();
	    }
    }
    
    private static String nodeToString(Node node) throws TransformerException {
	    StringWriter buf = new StringWriter();
	    Transformer xform = TransformerFactory.newInstance().newTransformer();
	    xform.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
	    xform.transform(new DOMSource(node), new StreamResult(buf));
	    return (buf.toString());
	}
}

