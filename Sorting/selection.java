class selection{
    public static void main(String[] args) {
        int [] arr = {13,17,3,17,35,21,41,7,22};
        for(int i=0;i<arr.length-1;i++){
           
            int smallInd=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<=arr[smallInd]){
                    smallInd=j;
                }
            }
           
                int temp=arr[i];
                arr[i]=arr[smallInd];
                arr[smallInd]=temp;
           
           
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
           }
       
    }
}