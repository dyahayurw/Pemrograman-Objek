package pbo_3_inheritance;

import java.util.ArrayList;

class Tim {
    private String nama;
    private ArrayList<Member> member;
    
    public Tim(String nama) {
        this.nama = nama;
        member = new ArrayList<>();
    }
    
    public void addMember(Member m) {
        member.add(m);
    }
        
    public void displayFullMember() {
        System.out.println("MEMBER : " + nama);
        for(Member m : member) {
            m.display();
            System.out.println();
        }
    }
    public void displayTrainee() {
        System.out.println("TRAINEE : " + nama);
        for(Member m : member) {
            if(m instanceof Trainee) {
                Trainee trainee = (Trainee) m;
                trainee.display();
                System.out.println();
            }
        }
    }
}

class Member {
    protected String nama;
    protected int umur;
    
    public Member(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    public void display() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }
}

class Trainee extends Member {
    private int lamaTraining;
    
    public Trainee(String nama, int umur, int lamaTraining) {
        super(nama, umur); 
        this.lamaTraining = lamaTraining;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Lama Training  : " + lamaTraining);
    }
}

public class main {

    public static void main(String[] args) {
        Tim MiB = new Tim("MI B");
        
        Member memb_1 = new Member("Dudi", 19);
        Member memb_2 = new Member("Ade", 21);
        Member memb_3 = new Member("Ahmad", 21);
        
        Member memb_4 = new Trainee("Joni", 25, 5);
        Member memb_5 = new Trainee("Beno", 21, 12);
        Member memb_6 = new Trainee("Husni", 24, 7);
        
        MiB.addMember(memb_1);
        MiB.addMember(memb_2);
        MiB.addMember(memb_3);
        MiB.addMember(memb_4);
        MiB.addMember(memb_5);
        MiB.addMember(memb_6);
        
        MiB.displayFullMember();
        MiB.displayTrainee();
    }
    
}