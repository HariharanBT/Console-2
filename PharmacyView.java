package demo;

import java.util.List;
import java.util.Scanner;

public class PharmacyView {
    private PharmacyViewModel pharmacyViewModel;

    public PharmacyView(PharmacyViewModel pharmacyViewModel) {
        this.pharmacyViewModel = pharmacyViewModel;
    }

    public void showMenu() {
        boolean exitRequested = false;
        Scanner scanner = new Scanner(System.in);

        while (!exitRequested) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addMedicine(scanner);
                    break;
                case 2:
                    viewMedicines();
                    break;
                case 3:
                    exitRequested = true;
                    System.out.println("Exiting Pharmacy Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void printMenu() {
        System.out.println("1. Add Medicine");
        System.out.println("2. View Medicines");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    private void addMedicine(Scanner scanner) {
        System.out.println("Enter medicine name:");
        String name = scanner.next();
        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        pharmacyViewModel.addMedicine(name, quantity);
        System.out.println("Medicine added successfully!");
    }

    private void viewMedicines() {
        List<Medicine> medicines = pharmacyViewModel.getAllMedicines();

        if (medicines.isEmpty()) {
            System.out.println("No medicines found.");
        } else {
            System.out.println("Medicines:");
            for (Medicine medicine : medicines) {
                System.out.println(medicine.getName() + " - Quantity: " + medicine.getQuantity());
            }
        }
    }

    public static void main(String[] args) {
        PharmacyViewModel pharmacyViewModel = new PharmacyViewModel();
        PharmacyView pharmacyView = new PharmacyView(pharmacyViewModel);
        pharmacyView.showMenu();
    }
}
