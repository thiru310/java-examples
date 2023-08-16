package com.example.xml;

import org.w3c.dom.*;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.xpath.*;

public class XMLManipulationWithXPath {
    public static void main(String[] args) {
        try {
            // Original XML string (Same as before)
        	File file = new File("C:\\Users\\tpurusot\\Downloads\\new 34.xml");

            // Parse the original XML string into a Document object
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            // Get the XPath expression
            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();

            // Find the source review-channel element with the specified attributes
            String sourceXpathExpression = "//review-channel[@channel='2' and @destination='4']/enclosures/review-document/review-channel/content";
            XPathExpression sourceExpression = xpath.compile(sourceXpathExpression);
            Node sourceContentNode = (Node) sourceExpression.evaluate(doc, XPathConstants.NODE);

            // Find the target review-channel element with the specified attributes
            String targetXpathExpression = "//review-channel[@channel='3' and @destination='-6']/enclosures/review-document/review-channel/content";
            XPathExpression targetExpression = xpath.compile(targetXpathExpression);
            Node targetContentNode = (Node) targetExpression.evaluate(doc, XPathConstants.NODE);

            if (sourceContentNode != null && targetContentNode != null) {
                // Remove existing content from targetContentNode
                while (targetContentNode.hasChildNodes()) {
                    targetContentNode.removeChild(targetContentNode.getFirstChild());
                }

                // Copy the content node from the sourceContentNode to targetContentNode
                Node copiedContent = doc.importNode(sourceContentNode, true);
                targetContentNode.appendChild(copiedContent);

                // Convert the Document object back to a string
                String resultXML = documentToString(doc);

                // Print the updated XML string
                System.out.println(resultXML);
            } else {
                System.out.println("Source or target review-channel element not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Helper method to convert a Document object to an XML string
    private static String documentToString(Document doc) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

        DOMSource domSource = new DOMSource(doc);
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        transformer.transform(domSource, result);

        return writer.toString();
    }
}
