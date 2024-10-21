public class peakhike {
    public static int hikey(int[] arr,int n){
        int couunt=arr[0];
        n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>couunt){
                couunt=arr[i];
            }

        }
        return couunt;
    }
    
}
