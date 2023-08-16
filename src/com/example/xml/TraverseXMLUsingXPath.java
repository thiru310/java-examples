package com.example.xml;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TraverseXMLUsingXPath {

	public static void main(String[] args) {
		String s = "<review-channel channel=\"157600081\" destination=\"-6\" layout-resid=\"157719905\" layout-resverid=\"158082471\">";
		
			//creating a constructor of file class and parsing an XML file  
						File file = new File("C:\\Users\\tpurusot\\Downloads\\new 34.xml");
						DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
					    Document document;
					    Node result = null;
					    try {
					        document = dbf.newDocumentBuilder().parse(file);
					        XPath xPath = XPathFactory.newInstance().newXPath();
					        
					        String xpathStr = "//review-case//review-document//review-channel[@channel=2]//enclosures//review-document//review-channel//content";
					        Node resultToReplace = (Node) xPath.evaluate(xpathStr, document, XPathConstants.NODE);
					        Node pdfContent = resultToReplace.cloneNode(true);
					        System.out.println(nodeToString(resultToReplace));
					        
					        String xpathStr1 = "//review-case//review-document//review-channel[@channel=157600081]//enclosures//review-document//review-channel//content";
					        Node resulttoremove = (Node) xPath.evaluate(xpathStr1, document, XPathConstants.NODE);
//					        System.out.println("resultTo remove ::: "+nodeToString(resulttoremove));
					        
					        String xpathStr2 = "//review-case//review-document//review-channel[@channel=157600081]//enclosures//review-document//review-channel//*";
					        NodeList resultList  = (NodeList) xPath.evaluate(xpathStr2, document, XPathConstants.NODESET);
//					        System.out.println("resultList ::: "+nodeToString(resultList));
					        int length = resultList.getLength();
					        for(int i=0; i < length; i++) {
//					        	System.out.println(resultList.item(i).getNodeName());
					        	if(resultList.item(i).getNodeName().equals("content")) {
					        		resultList.item(i).getParentNode().removeChild(resulttoremove);
					        		
					        		
//					        		System.out.println(nodeToString(resultList.item(i).getNextSibling()));
					        	}
					        	
					        	resultList.item(0).getParentNode().appendChild(pdfContent);
					        }
					        
//					        System.out.println(nodeToString(document));
					        
						} catch (SAXException | IOException | ParserConfigurationException
								| XPathExpressionException  | TransformerException  e) {
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
