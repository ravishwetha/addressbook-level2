package seedu.addressbook.data.tag;

import java.util.ArrayList;

public class Taggings {
	
	private static ArrayList<Tag> taggings = new ArrayList<Tag>();
	
	public static void addTag(Tag tag) {
		taggings.add(tag);
	}
	
	public static String allTagsString() {
		String allTags = "";
		for(int i=0; i<taggings.size(); i++) {
			allTags.concat(taggings.get(i).toString());
			
			if(i != taggings.size() -1) {
				allTags.concat("\n");
			}
		}
		
		return allTags;
	}
}