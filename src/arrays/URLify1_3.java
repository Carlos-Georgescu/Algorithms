package src.arrays;


//for
public class URLify1_3 {
    public static void main(String args[])
    {
        char[] s = new char[] {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '};
        System.out.println(urlify(s, 13));
    }

    public static char[] urlify(char[] s1, int n)
    {
        int counter = s1.length-1;
        for(int i=n-1;i>=0;i--)
        {
            if(s1[i] == ' ')
            {
                s1[counter] = '0';
                s1[counter-1] = '2';
                s1[counter-2] = '%';
                counter -= 3;
            }
            else{
                s1[counter] = s1[i];
                counter--;
            }
        }
        //System.out.println(s1[2]);
        return s1;
    }
}
