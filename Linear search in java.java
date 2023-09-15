public class seventh {
    public static void main(String[]args){
        //Linear search in java
        int[]array={9,1,8,2,7,3,6,4,5};
        int index=Linearsearch(array,0);
        if(index!=-1){
            System.out.println("Element found at index: "+index);
        }
        else{
            System.out.println("Ekement not found");
        }

    }
    private static int Linearsearch(int[]array,int value){
        for(int i=0;i<array.length;i++){
            if(array[i]==value){
                return i;
            }
        }
        return-1;
    }
    
}
