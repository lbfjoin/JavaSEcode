package com.company.duck;

/**
 * @author lbf
 * @date 2020/7/23 14:44
 */
public class Duck extends Poultry {
    public Duck() {
    }

    public Duck(String name, String symptom, int age, String illness) {
        super(name, symptom, age, illness);
    }

    @Override
    public void showSymptom(){
        System.out.println("症状为：" + getSymptom());
    }



}
