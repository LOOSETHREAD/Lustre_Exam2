/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lustre_exam2;

/**
 *
 * @author User
 */
import java.util.Scanner;

class Node {
    String data;
    
    Node next;
    
    public Node(String data){
        this.data = data;
        this.next = null;
        
    }
   
   }
    class CircularLinkedListNames{
        Node head;
        
        public void insert(String name, int position) {
        Node newNode = new Node(name);
        
        if (head == null) {
            head = newNode;
            newNode.next = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (current == head) {
            head = newNode;
        }
    }

    public void print() {
        if (head == null) {
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }
}
    class CircularLinkedListSariSari{
         private Node  head;
         
         public CircularLinkedListSariSari(){
             this.head = null;
         }
         public boolean search(String ProductToFind){
             if(head == null){
                 return false;
                 
             }
             Node current = head;
             do{
                 if(current.data == ProductToFind){
                     return true;
                     
                 }
                 current = current.next;
                 
             }while(current != head);
             return false;
         }
         
         public void delete(String data){
             if(head == null){
                 return;
             }
             if(head.data == data){
                 Node current = head;
                 while(current.next != head){
                     current = current.next;
                     
                 }if(head == head.next){
                     head = null;
                 }else{
                     head = head.next;
                     current.next = head;
                 } 
             }else {
                 Node current = head;
                 Node prev = null;
                 
                 while(current.next != head){
                     prev = current;
                    current = current.next;
                if (current.data == data) {
                    prev.next = current.next;
                    return;
                }
                 }
             }
         

    
         }
         public void display() {
        
        Node current = head;
        do {
            System.out.print(current.data + ", ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
    }

    public class Lustre_Exam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lustre_Exam2 lib = new Lustre_Exam2();
        Scanner scn = new Scanner(System.in);
        
        while(true){
            System.out.println("\nExam 2");
            System.out.println("Questions");
            System.out.println("Number [1]");
            System.out.println("Number [2]");
            System.out.println("Choose Number above");
            int input = scn.nextInt();
            
            if(input == 1){
                while(true){
                    CircularLinkedListNames list = new CircularLinkedListNames();
                Scanner choice = new Scanner(System.in);
                
                System.out.println("Input name: ");
                String name = choice.nextLine();
                System.out.println("Input Position: ");
                int pos = choice.nextInt();
                
                list.insert(name , 0);
                list.insert(name, 1);
                list.insert(name, 2);
                list.insert(name, 3);
                list.insert(name, 4);
                list.insert(name, 5);
                list.insert(name, 6);
                list.insert(name, 7);
                list.insert(name, 8);
                list.insert(name, 9);
                list.print();
                
                
            }
            }
            else if(input == 2){
                CircularLinkedListSariSari list = new CircularLinkedListSariSari();
                Scanner scanner = new Scanner(System.in);
                
                System.out.println("Search a product to buy: ");
                
                
                
            }
    }
        
    
   }
    }
