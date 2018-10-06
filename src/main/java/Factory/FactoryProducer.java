package Factory;

//factory method
public class FactoryProducer {
    public AbstractFactory getFactory(String typeFactory){
        if (typeFactory.equalsIgnoreCase("dev")){
            return new DevelopFactory();
        }else if (typeFactory.equalsIgnoreCase("prod")){
            return new ProductionFactory();
        }
        else {
            return null;
        }
    }

}
