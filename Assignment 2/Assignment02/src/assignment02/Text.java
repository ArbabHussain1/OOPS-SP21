package assignment02;

public class Text 
{
    private String[] para;
    private int currentPara = 0;
    
    public Text(String message)
    {
        para = new String[1];
        para[0] = message;
        currentPara = 1;
    }
    
    public void addPara(String newPara)
    {
        String[] temp = new String[para.length];
        
        for (int i = 0; i < temp.length; i++)
        {
            temp[i] = para[i];
        }
        
        currentPara += 1;
        para = new String[currentPara];
        
        for (int i = 0; i < currentPara-1; i++)
        {
            para[i] = temp[i];
        }
        para[currentPara-1] = newPara;
    }

    public int getCurrentPara() 
    {
        return currentPara;
    }
    
    public void resetCurrentPara()
    {
        currentPara = 0;
        para = new String[currentPara];   
    }
    
    @Override
    public String toString()
    {
        String message = "";
        for(int i = 0; i < getCurrentPara(); i++)
        {
            message += para[i] + "\n";
        }
        
        return message;
    }
}
