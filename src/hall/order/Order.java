package hall.order;

import kitchen.menu.Foot;

import java.util.Map;

public interface Order {
	void writeDownFoot(Integer number, Foot foot);

	void strikeOutFoot(Integer number);

	Map<Integer, Foot> readFootMap();
}
