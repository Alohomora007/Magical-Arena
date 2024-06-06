import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int health,strength,attack;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Health of Player A:");
        health=sc.nextInt();
        System.out.println("Enter Strength of Player A:");
        strength=sc.nextInt();
        System.out.println("Enter Attack value of Player A:");
        attack=sc.nextInt();
        Player player1 = new Player(health, strength, attack);
        System.out.println("Enter Health of Player B:");
        health=sc.nextInt();
        System.out.println("Enter Strength of Player B:");
        strength=sc.nextInt();
        System.out.println("Enter Attack value of Player B:");
        attack=sc.nextInt();
        Player player2 = new Player(health, strength, attack);
        Arena arena = new Arena(player1, player2);
        arena.startFight();
    }
}