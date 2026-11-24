import java.util.Scanner;
void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Aukeratu betekizuna: ");
    System.out.println("1. Trena bilatu");
    System.out.println("2. Biletea erosi");
    System.out.println("3. Erreserba aldatu ");
    System.out.println("4. Irten");
    int aukera=sc.nextInt();
    while (aukera!=4){
        switch (aukera){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Aukekera ez da egokia:");
        }
        aukera=sc.nextInt();
    }
}