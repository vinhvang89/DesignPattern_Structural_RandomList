import java.util.ArrayList;

public class RandomList {
    private final int SIZE;
    private ArrayList<Integer> list ;
    public RandomList(int size) {
        this.SIZE = size;
        this.list = new ArrayList<>();
    }

    public ArrayList<Integer> getList() {
        return list;
    }
    public void setList(){
        for (int i = 0; i < SIZE ; i++) {
            int element1 =(int) (Math.random()*100);
            int element2 =(int) (Math.random()*10);
            int element = element1 + element2;
            list.add(i,element);
        }

    }
    public void display(){
        for (Integer integer : this.list) {
            System.out.print(integer + " , ");
        }
    }
    public void fillerOdd() throws Exception{
        ArrayList<Integer> temp = new ArrayList<>();
        int j = 0;
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                temp.add(j, integer);
                j++;
            }
        }
        list = null;
        list = temp;

    }
}
