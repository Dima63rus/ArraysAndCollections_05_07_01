import java.util.ArrayList;

public class Teams {
    private final ArrayList<String> mtArrayList = new ArrayList<>();

    /*
        method executeList

        ������� ���� � �� ����������� ��������
    */
    public ArrayList<String> executeList() {
        for (int i = 0; i < mtArrayList.size(); i++) {
            System.out.println((i + 1) + mtArrayList.get(i));
        }
        return mtArrayList;
    }

    /*
        method executeADD

        ��������� ���� � ����� ������ ��� ���� �� ����������� �����, ������� ��������� ���� �����,
        ���� ������� �����
    */
    public ArrayList<String> executeADD(String ioScannerStr,
                                        String[] itWordsFromScanner) {
        StringBuilder lvTextAfterAdd = new StringBuilder();
//        String lvTextAfterAdd = "";
        int lvPozNumber = 0;

        try {
            //�������� �� ����� � ������ ����� ������� �����
            int intValue = Integer.parseInt(itWordsFromScanner[1]);

            //� ���������� �������
            for (int i = 1; i < itWordsFromScanner.length; i++) {
                if (i == 1) {
                    lvPozNumber = Integer.parseInt(itWordsFromScanner[i]);
                } else {
                    lvTextAfterAdd.append(itWordsFromScanner[i]);
                    lvTextAfterAdd.append(" ");
//                    lvTextAfterAdd += itWordsFromScanner[i] + " ";
                }
            }
            //�������� � ������ � ���������� �������
            if (lvPozNumber > mtArrayList.size()) {
                System.out.println("������� " + lvPozNumber + " ��������� ������ ������ " + mtArrayList.size());
                //����� �� ���������
                System.exit(0);
            }
            mtArrayList.add(lvPozNumber, lvTextAfterAdd.toString().trim());
//            mtArrayList.add(lvPozNumber, lvTextAfterAdd.trim());
        } catch (NumberFormatException e) {
            //��� �����������
            for (int i = 1; i < itWordsFromScanner.length; i++) {
                lvTextAfterAdd.append(itWordsFromScanner[i]);
                lvTextAfterAdd.append(" ");
//                lvTextAfterAdd += itWordsFromScanner[i] + " ";
            }
            //�������� � ������
            mtArrayList.add(lvTextAfterAdd.toString().trim());
//            mtArrayList.add(lvTextAfterAdd.trim());
        }
        return mtArrayList;
    }

    public void showList(ArrayList<String> itArrayList) {
        for (int i = 0; i < itArrayList.size(); i++) {
            System.out.println(itArrayList.get(i));
        }
    }
}