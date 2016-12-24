package com.practice;

/*Имеется три стержня, на один из которых нанизаны N колец, причем кольца отличаются

размером и лежат меньшее на большем. Требуется перенести пирамиду из N колец с одного

стержня на другой за наименьшее число ходов. За один раз разрешается переносить только

одно кольцо, причём нельзя класть большее кольцо на меньшее.
 */
public class HanoiTower {


    private int count = 0;

    private void getHanoi(int n,String a,String b,String c){

        if(n>0){
            getHanoi(n-1,a,c,b);

            System.out.println(a + "-->" + b);
            count++;
            getHanoi(n-1,c,b,a);

        }
    }

    public static void main(String[] args) {
        HanoiTower tower = new HanoiTower();
        tower.getHanoi(10,"A","B","C");
        System.out.println(tower.count);
    }
}
