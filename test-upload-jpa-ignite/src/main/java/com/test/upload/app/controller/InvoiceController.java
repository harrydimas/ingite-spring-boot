package com.test.upload.app.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.test.upload.app.dto.InvoiceUploadDto;
import com.test.upload.app.model.Invoice;
import com.test.upload.app.service.InvoiceService;
import com.test.upload.app.util.ReaderUtil;

@Controller
public class InvoiceController {
	
	private static Logger log = LoggerFactory.getLogger(InvoiceController.class);

	@Autowired
	private InvoiceService invoiceService;

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		
		log.info("start > " + new Date().toString());
		
		List<Invoice> invoices = invoiceService.getAll();
		model.addAttribute("invoices", invoices);
		model.addAttribute("totalData", invoices.size());
		
		log.info("end > " + new Date().toString());
		
		return "list";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	protected String save(@RequestParam(value = "invoiceFile") MultipartFile multipartFile,
			HttpServletRequest request, HttpServletResponse response,
			Model model) throws Exception {

		log.info("start > " + new Date().toString());
		
		try {
			List<InvoiceUploadDto> dtos = new ArrayList<InvoiceUploadDto>();
			List<String[]> dataHolder = ReaderUtil.readCsv(multipartFile.getInputStream(), ',');

			for (int i = 1; i < dataHolder.size(); i++) {
				String[] object = dataHolder.get(i);
				InvoiceUploadDto dto = new InvoiceUploadDto(i, object);
				dtos.add(dto);
			}
			
			if (dtos.size() > 100) {
				int div = dtos.size()/10;
				for (int i = 0; i < 10; i++) {
					int fromIndex = i * div;
					int toIndex = (div * (i + 1));
					if (i == 9) toIndex = dtos.size();
					log.info(fromIndex + " - " + toIndex);
					Thread process = new Thread(new UploadProcess(dtos.subList(fromIndex, toIndex)), UUID.randomUUID().toString());
					process.start();
				}
			} else {
				Thread process = new Thread(new UploadProcess(dtos), UUID.randomUUID().toString());
				process.start();
			}
		} catch (Exception e) {
			log.error(e.toString());
		}
		
		log.info("end > " + new Date().toString());
		
		return "redirect:/";
	}
	
	private class UploadProcess implements Runnable {

		private List<InvoiceUploadDto> dtos = new ArrayList<InvoiceUploadDto>();
		
		private UploadProcess(List<InvoiceUploadDto> dtos) {
			super();
			this.dtos = dtos;
		}
		
		@Override
		public void run() {
			
			log.info("UploadProcess - START "+Thread.currentThread().getName());
			invoiceService.saveBulk(dtos);
			
		}
		
	}
}
