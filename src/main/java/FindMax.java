public class FindMax {
    public static  <T extends  Comparable <T>> Integer maximum(T[] Max)
    {
        T max=Max[0];
        for(T i:Max)
        {
            if(i.compareTo(max)> 0)
            {
                max=i;
            }
        }
        System.out.println(max+" ");
        return null;
    }

    public static void main(String[] args)
    {
        Integer[] integer= {1,2,3,4,5,6};
        Float[] floatArr= {1.1f,1.2f,2.0f,3.2f, 4.0f,5.2f};
        String[] string= {"Mango","Apple","Banana","Orange","Pineapple"};
        maximum(integer);
        maximum(floatArr);
        maximum(string);
    }
}