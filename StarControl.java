class Ship {
    String  name;
    int hp;
    public Ship (String name,int hp){
        this.name= name;
        this.hp =hp;
    }
}
public class StarControl {
    public static void main(String[] args) {
        Ship ship1,ship2;
        ship1 = new Ship ("fenix",10);
        ship2 = new Ship ("falcon-9",15);
        while (ship1.hp>0 && ship2.hp>0){
            ship1.hp =ship1.hp- (int)(Math.random()*3);
            ship2.hp =ship2.hp- (int)(Math.random()*4);
            System.out.println (ship1.name +'\t'+ship1.hp+"\t\t"+ship2.name +'\t'+ship2.hp);
        }



    }
}
