package com.company.duck1;

/**
 * @author lbf
 * @date 2020/7/23 19:40
 */
public class Duck extends Poultry {
    public Duck() {
    }

    public Duck(String name, String symptom, int age, String illness) {
        super(name, symptom, age, illness);
    }
    @Override
    public void showSymptom(){
        System.out.println("患病症状:" + getSymptom());
    }
}
