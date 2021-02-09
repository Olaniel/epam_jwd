package hw.task.app;

import hw.task.data.DataReader;
import hw.task.data.DbService;
import hw.task.parser.ApplianceParser;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        File inputFile = new File("src/resources/appliances_db.txt");
/*
        Т.к. в исходном файле нет ни одной записи с единицей техники типа "kettle",
        а также такого параметра, как "PRICE", для демонстрации работы
        алгоритма заданы другие параметры, которые можно изменить
        при добавлении в таблицу исходных данных записей, отвечающих
       требованиям, указанным в задаче. В противном случае результат будет нулевым
*/
        String appliance = "laptop"; //Здесь можно задать тип искомой техники

        String parameterName = "SYSTEM_MEMORY"; //Здесь можно задать искомый параметр

        List<String> appliances = new DataReader().readToList(inputFile);
        DbService dbService = new DbService();
        ApplianceParser applianceParser = new ApplianceParser();

        List<String> chosenAppliances = applianceParser.chooseToList(appliance, appliances);

        if (chosenAppliances.size() != 0) {
            Double minValue = dbService.findMinValue(chosenAppliances, parameterName);
            if (minValue != null) {
                dbService.printAppliancesWithParameterEquals(chosenAppliances, parameterName, minValue);
            } else {
                System.out.println("There is no such parameter");
            }
        } else {
            System.out.println("There is no such appliance type");
        }
    }

}
