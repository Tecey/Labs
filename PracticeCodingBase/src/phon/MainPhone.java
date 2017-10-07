package phon;


public class MainPhone {
    public static void main (String [] args){
        Phone iPhone = new Phone();
        iPhone.setColor ("green");
        iPhone.setType (" X ");

        System.out.println("COLOR - " + iPhone.getColor());
        System.out.println("TYPE - " + iPhone.getType());
    }
}
