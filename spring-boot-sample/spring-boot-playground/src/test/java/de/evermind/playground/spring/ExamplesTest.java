package de.evermind.playground.spring;

import static java.lang.System.out;
import static java.util.Map.entry;
import static java.util.stream.Collectors.toUnmodifiableList;
import static java.util.stream.Collectors.toUnmodifiableMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

class ExamplesTest {

	@Test
	void show() {
		out.println(show(1));
	}

	@SuppressWarnings("preview")
	private String show(int i) {
		return switch (i) {
		case 1 -> "eenie";
		case 2, 3 -> "meenie";
		case 4, 5, 6 -> "miney";
		default -> "mo";
		};
	}

	@Test
	void varStyles() {
		StringBuilder oldString = new StringBuilder();

		var varString = new StringBuilder();

		Map<String, Integer> oldMap = new HashMap<>();

		final var varMap = new HashMap<String, Integer>();
	}

	@Test
	void collectionFactories() {
		var list = List.of(1, 2, 3);

		var list2 = List.copyOf(list);

		var list3 = list.stream().map(Object::toString).collect(toUnmodifiableList());

		var set = Set.of("1", "2", "3");

		var set2 = Set.copyOf(set);
	}

	@Test
	void mapFactories() {
		var map1 = Map.of(1, "1");

		var map2 = Map.of(1, "1", 2, "2", 3, "3"); // up to 10

		var mapN = Map.ofEntries(entry(1, "1"), entry(2, "2"));

		var list = List.of(1, 2, 3);
		var map = list.stream().collect(toUnmodifiableMap(i -> i, Object::toString));

		// { 1, "1" }, { 2, "2" }, {3, "3" }

	}
}
