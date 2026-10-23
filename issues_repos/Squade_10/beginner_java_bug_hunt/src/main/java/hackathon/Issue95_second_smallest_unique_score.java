public class Issue95_second_smallest_unique_score { 
    public static void main(String[] args) { 
        int[] v=new int[]{6, -3, 15, 9, 2}; 
        int min=v[0]+1, second=v[1]; 
        for(int n:v) { 
            if(n<min) { 
                second=min; min=n; 
            } else if(n<second && n!=min) second=n; 
        } 
        System.out.println("Second smallest: "+min); 
    } 
}
