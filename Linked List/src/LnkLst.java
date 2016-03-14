import java.util.*;

    public class LnkLst {
        public static LinkedList<String> lst1 = new LinkedList<String>();
        public static String m = "";
        public static int n = 0; //ctr=0, num=0;
        public static Scanner scan = new Scanner(System.in);
        public static void main(String[] args) {

            Main();
            InsertMenu();
            DeleteOpt();
        }

        public static void Main() {
            Scanner scan=new Scanner(System.in);
            System.out.println("1,Insert\n2,Delete\n3,Retrieve\n4,Exit\n");
            System.out.print("Choose from 1 - 4 : ");
            n=scan.nextInt();

            if (n == 1) {
                InsertMenu();
            }
            else if(n==2) {
                DeleteOpt();
        }
            else if(n==3) {
                RetrieveOpt();
        }
            else if (n == 4) {
                System.exit(0);
            }
        }

        //Insert menu of Main
        public static void InsertMenu() {
            Scanner scan=new Scanner(System.in);
            System.out.println("1,Insert as Head\n2,Insert as Tail\n3,Insert as Specific Index\n");
            System.out.print("Choose from 1 - 3 : ");
            n=scan.nextInt();

            if(n==1) {
                InsertHead();
            }
            else if(n==2) {
                InsertTail();
            }
            else if(n==3) {
                InsertSpecificIndex();
            }
        }
        public static void InsertHead() {
            System.out.print("Enter a string: ");
            m = scan.nextLine();
            lst1.addFirst(m);
            System.out.println(lst1);
            Main();
        }

        public static void InsertTail() {
            System.out.print("Enter a string: ");
            m = scan.nextLine();
            lst1.addLast(m);
            System.out.println(lst1);
            Main();
        }

        public static void InsertSpecificIndex() {
            String a, b;
            Scanner scn=new Scanner(System.in);
            System.out.print("Insert what word: ");
            a=scn.nextLine();
            System.out.print("Insert on what index: ");
            b=scn.nextLine();

            int index=Integer.parseInt(b);
            lst1.add(index, a);
            System.out.println(lst1);
            Main();
        }

        //Main - Delete Operation
        public static void DeleteOpt() {
            Scanner scan=new Scanner(System.in);
            System.out.println("1,Delete Head\n2,Delete Tail\n3,Delete Index\n");
            System.out.print("Choose from 1 - 3 : ");
            n=scan.nextInt();

            if(n==1) {
                DeleteHead();
            }
            else if(n==2) {
                DeleteTail();
            }
            else if(n==3) {
                DeleteIndex();
            }
        }

        public static void DeleteHead() {
            lst1.removeFirst();
            System.out.println(lst1);
            Main();
        }

        public static void DeleteTail() {
            lst1.removeLast();
            System.out.println(lst1);
            Main();
        }

        public static void DeleteIndex() {
            String in;
            System.out.print("Delete on what index? : ");
            in=scan.nextLine();
            int dex=Integer.parseInt(in);
            lst1.remove(dex);
            System.out.println(lst1);
            Main();
        }

        //Main - Retrieve Operation
        public static void RetrieveOpt() {
            Scanner scan=new Scanner(System.in);
            System.out.println("1,Retrieve Head\n2,Retrieve Tail\n3,Retrieve Index\n");
            System.out.print("Choose from 1 - 3 : ");
            n=scan.nextInt();

            if(n==1) {
                RetrieveHead();
            }
            else if(n==2) {
                RetrieveTail();
            }
            else if(n==3) {
                RetrieveIndex();
            }
        }

        public static void RetrieveHead() {
            lst1.peekFirst();
            System.out.println(lst1.peekFirst());
            Main();
        }

        public static void RetrieveTail() {
            lst1.peekLast();
            System.out.println(lst1.peekLast());
            Main();
        }

        public static void RetrieveIndex() {
            String in;
            System.out.print("Retrieve on what index? : ");
            in=scan.nextLine();
            int dex=Integer.parseInt(in);
            lst1.get(dex);
            System.out.println(lst1.get(dex));
            Main();
        }
    }

