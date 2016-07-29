package tests;

import model.Hospital;
import model.ReadExcelFile;
import org.junit.Test;
import utils.BinarySearchTree;

import java.util.List;

/**
 * Tests ReadExcelFile
 */
public class ReadExcelFileTest {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String latitude;
    private String longitude;
    private String number;
    private String photo;

    @Test
    public void excelReader() throws Exception {
        BinarySearchTree<Hospital> hospitalBSTree = new BinarySearchTree<Hospital>();
        List hospitalList = ReadExcelFile.excelReader("HospitalList.xls");
        //ReadExcelFile.showExcelData(hospitalList);
        for (int i = 0; i < 124 /*hospitalList.size()*/; i++) {
            List record = (List) hospitalList.get(i); //list row
            // System.out.println(record);
            // System.out.println(record.get(col));
                name = String.valueOf(record.get(0));
                streetAddress = String.valueOf(record.get(1));
                city = String.valueOf(record.get(2));
                state = String.valueOf(record.get(3));
                zip = String.valueOf(record.get(4));
                latitude = String.valueOf(record.get(5));
                longitude = String.valueOf(record.get(6));
                number = String.valueOf(record.get(7));
                photo = String.valueOf(record.get(8));

                Hospital hospital = new Hospital(name, streetAddress, city, state, zip, latitude, longitude, number, photo);
                hospitalBSTree.add(hospital);

            }
            Hospital element;
            int treeSize = hospitalBSTree.reset(BinarySearchTree.INORDER);
            System.out.println("The tree in Inorder is:");
            for(int count = 1; count <= treeSize; count ++) {
                element = hospitalBSTree.getNext(BinarySearchTree.INORDER);
                System.out.println(element);
            }

        }

    }
