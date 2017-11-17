package cn.itsource.dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//创建对象的方法：1.new 2.反射 3.（单例的）静态方式 4.工厂返回

//原生API解析DOM
public class TestDom {

	@Test
	public void testGetDom() throws Exception {
		
//		1.指定文件XML路径(Ctrl+f)
		File file = new File("F:/dazigou/STUDY/EclipseWorkspace/NewDay3/MyFirst.xml");
//		2.通过DocumentBuilderFactory的static方法newInstance()获得DocumentBuilder实例
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//		3.通过DocumentBuilder的static方法newDocument()获得Document实例
		DocumentBuilder fBuilder = factory.newDocumentBuilder();
//		4.通过Document的解析方法parse()解析指定文件
		Document doc = fBuilder.parse(file);
		System.out.println(doc);
		
	}
	
	
	@Test
	public void testGetText() throws Exception {
		
//		要求：获得Second.xml的第二<title>的<font>的文本内容
		
//		1.找到文件并解析
		File file = new File("F:/dazigou/STUDY/EclipseWorkspace/NewDay3/src/cn/itsource/dom/Second.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder fBuilder = factory.newDocumentBuilder();
		Document doc = fBuilder.parse(file);
		
//		2.找到文件的根节点
//		通过getElementsByTagName()获得该文本的唯一 根节点contents的list
		NodeList contentsElement = doc.getElementsByTagName("contents");
		Node contentsNode = (Node) contentsElement.item(0);//文本仅有唯一根节点，索引为0
		
//		3.找到第二个子节点title
//		将根节点强！制！转！化！成org.w3c.dom.Element来获得contents的子节点元素
		Element titleElement = (Element) contentsNode;
//		通过getElementsByTagName()获得指定 子节点title的list
		NodeList titleList = titleElement.getElementsByTagName("title");
		Node titleNode = (Node) titleList.item(1);//获得索引为1的title节点
		
//		4.找到指定title下的font，并获得文本内容
		Element fontElement = (Element) titleNode;//将title节点 强制转化成 dom的子节点元素 
		NodeList fontList= fontElement.getElementsByTagName("font");//通过fontElements获得fontList
		Node fontNode = (Node) fontList.item(0);//通过fontList获得fontNode节点
		System.out.println(fontNode.getTextContent());//通过getTextContent（）获得内容
		
	}
	
	
	@Test
	public void testAmend() throws Exception {
		
//		要求：修改Second.xml的第二<title>的<size>的文本内容	
		
		File file = new File("F:/dazigou/STUDY/EclipseWorkspace/NewDay3/src/cn/itsource/dom/Second.xml");
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
		
		Node contentNode = (Node) doc.getElementsByTagName("contents").item(0);
		
		Element titleElement = (Element) contentNode;
		Node titleNode = titleElement.getElementsByTagName("title").item(1);
		
		Element sizeElement = (Element) titleNode;
		Node sizeNode = sizeElement.getElementsByTagName("size").item(0);
//		System.out.println("Before amend: " + sizeNode.getTextContent());//12
		
		sizeNode.setTextContent("11");//修改指定内容
		
//		内存数据同步到xml  
//		1.TransformerFactory 2. Transformer  3. transform(Source xmlSource,  Result outputTarget )
		TransformerFactory fFactory = TransformerFactory.newInstance();//实例化transformerFactory
		Transformer trans = fFactory.newTransformer();//实例化transformer
		Source xmlSource = new DOMSource(doc);//通过DOMSource()实例化解析的文件
		Result outputTarget = new StreamResult(file);//通过StreamResult()输出到指定文档
		trans.transform(xmlSource, outputTarget);
		
//		System.out.println("After amend: " + sizeNode.getTextContent());//11
		
	}
	
	
	@Test
	public void testCreate8Append8Attribute() throws Exception {
		
//		要求：为Second.xml创建第三个<title>，子节点包括<email></email>,<address></address>
		
		File file = new File("F:/dazigou/STUDY/EclipseWorkspace/NewDay3/src/cn/itsource/dom/Second.xml");
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
		
//		获得根节点 （标签元素）
		Element contentsElement = doc.getDocumentElement();
		
//		创建新元素 在文本中create
		Element title3 = doc.createElement("title");
		title3.setAttribute("id", "2");//为子节点title设置attribute(属性)
		Element email = doc.createElement("email");
		email.setTextContent("631@qq.com");//为title的子节点setTextContent内容
		Element address = doc.createElement("address");
		address.setTextContent("No 1 HongLin Road");
		Element contact = doc.createElement("contact");
		contact.setTextContent("tel:196985");
		Element tel = doc.createElement("telephone");
		tel.setTextContent("tel:196985");
		
//		将create的元素append附加到节点中
		contentsElement.appendChild(title3);//将title附加到根节点后
		title3.appendChild(email);//将子节点附加到title后
		title3.appendChild(address);
		title3.appendChild(contact);
		title3.appendChild(tel);
		
//		内存数据同步到xml
		Transformer trans = TransformerFactory.newInstance().newTransformer();
		Source xmlSource = new DOMSource(doc);
		Result outputTarget = new StreamResult(file);
		trans.transform(xmlSource, outputTarget);
	}
	
	
	@Test
	public void testRemove() throws Exception {
		
//		要求：删除Second.xml创建第三个<title>，重复的子节点<telephone>
		
		File file = new File("F:/dazigou/STUDY/EclipseWorkspace/NewDay3/src/cn/itsource/dom/Second.xml");
		Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
		Element contentsElement = document.getDocumentElement();
		Element titleElement = (Element) contentsElement.getElementsByTagName("title").item(2);
		Element telephoneElement = (Element) titleElement.getElementsByTagName("telephone").item(0);
		telephoneElement.getParentNode().removeChild(telephoneElement);//先取得parentNode(),再removeChild()
		
//		内存数据同步到xml
		Transformer trans = TransformerFactory.newInstance().newTransformer();
		Source xmlSource = new DOMSource(document);
		Result outputTarget = new StreamResult(file);
		trans.transform(xmlSource, outputTarget);
	}
	
}
