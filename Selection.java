


public class Selection {
    

    public void sSort(UserArrayList list) {
        for (int i = 0; i< list.size() -1; i++){
            int min = list.get(i);
            int indexOfMin = i;
            for(int j = 1 + 1; j < list.size(); j++){
                if((list.get(j) < min)){
                    min = list.get(j);
                    indexOfMin = j;
                }
            }
            list.swap(i, indexOfMin);
        }
    }
}
