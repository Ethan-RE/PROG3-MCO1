import VendingMachine.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * A class representing a factory
 */
public class Factory {
    private NewRegVendMachine vm;
    
    //VM creation
    /*
    public void inputItem(NewRegVendMachine vm, int itemNum) {
        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i<itemNum ; i++) {
            String tempName = "\n";
            double tempPrice = 0;
            double tempCal = 0;
            int stock = 0;
            System.out.printf("\nItem #%d\n", i+1);

            do {
                System.out.printf("Enter item name: ");
                tempName = input.nextLine();
                if (tempName.equals("\n")) System.out.printf("\nNAME CANNOT BE EMPTY\n");
                else if (vm.checkIfItemExists(tempName)) System.out.printf("\nITEM ALREADY EXISTS\n");
            } while (tempName.equals("\n")||vm.checkIfItemExists(tempName));

            do {
                try {
                    System.out.printf("Enter item price (php): ");
                    tempPrice = input.nextDouble();       
                }
                catch (InputMismatchException e) {
                    System.out.printf("\nINVALID INPUT\n");
                    input.nextLine();
                }
                if (tempPrice<0) System.out.printf("\nPRICE CANNOT BE NEGATIVE\n");
            } while (tempPrice<0);
            
            input.nextLine();

            do {
                try {
                    System.out.printf("Enter item calories: ");
                    tempCal = input.nextDouble();       
                }
                catch (InputMismatchException e) {
                    System.out.printf("\nINVALID INPUT\n");
                    input.nextLine();
                }
                if (tempCal<0) System.out.printf("\nCALORIES CANNOT BE NEGATIVE\n");
            } while (tempCal<0);

            do {
                try {
                    System.out.printf("Enter item stock: ");
                    stock = input.nextInt();       
                }
                catch (InputMismatchException e) {
                    System.out.printf("\nINVALID INPUT\n");
                    input.nextLine();
                }
                if (stock<0) System.out.printf("\nSTOCK CANNOT BE NEGATIVE\n");
                else if (stock>this.vm.MAX_ITEMS) System.out.printf("\nSTOCK CANNOT BE GREATER THAN 16\n");
            } while (stock<0);

            input.nextLine();

            vm.addNewItemStack(new Item(tempName, tempPrice, tempCal));
            vm.stockItem(i, stock);
        }
    }
    */

    public void createVM() {
        this.newVM = new NewRegVendMachine();
    }

    //VM testing
    public void testVM() {
        Scanner input = new Scanner(System.in);
        int x = -1;
        do {
            System.out.printf("\nVENDING MACHINE TEST MENU\n");
            System.out.printf("1. Back\n2. Vending Features\n3. Maintenance Feature");
            try {
                System.out.printf("\nINPUT: ");
                x = input.nextInt();       
            }
            catch (InputMismatchException e) {
                System.out.printf("\nINVALID INPUT\n");
                input.nextLine();
            }
            switch (x) {
                case 1: 
                    break;
                case 2:
                    this.vm.featuresVending();
                    break;
                case 3:
                    this.vm.featuresMaintenance();
                    break;
                default:
                    System.out.printf("\nINVALID INPUT\n");
            }
        } while (x!=1);
    }
}