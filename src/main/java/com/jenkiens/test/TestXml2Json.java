package com.jenkiens.test;

import java.io.StringReader;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.jenkiens.pojo.config.ConfigReport;

public class TestXml2Json {

   public static void main(String[] args) throws Exception
   {
//      
//
//      XmlMapper xmlMapper = new XmlMapper();
//      JsonNode node = xmlMapper.readTree(new File("config.xml"));
//      ObjectMapper jsonMapper = new ObjectMapper();
//      String json = jsonMapper.writeValueAsString(node);
//      System.out.println(json);
	   
		String xml="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
	   			"<planet>\r\n" + 
	   			"    <name>Earth</name>\r\n" + 
	   			"    <planet_from_sun>3</planet_from_sun>\r\n" + 
	   			"    <moons>9</moons>\r\n" + 
	   			"</planet>";
		
		
		
		
		
	     XmlMapper xmlMapper = new XmlMapper();
	      XMLInputFactory xmlif = XMLInputFactory.newInstance();
	      XMLStreamReader xmlsr = xmlif.createXMLStreamReader(new StringReader(xml));
	      ConfigReport planet = xmlMapper.readValue(xmlsr, ConfigReport.class);
	      ObjectMapper jsonMapper = new ObjectMapper();
	      String json = jsonMapper.writeValueAsString(planet.getReporters().getHudsonPluginsPmdPmdReporter().getThresholds());
	      System.out.println(json);

	   
   }
}