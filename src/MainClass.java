import java.util.Date;
import java.util.Scanner;

public class MainClass {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner  = new Scanner(System.in);
        String command = null;
        Phone phone = null;
        while(true){
            command = scanner.nextLine();
            if(command.equals("СЃРѕР·РґР°С‚СЊ")){
                phone = createPhone();
                phone.add(phone);
            }
        }
    }
    private static Phone createPhone() {
            System.out.println("Р’РІРµРґРё РІР»Р°РґРµР»СЊС†Р°");
            String owner = scanner.nextLine();
            System.out.println("Р’РІРµРґРё РѕРїРёСЃР°РЅРёРµ");
            String info = scanner.nextLine();
            Phone phone = new Phone(owner,info,(double) 1000, new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis() + 573745734));
            return phone;
        }
}