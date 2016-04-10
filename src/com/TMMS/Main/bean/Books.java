package com.TMMS.Main.bean;

import java.util.Set;

/**
 * Books entity. @author MyEclipse Persistence Tools
 */
public class Books extends AbstractBooks implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Books() {
	}

	/** minimal constructor */
	public Books(Long BId, String BName, String BAuthor, Long BPrice,
			String BIsbn, String BPress, String BOrder, Boolean BState) {
		super(BId, BName, BAuthor, BPrice, BIsbn, BPress, BOrder, BState);
	}

	/** full constructor */
	public Books(Long BId, String BName, String BAuthor, Long BPrice,
			String BIsbn, String BPress, String BOrder, String BPlan,
			String BBorders, String BGrand, Boolean BState, Set bos) {
		super(BId, BName, BAuthor, BPrice, BIsbn, BPress, BOrder, BPlan,
				BBorders, BGrand, BState, bos);
	}

}