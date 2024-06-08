package o.inheritanceandpolymorphism;
class PlantTypes {// Superclass (parent)
    public void plantkind(){

    }
}
class annuals extends PlantTypes {
    @Override
    public void plantkind() {
        super.plantkind();//Call the superclass method
        System.out.println("Annuals complete their entire life cycle in one year. ");
    }
}
class biennials extends PlantTypes {
    public void plantkind() {
        super.plantkind();//Call the superclass method
        System.out.println("Biennials take two years to complete their life cycle.");
    }
}
class perennials extends PlantTypes {
    public void plantkind() {
        super.plantkind();//Call the superclass method
        System.out.println("Perennials take three years to complete their life cycle.");
    }
}

