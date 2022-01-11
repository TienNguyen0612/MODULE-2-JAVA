package thuchanh5.main;

import thuchanh5.manager.CadresManager;
import thuchanh5.model.Cadres;
import thuchanh5.model.Engineer;
import thuchanh5.model.Staff;
import thuchanh5.model.Worker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadresManager cadresManager = new CadresManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("--------------MENU-------------");
            System.out.println("| 1. Thêm cán bộ              |");
            System.out.println("| 2. Hiển thị cán bộ theo tên |");
            System.out.println("| 3. Hiển thị tất cả          |");
            System.out.println("| 0. Exit                     |");
            System.out.println("-------------------------------");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int choice1;
                    do {
                        System.out.println("1. Thêm công nhân");
                        System.out.println("2. Thêm kỹ sư");
                        System.out.println("3. Thêm nhân viên");
                        System.out.println("4. Thêm cán bộ");
                        System.out.println("0. Exit");
                        System.out.println("Nhập lựa chọn:");
                        choice1 = scanner.nextInt();
                        switch (choice1) {
                            case 1:
                                Worker worker = (Worker) cadresManager.createCadres(choice1);
                                cadresManager.addCadres(worker);
                                System.out.println("----------------");
                                break;
                            case 2:
                                Engineer engineer = (Engineer) cadresManager.createCadres(choice1);
                                cadresManager.addCadres(engineer);
                                System.out.println("----------------");
                                break;
                            case 3:
                                Staff staff = (Staff) cadresManager.createCadres(choice1);
                                cadresManager.addCadres(staff);
                                System.out.println("----------------");
                                break;
                            case 4:
                                Cadres cadres = cadresManager.createCadres(choice1);
                                cadresManager.addCadres(cadres);
                                System.out.println("----------------");
                                break;

                        }
                    } while (choice1 != 0);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Nhập vào tên cán bộ:");
                    String nameSearch = scanner.nextLine();
                    cadresManager.searchByName(nameSearch);
                    System.out.println("----------------");
                    break;
                case 3:
                    cadresManager.displayAll();
                    System.out.println("----------------");
                    break;
            }
        } while (choice != 0);
    }
}
