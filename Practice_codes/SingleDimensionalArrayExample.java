public class SingleDimensionalArrayExample {
    public static void main(String[] args) {
        int a  = 1;
        String name = "Ram";
    
        int[]  integerArray = {1,2,3,4,5,6};
        String[] stringArray = new String[5];   // size of 5
        stringArray[0] = "Anita";
        
    
        // System.out.println(integerArray[0]);
        // System.out.println(integerArray[1]);
        // System.out.println(integerArray[2]);
        // System.out.println(integerArray[3]);
        // System.out.println(integerArray[4]);
        // System.out.println(integerArray[5]);


        //Traversing the array
        // for(int i=0; i< integerArray.length; i++){
        //     System.out.println(integerArray[i]);
        // }

        // extended for loop -- for each loop
        for(int i: integerArray){
            System.out.println(i);
        }

        for(String i: stringArray){
            System.out.println(i);
        }

    }
}
