package com.dianping.puma.storage.index.biz;

import com.dianping.puma.core.model.BinlogInfo;

public class L2IndexKey implements Comparable<L2IndexKey> {

	private BinlogInfo binlogInfo;

	public L2IndexKey(L1IndexKey l1IndexKey) {
		this.binlogInfo = l1IndexKey.getBinlogInfo();
	}

	public L2IndexKey(BinlogInfo binlogInfo) {
		this.binlogInfo = binlogInfo;
	}

	@Override
	public int compareTo(L2IndexKey l2IndexKey) {
		return binlogInfo.compareTo(l2IndexKey.getBinlogInfo());
	}

	public BinlogInfo getBinlogInfo() {
		return binlogInfo;
	}

	public void setBinlogInfo(BinlogInfo binlogInfo) {
		this.binlogInfo = binlogInfo;
	}
}