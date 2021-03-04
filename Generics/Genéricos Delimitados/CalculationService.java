package aulas;

import java.util.List;

public class CalculationService {
	
	//"T extends Comparable<T>" é necessário para o "compareTo()" funcionar.
	public static<T extends Comparable<T>> T max(List<T> list) {
		
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty.");
		}
		
		T max = list.get(0);
		for (T item: list) {
			//verifica se o "item" é maior que o "max".
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
