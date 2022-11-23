import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
   ÷ель задани€
         Ќаучитьс€ работать со списком ArrayList.
   „то нужно сделать
         –азработайте список дел, который управл€етс€ командами в консоли.  оманды:
         LIST, ADD, EDIT, DELETE.
         ѕринцип работы команд:

Х	LIST Ч выводит дела с их пор€дковыми номерами;
Х	ADD Ч добавл€ет дело в конец списка или дело на определЄнное место, сдвига€ остальные дела вперЄд, если указать номер;
Х	EDIT Ч замен€ет дело с указанным номером;
Х	DELETE Ч удал€ет.
*/
        final String LC_LIST = "LIST";
        final String LC_ADD = "ADD";
        final String LC_EDIT = "EDIT";
        final String LC_DELETE = "DELETE";

        Scanner loScanner = new Scanner(System.in);
        String lvTextBlock = """
                ¬ведите команду из списка:
                         LIST
                         ADD текст
                         ADD пор€дковый номер текст
                         EDIT пор€дковый номер текст
                         DELETE пор€дковый номер
                """;
        System.out.println(lvTextBlock);
        String loScannerLine = loScanner.nextLine();

        ArrayList<String> ltArrayList = new ArrayList<>();

        Teams loTeams = new Teams();

        //ѕоиск первого слова
        String[] ltWordsFromScanner = loScannerLine.split("\\s+");
        String lvFirstWordFromScanner = ltWordsFromScanner[0];

        //LIST
        if (lvFirstWordFromScanner.equals(LC_LIST)) {
            ltArrayList = loTeams.executeList();
        }
        //ADD
        if (lvFirstWordFromScanner.equals(LC_ADD)) {
            ltArrayList = loTeams.executeADD(ltWordsFromScanner);
        }
        //EDIT
        if (lvFirstWordFromScanner.equals(LC_EDIT)) {
            ltArrayList = loTeams.executeEDIT(ltWordsFromScanner);
        }
        //DELETE
        if (lvFirstWordFromScanner.equals(LC_DELETE)) {
            ltArrayList = loTeams.executeDELETE(ltWordsFromScanner);
        }

        //¬ывод на экран
        loTeams.showList(ltArrayList);
    }
}
