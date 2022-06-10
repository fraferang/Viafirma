package org.springframework.samples.petclinic.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.springframework.stereotype.Service;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

@Service
public class NewPDFService {

	public void newPDF(Path path) {
		try {
		File file = new File(path.toString());
		PDDocument document = PDDocument.load(file);
		PDPage my_page = new PDPage();
		document.addPage(my_page);
		document.save("C:\\Users\\Francisco\\Desktop\\entrevista\\Viafirma\\Francisco\\src\\main\\resources\\static\\resources\\pdfs\\NuevoPDF.pdf");
		document.close();
		
		}
		catch (IOException e)
        {
            e.printStackTrace();
        }
	}
}
