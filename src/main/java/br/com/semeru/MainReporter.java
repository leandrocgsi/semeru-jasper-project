package br.com.semeru;

import br.com.semeru.mock.ContactFactory;
import br.com.semeru.beans.ContactBean;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class MainReporter {

    public static void main(String[] args) throws Exception {

        String jrxmlPath = System.getProperty("user.dir") + "\\src\\main\\java\\br\\com\\semeru\\templates\\";

        System.out.println(jrxmlPath);
        try {
	        InputStream inputStream = new FileInputStream(jrxmlPath + "demo.jrxml");
	
	        ArrayList<ContactBean> dataBeanList = (ArrayList<ContactBean>) ContactFactory.create();
	
	        JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(dataBeanList);

			@SuppressWarnings("rawtypes")
			Map parameters = new HashMap();

			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			@SuppressWarnings("unchecked")
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanColDataSource);
			JasperExportManager.exportReportToPdfFile(jasperPrint, jrxmlPath + "test_jasper_with_subreport.pdf");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
