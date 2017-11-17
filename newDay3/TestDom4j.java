package cn.itsource.dom;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

public class TestDom4j {
	
	@Test
	public void testGetDom4j() throws Exception {
		
//		1.新建指定文件
		File file = new File("F:/dazigou/STUDY/EclipseWorkspace/NewDay3/src/cn/itsource/dom/Third.xml");
		
//		2.新建dom4j的SAXReader, 调用read（）将指定file返回成dom4j的Document
		SAXReader reader = new SAXReader();//查看Quick Start Guid-->parsing XML
		Document document = reader.read(file);
//							而w3c.dom解析文件需要DocumentBuilderfactory的newInstance()--》new DocumentBuilder()--》parse()
		System.out.println(document);

	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void testGetTextDom4j() throws Exception {
		
//		要求：获得Third.xml的第二<title>的<font>的文本内容
		
//		1.找到文件并解析
		File file = new File("F:/dazigou/STUDY/EclipseWorkspace/NewDay3/src/cn/itsource/dom/Third.xml");
		SAXReader reader = new SAXReader();
		Document document = reader.read(file);
		
//		2.找到文件的根节点
		Element rootElement = document.getRootElement();
		
//		3.找到第二个子节点title
		List<Element> tilteList = rootElement.elements("title");
		Element titleElement = tilteList.get(1);
		
//		4.找到指定title下的font，并获得文本内容
		Element fontElement = titleElement.element("font");
		System.out.println(fontElement.getText());
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void testAmendDom4j() throws Exception {
		
//		要求：修改Thrid.xml的第三<title>的<contact>的tel成大写
		
		File file = new File("F:/dazigou/STUDY/EclipseWorkspace/NewDay3/src/cn/itsource/dom/Third.xml");
		SAXReader reader = new SAXReader();
		Document document = reader.read(file);
		
		Element rootelement = document.getRootElement();
		List <Element> titleList =  rootelement.elements("title");//注意elements对应是List，element对应的是Element
		Element titleElement = titleList.get(2);
		Element contactElemt = titleElement.element("contact");
		contactElemt.setText("Tel: 196985");
		
//		内存数据同步到xml  
//		新建dom4j的XMLWriter,通过新建FileWriter（）传入将指定file, 调用write（）
		XMLWriter writer = new XMLWriter(new FileWriter(file));
		writer.write(document);//查看Quick Start Guid-->write a docment to a file
		writer.close();
//							而w3c.dom同步文件需要TransfomerFactory的newInstance()--》new Transfomer()--》DOMSource()-->StreamResult()-->transform

	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void testAddElement8Pretty() throws Exception {
		
//		要求：添加Thrid.xml的第三<title>的<person>
		
		File file = new File("F:/dazigou/STUDY/EclipseWorkspace/NewDay3/src/cn/itsource/dom/Third.xml");
		Document document = new SAXReader().read(file);
		Element rootElement = document.getRootElement();
		List<Element> titleList = rootElement.elements();
		Element titleElement = titleList.get(2);
		
		Element personElement= titleElement.addElement("person");//添加元素addElement()
		personElement.addAttribute("title", " manager");//为元素添加属性addAttribute()
		personElement.setText("Mr. Someone");//为元素添加内容setText()
		Element personElement1= titleElement.addElement("useless");//添加元素addElement()
		personElement1.setText("Mr.Someone");//为元素添加内容setText()
		
		personElement1.getParent().remove(personElement1);//先getParent（）再remove（）

//		美化格式并同步到文件 查看Quick Start Guid-->prettyPrint
		OutputFormat format = OutputFormat.createPrettyPrint();//条用outputFormat的createPrettyPrint
		XMLWriter writer = new XMLWriter(new FileWriter(file), format);//将新建FileWriter（file）和格式, 传入XMLWriter
		writer.write(document);
		writer.close();
	}
	
	
	
}