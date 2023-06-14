package com.boaner.demo;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class wikisearch {
	
	public static String main (String conv) throws IOException {	
		
		String searchTerm = conv.replaceAll("(?i)wikipedia", "").trim();
		System.out.println(searchTerm);
		if(searchTerm.contains("in")) {
			searchTerm = searchTerm.replaceAll("(?i) in", "").trim();
		}
		System.out.println(searchTerm);
		String encodedSearchTerm = URLEncoder.encode(searchTerm, StandardCharsets.UTF_8);

        String apiUrl = "https://en.wikipedia.org/wiki/" + encodedSearchTerm;
        Document doc = Jsoup.connect(apiUrl).get();
        Elements paragraphs = doc.select("div#mw-content-text > div.mw-parser-output > p");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            Element paragraph = paragraphs.get(i);
            sb.append(paragraph.text());
            System.out.println(paragraph.text());
        }
		return sb.toString();
	}

}
