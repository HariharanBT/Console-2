package demo;

import java.util.List;

public class PharmacyViewModel {
	private PharmacyModel pharmacyModel;

	public PharmacyViewModel() {
		this.pharmacyModel = new PharmacyModel();
	}

	public List<Medicine> getAllMedicines() {
		return pharmacyModel.getAllMedicines();
	}

	public void addMedicine(String name, int quantity) {
		pharmacyModel.addMedicine(name, quantity);
	}
}