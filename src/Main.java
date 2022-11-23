import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
   Цель задания
         Научиться работать со списком ArrayList.
   Что нужно сделать
         Разработайте список дел, который управляется командами в консоли. Команды:
         LIST, ADD, EDIT, DELETE.
         Принцип работы команд:

•	LIST — выводит дела с их порядковыми номерами;
•	ADD — добавляет дело в конец списка или дело на определённое место, сдвигая остальные дела вперёд, если указать номер;
•	EDIT — заменяет дело с указанным номером;
•	DELETE — удаляет.
*/
        final String LC_LIST = "LIST";
        final String LC_ADD = "ADD";
        final String LC_EDIT = "EDIT";
        final String LC_DELETE = "DELETE";

        Scanner loScanner = new Scanner(System.in);
        String lvTextBlock = """
                Введите команду из списка:  
                         LIST
                         ADD текст 
                         ADD порядковый номер текст
                         EDIT порядковый номер текст
                         DELETE порядковый номер
                """;
        System.out.println(lvTextBlock);
        String loScannerLine = loScanner.nextLine();
//        String loScannerLine = "ADD 0 Какое-то дело на нулевом месте"; //Test

        ArrayList<String> ltArrayList = new ArrayList<>();

        Teams loTeams = new Teams();

        //Поиск первого слова
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
            //Заменяет дело с указанным номером
//            ltArrayList = executeEDIT();
        }
        //DELETE
        if (lvFirstWordFromScanner.equals(LC_DELETE)) {
            //Удаляет
//            ltArrayList = executeDELETE();
        }

        //Вывод на экран
        loTeams.showList(ltArrayList);
    }
}
