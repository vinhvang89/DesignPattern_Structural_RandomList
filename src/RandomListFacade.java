public class RandomListFacade {
    private RandomList randomList;
    private int size;

    public RandomListFacade(int size) {
        this.size = size;
        this.randomList = new RandomList(this.size);
    }
    public void filter() throws Exception {
        randomList.setList();
        System.out.println("Array before filter ");
        randomList.display();
        System.out.println();
        randomList.fillerOdd();
        System.out.println("Array after filter ");
        randomList.display();
    }
}
