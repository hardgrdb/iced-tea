package scene;

import java.util.HashMap;

import visual.dynamic.SlidingSprite;
import visual.dynamic.described.RuleBasedSprite;
import visual.dynamic.described.Stage;
import data.Environment;

public abstract class Scene extends Stage {

	private RuleBasedSprite[] addedSprites;
	private RuleBasedSprite[] slidingSprites;
	private Environment environment;
	private HashMap<RuleBasedSprite, Integer> slidingMap;
	
}
