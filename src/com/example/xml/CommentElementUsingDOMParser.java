package com.example.xml;

import org.w3c.dom.*;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class CommentElementUsingDOMParser {
    public static void main(String[] args) throws IOException {
        // XML string with elements
        String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<review-case createdate=\"21/Jul/2023 06:58:03\" system=\"\" batchid=\"0\" transactionno=" +
                "\"1\">\n" +
                "    <review-document bo-class=\"\" bo-name=\"\" styleset-resid=\"15\" styleset-resverid=\"16\" language=\"-1\">\n" +
                "        <review-channel channel=\"1\" destination=\"5\">\n" +
                "            <enclosures>\n" +
                "                <review-document>\n" +
                "                    <review-channel>\n" +
                "                        <content>\n" +
                "                        </content>\n" +
                "                    </review-channel>\n" +
                "                </review-document>\n" +
                "            </enclosures>\n" +
                "        </review-channel>\n" +
                "        <review-channel channel=\"2\" destination=\"4\">\n" +
                "            <enclosures>\n" +
                "                <review-document>\n" +
                "                    <review-channel>\n" +
                "                        <content>\n" +
                "                        </content>\n" +
                "                    </review-channel>\n" +
                "                </review-document>\n" +
                "            </enclosures>\n" +
                "        </review-channel>\n" +
                "        <review-channel channel=\"3\" destination=\"-6\">\n" +
                "            <enclosures>\n" +
                "                <review-document>\n" +
                "                    <review-channel>\n" +
                "                        <content>\n" +
                "                        </content>\n" +
                "                    </review-channel>\n" +
                "                </review-document>\n" +
                "            </enclosures>\n" +
                "        </review-channel>\n" +
                "        <review-channel channel=\"4\" destination=\"3\">\n" +
                "            <enclosures>\n" +
                "                <review-document>\n" +
                "                    <review-channel>\n" +
                "                        <content>\n" +
                "                        </content>\n" +
                "                    </review-channel>\n" +
                "                </review-document>\n" +
                "            </enclosures>\n" +
                "        </review-channel>\n" +
                "    </review-document>\n" +
                "</review-case>";

        File file = new File("C:\\Users\\tpurusot\\Downloads\\new 34.xml");
        xmlString = Files.readString(Path.of("C:\\Users\\tpurusot\\Downloads\\new 34.xml"));
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputSource inputSource = new InputSource(new StringReader(xmlString));
            Document document = builder.parse(inputSource);
            NodeList reviewChannels = document.getElementsByTagName("review-channel");
            Node targetReviewChannel = null;

            for (int i = 0; i < reviewChannels.getLength(); i++) {
                Element reviewChannel = (Element) reviewChannels.item(i);
                if (reviewChannel.getAttribute("channel").equals("157600081") && reviewChannel.getAttribute("destination").equals("-6")) {
                    targetReviewChannel = reviewChannel;
                    break;
                }
            }

            if (targetReviewChannel != null) {
                Comment commentNode = document.createComment(toString(targetReviewChannel)); // Comment out the entire <review-channel> element and its content
                Node parent = targetReviewChannel.getParentNode();
                parent.replaceChild(commentNode, targetReviewChannel);
                String commentedXMLString = toString(document);
                System.out.println(commentedXMLString);
            } else {
                System.out.println("No valid <review-channel> element with attributes found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Utility method to convert a DOM node to a string
    private static String toString(Node node) {
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(node), new StreamResult(writer));
            return writer.getBuffer().toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
