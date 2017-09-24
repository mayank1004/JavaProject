package Selenium.Test.Selenium;

import java.io.FileReader;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Common.Sum;



/**
 * Hello world!
 *
 */
public class App 
{
	
   
    public static void main(String[] args) {

    	JSONParser parser = new JSONParser();
    	 
         try {
  
             Object obj = parser.parse(new FileReader(
                     "C:\\Users\\Mayank\\Desktop\\Testing\\json\\json.txt"));
  
             JSONObject jsonObject = (JSONObject) obj;
  
             String name = (String) jsonObject.get("Name");
             String author = (String) jsonObject.get("Author");
             JSONArray companyList = (JSONArray) jsonObject.get("Company List");
  
             System.out.println("Name: " + name);
             System.out.println("Author: " + author);
             System.out.println("\nCompany List:");
             Iterator<String> iterator = companyList.iterator();
             while (iterator.hasNext()) {
                 System.out.println(iterator.next());
             }
  
         } catch (Exception e) {
             e.printStackTrace();
         }
         
         System.out.println(Sum.getSum(3,5));
	}
}
