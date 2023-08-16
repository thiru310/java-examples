package com.example.xml;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CommentXmlNodeUsingStringManipulation {
    public static void main(String[] args) throws IOException {
        // XML string with elements
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<case1 createdate=\"19/Jul/2023 19:21:51\" system=\"\" batchid=\"0\" transactionno=\"1\">\n" +
                "    <tx></tx>\n" +
                "    <review-doc bo-class=\"\" bo-name=\"\" styleset-resid=\"157645080\">\n" +
                "        <review-channel channel=\"2\" destination=\"-5\" layout-resid=\"157719905\"></review-channel>\n" +
                "        <review-channel channel=\"1\" destination=\"-5\" layout-resid=\"157719905\"></review-channel>\n" +
                "        <review-channel channel=\"3\" destination=\"-6\" layout-resid=\"157719905\"></review-channel>\n" +
                "    </review-doc>\n" +
                "</case1>";

        File file = new File("C:\\Users\\tpurusot\\Downloads\\new 34.xml");
        String xmlString = Files.readString(Path.of("C:\\Users\\tpurusot\\Downloads\\new 34.xml"));
//        System.out.println(xmlString);
        String targetStartTag = "<review-channel channel=\"157600081\" destination=\"-6\" layout-resid=\"157719905\" layout-resverid=\"158082471\">";
        String targetEndTag = "</review-channel>";

        int startIndex = xmlString.lastIndexOf(targetStartTag);
        int endIndex = xmlString.indexOf(targetEndTag, startIndex);

        if (startIndex != -1 && endIndex != -1) {
            // Use StringBuilder for efficient string manipulation
            StringBuilder stringBuilder = new StringBuilder(xmlString.length() + 100);

            // Append the original XML string up to the start index
            stringBuilder.append(xmlString, 0, startIndex);

            // Append the commented out <review-channel> element and its content
            stringBuilder.append("<!--");
            stringBuilder.append(xmlString, startIndex, endIndex + targetEndTag.length());
            stringBuilder.append("-->");

            // Append the rest of the original XML string after the end index
            stringBuilder.append(xmlString, endIndex + targetEndTag.length(), xmlString.length());

            // Print the updated XML string with the <review-channel> element commented out
            System.out.println(stringBuilder.toString());
        } else {
            System.out.println("No valid <review-channel> element with attributes found.");
        }
    }
}
