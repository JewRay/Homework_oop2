public interface Trailer {

    default void updateTrailer(){
        System.out.println("Проверяем прицеп");
    }
    default void checkTrailer(Transport transport){
        transport.updateTrailer();
    }
}
