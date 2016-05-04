package io.training.jxls.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class TrainingJxlsApplication {
	private static Logger logger = LoggerFactory.getLogger(TrainingJxlsApplication.class);
	public static void main(String[] args) throws IOException {
		ApplicationContext ctx = SpringApplication.run(TrainingJxlsApplication.class, args);
		ExportService es = ctx.getBean(ExportService.class);
		logger.info("==========" + (null == es));
//		es.simpleExporter();
//		es.export2();
		es.standardExport();
	}
}
