public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(200);
        boss.setDamage(300);
        boss.veapon.setWeaponName("kalashnikov");
        boss.veapon.setWeaponType(WeaponType.FIRE);
        System.out.println( "zdorove bossa: " + boss.getHealth() + "\n uron bossa: " +
                boss.getDamage() + "\n nazvanie orujie: " + boss.veapon.getWeaponName()
                + "\n tip orujie: " +  boss.veapon.getWeaponType());


    }













}