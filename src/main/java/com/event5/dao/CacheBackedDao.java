package com.event5.dao;

import java.util.List;
import java.util.ListIterator;

import com.monkeylearn.MonkeyLearn;
import com.monkeylearn.MonkeyLearnResponse;
import com.monkeylearn.MonkeyLearnException;
import com.event5.assets.Keys;
import com.event5.model.Event;

public class CacheBackedDao {
	public static String classify(String query) throws MonkeyLearnException {
		System.out.println(query);
		
	    MonkeyLearn ml = new MonkeyLearn(Keys.ML_KEY);
	    String[] trainList = new String[1];
	    trainList[0] = query;
	    MonkeyLearnResponse res = ml.classifiers.classify(Keys.ML_MODULE_ID, trainList, true);
	    System.out.println( res.arrayResult );
	    
		return res.arrayResult.toString();
	}
	
	public static List<Event> filter(List<Event> events, String category) throws MonkeyLearnException {
		ListIterator<Event> it = events.listIterator();
		while (it.hasNext()) {
			Event current = it.next();
			String description = current.getDescription();

					if (!category.equals(classify(description))) {
						it.remove();
					}

		}
		
		return events;
	}
}
