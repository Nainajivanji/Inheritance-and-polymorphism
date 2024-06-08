package o.inheritanceandpolymorphism;

public class Plants {
    public static void main(String[] args) {
        System.out.println("These plants are of the garden variety:");
PlantTypes annuals= new annuals();//Create annuals object
PlantTypes biennials= new biennials();//Create biennials object
PlantTypes perennials=new perennials();//Create a perennials object
annuals.plantkind();
biennials.plantkind();
perennials.plantkind();
    }
}
