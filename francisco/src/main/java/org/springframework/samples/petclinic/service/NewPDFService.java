package org.springframework.samples.petclinic.service;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

@Service
public class NewPDFService {

	public void newPDF() {
		try {
		PdfReader reader = new PdfReader("static/resources/pdfs/Francisco.pdf");
		PdfStamper stamper = new PdfStamper(reader, new FileOutputStream("Nuevo PDF con página en blanco.pdf"));
		stamper.insertPage(reader.getNumberOfPages() + 1, reader.getPageSizeWithRotation(1));
		stamper.close();
		reader.close();
		}
		catch (IOException e)
        {
            e.printStackTrace();
        }
		catch (DocumentException e)
		{
            e.printStackTrace();
			
		}
	}
}
