package com.TMMS.Main.bean;

import java.util.Date;
import java.util.Set;

/**
 * Ordercycle entity. @author MyEclipse Persistence Tools
 */
public class Ordercycle extends AbstractOrdercycle implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ordercycle() {
	}

	/** minimal constructor */
	public Ordercycle(Long ocId, Date ocSt, Date ocEt) {
		super(ocId, ocSt, ocEt);
	}

	/** full constructor */
	public Ordercycle(Long ocId, Date ocSt, Date ocEt, String ocCh, Set orderses) {
		super(ocId, ocSt, ocEt, ocCh, orderses);
	}

}
