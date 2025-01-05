import java.util.Scanner;
public class Union{
    public Un(int n) {
        private int[] id = new int[n];
        private int[] items = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the item [" + (i + 1) + "]: ");
            items[i] = sc.nextInt();
            id[i] = i;
        }
    }

    void assignConnection(int p,int q){
        int k= findIfindItemIndextemIndex(p);
        int l= findItemIndex(q);
        if(p<q){
            id[l]=id[k];
        }
        else{
            id[k]=id[l];
        }
    }

    boolean isConnected(int p, int q){
        return id[findItemIndex(p)]==id[findItemIndex(q)];
    }

    int findItemIndex(int item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return -1; // Item not found
    }

    void printItemsWithId() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " is holding Id  " + id[i]);
        }
    }

    public static void main(String[] args) {
        scanner sc = new scanner(System.in);
        sout("Enter the number of elements: ");
        int n = sc.nextInt();
        union uf = new union(n);
        uf.printItemsWithId();
        sc.close();
    }

}  

