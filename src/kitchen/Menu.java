package kitchen;

import kitchen.menu.Foot;

import java.util.HashMap;

public class Menu {
	private static Menu instance;

	private HashMap<Integer, Foot> footHashMap;

	private Menu(HashMap<Integer, Foot> footHashMap) {
		this.footHashMap = footHashMap;
	}

	public static Menu getInstance() {
		if (instance==null) {
			instance = new Menu(new HashMap<>());
		}
		return instance;
	}

	public void set(Integer number, Foot foot) {
		instance.footHashMap.put(number, foot);
	}

	public HashMap<Integer, Foot> getFootHashMap() {
		return footHashMap;
	}
}
