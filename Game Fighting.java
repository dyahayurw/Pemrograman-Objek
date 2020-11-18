package com.yoman;

class Player{
    String name;
    double lifepoint;
    int level;
    Attack attack;
    Kick kick;

        Player(String name, double lifepoint){
            this.name = name;
            this.lifepoint = lifepoint;
        }

        void kick(Player opponent){
            double kickhitpoint = this.kick.kickhitpoint;
            System.out.println(this.name+" kick "+opponent.name);
            opponent.defend(kickhitpoint);
            this.lifepoint -= kickhitpoint;
                System.out.println(this.name+" gets damage "+kickhitpoint);
        }

        void attack(Player opponent){
            double attackhitpoint = this.attack.attackhitpoint;
            System.out.println(this.name+" attack "+opponent.name);
            opponent.defend(attackhitpoint);
            this.lifepoint -= attackhitpoint;
                System.out.println(this.name+" gets damage "+attackhitpoint);
        }

        void defend(double attackhitpoint){
            System.out.println(this.name + " gets damage "+attackhitpoint);

    }

    void equipAttack(Attack attack){
        this.attack = attack;
    }

    void equipKick(Kick kick){
        this.kick = kick ;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Lifepoint : " + this.lifepoint + " hp");
        this.attack.display();
        this.kick.display();
    }
}

class Attack{
    double attackhitpoint;
    String name;

    Attack(String name, double attackhitpoint){
        this.name = name;
        this.attackhitpoint = attackhitpoint;
    }
    void display(){
        System.out.println("Attack : " + this.name + " , damage : " + this.attackhitpoint);
    }
}

class Kick{
    double kickhitpoint;
    String name;

    Kick(String name, double kickhitpoint){
        this.name = name;
        this.kickhitpoint = kickhitpoint;
    }

    void display(){
        System.out.println("Kick : " + this.name + " , damage : " + this.kickhitpoint);
    }
}

public class Game{

    public static void main(String[] args) {
        
        Player player1 = new Player("Raiden",100);
        Player player2 = new Player("Sub-Zero",100);

        Attack highpunch = new Attack("Highpunch",10);
        Attack lowpunch = new Attack("Lowpunch",5);

        Kick lowkick = new Kick("Lowkick",20);
        Kick highkick = new Kick("Highkick",25);

        player1.equipAttack(highpunch);
        player1.equipKick(lowkick);
        player1.display();

        player2.equipAttack(lowpunch);
        player2.equipKick(highkick);
        player2.display();

        System.out.println("\nSTART");

        System.out.println("WAR 1");
        player1.kick(player2);
        player1.display();
        player2.display();

        System.out.println("\nWAR 2");
        player2.kick(player1);
        player1.display();
        player2.display();

        System.out.println("\nWAR 3");
        player1.attack(player2);
        player1.attack(player2);
        player1.attack(player2);
        player1.display();
        player2.display();

        System.out.println("\nWAR 4");
        player2.attack(player1);
        player2.attack(player1);
        player2.attack(player1);
        player2.attack(player1);
        player1.display();
        player2.display();
        
        System.out.println("\nSub-Zero WIN");
    }
}