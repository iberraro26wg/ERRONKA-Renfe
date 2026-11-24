import java.util.Scanner;
void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Aukeratu betekizuna: ");
    System.out.println("1. Trena bilatu");
    System.out.println("2. Biletea erosi");
    System.out.println("3. Erreserba kontsultatu");
    System.out.println("4. Erreserba aldatu ");
    System.out.println("5. Erreserba ezabatu");
    System.out.println("6. Irten");
    int aukera=sc.nextInt();
    while (aukera!=6){
        switch (aukera){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Aukekera ez da egokia:");
        }
        System.out.println("Aukeratu betekizuna: ");
        System.out.println("1. Trena bilatu");
        System.out.println("2. Biletea erosi");
        System.out.println("3. Erreserba kontsultatu");
        System.out.println("4. Erreserba aldatu ");
        System.out.println("5. Erreserba ezabatu");
        System.out.println("6. Irten");
        aukera=sc.nextInt();
    }
}