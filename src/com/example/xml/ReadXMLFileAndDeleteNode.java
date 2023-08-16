package com.example.xml;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

public class ReadXMLFileAndDeleteNode {
	public static void main(String argv[]) {
		try {
//creating a constructor of file class and parsing an XML file  
			File file = new File("C:\\Users\\tpurusot\\Downloads\\new 50.xml");
//an instance of factory that gives a document builder  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//an instance of builder to parse the specified xml file  
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
			NodeList reviewcase = doc.getElementsByTagName("review-case");
			Node reviewCaseNode = reviewcase.item(0);
			Element reviewCaseElement = (Element) reviewCaseNode;
			Element reviewDocumentElement =  (Element) reviewCaseElement.getElementsByTagName("review-document").item(0);
			NodeList reviewchannel = reviewDocumentElement.getElementsByTagName("review-channel");
			Node reviewChannelNodeToCopy = null;
			boolean nodeCopied = false;
			boolean nodeDeleted = false;
			Node nod1 = null;
			for(int i = 0 ; i < reviewchannel.getLength() ; i++) {
				System.out.println("inside for loop ::: "+i);
				Node reviewChannelNode = reviewchannel.item(i);
				
				
				if(reviewChannelNode.hasAttributes() && null != reviewChannelNode.getAttributes().getNamedItem("channel")
						&& null != reviewChannelNode.getAttributes().getNamedItem("destination")) {
//					System.out.println("Main Channel Check ::: "+reviewChannelNode.getAttributes().getNamedItem("channel").getNodeValue());
//					System.out.println("Main Destination Check ::: "+reviewChannelNode.getAttributes().getNamedItem("destination").getNodeValue());
					
					if(reviewChannelNode.getAttributes().getNamedItem("destination").getNodeValue().equals("-5")
							&& reviewChannelNode.getAttributes().getNamedItem("channel").getNodeValue().equals("2")) {
						nod1 = reviewChannelNode.cloneNode(true);
						NodeList nodeList = reviewChannelNode.getChildNodes();
						for(int j=0; j < nodeList.getLength(); j++) {
							if(nodeList.item(j).getNodeName().equalsIgnoreCase("enclosures")) {
								Node enclosureNode = nodeList.item(j);
								
								NodeList enclNodeList = enclosureNode.getChildNodes();
								for(int k=0 ; k < enclNodeList.getLength(); k++) {
									if(enclNodeList.item(k).getNodeName().equals("review-document")) {
										NodeList reviewDocNodeList = enclNodeList.item(k).getChildNodes();
										int lenghtofEnclChildNodes = reviewDocNodeList.getLength();
										for(int l=0; l < lenghtofEnclChildNodes; l++ ) {
											if(reviewDocNodeList.item(l).getNodeName().equalsIgnoreCase("review-channel")) {
												NodeList reviewDocChildNodes = reviewDocNodeList.item(l).getChildNodes();
												int reviewDocChildNodeLength = reviewDocChildNodes.getLength();
												for(int m=0; m < reviewDocChildNodeLength; m++) {
													if(reviewDocChildNodes.item(m).getNodeName().equalsIgnoreCase("content")) {
														System.out.println(nodeToString(reviewDocChildNodes.item(m)));
														break;
													}
												}
											}
											
										}
									}
								}
							}
						}
						nod1.getAttributes().getNamedItem("channel").setNodeValue("157600081");
						nod1.getAttributes().getNamedItem("destination").setNodeValue("-6");
						System.out.println("Hi How are you");
						
					}
					
					if(reviewChannelNode.getAttributes().getNamedItem("destination").getNodeValue().equals("-6")
							&& reviewChannelNode.getAttributes().getNamedItem("channel").getNodeValue().equals("157600081")) {
//						System.out.println("Destination Values :: "+reviewChannelNode.getAttributes().getNamedItem("destination").getNodeValue());
//						System.out.println("Channel Values :: "+reviewChannelNode.getAttributes().getNamedItem("channel").getNodeValue());
//						reviewDocumentElement.appendChild(reviewChannelNodeToCopy);
						reviewDocumentElement.removeChild(reviewchannel.item(i));
						
					}
					
//					if(reviewChannelNode.getAttributes().getNamedItem("destination").getNodeValue().equals("-5")
//							&& reviewChannelNode.getAttributes().getNamedItem("channel").getNodeValue().equals("2")) {
//						reviewChannelNodeToCopy = reviewchannel.item(i);
//						reviewChannelNodeToCopy.getAttributes().getNamedItem("channel").setNodeValue("157600081");
//						reviewChannelNodeToCopy.getAttributes().getNamedItem("destination").setNodeValue("-6");
//						nodeCopied = true;
//						reviewDocumentElement.appendChild(reviewChannelNodeToCopy);
//						reviewDocumentElement.insertBefore(reviewChannelNodeToCopy, reviewchannel.item(i));
//					}
					
					
				}
			}
			
			reviewDocumentElement.appendChild(nod1);
			System.out.println(nodeToString(reviewcase.item(0)));
			//			System.out.println(nodeToString(reviewcase.item(0)));
//			if(null != reviewChannelNodeToCopy) {
//				reviewDocumentElement.appendChild(reviewChannelNodeToCopy);
//			}
//			System.out.println(nodeToString(reviewcase.item(0)));
			
			
//			NodeList nodeList = doc.getElementsByTagName("student");
//// nodeList is not iterable, so we are using for loop  
//			for (int itr = 0; itr < nodeList.getLength(); itr++) {
//				Node node = nodeList.item(itr);
//				System.out.println("\nNode Name :" + node.getNodeName());
//				if (node.getNodeType() == Node.ELEMENT_NODE) {
//					Element eElement = (Element) node;
//					System.out.println("Student id: " + eElement.getElementsByTagName("id").item(0).getTextContent());
//					System.out.println(
//							"First Name: " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
//					System.out.println(
//							"Last Name: " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
//					System.out.println("Subject: " + eElement.getElementsByTagName("subject").item(0).getTextContent());
//					System.out.println("Marks: " + eElement.getElementsByTagName("marks").item(0).getTextContent());
//				}
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String nodeToString(Node node) {
	    StringWriter sw = new StringWriter();
	    try {
	      Transformer t = TransformerFactory.newInstance().newTransformer();
	      t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
	      t.setOutputProperty(OutputKeys.INDENT, "yes");
	      t.transform(new DOMSource(node), new StreamResult(sw));
	    } catch (TransformerException te) {
	      System.out.println("nodeToString Transformer Exception");
	    }
	    return sw.toString();
	  }
}
