import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        int age = 25;
        if (age >=18) {
            System.out.println("Поздравляю с совершеннолетием ");
        }
        if (age < 18) {
            System.out.println("Тебе еще рано праздновать ");
        }
        int age1 = 6;
        if (age1 >= 7){
            System.out.println("Можешь отправляться в школу");
        }
        if (age1 < 7){
            System.out.println("Тебе еще рано в школу, дуй в сад ");
        }
        int age2 = 19;
        if (age2 >= 18){
            System.out.println("Школа окончена, пора в универ");
        }
        if (age2 < 18) {
            System.out.println("Будь любезен, сначало окончи школу ");
        }
        int wagonCapacity = 59;
        if (wagonCapacity == 60) {
            System.out.println("В вагоне нет сидячих мест ");
        }
        if (wagonCapacity < 102) {
            System.out.println("В вагоне есть место");
        }
        if (wagonCapacity < 60) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (wagonCapacity > 60) {
            System.out.println("В вагоне остались только стоячие места");
        }
        int age3 = 17;
        if (age3 >=18){
            System.out.println("Поздравляю с совершеннолетием");
        } else {
            System.out.println("Тебя еще рано праздновать");
        }
        int age4 = 6;
        if (age4 >=7){
            System.out.println("Ребенок может ходить в школу ");
        }else {System.out.println("Ребенку еще рано в школу");}
        int age5 = 17;
        if (age5 >=18){
            System.out.println("Человек можут отправляться в университет");
        } else {System.out.println("В университет еще рано ");}

        int wagonCapacity1 = 59;
        if (wagonCapacity1 == 102) {
            System.out.println("В вагоне нет мест");
        }else {System.out.println("В вагоне есть место");}
        if (wagonCapacity1 < 60){
            System.out.println("В вагоне есть сидячие места");
        } else {System.out.println("В вагоне нет сидячих мест");}
        boolean kindergarten = age >2 || age <6;
        if (kindergarten){
            System.out.println("Если возраст человека от 2х до 6 лет, он должен ходить в садик ");
        } else {System.out.println("В садик ходить не надо");}
        boolean school = age > 7 || age <18;
        if (school){
            System.out.println("Если возраст человека от 7 до 18 лет, он должен ходить в школу ");
        }else {System.out.println("В школу ходить не надо");}
        boolean student = age > 18 || age <24;
        if (student){
            System.out.println("Если человеку больше 18 но меньше 24х лет, он должен учиться в университете ");
        }else {System.out.println("В университет еще рано");}
        boolean work = age > 24;
        if (work){
            System.out.println("Если человеку больше 24 лет, ему пора работать");
        }else {System.out.println("На работу еще рано, доучись");}
        int child = 14;
        if (child <=5){
            System.out.println("Ребенок  может кататься");
        } else {System.out.println("Ребеок не может кататься");}
        if (child >= 6 || child < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого");
        } else {System.out.println("Ребенок может кататься");}
        if (child >=14){
            System.out.println("Ребенок может кататься сам");
        } else {System.out.println("Ребенок не может кататься");}

        int one = 1;
        int two = 2;
        int tree = 3;

        if (one<two || two < tree){
            System.out.println("Три болше двух и два болше одного");
        }else {System.out.println("Все не верно");}











    }

}