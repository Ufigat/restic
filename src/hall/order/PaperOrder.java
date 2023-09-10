package hall.order;

import kitchen.menu.Foot;

import java.util.Map;

public class PaperOrder implements Order {

	private Map<Integer, Foot> footMap;

	public PaperOrder(Map<Integer, Foot> footMap) {
		this.footMap = footMap;
	}

	public void writeDownFoot(Integer number, Foot foot) {
		this.footMap.put(number, foot);
	}

	public void strikeOutFoot(Integer number) {
		this.footMap.remove(number);
	}

	public Map<Integer, Foot> readFootMap() {
		return this.footMap;
	}
}
