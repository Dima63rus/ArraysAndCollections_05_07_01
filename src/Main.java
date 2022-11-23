import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
   ���� �������
         ��������� �������� �� ������� ArrayList.
   ��� ����� �������
         ������������ ������ ���, ������� ����������� ��������� � �������. �������:
         LIST, ADD, EDIT, DELETE.
         ������� ������ ������:

�	LIST � ������� ���� � �� ����������� ��������;
�	ADD � ��������� ���� � ����� ������ ��� ���� �� ����������� �����, ������� ��������� ���� �����, ���� ������� �����;
�	EDIT � �������� ���� � ��������� �������;
�	DELETE � �������.
*/
        final String LC_LIST = "LIST";
        final String LC_ADD = "ADD";
        final String LC_EDIT = "EDIT";
        final String LC_DELETE = "DELETE";

        Scanner loScanner = new Scanner(System.in);
        String lvTextBlock = """
                ������� ������� �� ������:  
                         LIST
                         ADD ����� 
                         ADD ���������� ����� �����
                         EDIT ���������� ����� �����
                         DELETE ���������� �����
                """;
        System.out.println(lvTextBlock);
        String loScannerLine = loScanner.nextLine();
//        String loScannerLine = "ADD 0 �����-�� ���� �� ������� �����"; //Test

        ArrayList<String> ltArrayList = new ArrayList<>();

        Teams loTeams = new Teams();

        //����� ������� �����
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
            //�������� ���� � ��������� �������
//            ltArrayList = executeEDIT();
        }
        //DELETE
        if (lvFirstWordFromScanner.equals(LC_DELETE)) {
            //�������
//            ltArrayList = executeDELETE();
        }

        //����� �� �����
        loTeams.showList(ltArrayList);
    }
}
