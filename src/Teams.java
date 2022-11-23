import java.util.ArrayList;

public class Teams {
    private final ArrayList<String> mtArrayList = new ArrayList<>();

    /*
        method executeList

        Выводит дела с их порядковыми номерами
    */
    public ArrayList<String> executeList() {
        for (int i = 0; i < mtArrayList.size(); i++) {
            System.out.println((i + 1) + mtArrayList.get(i));
        }
        return mtArrayList;
    }

    /*
        method executeADD

        Добавляет дело в конец списка или дело на определённое место, сдвигая остальные дела вперёд,
        если указать номер
    */
    public ArrayList<String> executeADD( String[] itWordsFromScanner) {
        StringBuilder lvTextAfterAdd = new StringBuilder();
        int lvPozNumber = 0;
        try {
            //Проверка на число в строке после первого слова
            int intValue = Integer.parseInt(itWordsFromScanner[1]);

            //С порядковым номером
            for (int i = 1; i < itWordsFromScanner.length; i++) {
                if (i == 1) {
                    lvPozNumber = Integer.parseInt(itWordsFromScanner[i]);
                } else {
                    lvTextAfterAdd.append(itWordsFromScanner[i]);
                    lvTextAfterAdd.append(" ");
                }
            }
            //Добавить в список с порядковым номером
            if (lvPozNumber > mtArrayList.size()) {
                System.out.println("Позиция " + lvPozNumber + " превышает длинну списка " + mtArrayList.size());
                //Выход из программы
                System.exit(0);
            }
            mtArrayList.add(lvPozNumber, lvTextAfterAdd.toString().trim());
        } catch (NumberFormatException e) {
            //Без порядкового
            for (int i = 1; i < itWordsFromScanner.length; i++) {
                lvTextAfterAdd.append(itWordsFromScanner[i]);
                lvTextAfterAdd.append(" ");
            }
            //Добавить в список
            mtArrayList.add(lvTextAfterAdd.toString().trim());
        }
        return mtArrayList;
    }

    public void showList(ArrayList<String> itArrayList) {
        for (int i = 0; i < itArrayList.size(); i++) {
            System.out.println(itArrayList.get(i));
        }
    }
}