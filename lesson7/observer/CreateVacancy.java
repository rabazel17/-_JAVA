package OOP_Java.lesson7.observer;
public interface CreateVacancy {

    public default String createVacancy(){
        Vacancy vac = new Vacancy();
         return vac.nameVacancy;
    }
    
}