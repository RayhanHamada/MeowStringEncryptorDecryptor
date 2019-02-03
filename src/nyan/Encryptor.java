package nyan;

public class Encryptor {

    private String rawString = "";

    public Encryptor(String rawString)
    {
        this.rawString = rawString;
    }

    public String encrypt()
    {
        String binaryForm = "", result = "";
        for (char c : rawString.toCharArray()) binaryForm += Integer.toBinaryString((int)c);

        int i = 0;
        for (char c : binaryForm.toCharArray())
        {
            if (c == '0')
            {
                if (i == 0) result += 'm';
                else if (i == 1) result += 'e';
                else if (i == 2) result += 'o';
                else result += 'w';
            }
            else
            {
                if (i == 0) result += 'M';
                else if (i == 1) result += 'E';
                else if (i == 2) result += 'O';
                else result += 'W';
            }

            if (i > 3) i = 0;
            else i++;
        }
        return result;
    }
}
