package org.mixer2;

import org.apache.commons.logging.Log;
import org.junit.Test;
import org.slf4j.Logger;

public class Samples {

	@Test
	public void jul() throws Exception {
		java.util.logging.Logger log = java.util.logging.Logger.getLogger(java.util.logging.Logger.GLOBAL_LOGGER_NAME);
		log.addHandler(new java.util.logging.StreamHandler() {
			{
				setOutputStream(System.out);
				setLevel(java.util.logging.Level.ALL);
			}
		});
		log.setUseParentHandlers(false);
		log.setLevel(java.util.logging.Level.ALL);
		log.severe("severeです");
		log.warning("warningです");
		log.info("infoです");
		log.config("configです");
		log.fine("fineです");
		log.finer("finerです");
		log.finest("finestです");
	}

	@Test
	public void log4j() throws Exception {
		org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger("log4j");
		log.fatal("fatalです");
		log.error("errorです");
		log.warn("warnです");
		log.info("infoです");
		log.debug("debugです");
		log.trace("traceです");
	}

	@Test
	public void jcl() throws Exception {
		org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog("jcl");
		log.fatal("fatalです");
		log.error("errorです");
		log.warn("warnです");
		log.info("infoです");
		log.debug("debugです");
		log.trace("traceです");
	}

	@Test
	public void slf4j() throws Exception {
		org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger("slf4j");
		// log.fatal(); // not implemented
		log.error("errorです");
		log.warn("warnです");
		log.info("infoです");
		log.debug("debugです");
		log.trace("traceです");
	}
}
