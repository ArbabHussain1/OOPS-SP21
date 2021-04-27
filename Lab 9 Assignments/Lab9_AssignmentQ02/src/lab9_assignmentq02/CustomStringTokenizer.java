package lab9_assignmentq02;
import java.util.*;

public class CustomStringTokenizer extends StringTokenizer 
{
    private String string;

    public CustomStringTokenizer(String string) 
    {
        super(string);
        this.string  = string;
    }
    
    @Override
    public int countTokens() 
    {
        String[] tokens = string.trim().split(" ");
        String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int tokensCount = 0;
        for(int i = 0; i < tokens.length ; i ++)
        {
            boolean numeric = true;
            for(int j = 0; j < num.length; j++)
            {
                if(tokens[i].contains(num[j]))
                {
                    numeric = false;
                }
            }
            if(numeric)
            {
                tokensCount++;
            }
        }
        return tokensCount;
    }
}
