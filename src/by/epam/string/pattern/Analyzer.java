package by.epam.string.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analyzer
{
	private static Pattern anyNode = Pattern.compile("(<.+?>)|((?<=\\>).+?(?=\\<))");
	private Pattern anyTag;
	private Pattern openTag;
	private Pattern closeTag;
	private Pattern standAloneTag;
	//private Pattern textPattern;
	private static Matcher mainMatcher;
	private int count = 0;
	private int amountOfNode = 0;
	private String xml;
	
	Analyzer()
	{
		anyNode = Pattern.compile("(<.+?>)|((?<=\\>).+?(?=\\<))");
		anyTag = Pattern.compile("<.+?>");
		openTag = Pattern.compile("<(?!/).+?(?!=/)>");
		closeTag = Pattern.compile("</.+?(?!=/)>");
		standAloneTag = Pattern.compile("<(?!/).+?/>");
		//textPattern = Pattern.compile("(?<=\\>).+?(?=\\<)");
	}
	
	//call by isXML(String xml) method
	private boolean isXMLValid(String xml, String root)
	{
		Pattern rootType = Pattern.compile("\\w+?");
		Matcher matRoot = rootType.matcher(root);
		
		if(matRoot.find())
		{
			rootType = Pattern.compile(matRoot.group());
		}
		else
		{
			return false;
		}
		
		Matcher matOpen;
		Matcher matClose;
		
		Matcher matTag = anyTag.matcher(xml);
		String node;
		
		while(matTag.find())
		{
			node = matTag.group();
			matOpen = openTag.matcher(node);
			matClose = closeTag.matcher(node);
			if(matOpen.matches())
			{
				int strut = matTag.start() + node.length();
				return isXMLValid(xml.substring(strut),node);
			}
			else if(matClose.matches())
			{
				matRoot = rootType.matcher(node);
				return matRoot.find() ? true : false;
			}
		}
		
		return false;
	}
	
	private boolean isXMLValid(String xml)
	{	
		Matcher matAnyTag = openTag.matcher(xml);
		String root;
		int strut;
		if(matAnyTag.find())
		{
			root = matAnyTag.group();
			strut = matAnyTag.start() + root.length();
		}
		else
		{
			return false;
		}
		return isXMLValid(xml.substring(strut), root);
	}
	
	public boolean hasNextNode()
	{
		return mainMatcher.find() ? true : false;
	}
	
	private String getContent(String xml)
	{
		Matcher matOpen;
		Matcher matClose;
		Matcher matTag = anyTag.matcher(xml);
		int i = 1;
		while(i != 0 && matTag.find())
		{
			String tag = matTag.group();
			System.out.println(tag);
			matOpen = openTag.matcher(tag);
			matClose = closeTag.matcher(tag);
			if(matOpen.matches())
			{
				System.out.println("+");
				i++;
			}
			if(matClose.matches())
			{
				i--;
			}
		}
		return "content: " +xml.substring(0,matTag.start());
	}
	
	
	
	public String getNextNode() throws IllegalStateException
	{
		Matcher matOpen;
		Matcher matClose;
		Matcher matStandAlone;
		
		String node = null;
		String content;
		String type;
		if(mainMatcher.find())
		{
			node = mainMatcher.group();
			matOpen = openTag.matcher(node);
			matClose = closeTag.matcher(node);
			matStandAlone = standAloneTag.matcher(node);
			if(matOpen.matches())
			{
				type = "opening tag";
				String xmlTail = xml.substring(mainMatcher.start()+node.length());
				content = getContent(xmlTail);
				count++;
			}
			else 
			{
				content = "there are no content";
				if(matClose.matches())
				{
					type = "closing tag";
					count--;
					if(count == 0)
					{
						return node + " " + type + "\n" + content + "\n\n";
					}
				}
				else if(matStandAlone.matches())
				{
					type = "self-closing tag";
				}
				else
				{
					type = "text";
				}
			}
			return node + " " + type + "\n" + content + "\n\n";
		}
		
		return "";
	}
	
	public void init(String xml) throws Exception
	{
		if(isXMLValid(xml))
		{
			this.xml = xml;
			mainMatcher = anyNode.matcher(xml);
			while(mainMatcher.find())
			{
				amountOfNode++;
			}
			mainMatcher = anyNode.matcher(xml);
			count = 0;
		}
		else
		{
			count = 0;
			amountOfNode = 0;
			throw new Exception("invalidXML");
		}
	}
	
	public static void main(String[] args)
	{
		String simpleXML = "<a><b></b>b<b>b<d />bb</b>b</a>";
		
		Analyzer t = new Analyzer();
		
		try 
		{
			t.init(simpleXML);
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		
		System.out.println(t.amountOfNode);
		for(int i = 0; i < t.amountOfNode; i++)
		{
			System.out.println(t.getNextNode());
		}
		
		
	}
}
