public abstract class Barrier {
    public abstract void doIt(Competitor competitor);
}




//
//class MainCross {
//    public static void main(String[] args) {
//        Competitor[] competitors = {new Player2("Bob"), new Player3("Vaska"), new Player1("Sharik")};
//        Barrier[] barriers = {};
//
//        for (Competitor c : competitors) {
//            for (Barrier b : barriers) {
//                b.doIt(c);
//                if (!c.isOnDistance()) {
//                    break;
//                }
//            }
//        }
//        for (Competitor c : competitors) {
//            c.info();
//        }
//    }
//}