package controllers;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.Employee;
import models.Restapi;
import views.MainConsole;

public class MainController {
    MainConsole mainConsole;
    public MainController() {
        this.mainConsole = new MainConsole();
        this.showEmp();
    }
    private void showEmp() {
        Restapi restapi = new Restapi();
        String res = restapi.getEmployees();
        ArrayList<Employee> empList = convertStringToArray(res);
        this.mainConsole.printEmployees(empList);
    }

    private ArrayList<Employee> convertStringToArray(String text) {
        ArrayList<Employee> empList = null;
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Employee[] empArray = gson.fromJson(text, Employee[].class);
        empList = new ArrayList<>(Arrays.asList(empArray));
        return empList;
    }
}
