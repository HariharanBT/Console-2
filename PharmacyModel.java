package demo;

import java.util.ArrayList;
import java.util.List;

public class PharmacyModel {
	private List<Medicine> medicines;

	public PharmacyModel() {
		medicines = new ArrayList<>();
	}

	public List<Medicine> getAllMedicines() {
		return new ArrayList<>(medicines);
	}

	public void addMedicine(String name, int quantity) {
		Medicine medicine = findMedicine(name);
		if (medicine == null) {
			medicines.add(new Medicine(name, quantity));
		} else {
			medicine.addQuantity(quantity);
		}
	}

	private Medicine findMedicine(String name) {
		for (Medicine medicine : medicines) {
			if (medicine.getName().equalsIgnoreCase(name)) {
				return medicine;
			}
		}
		return null;
	}
}