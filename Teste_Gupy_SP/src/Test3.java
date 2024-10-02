import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Test3 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); 
			DocumentBuilder builder = factory.newDocumentBuilder(); //criando o documento
			
			Document document = builder.parse("c:\\temp\\faturamento.xml"); //lendo o documento
			
			document.getDocumentElement().normalize();
			
			NodeList dias = document.getElementsByTagName("dia");
			
			Double menorFaturamento = Double.MAX_VALUE;
			Double maiorFaturamento = Double.MIN_VALUE;
			double somaFaturamento = 0;
			int diasFaturamento = 0;
			
			for (int i = 0; i < dias.getLength(); i++) {
                double faturamentoDiario = Double.parseDouble(dias.item(i).getTextContent());
                
                if (faturamentoDiario > 0) {
                	
                	if (faturamentoDiario < menorFaturamento) {
                		menorFaturamento = faturamentoDiario;
                	}
                	if (faturamentoDiario > maiorFaturamento) {
                		maiorFaturamento = faturamentoDiario;
                	}
                	
                	somaFaturamento += faturamentoDiario;
                	diasFaturamento ++; 
                }
			}
			double mediaFaturamento = somaFaturamento / diasFaturamento;
			
			int diasAcimaMedia = 0;
			for(int i=0; i<dias.getLength(); i++) {
				double faturamentoDiario = Double.parseDouble(dias.item(i).getTextContent());
				
				if(faturamentoDiario > mediaFaturamento) {
					diasAcimaMedia ++;
				}
			}
			System.out.println("O menor valor de faturamento ocorrido em um dia do mês foi: " + menorFaturamento);
			System.out.println("O maior valor de faturamento ocorrido em um dia do mês foi: " + maiorFaturamento);
			System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal foi: " + diasAcimaMedia);
		}
			
		catch (IOException e) {
		System.out.println("Error: " + e );
		}
	}
}
