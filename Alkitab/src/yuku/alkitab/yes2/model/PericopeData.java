package yuku.alkitab.yes2.model;

import java.util.ArrayList;
import java.util.List;

public class PericopeData {
	public static class Entry {
		public int ari;
		public Block block;
	}
	public static class Block {
		public String title;
		public List<String> parallels;
		
		public int _offset = -1;
		
		public void addParallel(String parallel) {
			if (parallels == null) parallels = new ArrayList<String>();
			parallels.add(parallel);
		}
	}
	
	public List<Entry> entries;
	
	public void addEntry(Entry e) {
		if (entries == null) entries = new ArrayList<Entry>();
		entries.add(e);
	}
}
