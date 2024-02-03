public class shivansh2 {

    int []num_k = new int[1000001];

    void f()
    {
        for(int i=2;i<1000001;i++)
        {
           if(num_k[i]==0)
           {    
                for(int j=i;j<1000001;j+=i)
                {
                    num_k[j]++;   
                }
            }
        }
    }

    public static void main(String[] args) {

        
        
    }



    
    
}
